package exerciciosHerança14junho.animal;

public class Onsa extends Mamifero{
     private int velocidade = 5;
    @Override
    public String mamar() {
        return  "está mamando";
    }

    @Override
    public String respirar() {
        return "está respirando...";
    }
    public String correr(){
        velocidade += 5;
        if (velocidade >= 40){
            System.out.println("Esse é o limite que a onsa pode correr... 40 km por hora.");
velocidade = 5;

            return "está correndo... " + velocidade;
        }

        return  "está correndo... " + velocidade;
    }
}
