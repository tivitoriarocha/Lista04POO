package Questao8;

public class ComandoRede implements IComando{

    @Override
    public void executar(String[] parameters) {
        System.out.println("Executando Comando de Rede...");
        System.out.print("Parâmetros: ");
        for (String param : parameters) {
            System.out.print(param + " ");
        }
        System.out.println();
    }

}
