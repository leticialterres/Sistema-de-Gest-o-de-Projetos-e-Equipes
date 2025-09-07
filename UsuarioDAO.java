import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public Usuario create(Usuario u, String senhaPlain) throws SQLException {
        String sql = "INSERT INTO usuario (nome, cpf, email, cargo, login, senha_hash, perfil) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String hash = PasswordUtil.hash(senhaPlain);

        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getCpf());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getCargo());
            ps.setString(5, u.getLogin());
            ps.setString(6, hash);
            ps.setString(7, u.getPerfil());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) u.setId(rs.getInt(1));
            }
        }
        return u;
    }


    public Usuario findById(int id) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));
                    u.setCpf(rs.getString("cpf"));
                    u.setEmail(rs.getString("email"));
                    u.setCargo(rs.getString("cargo"));
                    u.setLogin(rs.getString("login"));
                    u.setSenhaHash(rs.getString("senha_hash"));
                    u.setPerfil(rs.getString("perfil"));
                    return u;
                }
            }
        }
        return null;
    }

    public List<Usuario> findAll() throws SQLException {
        String sql = "SELECT * FROM usuario";
        List<Usuario> list = new ArrayList<>();
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));
                u.setEmail(rs.getString("email"));
                u.setCargo(rs.getString("cargo"));
                u.setLogin(rs.getString("login"));
                u.setSenhaHash(rs.getString("senha_hash"));
                u.setPerfil(rs.getString("perfil"));
                list.add(u);
            }
        }
        return list;
    }

    public boolean update(Usuario u) throws SQLException {
        String sql = "UPDATE usuario SET nome=?, cpf=?, email=?, cargo=?, login=?, perfil=? WHERE id=?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getCpf());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getCargo());
            ps.setString(5, u.getLogin());
            ps.setString(6, u.getPerfil());
            ps.setInt(7, u.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean updateSenha(int usuarioId, String novaSenhaPlain) throws SQLException {
        String sql = "UPDATE usuario SET senha_hash = ? WHERE id = ?";
        String hash = PasswordUtil.hash(novaSenhaPlain);
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, hash);
            ps.setInt(2, usuarioId);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    public Usuario findByLogin(String login) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE login = ?";
        try (Connection conn = ConnectionManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, login);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("nome"));
                    u.setCpf(rs.getString("cpf"));
                    u.setEmail(rs.getString("email"));
                    u.setCargo(rs.getString("cargo"));
                    u.setLogin(rs.getString("login"));
                    u.setSenhaHash(rs.getString("senha_hash"));
                    u.setPerfil(rs.getString("perfil"));
                    return u;
                }
            }
        }
        return null;
    }
}
