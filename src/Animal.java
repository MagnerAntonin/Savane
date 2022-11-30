public class Animal extends Savana{
    String sexe,nom="";

    public Animal(String sexe, String nom) {
        this.sexe = sexe;
        this.nom = nom;
    }



    public void Manger(){
        System.out.println(nom+": \n Je mange");

    }
    public void Dormir(){
        System.out.println("Je dors dans la savane");
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Animal() {
    }

    public static void main(String[] args) {

    }
}
