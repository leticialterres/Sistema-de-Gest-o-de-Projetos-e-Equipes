package com.oracle.project;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {

    public Tarefa create(Tarefa t) throws SQLException {
        String sql = "INSERT INTO tarefa (titulo, descricao, projeto_id, responsavel_id, status, data_inicio_prevista, data_fim_prevista, data_inicio_real, data_fim_real) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, t.getTitulo());
            ps.setString(2, t.getDescricao());
            ps.setInt(3, t.getProjetoId());
            if (t.getResponsavelId() != null) ps.setInt(4, t.getResponsavelId()); else ps.setNull(4, Types.INTEGER);
            ps.setString(5, t.getStatus());
            if (t.getDataInicioPrevista() != null) ps.setDate(6, Date.valueOf(t.getDataInicioPrevista())); else ps.setNull(6, Types.DATE);
            if (t.getDataFimPrevista() != null) ps.setDate(7, Date.valueOf(t.getDataFimPrevista())); else ps.setNull(7, Types.DATE);
            if (t.getDataInicioReal() != null) ps.setDate(8, Date.valueOf(t.getDataInicioReal())); else ps.setNull(8, Types.DATE);
            if (t.getDataFimReal() != null) ps.setDate(9, Date.valueOf(t.getDataFimReal())); else ps.setNull(9, Types.DATE);
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) t.setId(rs.getInt(1));
            }
        }
        return t;
    }

    public Tarefa findById(int id) throws SQLException {
        String sql = "SELECT * FROM tarefa WHERE id = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Tarefa t = new Tarefa();
                    t.setId(rs.getInt("id"));
                    t.setTitulo(rs.getString("titulo"));
                    t.setDescricao(rs.getString("descricao"));
                    t.setProjetoId(rs.getInt("projeto_id"));
                    int rid = rs.getInt("responsavel_id");
                    if (!rs.wasNull()) t.setResponsavelId(rid);
                    t.setStatus(rs.getString("status"));
                    Date d;
                    d = rs.getDate("data_inicio_prevista"); if (d!=null) t.setDataInicioPrevista(d.toLocalDate());
                    d = rs.getDate("data_fim_prevista"); if (d!=null) t.setDataFimPrevista(d.toLocalDate());
                    d = rs.getDate("data_inicio_real"); if (d!=null) t.setDataInicioReal(d.toLocalDate());
                    d = rs.getDate("data_fim_real"); if (d!=null) t.setDataFimReal(d.toLocalDate());
                    return t;
                }
            }
        }
        return null;
    }

    public boolean update(Tarefa t) throws SQLException {
        String sql = "UPDATE tarefa SET titulo=?, descricao=?, projeto_id=?, responsavel_id=?, status=?, data_inicio_prevista=?, data_fim_prevista=?, data_inicio_real=?, data_fim_real=? WHERE id=?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, t.getTitulo());
            ps.setString(2, t.getDescricao());
            ps.setInt(3, t.getProjetoId());
            if (t.getResponsavelId() != null) ps.setInt(4, t.getResponsavelId()); else ps.setNull(4, Types.INTEGER);
            ps.setString(5, t.getStatus());
            if (t.getDataInicioPrevista() != null) ps.setDate(6, Date.valueOf(t.getDataInicioPrevista())); else ps.setNull(6, Types.DATE);
            if (t.getDataFimPrevista() != null) ps.setDate(7, Date.valueOf(t.getDataFimPrevista())); else ps.setNull(7, Types.DATE);
            if (t.getDataInicioReal() != null) ps.setDate(8, Date.valueOf(t.getDataInicioReal())); else ps.setNull(8, Types.DATE);
            if (t.getDataFimReal() != null) ps.setDate(9, Date.valueOf(t.getDataFimReal())); else ps.setNull(9, Types.DATE);
            ps.setInt(10, t.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM tarefa WHERE id = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    public List<Tarefa> findAll() throws SQLException {
        List<Tarefa> list = new ArrayList<>();
        String sql = "SELECT * FROM tarefa";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Tarefa t = new Tarefa();
                t.setId(rs.getInt("id"));
                t.setTitulo(rs.getString("titulo"));
                t.setDescricao(rs.getString("descricao"));
                t.setProjetoId(rs.getInt("projeto_id"));
                int rid = rs.getInt("responsavel_id");
                if (!rs.wasNull()) t.setResponsavelId(rid);
                t.setStatus(rs.getString("status"));
                Date d;
                d = rs.getDate("data_inicio_prevista"); if (d!=null) t.setDataInicioPrevista(d.toLocalDate());
                d = rs.getDate("data_fim_prevista"); if (d!=null) t.setDataFimPrevista(d.toLocalDate());
                d = rs.getDate("data_inicio_real"); if (d!=null) t.setDataInicioReal(d.toLocalDate());
                d = rs.getDate("data_fim_real"); if (d!=null) t.setDataFimReal(d.toLocalDate());
                list.add(t);
            }
        }
        return list;
    }
}


