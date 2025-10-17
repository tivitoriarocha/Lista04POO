package Questao1;

public class Main {

    public static void main(String[] args){

        IImprimivel fatura = new Fatura();

        System.out.println("== Teste de Impressão ==");
        fatura.imprimir(5);
        fatura.imprimir(7);
        fatura.imprimir(2);

    }

}
