package exerciciosHerança14junho.funcionario;

public class Advogado extends Funcionario {
final private  String palavraFinal = "eu tenho razão";
    @Override
    public double cauculaSalario(int horaTrabalhada, double valorHora) {
        return super.cauculaSalario(horaTrabalhada, valorHora);
    }
    public double ganhaPorFalar(){
        System.out.println(palavraFinal);
        super.salario += 600.550;
        if (super.salario <= 2500.00){
            System.out.println("isto é um absurdo, não aceitarei menos do que 2500");
            return 0.00;
        }
        return  salario;
    }
}

