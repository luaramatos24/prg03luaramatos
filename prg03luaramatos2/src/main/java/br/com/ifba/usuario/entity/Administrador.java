package br.com.ifba.usuario.entity;

public class Administrador extends Usuario {

    public Administrador(String nome, String cpf, String login, String senha) {
        super(nome, cpf, login, senha);
    }

    // admin ignora maiúsculas/minúsculas no login
    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equalsIgnoreCase(login) && getSenha().equals(senha);
    }
}
