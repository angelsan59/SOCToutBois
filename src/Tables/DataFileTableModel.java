/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;
import javax.swing.*;
        import javax.swing.table.*;
        import java.io.*;
        import java.util.*;

        
/**
 *
 * @author sociepka
 */


 public class DataFileTableModel extends AbstractTableModel {
         protected Vector data;            //données
         protected Vector columnNames ;    //noms de colonnes
         protected String datafile;        //nom du fichier de données

    public DataFileTableModel(String f) {
          datafile=f;
          initVectors();
         }
 
         public void initVectors() {
          String ligne;
          data=new Vector();
          columnNames=new Vector();
          try {
           FileInputStream fin=new FileInputStream(datafile);
           BufferedReader br=new BufferedReader(
            new InputStreamReader(fin));
           // lecture des noms de colonnes (1ère ligne)
           ligne=br.readLine();
           StringTokenizer st1=new StringTokenizer(ligne, ";");
           while(st1.hasMoreTokens())
            columnNames.addElement(st1.nextToken());
           // lecture des données
           while ((ligne = br.readLine()) != null) {
            StringTokenizer st2=new StringTokenizer(ligne, ";");
            while(st2.hasMoreTokens())
             data.addElement(st2.nextToken());
            }
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
         }
 }