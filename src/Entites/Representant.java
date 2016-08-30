/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author sociepka
 */
public class Representant extends Personne {
    private int numrepresentant ;
    private float tauxcommission ;
    private float salairebrut ;

    public int getNumrepresentant() {
        return numrepresentant;
    }

    public void setNumrepresentant(int numrepresentant) {
        this.numrepresentant = numrepresentant;
    }

    public float getTauxcommission() {
        return tauxcommission;
    }

    public void setTauxcommission(float tauxcommission) {
        this.tauxcommission = tauxcommission;
    }

    public float getSalairebrut() {
        return salairebrut;
    }

    public void setSalairebrut(float salairebrut) {
        this.salairebrut = salairebrut;
    }

    public Representant(String nom, String prenom, int numrepresentant, float tauxcommission, float salairebrut) {
        super (nom, prenom);
        this.numrepresentant = numrepresentant;
        this.tauxcommission = tauxcommission;
        this.salairebrut = salairebrut;
        
    }
    
    // code à changer pour le format du fichier d'enregistrement
    
     @Override
    public String toString() {
        return "Représentant : " + prenom + " " + nom + " avec un taux de commission" + tauxcommission + " et un salaire de "+salairebrut;
    }
    
    // Méthode d'ajout d'un representant avec les données venant du formulaire
  public void ajoutRepresentant (){
      
      // initialisation de la valeur taille qui sera la taille des tableaux
      int taille =0;
      
      // Déclaration des 4 tableaux 
        String tabnum[];
        String tabprenom[];
        String tabnom[];
        String tabtxcom[];
        String tabsalaire[];
        
  }
    
}
