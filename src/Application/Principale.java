/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;


import com.san.form.FenetrePrincipaleFrame;
import javax.swing.ImageIcon;
import javax.swing.JFrame ;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 *
 * @author scoulon
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //FenetrePrincipale fp = new FenetrePrincipale(new javax.swing.JFrame(), true);
        /**
         * Chargement de la fenetre principale
         */
        FenetrePrincipaleFrame fp = new FenetrePrincipaleFrame (new javax.swing.JFrame(), true);
        fp.setVisible(true);
        // ImageIcon img = new ImageIcon("E:\\sociepka\\Netbeansprojects\\A_Projet_ToutBois\\src\\com\\san\\form\\logo.jpg");
        //fp.setIconImage(img.getImage());
       // fp.setIconImage(ImageIO.read(new File("/com/san/form/logo.png")));
        //(new javax.swing.ImageIcon(getClass().getResource("/com/san/form/meubles1.jpg"))); // NOI18N
    }
    
}
