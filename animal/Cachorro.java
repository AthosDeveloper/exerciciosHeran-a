package exerciciosHerança14junho.animal;

public class Cachorro extends Mamifero {
    @Override
    public String mamar() {
        return "Está mamando";
    }

    @Override
    public String respirar() {
        return "ele está respirando...";
    }
    public void latir(){
        System.out.println("latindo");
    }
}
