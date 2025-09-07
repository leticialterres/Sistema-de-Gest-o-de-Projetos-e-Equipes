package com.oracle.project;

import java.sql.SQLException;

public class AuthService {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Usuario login(String login, String senhaPlain) throws SQLException {
        Usuario u = usuarioDAO.findByLogin(login);
        if (u == null) return null;
        if (PasswordUtil.verify(senhaPlain, u.getSenhaHash())) {
            // opcional: não retornar senha_hash para o frontend
            u.setSenhaHash(null);
            return u;
        }
        return null;
    }
}


