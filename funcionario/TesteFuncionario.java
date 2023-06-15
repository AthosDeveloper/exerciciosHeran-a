package exerciciosHerança14junho.funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente funcionario = new Gerente();


        System.out.println(funcionario.cauculaSalario(6, 120));
        System.out.println(funcionario.salarioAcrecimo());
 Vendedor vendedor = new Vendedor();
        System.out.println(vendedor.cauculaSalario(3,  30.00));
        System.out.println(vendedor.salarioComJuro());
        Advogado advogado = new Advogado();
        System.out.println(advogado.cauculaSalario(6, 20.00));
        System.out.println(advogado.ganhaPorFalar());
    }
}
