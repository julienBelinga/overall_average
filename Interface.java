
package overhall_average;

import javax.swing.JFrame;

public class Interface {
    
    public void fenetre(){
        JFrame fenetre = new JFrame();
        
        fenetre.setTitle("Moyenne");
        fenetre.setSize(500, 500);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
   
}
