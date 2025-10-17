package Questao10;

public class TransferenciaHTTP implements  ITransferencia{

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        int bytesRecebidos = 0;
        boolean continuar = true;

        System.out.println("Iniciando download de " + tamanhoTotal + " bytes...");

        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos += 10;

            int progresso = (bytesRecebidos * 100) / tamanhoTotal;
            System.out.println("Progresso: " + progresso + "% (" + bytesRecebidos + "/" + tamanhoTotal + " bytes)");

            if (progresso >= 50 && continuar) {
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }
        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Download Completo!");
        } else {
            System.out.println("Download Pausado/Interrompido!");
        }

    }

}
