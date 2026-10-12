package br.com.ifba.usuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administrador extends Usuario {

    public Administrador() {
        super();
    }

    public Administrador(String nome, String cpf, String login, String senha) {
        super(nome, cpf, login, senha);
    }

    // Admin ignora maiúsculas/minúsculas no login
    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equalsIgnoreCase(login)
                && getSenha().equals(senha);
    }
}
