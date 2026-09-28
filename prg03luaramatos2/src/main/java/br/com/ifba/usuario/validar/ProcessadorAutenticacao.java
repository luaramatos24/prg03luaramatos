package br.com.ifba.usuario.validar;

import br.com.ifba.usuario.interfaces.Autenticavel;

public class ProcessadorAutenticacao {

    public static boolean processar(Autenticavel pessoa, String login, String senha) {
        return pessoa.autenticar(login, senha);
    }
}
