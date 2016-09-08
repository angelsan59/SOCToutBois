/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFichier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author scoulon
 */
public class EcritureDansFichier {
   
    public static void EcritureFichier (String nomfichier, String chaine) throws IOException {
        // Création du fichier texte pour le programme
	//String nomfichier = "Data/Representants.txt" ;	
        File fichierTexte = new File (nomfichier);
		// Création de "l'écrivain"
		FileWriter ecrireFichier;
		try {
                    // Instanciation de l'objet ecrireFichier qui va écrire dans fichierTexte.txt
                    //true c'est elle qui permet d'écrire à la suite des donnée enregistrer et non de les remplacé
                    ecrireFichier = new FileWriter(fichierTexte, true);
                    // Écriture d'une chaîne de caractères dans le fichier texte
                    ecrireFichier.write(chaine);
                    // "Fermeture" du FileWriter
                    ecrireFichier.close();
		}
                catch (FileNotFoundException e) 
                        {
        		e.printStackTrace();
                	} 
                catch (IOException e) 
                        {
			e.printStackTrace();
                        }
    }
    
    public static void ModificationLigne (String nomfichier, String chaine, int ligneachanger) throws IOException {
        System.out.println(nomfichier + "---" + chaine + "---" + ligneachanger);
        int ligneactive = 0 ;
        String lignearecopier ="" ;
        File entree = new File(nomfichier);
        File sortie = new File("Data\\temp.txt");
        BufferedReader br = new BufferedReader(new FileReader(entree));
        BufferedWriter bw = new BufferedWriter(new FileWriter(sortie));
        try {
            while ((lignearecopier = br.readLine()) != null) {
                if (ligneactive != ligneachanger) {
                    bw.write (lignearecopier + "\n") ;
                    // bw.flush () ;
                    System.out.println(ligneactive + " <=> " + lignearecopier) ;
                    ligneactive = ligneactive + 1 ;
                    }
                else
                {                
                bw.write (chaine) ;
                // bw.flush () ;
                System.out.println(ligneactive + " <=> " + ligneachanger) ;
                ligneactive = ligneactive + 1 ; 
                }            }
            bw.close () ;
            br.close () ;
            entree.delete();
            sortie.renameTo(new File(nomfichier));
            }
        catch (FileNotFoundException e) 
            {
            e.printStackTrace();
            } 
        catch (IOException e) 
            {
            e.printStackTrace();
            }
        }
    }
    
        
        
        
        
        
        


