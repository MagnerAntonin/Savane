import java.util.Objects;

public class Zebre extends Animal{
    String regime="Herbivore";


    public Zebre(String sexe, String nom, String regime) {
        super(sexe, nom);
        this.regime = regime;
    }
    public void Manger(){
        if(regime.equals("Herbivore")) System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT +nom+ ConsoleColors.RESET+ConsoleColors.CYAN_UNDERLINED+": Je mange de la verdure et mon sexe est : "+ ConsoleColors.RESET+ConsoleColors.YELLOW_BOLD_BRIGHT+sexe+"\n");
        else System.out.println("Le régime n'est pas spécifié");
    }
    public void Dormir(){
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT +nom+ ConsoleColors.RESET+ConsoleColors.CYAN_UNDERLINED+": Je dors dans la savane et mon sexe est : "+ ConsoleColors.RESET+ConsoleColors.YELLOW_BOLD_BRIGHT+sexe+ ConsoleColors.RESET+"\n");
    }
    public Zebre() {
    }

    public static void main(String[] args) {

    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }
}
