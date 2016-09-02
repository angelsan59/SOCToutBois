/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;
import javax.swing.*;
        import java.awt.event.*;
        import java.awt.*;
        import java.io.*;
        import java.util.*;
/**
 *
 * @author sociepka
 */
public class DataFileTable extends JPanel {
    public DataFileTable(String dataFilePath) {
          JTable table;                // le tableau
          DataFileTableModel model;    // le modèle
          //fonte
          Font f=new Font("SanSerif",Font.PLAIN,24);
          setFont(f);
          //gestionnaire de positionnement
          setLayout(new BorderLayout());
          //construction du modèle de remplissage à partir du fichier
          model = new DataFileTableModel(dataFilePath);
          //création du tableau
          table=new JTable();
          table.setModel(model);
          table.createDefaultColumnsFromModel();
          //scroller
          JScrollPane scrollpane=new JScrollPane(table);
          add(scrollpane);
         }
    
     public Dimension getPreferredSize() {
          return new Dimension(400, 300);
         }
     public static void main(String args[]) {
          //la fenêtre du programme
          JFrame fen=new JFrame("Table");
          //le tableau
          DataFileTable tablo;
          String nomFichier="contenu.txt";
          if (args.length>0) nomFichier=args[0];
          tablo=new DataFileTable(nomFichier);
          //configuration de la fenêtre
          fen.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          fen.setForeground(Color.black);
          fen.setBackground(Color.lightGray);
          fen.getContentPane().add(tablo,"Center");
          fen.setSize(tablo.getPreferredSize());
          //affichage
          fen.setVisible(true);
          //écouteur pour fermeture
          fen.addWindowListener(new WindowCloser());
         }
        }
 class WindowCloser extends WindowAdapter {
         public void windowClosing(WindowEvent e) {
          Window win=e.getWindow();
          //effacer la fenêtre
          win.setVisible(false);
          //terminer le programme
          System.exit(0);
         }
        }
