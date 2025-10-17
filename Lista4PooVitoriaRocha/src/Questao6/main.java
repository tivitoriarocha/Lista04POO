package Questao6;

public class main {

    public static void main(String[] args) {

        System.out.println("== Sistema de Log de Eventos ==\n");

        Logger logger = new Logger();

        System.out.println("--- Salvamento em Arquivo ---");
        logger.salvarLocal("Usuário João fez login");
        logger.salvarLocal("Erro na conexão com banco");
        logger.salvarLocal(""); // Teste com string vazia

        System.out.println("\n== Salvamento em Banco de Dados ==");
        logger.salvarRemoto("Backup realizado com sucesso");
        logger.salvarRemoto("Atualização de usuários concluída");

        // Demonstrando polimorfismo com as interfaces
        System.out.println("\n--- Demonstração de Polimorfismo ---");

        ISalvavelEmArquivo arquivoLogger = logger;
        ISalvavelEmDB dbLogger = logger;

        System.out.println("Via interface ISalvavelEmArquivo:");
        arquivoLogger.salvarLocal("Log via interface arquivo");

        System.out.println("\nVia interface ISalvavelEmDB:");
        dbLogger.salvarRemoto("Log via interface DB");

    }

}
