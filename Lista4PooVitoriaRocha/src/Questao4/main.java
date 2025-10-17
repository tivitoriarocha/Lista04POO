package Questao4;

public class main {

    public static void main(String[] args) {

        System.out.println("=== Gerenciador de Tarefas ===");
        TarefaLonga tarefa = new TarefaLonga();
        System.out.println("Estado inicial - Concluída: " + tarefa.EstaFeita());
        tarefa.executar();
        System.out.println("Estado final - Concluída: " + tarefa.EstaFeita());

    }

}
