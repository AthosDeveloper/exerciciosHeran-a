package exerciciosHerança14junho.banco;

public class Conta implements JuroContaPoupanca {
    private double valor;
     private double taxa = 0.8;
    public void depositar(double valor){
        this.valor = valor;
    }

    public double getValor(){

        return valor;
    }
    public  void sacarValor(double valor){
        if (valor >= 0) {
            this.valor -= valor;
        }



    }

    @Override
    public double jurosAplicado() {
        double juros = (valor * taxa) + valor;
        return juros;
    }
}
