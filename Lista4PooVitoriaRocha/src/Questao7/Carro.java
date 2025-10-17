package Questao7;

public class Carro extends Veiculo{

    private String modelo;

    public Carro(String cor, String modelo) {

        super(cor);
        this.modelo = modelo;

        //O super(); garante que as variáveis herdadas sejam inicializada
        // corretamente antes de receber as novas variáveis como modelo.
        //Além disso, tbm respeita o encapsulamento respeitanto a originalidade dos atributos!

    }

    public String getModelo() {
        return modelo;
    }

    public void exibirInfo() {
        System.out.println("Carro " + modelo + " na cor " + cor);
    }

}
