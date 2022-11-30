import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Animal>  listeAnimal = new ArrayList<Animal>();
        //création animaux
        Lion lion1=new Lion("Mâle","Lion 1","Carnivore");
        Lion lion2=new Lion("Mâle","Lion 2","Carnivore");
        Lion lion3=new Lion("Mâle","Lion 3","Carnivore");
        Lion lion4=new Lion("Mâle","Lion 4","Carnivore");
        Lion lion5=new Lion("Mâle","Lion 5","Carnivore");
        Lion lion6=new Lion("Femelle","Lion 6","Carnivore");
        Lion lion7=new Lion("Femelle","Lion 7","Carnivore");
        Lion lion8=new Lion("Femelle","Lion 8","Carnivore");
        Lion lion9=new Lion("Femelle","Lion 9","Carnivore");
        Lion lion10=new Lion("Femelle","Lion 10","Carnivore");

        Zebre zebre1=new Zebre("Mâle","Zèbre 1","Herbivore");
        Zebre zebre2=new Zebre("Femelle","Zèbre 2","Herbivore");
        Zebre zebre3=new Zebre("Mâle","Zèbre 3","Herbivore");
        Zebre zebre4=new Zebre("Femelle","Zèbre 4","Herbivore");
        Zebre zebre5=new Zebre("Mâle","Zèbre 5","Herbivore");
        Zebre zebre6=new Zebre("Femelle","Zèbre 6","Herbivore");
        Zebre zebre7=new Zebre("Mâle","Zèbre 7","Herbivore");
        Zebre zebre8=new Zebre("Femelle","Zèbre 8","Herbivore");
        Zebre zebre9=new Zebre("Mâle","Zèbre 9","Herbivore");
        Zebre zebre10=new Zebre("Femelle","Zèbre 10","Herbivore");


        listeAnimal.add(lion1);
        listeAnimal.add(lion2);
        listeAnimal.add(lion3);
        listeAnimal.add(lion4);
        listeAnimal.add(lion5);
        listeAnimal.add(lion6);
        listeAnimal.add(lion7);
        listeAnimal.add(lion8);
        listeAnimal.add(lion9);
        listeAnimal.add(lion10);
        listeAnimal.add(zebre1);
        listeAnimal.add(zebre2);
        listeAnimal.add(zebre3);
        listeAnimal.add(zebre4);
        listeAnimal.add(zebre5);
        listeAnimal.add(zebre6);
        listeAnimal.add(zebre7);
        listeAnimal.add(zebre8);
        listeAnimal.add(zebre9);
        listeAnimal.add(zebre10);


        for (Animal animal : listeAnimal){
            animal.Manger();
            animal.Dormir();

        }

    }


}