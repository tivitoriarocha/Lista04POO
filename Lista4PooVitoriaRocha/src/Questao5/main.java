package Questao5;

public class main {

    public static void main(String[] args) {

        System.out.println("== Sistema de Validação de Credenciais ==");

        ValidadorSeguranca validador = new ValidadorSeguranca();

        System.out.println("\nTeste 1 - Senha: 'MinhaSenhaA'");
        validador.validarAcesso("MinhaSenhaA");
        System.out.println("\nTeste 2 - Senha: 'SenhaA123'");
        validador.validarAcesso("SenhaA123");
        System.out.println("\nTeste 3 - Senha: 'abcA'");
        validador.validarAcesso("abcA");
        System.out.println("\nTeste 4 - Senha: 'senhalonga'");
        validador.validarAcesso("senhalonga");
        System.out.println("\nTeste 5 - Senha: '12345678'");
        validador.validarAcesso("12345678");
        System.out.println("\nTeste do método validarFormato:");
        System.out.println("Resultado: " + validador.validarFormato("qualquer texto"));

    }

}
