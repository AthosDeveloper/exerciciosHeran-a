package exerciciosHerança14junho.banco;

public class TesteBanco {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
cliente.conta.depositar(5690.55);
        System.out.println(cliente.conta.getValor());
cliente.conta.sacarValor(993.22);
        System.out.println(cliente.conta.getValor());
        System.out.println(cliente.conta.jurosAplicado());

    }
}
