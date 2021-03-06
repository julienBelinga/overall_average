package overhall_average;


import java.util.Scanner;

public class Etudiant {

    private Matiere matiere;
    private double moyenne, m_matiereV[];
    private int nbMatiere, m_matiereC[], i;

    
    //constructeur
    Etudiant() {}

    //method
    public double calculMoyenne() {
        double somme = 0;
        
        System.out.print("Saisissez votre nombre de matière : ");
        
        Scanner saisieNbMatiere = new Scanner(System.in);
        nbMatiere = saisieNbMatiere.nextInt();

        int cpt = 0;
        
        for (i = 0; i < nbMatiere; i++) {
            
            matiere = new Matiere();

            matiere.calculMoyenne();
            
            m_matiereV = new double[matiere.getNbNote()];
            m_matiereC = new int [matiere.getCoef()];

            m_matiereV[i] = matiere.getValeur();
            m_matiereC[i] = matiere.getCoef();

            cpt += m_matiereC[i];
            somme += ((m_matiereV[i]) * (m_matiereC[i]));
        }
        
        this.moyenne = somme /cpt;
        
        return this.moyenne;
    }

    public void afficher() {
        System.out.println("\n========= BULLETIN ==========");
        System.out.println("Moyenne: " + moyenne + "\n");

        for (i = 0; i < nbMatiere; i++) {
            System.out.println("note: " + m_matiereV[i] + "\ncoef: " + m_matiereC[i]);
            matiere.afficher();
        }
    }
}
