package Questao1;

public class Fatura implements IImprimivel {

    @Override
    public void imprimir(int copias) {

        if(copias>5){
            System.out.println("Imprimindo" + copias + "cópias em Modo Rascunho.");
        }else{
            System.out.println("Imprimindo" + copias + "cópias em Modo Alta Qualidade.");
        }

    }

}
