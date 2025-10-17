package Questao9;

public abstract class Produto {

    protected int quantidadeEstoque;

    public Produto(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void verificarDisponibilidade(int quantidadeSolicitada);

}
