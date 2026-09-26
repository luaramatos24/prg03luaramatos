package br.com.ifba.conta.entity;
import br.com.ifba.usuario.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import br.com.ifba.transacao.entity.Transacao;

/**
 *
 * @author matos
 */
public class Conta {
    private Usuario titular;
    private String nome;
    private double saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public Conta(Usuario titular, String nome, double saldo) {
        this.titular = titular;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Usuario getTitular() { return titular; }
    public void setTitular(Usuario titular) { this.titular = titular; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return new ArrayList<>(transacoes);
    }
}