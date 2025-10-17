package Questao7;

public class main {

    public static void main(String[] args) {

        System.out.println("== Sistema de Veículos ==\n");

        Carro carro1 = new Carro("Vermelho", "Fusca");
        Carro carro2 = new Carro("Azul", "Civic");
        Carro carro3 = new Carro("Preto", "Corolla");

        System.out.println("\n-- Informações dos Carros --");
        carro1.exibirInfo();
        carro2.exibirInfo();
        carro3.exibirInfo();

        System.out.println("\n-- Acessando métodos --");
        System.out.println("Carro 1 - Modelo: " + carro1.getModelo() + ", Cor: " + carro1.getCor());
        System.out.println("Carro 2 - Modelo: " + carro2.getModelo() + ", Cor: " + carro2.getCor());

        System.out.println("\n--- Modificando cor ---");
        carro1.setCor("Amarelo");
        System.out.println("Nova cor do Carro 1: " + carro1.getCor());
    }

}
