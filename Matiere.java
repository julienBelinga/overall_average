package overhall_average;

import java.util.Scanner;

public class Matiere {

    private String nom;
    private Note note;
    private Note moyenne;
    private int coefficient, nbNote, i;
    private String professeur;
    private double somme = 0, m_moyenne = 0;
    private int coefSomme = 0;
    private double tabNoteValeur[];
    private int tabNoteCoef[];

    //constructeur
    Matiere() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nom de la matière : ");
        nom = sc.nextLine();

        System.out.print("Nom du professeur : ");
        professeur = sc.nextLine();
        

        System.out.print("Coefficient de la matière : ");
        coefficient = sc.nextInt();
    }

    //accesseurs
    public String getNom() {
        return nom;
    }

    public double getValeur() {
        return m_moyenne;
    }

    public int getCoef() {
        return coefficient;
    }

    public Note getMoyenne() {
        return moyenne;
    }

    public String getProf() {
        return professeur;
    }

    public int getNbNote(){
        return nbNote;
    }
    
    //method
    public void calculMoyenne() {
        System.out.println("Saisissez votre nombre de note:");
        Scanner sc1 = new Scanner(System.in);
        nbNote = sc1.nextInt();
        
        tabNoteValeur = new double[nbNote];
        tabNoteCoef = new int[nbNote];

        for (i = 0; i < nbNote; i++) {
            System.out.print("saisissez la note: ");
            tabNoteValeur[i] = sc1.nextDouble();
            System.out.print("Puis le coefficient: ");
            tabNoteCoef[i] = sc1.nextInt();

            somme += (tabNoteValeur[i]) * (tabNoteCoef[i]);
            coefSomme += tabNoteValeur[i];
        }

        m_moyenne = somme / coefSomme;
    }

    public void afficher() {
        System.out.println("Matière : " + getNom() + "\nProfesseur: " + getProf() + "\n");
        System.out.println("Moyenne: " + moyenne + "\n");

        for (i = 0; i < nbNote; i++) {
            System.out.println("note: " + tabNoteValeur[i] + "\ncoef: " + tabNoteCoef[i]);
        }
    }
}
