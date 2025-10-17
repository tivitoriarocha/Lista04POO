package Questao2;

public class main {

    public static void main(String[] args){

        System.out.println("== Sistema de Cálculo de Bônus ==");

        Desenvolvedor devFulano = new Desenvolvedor("João Silva", 1, 3000.0);
        Desenvolvedor devFulana = new Desenvolvedor("Maria Santos", 2, 5000.0);
        Desenvolvedor devBeltrano = new Desenvolvedor("Carlos Oliveira", 3, 8000.0);
        Desenvolvedor devCicrano = new Desenvolvedor("Pedro Costa", 4, 4000.0);

        devFulano.calcularBonus();
        devFulana.calcularBonus();
        devBeltrano.calcularBonus();
        devCicrano.calcularBonus();

    }

}
