package br.com.ifba.prg03.transacao;

import java.time.LocalDate;

public abstract class Transacao {

    private LocalDate data;
    private double valor;
    private String descricao;

    public Transacao(LocalDate data, double valor, String descricao) {
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public abstract double aplicarNoSaldo(double saldoAtual);

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
