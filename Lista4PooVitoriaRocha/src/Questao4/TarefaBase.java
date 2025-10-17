package Questao4;

public abstract class TarefaBase {

    protected boolean concluida = false;

    public void marcarFeita() {
        this.concluida = true;
        System.out.println("Tarefa marcada como concluída!");
    }

    public boolean EstaFeita() {
        return concluida;
    }

}
