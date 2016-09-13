/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.....
 */
package Application;


import FormulairesTXT.FenetrePrincipaleFrame;
import GestionFichier.* ;
import static GestionFichier.EcritureDansFichier.EcritureFichier;
import javax.swing.ImageIcon;
import javax.swing.JFrame ;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;

/**
 * Appelle la classe FenetrePrincipaleFrame pour l'afficher, et charge les fichiers de données txt
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 * @version 1.0
 */
public class Principale {
    /**
     * Ouverture de la fenêtre principale de l'application
     * @param args the command line arguments
     * @throws java.io.IOException  erreur si le fichier parent n'existe pas
     */
    public static void main(String[] args) throws IOException {
        
                      
        /**
         * Chargement de la fenetre principale
         */
        
        FenetrePrincipaleFrame fp = new FenetrePrincipaleFrame (new javax.swing.JFrame(), true);
        fp.setVisible(true);
                                          
     }
}
