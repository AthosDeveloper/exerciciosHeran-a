package exerciciosHerança14junho.funcionario;

public class Funcionario {
    protected double salario;
public  double cauculaSalario(int horaTrabalhada, double valorHora){
    this.salario = horaTrabalhada * valorHora * 24;
    return salario;
}
}
