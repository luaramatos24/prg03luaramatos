package br.com.ifba.conta.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.transacao.entity.Transacao;
import br.com.ifba.transacao.enums.TipoTransacao;

public class ContaTest {

    @Test
    public void testAdicionarTransacaoAumentaLista() {
        Usuario usuario = new Usuario("Maria Silva", "12345678900", "mariasilva", "senha123");
        Conta conta = new Conta(usuario, "Conta Corrente", 100.0);

        Transacao transacao = new Transacao(50.0, "22/09/2026", TipoTransacao.DESPESA);
        conta.adicionarTransacao(transacao);

        assertEquals(1, conta.getTransacoes().size());
    }

    @Test
    public void testContaNasceComSaldoCorreto() {
        Usuario usuario = new Usuario("Maria Silva", "12345678900", "mariasilva", "senha123");
        Conta conta = new Conta(usuario, "Conta Corrente", 200.0);

        assertEquals(200.0, conta.getSaldo());
    }

    @Test
    public void testGetTitularRetornaObjetoCorreto() {
        Usuario usuario = new Usuario("Maria Silva", "12345678900", "mariasilva", "senha123");
        Conta conta = new Conta(usuario, "Conta Corrente", 100.0);

        assertEquals(usuario, conta.getTitular());
    }
}
