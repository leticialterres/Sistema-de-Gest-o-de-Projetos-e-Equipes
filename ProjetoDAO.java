package com.oracle.project;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {

    public Projeto create(Projeto p) throws SQLException {
        String sql = "INSERT INTO projeto (nome, descricao, data_inicio, data_termino_prevista, status, gerente_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getDescricao());
            if (p.getDataInicio() != null) ps.setDate(3, Date.valueOf(p.getDataInicio())); else ps.setNull(3, Types.DATE);
            if (p.getDataTerminoPrevisto() != null) ps.setDate(4, Date.valueOf(p.getDataTerminoPrevisto())); else ps.setNull(4, Types.DATE);
            ps.setString(5, p.getStatus());
            if (p.getGerenteId() != null) ps.setInt(6, p.getGerenteId()); else ps.setNull(6, Types.INTEGER);
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) p.setId(rs.getInt(1));
            }
        }
        return p;
    }

    public Projeto findById(int id) throws SQLException {
        String sql = "SELECT * FROM projeto WHERE id = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Projeto p = new Projeto();
                    p.setId(rs.getInt("id"));
                    p.setNome(rs.getString("nome"));
                    p.setDescricao(rs.getString("descricao"));
                    Date d1 = rs.getDate("data_inicio");
                    if (d1 != null) p.setDataInicio(d1.toLocalDate());
                    Date d2 = rs.getDate("data_termino_prevista");
                    if (d2 != null) p.setDataTerminoPrevisto(d2.toLocalDate());
                    p.setStatus(rs.getString("status"));
                    int gid = rs.getInt("gerente_id");
                    if (!rs.wasNull()) p.setGerenteId(gid);
                    return p;
                }
            }
        }
        return null;
    }

    public boolean update(Projeto p) throws SQLException {
        String sql = "UPDATE projeto SET nome=?, descricao=?, data_inicio=?, data_termino_prevista=?, status=?, gerente_id=? WHERE id=?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNome());
            ps.setString(2, p.getDescricao());
            if (p.getDataInicio() != null) ps.setDate(3, Date.valueOf(p.getDataInicio())); else ps.setNull(3, Types.DATE);
            if (p.getDataTerminoPrevisto() != null) ps.setDate(4, Date.valueOf(p.getDataTerminoPrevisto())); else ps.setNull(4, Types.DATE);
            ps.setString(5, p.getStatus());
            if (p.getGerenteId() != null) ps.setInt(6, p.getGerenteId()); else ps.setNull(6, Types.INTEGER);
            ps.setInt(7, p.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM projeto WHERE id = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    public List<Projeto> findAll() throws SQLException {
        List<Projeto> list = new ArrayList<>();
        String sql = "SELECT * FROM projeto";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Projeto p = new Projeto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                Date d1 = rs.getDate("data_inicio");
                if (d1 != null) p.setDataInicio(d1.toLocalDate());
                Date d2 = rs.getDate("data_termino_prevista");
                if (d2 != null) p.setDataTerminoPrevisto(d2.toLocalDate());
                p.setStatus(rs.getString("status"));
                int gid = rs.getInt("gerente_id");
                if (!rs.wasNull()) p.setGerenteId(gid);
                list.add(p);
            }
        }
        return list;
    }
}


