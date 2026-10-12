package br.com.ifba.conta.entity;

import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.transacao.entity.Transacao;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "titular_id")
    private Usuario titular;

    private String nome;
    private double saldo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "conta_id")
    private List<Transacao> transacoes = new ArrayList<>();

    public Conta() {
    }

    public Conta(Usuario titular, String nome, double saldo) {
        this.titular = titular;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return new ArrayList<>(transacoes);
    }
}