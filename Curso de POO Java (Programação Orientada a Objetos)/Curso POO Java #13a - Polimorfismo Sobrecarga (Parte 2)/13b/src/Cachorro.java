import javax.print.attribute.standard.Fidelity;

public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    public void reagir(String frase){
        if (frase.equals("Toma comida") || frase.equals("Ola")) {
            System.out.println("Abanar e latir");
        }else System.out.println("Rosnar");
    }

    public void reagir(int h, int min){

        if (h < 12){
            System.out.println("Abanar");
        }
        else if (h >= 18){
            System.out.println("ignorar");
        }
        else System.out.println("Abanar e latir");

    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }else System.out.println("Rosnar e latir");
    }

    public void reagir(int idade, float peso){
        if (idade < 5){
            System.out.println("Abanar");
        }else {
            System.out.println("latir");
        }
        if (peso <10){
            System.out.println("Rosnar");
        }else System.out.println("ignorar");
    }

}
