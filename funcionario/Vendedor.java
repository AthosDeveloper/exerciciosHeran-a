package exerciciosHerança14junho.funcionario;

public class Vendedor extends Funcionario {
    private final double juroTerrivel = 250.525;
public double cauculaSalario(int horaTrabalhada, double valorHora){

    super.salario = horaTrabalhada * valorHora * 24;
    return salario;
}
public double salarioComJuro(){
    super.salario -= juroTerrivel;
    if (super.salario > 2500.00){
        System.out.println("Um vendedor não ganha mais do que 2500 por mês");
        return  0.0;
    }
    return  salario;
}

}
