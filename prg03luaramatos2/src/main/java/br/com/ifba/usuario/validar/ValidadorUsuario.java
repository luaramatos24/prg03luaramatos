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

    // Verifica se todos os campos foram preenchidos
    public static boolean camposPreenchidos(String... campos) {
        for (String campo : campos) {
            if (campo == null || campo.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // Verifica se a senha e a confirmação são iguais
    public static boolean senhasIguais(String senha, String confirmarSenha) {
        return senha.equals(confirmarSenha);
    }
}
