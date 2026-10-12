/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.transacao.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import br.com.ifba.transacao.enums.TipoTransacao;
/**
 *
 * @author matos
 */
@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;
    private String data;
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipo;

    // Construtor vazio exigido pelo JPA
    public Transacao() {
    }

    public Transacao(double valor, String data, TipoTransacao tipo) {
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public TipoTransacao getTipo() { return tipo; }
    public void setTipo(TipoTransacao tipo) { this.tipo = tipo; }
}
