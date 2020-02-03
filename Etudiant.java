package overhall_average;


import java.util.Scanner;

public class Etudiant {

    private Matiere matiere;
    private double moyenne, m_matiereV[];
    private int nbMatiere, m_matiereC[], i;

    
    //constructeur
    Etudiant() {
        
    }

    //method
    public double calculMoyenne() {
        
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
            moyenne = (m_matiereV[i] * m_matiereC[i]) / cpt;
        }
        

        return moyenne;
    }

    public void afficher() {
        System.out.println("========= BULLETIN ==========");
        System.out.println("Moyenne: " + moyenne + "\n");

        for (i = 0; i < nbMatiere; i++) {
            System.out.println(matiere.getNom() + "  note: " + m_matiereV[i] + "/ coef: " + m_matiereC[i]);
            matiere.afficher();
        }
    }
}
