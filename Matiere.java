
import java.util.Scanner;

public class Matiere {

    //constructeur
    Matiere() {
    }

    private String nom;
    private Note note;
    private Note moyenne;
    private int coefficient, nbNote, i;
    private String professeur;
    private double somme = 0, m_moyenne = 0;
    private int coefSomme = 0;
    private double tabNoteValeur[];
    private int tabNoteCoef[];
    private Scanner sc = new Scanner(System.in);

    //accesseurs
    public String getNom() {return nom;}

    public double getValeur() {return m_moyenne;}

    public int getCoef() {return coefficient;}

    public Note getMoyenne() {
        moyenne.valeur = m_moyenne;
        moyenne.coefficient = coefficient;

        return moyenne;
    }

    public String getProf() {return professeur;}

    //mutateurs
    public String setNom() {
        System.out.print("matière: ");
        nom = sc.nextLine();

        return nom;
    }

    public String setProf() {
        System.out.print("proffeseur: ");
        professeur = sc.nextLine();

        return professeur;
    }

    public int setCoef() {
        System.out.print("coefficient: ");
        coefficient = sc.nextInt();

        return coefficient;
    }

    //method
    public void calculMoyenne() {
        System.out.print("Saisissez votre nombre de note:");
        nbNote = sc.nextInt();
        System.out.print("\n");

        for (i = 1; i < nbNote; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("note: ");
            tabNoteValeur[i] = sc1.nextDouble();
            System.out.print("coef: ");
            tabNoteCoef[i] = sc1.nextInt();

            somme += (tabNoteValeur[i]) * (tabNoteCoef[i]);
            coefSomme += tabNoteValeur[i];
        }

        m_moyenne = somme / coefSomme;
    }

    public void afficher() {
        System.out.println("Matière : " + getNom() + "\nProfesseur: " + getProf());
        System.out.println("Moyenne: " + moyenne);

        for (i = 0; i < nbNote; i++) {
            System.out.println("note: " + tabNoteValeur[i] + "/ncoef: " + tabNoteCoef[i]);
        }
    }
}
