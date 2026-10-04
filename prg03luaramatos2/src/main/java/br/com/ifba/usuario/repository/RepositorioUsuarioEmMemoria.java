package br.com.ifba.usuario.repository;

import br.com.ifba.usuario.entity.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioUsuarioEmMemoria {

    private final List<Usuario> usuarios = new ArrayList<>();
    private final Map<String, Usuario> porLogin = new HashMap<>();

    public void cadastrar(Usuario usuario) {
        if (porLogin.containsKey(usuario.getLogin())) {
            throw new IllegalArgumentException("Login já cadastrado: " + usuario.getLogin());
        }
        usuarios.add(usuario);
        porLogin.put(usuario.getLogin(), usuario);
    }

    public List<Usuario> listarTodos() {
        return usuarios;
    }

    // versão 1: varre a List com for
    public Usuario buscarPorLoginComFor(String login) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login)) {
                return u;
            }
        }
        return null;
    }

    // versão 2: consulta direta no Map
    public Usuario buscarPorLogin(String login) {
        return porLogin.get(login);
    }
}