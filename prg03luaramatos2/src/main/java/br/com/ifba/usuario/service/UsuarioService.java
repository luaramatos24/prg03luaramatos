package br.com.ifba.usuario.service;

import org.springframework.stereotype.Service;
import br.com.ifba.usuario.entity.Usuario;
import infrastructure.dao.UsuarioIDao;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService {

    private final UsuarioIDao usuarioDao;

    public UsuarioService(UsuarioIDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public void salvar(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) {
        usuarioDao.update(usuario);
    }

    @Override
    public void excluir(Long id) {
        Usuario usuario = usuarioDao.findById(id);

        if (usuario != null) {
            usuarioDao.delete(usuario);
        }
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return usuarioDao.findById(id);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        return usuarioDao.findByLogin(login);
    }
    
    @Override
    public boolean autenticar(String login, String senha) {
        Usuario usuario = usuarioDao.findByLogin(login);

        return usuario != null && usuario.autenticar(login, senha);
    }
}
