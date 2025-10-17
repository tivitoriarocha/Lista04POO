package Questao8;

public class ComandoArquivo implements IComando{

    @Override
    public void executar(String[] parameters) {
        System.out.println("Executando Comando de Arquivo...");
        System.out.print("Parâmetros: ");
        for (String param : parameters) {
            System.out.print(param + " ");
        }
        System.out.println();
    }

}
