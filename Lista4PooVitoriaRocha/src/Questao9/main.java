package Questao9;

public class main {

    public static void main(String[] args) {

        System.out.println("== Sistema de Controle de Estoque ==\n");

        ProdutoAlimenticio arroz = new ProdutoAlimenticio("Arroz", 50, "2025-12-31");
        ProdutoAlimenticio feijao = new ProdutoAlimenticio("Feijão", 20, "2025-10-15");
        ProdutoAlimenticio macarrao = new ProdutoAlimenticio("Macarrão", 5, "2026-03-20");

        arroz.verificarDisponibilidade(30);
        feijao.verificarDisponibilidade(25);
        macarrao.verificarDisponibilidade(10);

    }

}
