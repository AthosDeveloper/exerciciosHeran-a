package exerciciosHerança14junho.funcionario;

public class Gerente extends Funcionario {
final private double Acrecimo = 500.0;

public double cauculaSalario(int horaTrabalhada, double valorHora){
    super.salario = horaTrabalhada * valorHora * 24;
    return salario;
}
public double salarioAcrecimo(){
    super.salario += Acrecimo;
    return  salario;
}
}

