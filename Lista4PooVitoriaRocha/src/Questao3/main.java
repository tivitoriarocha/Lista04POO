package Questao3;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){

        System.out.println("== Sistema de Processamento de Dados ==");

        List<IProcessadorDeDados> processadores = new ArrayList<>();

        processadores.add(new ProcessadorCSV());

        String[] dadosExemplo = {
                "Nome,Idade,Cidade",
                "João,30,São Paulo",
                "Maria,25,Rio de Janeiro",
                "Carlos,35,Belo Horizonte"
        };

        for (IProcessadorDeDados processador : processadores) {
            processador.processar(dadosExemplo);
        }

    }

}
