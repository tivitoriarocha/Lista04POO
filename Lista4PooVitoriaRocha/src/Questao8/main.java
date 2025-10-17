package Questao8;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        System.out.println("== Pipeline de Execução de Comandos ==\n");

        List<IComando> comandos = new ArrayList<>();

        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());
        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        String[] parametros1 = {"host:192.168.1.1", "port:8080", "timeout:30"};
        String[] parametros2 = {"arquivo:dados.txt", "modo:leitura"};
        String[] parametros3 = {"host:10.0.0.1", "port:443"};
        String[] parametros4 = {"arquivo:log.csv", "modo:escrita"};

        System.out.println("--- Executando Pipeline de Comandos ---");

        int i = 0;
        for (IComando comando : comandos) {
            System.out.println("\nComando " + (i + 1) + ":");

            String[] parametros;
            if (comando instanceof ComandoRede) {
                parametros = (i % 2 == 0) ? parametros1 : parametros3;
            } else {
                parametros = (i % 2 == 0) ? parametros2 : parametros4;
            }

            comando.executar(parametros);
            i++;
        }

        System.out.println("\n--- Pipeline concluído ---");

    }

}
