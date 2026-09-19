package br.com.ifba.usuario.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void deveAutenticarQuandoCredenciaisCorretas() {
        Usuario usuario = new Usuario("Jonatas", "12345678900", "jonatas", "senha123");
        boolean resultado = usuario.autenticar("jonatas", "senha123");
        assertTrue(resultado);
    }

    @Test
    public void naoDeveAutenticarQuandoSenhaIncorreta() {
        Usuario usuario = new Usuario("Jonatas", "12345678900", "jonatas", "senha123");
        boolean resultado = usuario.autenticar("jonatas", "senhaErrada");
        assertFalse(resultado);
    }
}
