package br.com.ifba.usuario.controller;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.service.IUsuarioService;
import java.util.List;

public class UsuarioController implements IUsuarioController {

    private final IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void salvar(Usuario usuario) {
        usuarioService.salvar(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) {
        usuarioService.atualizar(usuario);
    }

    @Override
    public void excluir(Long id) {
        usuarioService.excluir(id);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return usuarioService.buscarPorId(id);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        return usuarioService.buscarPorLogin(login);
    }
    
    @Override
    public boolean autenticar(String login, String senha) {
        return usuarioService.autenticar(login, senha);
    }
}
