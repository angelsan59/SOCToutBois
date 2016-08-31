/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionFichier;

import java.io.* ;
// http://b.kostrzewa.free.fr/java/td-struct/glossaire.html
import java.util.Vector ;


/**
 *
 * @author Firefox59
 * Methode de lecture d'un fichier.
 */
public class LectureFichierCSV {
    private int nbdelignes ; // nombres de lignes dans le fichier CSV car évolutif.
    private int nbdecolonnes ; // nombres de colonnes dans le fichier CSV car évolutif.
    private Vector contenudufichier ; // Vector est le resultat de la lecture du fichier.
    private final static char separateurdecolonnes = ';' ; // Séparateur par défaut ";".
    
// Les getters et les setters    

    public int getNbdelignes() {
        return nbdelignes;
    }

    public void setNbdelignes(int nbdelignes) {
        this.nbdelignes = nbdelignes ;
        majdelatailleduvector() ;
    }

    public int getNbdecolonnes() {
        return nbdecolonnes;
    }

    public void setNbdecolonnes(int nbdecolonnes) {
        this.nbdecolonnes = nbdecolonnes ;
        majdelatailleduvector() ;
    }

    public Vector getContenudufichier() {
        return contenudufichier;
    }

    public void setContenudufichier(Vector contenudufichier) {
        this.contenudufichier = contenudufichier;
    }
    


    public LectureFichierCSV (String chemincomplet) throws FileNotFoundException {
        // Création d'un nouveau contenu de fichier CSV (Vector).
        contenudufichier = new Vector () ;
        // Charge le contenu dans fichierlu.
        FileReader fichierlu = new FileReader(chemincomplet) ;
        // Lance la fonction de lecture du contenu du fichier.
        LectureDuContenu (fichierlu) ;
        // Test d'affichage en console
        System.out.println(contenudufichier) ;
    /**
    * 
    * A FINALISER    
    * 
    **/    
    }

    // Fonction privée de lecture du contenu du fichier (reader = fichierlu)
    // Attends le contenu du fichier "reader" en entrée.
    // Pas de retour.
    private void LectureDuContenu(Reader reader) {
        BufferedReader buffReader = new BufferedReader(reader);
        // si le fichier n'est pas vide faire...
        if (buffReader != null) {
            // Risque ==> donc exception.
            try {
                // Lecture de la ligne et l'ajoute à la mémoire tampon (buffReader)
                String lignelu;
                lignelu = buffReader.readLine();
            // Tant ce que la ligne n'est pas vide.
            while (lignelu != null) {
               LectureDuContenuDeLaLigne (lignelu) ;
               lignelu = buffReader.readLine();
            }
        // Gestion des exceptions impossible de lire le fichier.    
         } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier CSV : " + e.toString());
        } 
        finally {
            // et pour finir vider le tampon.
            try {
               buffReader.close();
            // Gestion des exceptions impossible de fermer le fichier.   
            } catch (IOException e) {
               System.err.println("Erreur de fermeture du fichier CSV :" + e.toString());
            }
         }
      }
    // Fermeture de la fonction privée de lecture du contenu du fichier (reader = fichierlu)
    }

    // Fonction privée de lecture du contenu d'une ligne.
    // Attends le contenu du fichier "reader" en entrée.
    // Pas de retour.
    private void LectureDuContenuDeLaLigne (String lignelu) {
        // Si la ligne lue est vide, fermeture de la fonction.
        if (lignelu == null) {
            return;
        }
        // Création d'un nouveau contenu de fichier CSV (Vector).
        Vector ligneentraintement = new Vector();
        // Ajout de la ligne au contenu complet (contenudufichier).
        contenudufichier.add(ligneentraintement);
        // nbdelignes + 1
        nbdelignes++;
        // Si la ligne lue est pleinne que d'espace, fermeture de la fonction.
        if (lignelu.trim().length() == 0) {
            return;
        }
        int nbdecolonnes = 0;
        int debutducurseur = 0;
        // Renvoi dans findelaligne la premiere séparation CSV si inexistante alors renvoi "-1".
        int findelaligne = lignelu.indexOf(separateurdecolonnes);
        // Faire tant qu'un séparateur précedent existe (on a mis la donnée à "0")
        while (debutducurseur > -1) {
            // Si fin de ligne, extrait la dernière colonne et passe "debutducurseur" a -1 pour arrèter la boucle
            if (findelaligne == -1) {
                ligneentraintement.add(lignelu.substring(debutducurseur));
                debutducurseur = findelaligne;
            } 
            // Sinon, extrait la colonne et passe à la séparation suivante.
            else 
            {
            ligneentraintement.add(lignelu.substring(debutducurseur, findelaligne));
            debutducurseur = findelaligne + 1;
            }
            findelaligne = lignelu.indexOf(separateurdecolonnes, debutducurseur);
            // nbdecolonnes + 1
            nbdecolonnes++;
        // Fin du faire tant qu'un séparateur précedent existe (on a mis la donnée à "0")
        }
        // Change le nombre de colonne défini au départ par le nouveau nombre si supérieur.
        // Ne pas oublier qu'il s'agit d'une données variable.
        if (nbdecolonnes > getNbdecolonnes()) {
            setNbdecolonnes(Math.max(getNbdecolonnes(), nbdecolonnes));
        }
   }
    
    // Fonction privée de redimensionnement du Vector.
    // Pas d'entrées.
    // Pas de retour.
    private void majdelatailleduvector() {
      contenudufichier.setSize(getNbdelignes());
      int nbdelignes = getNbdelignes();
      int nbdecolonnes = getNbdecolonnes();
      for (int i = 0; i < nbdelignes; i++) {
         Vector aRow = (Vector)contenudufichier.get(i);
         if (aRow == null) {
            contenudufichier.set(i, new Vector());
            aRow = (Vector)contenudufichier.get(i);
         }
         aRow.setSize(nbdecolonnes);
      }
   }
    
    
}
