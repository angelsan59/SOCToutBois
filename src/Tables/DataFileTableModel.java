/*
 * Classe lisant le fichier texte contenant les données et les transformant en vectors afin de formater les données en tableau pour le setModel de Jtable
/* utilisé comme listes dans les formulaires des représentants, clients et prospects.
 */
package Tables;

import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;

        
/**
 *
 *@author sociepka
 */

/**
 * Utilisation de cette classe comme dérivé de la classe AbstractTableModel dans la bibliothèque java swing
 */
 public class DataFileTableModel extends AbstractTableModel {
         protected Vector data;            //données
         protected Vector columnNames ;    //noms de colonnes
         protected String datafile;        //nom du fichier de données

         /**
          * Création du constructeur
          * @param f données du fichier ouvert
          */
    public DataFileTableModel(String f) {
          datafile=f;
          initVectors();
         }
 
    /**
     * Initialisation des vectors (un pour les entetes de colonnes et un pour les données).
     * Et lecture du fichier texte avec gestion d'exception si le fichier est introuvable.
    */
    public void initVectors() {
        String ligne;
        boolean voirtout = false ;
        data=new Vector();
        columnNames=new Vector();
        try {
            FileInputStream fin=new FileInputStream(datafile);
            BufferedReader br=new BufferedReader(new InputStreamReader(fin, "UTF-8"));
            // lecture des noms de colonnes (1ère ligne)
            ligne=br.readLine();
            // Analyse de la ligne de données lue précédemment avec séparateur de données, ";"
            StringTokenizer st1=new StringTokenizer(ligne, ";");
            while(st1.hasMoreTokens()) {
                columnNames.addElement(st1.nextToken());
            }
            
            // lecture des données
            while ((ligne = br.readLine()) != null) {
            StringTokenizer st2=new StringTokenizer(ligne, ";");
            String vartempo = st2.nextToken() ;
            if (vartempo.equals("Oui")) {
                System.out.println(vartempo);
                data.addElement(vartempo) ;
                while(st2.hasMoreTokens()) {
                  data.addElement(st2.nextToken());
                }
                }
                else
                {
                if (voirtout == true) {
                    data.addElement(vartempo) ; 
                    while(st2.hasMoreTokens()) {
                    data.addElement(st2.nextToken());
                    }
                }    
                }
            }    
            System.out.println(data) ;
           br.close();
          } catch (Exception e) {
           e.printStackTrace();
          }
         }
  public int getColumnCount() {
          return columnNames.size();
         }
   public int getRowCount() {
          return data.size()/getColumnCount();
         }
   public String getColumnName(int columnIndex) {
          String colName="";
          if (columnIndex<=getColumnCount())
           colName=(String)columnNames.elementAt(columnIndex);
          return colName;
         }
   public Class getColumnClass(int columnIndex){
          return String.class;
         }
   public boolean isCellEditable(int rowIndex, int columnIndex) {
          return false;
         }
   
   public Object getValueAt(int rowIndex, int columnIndex) {
          return (String)data.elementAt(
                   (rowIndex*getColumnCount())+columnIndex);
         }
   public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       data.addElement(aValue);
       System.out.println(data);
       System.out.println("-----");
   }
   
   // methode d'actualisation des tables non utilisée pour le moment : problème de définition du type de variable de la jTable pour importer son nom et l'utiliser
   // dans la méthode
     // public static void actualiseTable(String fichiernom, javax.swing.JTable nomtable) {
     //   name = new javax.swing.JTable (nomtable);  
     //   String nomFichier1=fichiernom;
     //  DataFileTableModel model1 = new DataFileTableModel(nomFichier1);
     //
     //   model1.fireTableDataChanged();
     //  name.setModel(model1); 
 //}
}
