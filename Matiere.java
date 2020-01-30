import java.util.Scanner;

public class Matiere {
    
    //constructeur
    Matiere(){}
    
    private String nom;
    private Note note;
    private Note moyenne;
    private int coefficient, nbNote, i;
    private String professeur;
    private double  somme = 0,m_moyenne = 0;
    private int coefSomme = 0;
    private final double tabNoteValeur[] = {0};
    private final int tabNoteCoef[] = {0};
    
    //accesseurs
    public String getNom(){
        return nom;
    }
    public double getValeur(){
        return m_moyenne;
    }
    public int getCoef(){
        return coefficient;
    }
    public Note getMoyenne(){
        moyenne.valeur = m_moyenne;
        moyenne.coefficient = coefficient;
        
        return moyenne;
    }
    public String getProf(){
        return professeur;
    }
    
    //mutateurs
    public String setNom(){
        Scanner saisieNom = new Scanner(System.in);
        nom = saisieNom.nextLine();
        
        return nom;
    }
    public String setProf(){
        Scanner saisieNom = new Scanner(System.in);
        professeur = saisieNom.nextLine();
        
        return professeur;
    }
    public int setCoef(){
        Scanner saisieCoef = new Scanner(System.in);
        coefficient = saisieCoef.nextInt();
        
        return coefficient;
    }
  
    //method
    public void calculMoyenne(){
        System.out.println("Saisissez votre nombre de note:");
        Scanner saisieNbNote = new Scanner(System.in);
        nbNote = saisieNbNote.nextInt();
        
        for(i = 0; i < nbNote; i++){
            Scanner saisieNoteValeur = new Scanner(System.in);
            tabNoteValeur[i] = saisieNoteValeur.nextDouble();
            Scanner saisieNoteCoef = new Scanner(System.in);
            tabNoteCoef[i] = saisieNoteCoef.nextInt();
            
            somme += tabNoteValeur[i]*tabNoteCoef[i];
            coefSomme += tabNoteValeur[i];
        }
        
        m_moyenne = somme / coefSomme;
    }
    
    public void afficher(){
        System.out.println("Matière : "+getNom()+"\n Professeur: "+getProf()+"\n");
        System.out.println("Moyenne: "+moyenne+"\n");
        
        for (i=0; i < nbNote ; i++){
            System.out.println("note: "+tabNoteValeur[i]+"/ coef: "+tabNoteCoef[i]);
        }
    }    
}