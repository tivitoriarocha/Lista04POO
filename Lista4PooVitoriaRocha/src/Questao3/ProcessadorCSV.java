package Questao3;

public class ProcessadorCSV implements IProcessadorDeDados{


    @Override
    public void processar(String[] dados) {

        System.out.println("Processando dados CSV:");
        for (int i = 0; i < dados.length; i++) {
            System.out.println("Linha " + i + ": " + dados[i]);
        }

    }
}
