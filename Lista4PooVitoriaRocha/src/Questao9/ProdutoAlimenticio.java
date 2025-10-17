package Questao9;

public class ProdutoAlimenticio extends Produto{

    private String nome;
    private String dataValidade;

    public ProdutoAlimenticio(String nome, int quantidadeEstoque, String dataValidade) {
        super(quantidadeEstoque); // Chama construtor da classe abstrata
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    @Override
    public void verificarDisponibilidade(int quantidadeSolicitada) {
        System.out.println("\nVerificando disponibilidade do produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Quantidade solicitada: " + quantidadeSolicitada);

        if (quantidadeSolicitada <= 0) {
            System.out.println("Quantidade solicitada inválida!");
        } else if (quantidadeSolicitada <= quantidadeEstoque) {
            System.out.println("Produto disponível! Pode realizar a venda.");
            System.out.println("Saldo restante: " + (quantidadeEstoque - quantidadeSolicitada));
        } else if (quantidadeSolicitada <= quantidadeEstoque * 2) {
            System.out.println("Estoque insuficiente. Necessário repor estoque.");
            System.out.println("Faltam: " + (quantidadeSolicitada - quantidadeEstoque) + " unidades");
        } else {
            System.out.println("Estoque muito abaixo do necessário!");
            System.out.println("Necessário: " + quantidadeSolicitada + ", Disponível: " + quantidadeEstoque);
        }

        System.out.println("Data de validade: " + dataValidade);
    }

    public String getNome() {
        return nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

}
