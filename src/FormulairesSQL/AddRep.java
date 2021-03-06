
package FormulairesSQL;

import FormulairesTXT.*;
import static GestionFichier.EcritureDansFichier.* ;
import GestionFichier.LectureDuFichierComplet;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Tables.*;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 * Ouvre la fenêtre de gestion des représentants. Ajout, Modification, Suppression et consultation de la liste des représentants existants.
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 * @version 1.0
 */
public class AddRep extends javax.swing.JDialog {

   /**
    * Création de la fenêtre de gestion des représentants, chargement des données dans le tableau
     *@param parent : fenetrePrincipaleFrame
     * @param modal true ou false
     * @throws java.io.IOException erreur si le fichier parent n'existe pas
     */
    
    public AddRep(Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        initialise () ;
        
        // code de changement d'icone de fenêtre qui a marché mais ne semble plus marcher
        // BufferedImage img = ImageIO.read(AddRep.class.getResource("/com/san/form/logo.png"));
        // setIconImage(img);
        /**
        * Commande pour centrer la fenêtre dans l'écran
        */
       setLocationRelativeTo(null);
    }
  /**
        * changer l'icone de la fenêtre
        */   
private void initialise(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titre = new javax.swing.JLabel();
        bAjouter = new javax.swing.JButton();
        bSupprimer = new javax.swing.JButton();
        bEffacer = new javax.swing.JButton();
        bModifier = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        chpPrenom = new javax.swing.JTextField();
        chpNom = new javax.swing.JTextField();
        chpTxCommission = new javax.swing.JTextField();
        chpSalaire = new javax.swing.JTextField();
        lbPrenom = new javax.swing.JLabel();
        lbTxCommission = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        lbSalaire = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataFileTableModel model;
        String nomFichier="Data/Representants.txt";
        TableRepresentants = new javax.swing.JTable();
        lbIdentifiant = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ToutBois - Gestion Représentants");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(187, 235, 219));
        jPanel1.setLayout(null);

        Titre.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Titre.setText("Gestion des représentants");
        jPanel1.add(Titre);
        Titre.setBounds(30, 20, 500, 30);

        bAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconeplus.jpg"))); // NOI18N
        bAjouter.setText("Ajouter");
        bAjouter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAjouterMouseClicked(evt);
            }
        });
        jPanel1.add(bAjouter);
        bAjouter.setBounds(570, 100, 120, 27);

        bSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconemoins.jpg"))); // NOI18N
        bSupprimer.setText("Supprimer");
        bSupprimer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSupprimerMouseClicked(evt);
            }
        });
        jPanel1.add(bSupprimer);
        bSupprimer.setBounds(570, 160, 120, 27);

        bEffacer.setText("Effacer");
        bEffacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bEffacerMouseClicked(evt);
            }
        });
        jPanel1.add(bEffacer);
        bEffacer.setBounds(570, 190, 120, 23);

        bModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconemodif.jpg"))); // NOI18N
        bModifier.setText("Modifier");
        bModifier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bModifierMouseClicked(evt);
            }
        });
        bModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifierActionPerformed(evt);
            }
        });
        jPanel1.add(bModifier);
        bModifier.setBounds(570, 130, 120, 27);

        jPanel2.setBackground(new java.awt.Color(191, 191, 179));

        chpPrenom.setColumns(10);
        chpPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpPrenomActionPerformed(evt);
            }
        });

        chpNom.setColumns(10);
        chpNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpNomActionPerformed(evt);
            }
        });

        chpTxCommission.setColumns(10);
        chpTxCommission.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpTxCommission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpTxCommissionActionPerformed(evt);
            }
        });

        chpSalaire.setColumns(10);
        chpSalaire.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpSalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpSalaireActionPerformed(evt);
            }
        });

        lbPrenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPrenom.setText("Prénom *");

        lbTxCommission.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTxCommission.setText("Taux de commission *");

        lbNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNom.setText("Nom *");

        lbSalaire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSalaire.setText("Salaire brut *");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lbNom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrenom)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chpSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbTxCommission)
                                    .addGap(18, 18, 18)
                                    .addComponent(chpTxCommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNom)
                    .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrenom)
                    .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTxCommission)
                    .addComponent(chpTxCommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chpSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(240, 70, 290, 150);

        model = new DataFileTableModel(nomFichier);
        TableRepresentants.setModel(model);
        TableRepresentants.createDefaultColumnsFromModel();
        // Je masque les colonnes inutiles.
        // TableRepresentants.removeColumn(TableRepresentants.getColumnModel().getColumn(0));
        TableRepresentants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableRepresentantsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableRepresentants);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(70, 240, 640, 120);

        lbIdentifiant.setText("Identifiant");
        jPanel1.add(lbIdentifiant);
        lbIdentifiant.setBounds(10, 90, 60, 20);
        jPanel1.add(lbid);
        lbid.setBounds(80, 90, 40, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meubles4.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 380);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconearbre.jpg"))); // NOI18N
        jMenu1.setText("Retour à la fenêtre principale");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconeaide.jpg"))); // NOI18N
        jMenu2.setText("Aide");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chpPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpPrenomActionPerformed

         
    }//GEN-LAST:event_chpPrenomActionPerformed

    private void chpNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpNomActionPerformed
         
    }//GEN-LAST:event_chpNomActionPerformed

    private void chpTxCommissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpTxCommissionActionPerformed
        
    }//GEN-LAST:event_chpTxCommissionActionPerformed

    private void chpSalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpSalaireActionPerformed
       
    }//GEN-LAST:event_chpSalaireActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
         dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void TableRepresentantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableRepresentantsMouseClicked
        // Je récupére l'identifiant, colonne 1.
        lbid.setText ((String) TableRepresentants.getModel().getValueAt(TableRepresentants.getSelectedRow(),1));
        // Je récupére le nom, colonne 2.
        chpNom.setText ((String) TableRepresentants.getModel().getValueAt(TableRepresentants.getSelectedRow(),2));
        // Je récupére le Prenom, colonne 3.
        chpPrenom.setText ((String) TableRepresentants.getModel().getValueAt(TableRepresentants.getSelectedRow(),3));
        // Je récupére le salaire, colonne 4.
        chpSalaire.setText ((String) TableRepresentants.getModel().getValueAt(TableRepresentants.getSelectedRow(),4));
        // Je récupére le taux de commission, colonne 5.
        chpTxCommission.setText ((String) TableRepresentants.getModel().getValueAt(TableRepresentants.getSelectedRow(),5));
        
    }//GEN-LAST:event_TableRepresentantsMouseClicked

    private void bEffacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEffacerMouseClicked
        // Action sur le bouton Effacer, purge des champs de saisies et suppression de la selection dans la table.
        chpNom.setText ("") ;
        chpPrenom.setText ("") ;
        chpSalaire.setText ("") ;
        chpTxCommission.setText ("") ;
        lbid.setText ("") ;
        TableRepresentants.getSelectionModel().clearSelection();
        
    }//GEN-LAST:event_bEffacerMouseClicked

    private void bModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bModifierActionPerformed

    private void bSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSupprimerMouseClicked
        // Je recupere la ligne à rendre inactive
        //int ligneactuelle = TableRepresentants.getSelectedRow() + 1 ;
        String repActif = "Non" ;
        String repid = lbid.getText() ;
        int repid1 = Integer.parseInt(repid);
        String repnom = chpNom.getText() ;
        String repprenom = chpPrenom.getText() ;
        String repSalaire = chpSalaire.getText () ; 
        String repTxtCommission = chpTxCommission.getText() ;
        String chaine = (repActif + ";" + repid + ";" + repnom + ";" + repprenom + ";" + repSalaire + ";" + repTxtCommission + "\n");
        // Ecraser la ligne du représentant avec la position inactif.
                System.out.println("Chaine dans le bouton supprimer : " +chaine);
                System.out.println("ligneactuelle dans le bouton supprimer : " +repid);
        try {
            ModificationLigne ("Data/Representants.txt", chaine, repid1) ;
            JOptionPane.showMessageDialog(null, "Le représentant a bien été enlevé de la liste", "Suppression de représentant", JOptionPane.INFORMATION_MESSAGE);
           
            // Actualisation de la table
            DataFileTableModel model1;
            String nomFichier1="Data/Representants.txt";
            model1 = new DataFileTableModel(nomFichier1);
            model1.fireTableDataChanged();
            TableRepresentants.setModel(model1);

            // Effacer les données du formulaire
            chpNom.setText ("") ;
            chpPrenom.setText ("") ;
            chpSalaire.setText ("") ;
            chpTxCommission.setText ("") ;
            lbid.setText ("") ;
            } 
        catch (IOException ex) 
            {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bSupprimerMouseClicked

    private void bModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bModifierMouseClicked
      // Je recupere la ligne à modifier
        //int ligneactuelle = TableRepresentants.getSelectedRow() + 1 ;
        String repid = lbid.getText() ;
        int repid1 = Integer.parseInt(repid);
        String repnom = chpNom.getText() ;
        String repprenom = chpPrenom.getText() ;
        String repSalaire = chpSalaire.getText () ; 
        String repTxtCommission = chpTxCommission.getText() ;
        String repActif = "Oui" ;
        String chaine = (repActif + ";" + repid + ";" + repnom + ";" + repprenom + ";" + repSalaire + ";" + repTxtCommission + "\n");
        // Ecraser la ligne du représentant avec la position actif.
                System.out.println(chaine);
        try {
            ModificationLigne ("Data/Representants.txt", chaine, repid1) ;
           // pop up de confirmation de modification
            JOptionPane.showMessageDialog(null, "Le représentant a bien été modifié", "Modification de représentant", JOptionPane.INFORMATION_MESSAGE);
            
            // Actualisation de la table
            DataFileTableModel model1;
String nomFichier1="Data/Representants.txt";
model1 = new DataFileTableModel(nomFichier1);
model1.fireTableDataChanged();
TableRepresentants.setModel(model1);

            // Effacer les données du formulaire
            chpNom.setText ("") ;
            chpPrenom.setText ("") ;
            chpSalaire.setText ("") ;
            chpTxCommission.setText ("") ;
            lbid.setText ("") ;
            } catch (IOException ex) {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_bModifierMouseClicked

    private void bAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAjouterMouseClicked
       // Je recupere le nombre de ligne (soit le nombre de représentants.
       int nbdeligne = 0 ;
       
        try {
            LectureDuFichierComplet fichierrepresentant = new LectureDuFichierComplet ("Data/Representants.txt");
            nbdeligne = fichierrepresentant.getNbdelignes() ;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
        }
       
 
        //Je récupére les caractéristique du nouveau representant.
        String repnom = chpNom.getText() ;
        String repprenom = chpPrenom.getText() ;
        String repSalaire = chpSalaire.getText () ; 
        String repTxtCommission = chpTxCommission.getText() ;
        String repActif = "Oui" ;
        String chaine = (repActif + ";" + nbdeligne + ";" + repnom + ";" + repprenom + ";" + repSalaire + ";" + repTxtCommission  +  "\n");
        // System.out.println(chaine);
        try {
            EcritureFichier ("Data/Representants.txt", chaine) ;
            
            // pop up de confirmation d'ajout
            JOptionPane.showMessageDialog(null, "Le nouveau représentant a bien été ajouté", "Ajout de représentant", JOptionPane.INFORMATION_MESSAGE);
            
            // Actualisation de la table
            DataFileTableModel model1;
            String nomFichier1="Data/Representants.txt";
            model1 = new DataFileTableModel(nomFichier1);
            model1.fireTableDataChanged();
            TableRepresentants.setModel(model1);

            // Effacer les données du formulaire
            chpNom.setText ("") ;
            chpPrenom.setText ("") ;
            chpSalaire.setText ("") ;
            chpTxCommission.setText ("") ;
            lbid.setText ("") ;
            } catch (IOException ex) {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_bAjouterMouseClicked

    /**
     * Mise en page de la fenêtre de gestion de représentants
     * @param args arguments utilisés pour créer la fenêtre
     */
    public static void FenetreRepresentant (String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddRep dialog = null;
                try {
                    dialog = new AddRep(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableRepresentants;
    private javax.swing.JLabel Titre;
    private javax.swing.JButton bAjouter;
    private javax.swing.JButton bEffacer;
    private javax.swing.JButton bModifier;
    private javax.swing.JButton bSupprimer;
    private javax.swing.JTextField chpNom;
    private javax.swing.JTextField chpPrenom;
    private javax.swing.JTextField chpSalaire;
    private javax.swing.JTextField chpTxCommission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbIdentifiant;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbSalaire;
    private javax.swing.JLabel lbTxCommission;
    private javax.swing.JLabel lbid;
    // End of variables declaration//GEN-END:variables
}
