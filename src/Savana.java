import java.util.Random;

public class Savana {
    int nbrAnimaux=0;

    public Savana() {
    }

    public void Dormir(){
        System.out.println("Je dors dans la savane");
    }
    public static void main(String[] args) {

    }
    float genererFloat() {
        Random random = new Random();
        return random.nextFloat();
    }
    public void RencontrerAnimal(Animal animal1, Animal animal2){
        String nom1 =animal1.nom;
        String nom2=animal2.nom;;

        if(nom1.startsWith("Lion")){

        }


    }

}

