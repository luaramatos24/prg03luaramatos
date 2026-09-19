package br.com.ifba.usuario.validar;

public class ValidadorUsuario {

    // verifica se todos os campos obrigatorios foram preenchidos
    public static boolean camposPreenchidos(String nome, String cpf, String dataNascimento,
            String telefone, String email, String login, String senha, String confirmarSenha) {
        if (nome == null || cpf == null || dataNascimento == null || telefone == null
                || email == null || login == null || senha == null || confirmarSenha == null) {
            return false;
        }
        return !nome.isEmpty() && !cpf.isEmpty() && !dataNascimento.isEmpty()
                && !telefone.isEmpty() && !email.isEmpty() && !login.isEmpty()
                && !senha.isEmpty() && !confirmarSenha.isEmpty();
    }

    // verifica se o cpf tem 11 digitos numericos
    public static boolean cpfValido(String cpf) {
        if (cpf == null) {
            return false;
        }
        return cpf.replaceAll("[^0-9]", "").length() == 11;
    }

    // verifica se a senha tem no minimo 6 caracteres
    public static boolean senhaForte(String senha) {
        if (senha == null) {
            return false;
        }
        return senha.length() >= 6;
    }

    // Verifica se o texto contém alguma palavra proibida
    public static boolean contemPalavraProibida(String texto) {
        if (texto == null) {
            return false;
        }
        String[] palavrasProibidas = {"admin", "teste", "root", "senha123"};

        for (String palavra : palavrasProibidas) {
            if (texto.toLowerCase().contains(palavra)) {
                return true;
            }
        }
        return false;
    }
}