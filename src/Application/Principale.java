/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.....
 */
package Application;


import Formulaires.FenetrePrincipaleFrame;
import GestionFichier.LectureFichierCSV;
import javax.swing.ImageIcon;
import javax.swing.JFrame ;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
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
        
        //FenetrePrincipale fp = new FenetrePrincipale(new javax.swing.JFrame(), true);
        /**
         * Chargement de la fenetre principale
         */
        FenetrePrincipaleFrame fp = new FenetrePrincipaleFrame (new javax.swing.JFrame(), true);
        fp.setVisible(true);
                          
       // LectureFichierCSV fichierrepresentant = new LectureFichierCSV ("E:\\Afpa\\Mes exercices\\A_Projet_ToutBois\\data\\test.txt") ;
       LectureFichierCSV fichierrepresentant = new LectureFichierCSV ("Data/Representants.txt") ;
        // Lit tout le fichier       
        System.out.println("Depuis principale :") ;
        System.out.println(fichierrepresentant) ;
        System.out.println("--------------------------------------") ;
        System.out.println("lecture d'une donnée") ;
        int colonne = 2 ;
        int ligne = 2 ;        
        System.out.println(fichierrepresentant.getUnedonnee(ligne,colonne));
        System.out.println("--------------------------------------") ;
        System.out.println("lecture du Vector") ;
        System.out.println(fichierrepresentant.getContenudufichier() );
        System.out.println("--------------------------------------") ;
        System.out.println("lecture d'une ligne") ;
        int lignealire = 2 ;
        int nbcolonne = fichierrepresentant.getNbdecolonnes() - 1 ;
        for (int i=0; i<nbcolonne; i++) {
        System.out.println(fichierrepresentant.getUnedonnee(lignealire,i));    
        }
        System.out.println("--------------------------------------") ;
    }
}
