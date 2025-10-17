package Questao7;

public abstract class Veiculo{

    protected String cor;

    public Veiculo(String cor){

        this.cor = cor;
        System.out.println("Veículo criado com cor:" + cor);

    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;

    }

}
