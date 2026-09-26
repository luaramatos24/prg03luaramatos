package br.com.ifba.prg03.transacao;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransacaoTest {

    @Test
    public void testHerancaGetDescricaoHerdado() {
        Receita receita = new Receita(LocalDate.now(), 100.0, "Salário");
        // getDescricao() não existe em Receita, é herdado de Transacao
        assertEquals("Salário", receita.getDescricao());
    }

    @Test
    public void testMetodoSobrescritoReceita() {
        Receita receita = new Receita(LocalDate.now(), 100.0, "Salário");
        double saldoFinal = receita.aplicarNoSaldo(500.0);
        assertEquals(600.0, saldoFinal);
    }

    @Test
    public void testMetodoSobrescritoDespesa() {
        Despesa despesa = new Despesa(LocalDate.now(), 100.0, "Aluguel");
        double saldoFinal = despesa.aplicarNoSaldo(500.0);
        assertEquals(400.0, saldoFinal);
    }
}
