
import java.util.Scanner;

public class Note {

    //constructeur
    Note() {
    }

    protected int coefficient;
    protected double valeur;
    private Scanner sc1 = new Scanner(System.in);

    // accesseurs
    public int getCoef() {return coefficient;}

    public double getValeur() {return valeur;}

    //mutateurs
    public double setvaleur() {
        System.out.println("Veuillez saisir votre note:");
        valeur = sc1.nextDouble();

        return valeur;
    }

    public int setcoef() {
        System.out.println("veullez saisir le coefficient correspondant:");
        coefficient = sc1.nextInt();

        return coefficient;
    }
}
