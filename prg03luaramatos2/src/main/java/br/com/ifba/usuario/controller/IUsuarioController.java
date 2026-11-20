package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import java.util.List;

public interface IUsuarioController {

    void salvar(Usuario usuario);

    void atualizar(Usuario usuario);

    void excluir(Long id);

    Usuario buscarPorId(Long id);

    List<Usuario> listarTodos();

    Usuario buscarPorLogin(String login);
    
    boolean autenticar(String login, String senha);
}
