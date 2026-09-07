package br.com.ifba.usuario.validar;

public class ValidadorUsuario {

    // Verifica se o texto contém alguma palavra proibida
    public static boolean contemPalavraProibida(String texto) {
        String[] palavrasProibidas = {"admin", "teste", "root", "senha123"};

        for (String palavra : palavrasProibidas) {
            if (texto.toLowerCase().contains(palavra)) {
                return true;
            }
        }
        return false;
    }
}