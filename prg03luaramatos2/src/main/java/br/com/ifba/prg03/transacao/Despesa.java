package br.com.ifba.prg03.transacao;

import java.time.LocalDate;

public class Despesa extends Transacao {

    public Despesa(LocalDate data, double valor, String descricao) {
        super(data, valor, descricao);
    }

    @Override
    public double aplicarNoSaldo(double saldoAtual) {
        return saldoAtual - getValor();
    }
}
