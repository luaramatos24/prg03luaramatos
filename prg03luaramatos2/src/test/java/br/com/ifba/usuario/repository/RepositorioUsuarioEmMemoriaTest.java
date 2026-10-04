package br.com.ifba.usuario.repository;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.repository.RepositorioUsuarioEmMemoria;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepositorioUsuarioEmMemoriaTest {

    private RepositorioUsuarioEmMemoria repo;

    @BeforeEach
    public void setUp() {
        repo = new RepositorioUsuarioEmMemoria();
    }

    @Test
    public void cadastraUsuarioEApareceEmListarTodos() {
        Usuario ana = new Usuario("Ana", "111", "ana", "123");
        repo.cadastrar(ana);
        assertTrue(repo.listarTodos().contains(ana));
    }

    @Test
    public void buscarPorLoginDevolveOCerto() {
        Usuario ana = new Usuario("Ana", "111", "ana", "123");
        Usuario bia = new Usuario("Bia", "222", "bia", "456");
        repo.cadastrar(ana);
        repo.cadastrar(bia);
        assertSame(bia, repo.buscarPorLogin("bia"));
        assertSame(bia, repo.buscarPorLoginComFor("bia"));
    }

    @Test
    public void buscarPorLoginInexistenteDevolveNull() {
        assertNull(repo.buscarPorLogin("fantasma"));
    }

    @Test
    public void cadastrarLoginDuplicadoLancaExcecao() {
        repo.cadastrar(new Usuario("Ana", "111", "ana", "123"));
        assertThrows(IllegalArgumentException.class,
            () -> repo.cadastrar(new Usuario("Outra", "999", "ana", "000")));
    }

    @Test
    public void doisObjetosComMesmoLoginSaoIguaisParaALista() {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Ana", "111", "ana", "123"));
        assertTrue(lista.contains(new Usuario("Outra", "999", "ana", "000")));
    }
}
