import java.util.Scanner;

public class Note {
    
    //constructeur
    Note(){}
        
    protected int coefficient;
    protected double valeur;
    
    // accesseurs
    public int getCoef() {
        return coefficient;
    }
    public double getValeur() {
        return valeur;
    }
    //mutateurs
    public double setvaleur(){
        System.out.println("Veuillez saisir votre note:");
        Scanner saisieNote = new Scanner(System.in);
        valeur = saisieNote.nextDouble();
                
        return valeur;
    }
    public int setcoef(){
        System.out.println("veullez saisir le coefficient correspondant:");
        Scanner saisieCoef = new Scanner(System.in);
        coefficient = saisieCoef.nextInt();
        
        return coefficient;
    }
}
