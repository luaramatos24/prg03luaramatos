package br.com.ifba.usuario.entity;

import br.com.ifba.usuario.interfaces.Autenticavel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutenticavelTest {

    @Test
    void usuarioComumExigeLoginExato() {
        Autenticavel pessoa = new Usuario("Ana", "111", "ana", "1234");
        assertTrue(pessoa.autenticar("ana", "1234"));
        assertFalse(pessoa.autenticar("ANA", "1234"));
    }

    @Test
    void administradorIgnoraMaiusculasNoLogin() {
        Autenticavel pessoa = new Administrador("Root", "222", "root", "1234");
        assertTrue(pessoa.autenticar("ROOT", "1234"));
    }
}
