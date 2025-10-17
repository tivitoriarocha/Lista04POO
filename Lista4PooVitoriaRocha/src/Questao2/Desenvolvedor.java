package Questao2;

public class Desenvolvedor extends Funcionario{

    private double salarioCru;

    public Desenvolvedor(String nome, int codigoCargo, double salarioCru) {

        super(nome, codigoCargo);
        this.salarioCru = salarioCru;

    }

    @Override
    public double calcularBonus() {

        double salarioFinal;

        switch (codigoCargo){
            case 1:
                salarioFinal = (salarioCru*0.10)+salarioCru;
                System.out.print("\n");
                System.out.println("Bônus do " + nome + ": R$ " + (salarioCru*0.10) +" \n Salário final: R$ " + salarioFinal);
                break;
            case 2:
                salarioFinal = (salarioCru*0.15)+salarioCru;
                System.out.print("\n");
                System.out.println("Bônus do " + nome + ": R$ " + (salarioCru*0.15) +" \n Salário final: R$ " + salarioFinal);
                break;
            case 3:
                salarioFinal = (salarioCru*0.20)+salarioCru;
                System.out.print("\n");
                System.out.println("Bônus do " + nome + ": R$ " + (salarioCru*0.20) +" \n Salário final: R$ " + salarioFinal);
                break;
            default:
                salarioFinal = (salarioCru*0.05)+salarioCru;
                System.out.print("\n");
                System.out.println("Bônus do " + nome + ": R$ " + (salarioCru*0.05) +" \n Salário final: R$ " + salarioFinal);
                break;
        }

        return 0;
    }

}
