package br.com.ifba.usuario.service;

import br.com.ifba.usuario.entity.Usuario;
import infrastructure.dao.UsuarioIDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioServiceTest {

    @Test
    void deveSalvarUsuario() {
        FakeUsuarioDao dao = new FakeUsuarioDao();
        UsuarioService service = new UsuarioService(dao);

        Usuario usuario = new Usuario(
                "Ana Silva", "12345678900", "ana", "123"
        );

        service.salvar(usuario);

        assertEquals(1, service.listarTodos().size());
    }

    @Test
    void deveBuscarUsuarioPorLogin() {
        FakeUsuarioDao dao = new FakeUsuarioDao();
        UsuarioService service = new UsuarioService(dao);

        Usuario usuario = new Usuario(
                "Ana Silva", "12345678900", "ana", "123"
        );

        service.salvar(usuario);

        Usuario resultado = service.buscarPorLogin("ana");

        assertNotNull(resultado);
        assertEquals("Ana Silva", resultado.getNome());
    }

    @Test
    void deveExcluirUsuario() {
        FakeUsuarioDao dao = new FakeUsuarioDao();
        UsuarioService service = new UsuarioService(dao);

        Usuario usuario = new Usuario(
                "Ana Silva", "12345678900", "ana", "123"
        );

        service.salvar(usuario);
        service.excluir(1L);

        assertEquals(0, service.listarTodos().size());
    }

    // DAO falso para testar sem banco de dados
    private static class FakeUsuarioDao implements UsuarioIDao {

        private final Map<Long, Usuario> usuarios = new HashMap<>();
        private long proximoId = 1;

        @Override
        public void save(Usuario usuario) {
            usuarios.put(proximoId++, usuario);
        }

        @Override
        public void update(Usuario usuario) {
            for (Long id : usuarios.keySet()) {
                if (usuarios.get(id).getLogin().equals(usuario.getLogin())) {
                    usuarios.put(id, usuario);
                    return;
                }
            }
        }

        @Override
        public void delete(Usuario usuario) {
            usuarios.values().remove(usuario);
        }

        @Override
        public Usuario findById(Long id) {
            return usuarios.get(id);
        }

        @Override
        public List<Usuario> findAll() {
            return new ArrayList<>(usuarios.values());
        }

        @Override
        public Usuario findByLogin(String login) {
            for (Usuario usuario : usuarios.values()) {
                if (usuario.getLogin().equals(login)) {
                    return usuario;
                }
            }
            return null;
        }
    }
}
