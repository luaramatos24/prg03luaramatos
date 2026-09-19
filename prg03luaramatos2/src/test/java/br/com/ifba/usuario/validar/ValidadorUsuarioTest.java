package br.com.ifba.usuario.validar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {

    // ---------- cpfValido ----------

    @Test
    public void cpfValido_deveRetornarTrue_paraCpfComOnzeDigitos() {
        assertTrue(ValidadorUsuario.cpfValido("12345678900"));
    }

    @Test
    public void cpfValido_deveRetornarFalse_paraCpfVazio() {
        assertFalse(ValidadorUsuario.cpfValido(""));
    }

    @Test
    public void cpfValido_deveRetornarFalse_paraCpfComLetras() {
        assertFalse(ValidadorUsuario.cpfValido("abcdefghijk"));
    }

    @Test
    public void cpfValido_deveRetornarFalse_paraCpfNull() {
        assertFalse(ValidadorUsuario.cpfValido(null));
    }

    // ---------- senhaForte ----------

    @Test
    public void senhaForte_deveRetornarTrue_paraSenhaComSeisOuMaisCaracteres() {
        assertTrue(ValidadorUsuario.senhaForte("Senha123"));
    }

    @Test
    public void senhaForte_deveRetornarFalse_paraSenhaComMenosDeSeisCaracteres() {
        assertFalse(ValidadorUsuario.senhaForte("123"));
    }

    @Test
    public void senhaForte_deveRetornarFalse_paraSenhaNull() {
        assertFalse(ValidadorUsuario.senhaForte(null));
    }

    // ---------- camposPreenchidos ----------

    @Test
    public void camposPreenchidos_deveRetornarTrue_quandoTodosPreenchidos() {
        assertTrue(ValidadorUsuario.camposPreenchidos(
                "Maria", "12345678900", "15/03/1995", "11999999999",
                "maria@email.com", "mariasilva", "Senha123", "Senha123"));
    }

    @Test
    public void camposPreenchidos_deveRetornarFalse_quandoCampoVazio() {
        assertFalse(ValidadorUsuario.camposPreenchidos(
                "", "12345678900", "15/03/1995", "11999999999",
                "maria@email.com", "mariasilva", "Senha123", "Senha123"));
    }

    @Test
    public void camposPreenchidos_deveRetornarFalse_quandoCampoNull() {
        assertFalse(ValidadorUsuario.camposPreenchidos(
                null, "12345678900", "15/03/1995", "11999999999",
                "maria@email.com", "mariasilva", "Senha123", "Senha123"));
    }
    // ---------- contemPalavraProibida ----------

    @Test
    public void contemPalavraProibida_deveRetornarTrue_quandoTextoTemPalavraProibida() {
        assertTrue(ValidadorUsuario.contemPalavraProibida("admin"));
    }

    @Test
    public void contemPalavraProibida_deveRetornarTrue_ignorandoMaiusculas() {
        assertTrue(ValidadorUsuario.contemPalavraProibida("ADMIN"));
    }

    @Test
    public void contemPalavraProibida_deveRetornarFalse_quandoTextoLimpo() {
        assertFalse(ValidadorUsuario.contemPalavraProibida("Maria Silva"));
    }

    @Test
    public void contemPalavraProibida_deveRetornarFalse_paraTextoVazio() {
        assertFalse(ValidadorUsuario.contemPalavraProibida(""));
    }

    @Test
    public void contemPalavraProibida_deveRetornarFalse_paraTextoNull() {
        assertFalse(ValidadorUsuario.contemPalavraProibida(null));
    }
}