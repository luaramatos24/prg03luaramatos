package br.com.ifba.prg03luaramatos2;

import br.com.ifba.usuario.entity.Administrador;
import br.com.ifba.usuario.entity.Usuario;
import br.com.ifba.usuario.validar.ProcessadorAutenticacao;

public class MainPolimorfismo {

    public static void main(String[] args) {
        Usuario u = new Usuario("Ana", "111", "ana", "1234");
        Administrador a = new Administrador("Root", "222", "root", "1234");

        System.out.println(ProcessadorAutenticacao.processar(u, "ANA", "1234"));  // false
        System.out.println(ProcessadorAutenticacao.processar(a, "ROOT", "1234")); // true
    }
}
