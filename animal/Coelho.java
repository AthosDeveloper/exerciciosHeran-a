package exerciciosHerança14junho.animal;

public class Coelho extends Mamifero{
    final private String cenoura = "cenoura";
    @Override
    public String mamar() {
        return "Está mamando";
    }

    @Override
    public String respirar() {
        return "está respirando....";
    }
    public String comerCenoura(){
        return "Comendo " + cenoura + "...";
    }
}
