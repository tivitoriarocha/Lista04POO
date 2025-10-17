package Questao4;

public class TarefaLonga extends TarefaBase implements IExecutavel{

    @Override
    public void executar() {

        System.out.println("Iniciando execução da tarefa longa...");
        int progresso = 0;

        while (progresso < 100) {
            progresso += 20;
            System.out.println("Progresso: " + progresso + "%");

            for (int i = 0; i < 1000000; i++) {}

        }

        marcarFeita();

    }

}
