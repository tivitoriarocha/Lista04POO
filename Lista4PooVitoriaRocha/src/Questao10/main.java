package Questao10;

public class main {

    public static void main(String[] args) {

        System.out.println("=== Sistema de Gerenciamento de Downloads ===\n");

        ITransferencia download = new TransferenciaHTTP();

        System.out.println("--- Teste 1: Download de 100 bytes ---");
        download.iniciarDownload(100);

        System.out.println("\n--- Teste 2: Download de 50 bytes ---");
        download.iniciarDownload(50);

    }

}
