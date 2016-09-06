/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaires;

import Entites.Representant;
import static GestionFichier.EcritureDansFichier.EcritureFichier;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import Tables.*;
import javax.swing.table.TableColumn;
import GestionFichier.LectureFichierCSV ;
import javax.swing.table.TableColumnModel;
// import javax.swing.table.TableModel;
/**
 *
 * @author sociepka
 */
public class AddRep extends javax.swing.JDialog {

    /**
     * Creates new form AddRep
     */
    // LectureFichierCSV fichierrepresentant = new LectureFichierCSV ("Data/Representants.txt") ;
    
    public AddRep(Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        initialise () ;
         /**
        * changer l'icone de la fenêtre
        */
        // BufferedImage img = ImageIO.read(AddRep.class.getResource("/com/san/form/logo.png"));
        // setIconImage(img);
        /**
        * Commande pour centrer la fenêtre dans l'écran
        */
       setLocationRelativeTo(null);
    }
    
private void initialise(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
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
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeplus.jpg"))); // NOI18N
        jButton4.setText("Ajouter");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButton4);
        jButton4.setBounds(570, 100, 120, 27);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemoins.jpg"))); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 160, 120, 27);

        jButton5.setText("Effacer");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(570, 190, 120, 23);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemodif.jpg"))); // NOI18N
        jButton3.setText("Modifier");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 130, 120, 27);

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
        lbPrenom.setText("Prénom");

        lbTxCommission.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTxCommission.setText("Taux de commission");

        lbNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNom.setText("Nom");

        lbSalaire.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSalaire.setText("Salaire brut");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chpSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbTxCommission)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chpTxCommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbPrenom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbNom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
        jPanel2.setBounds(270, 70, 260, 150);

        model = new DataFileTableModel(nomFichier);
        jTable1.setModel(model);
        jTable1.createDefaultColumnsFromModel();
        // Je masque les colonnes inutiles.
        jTable1.removeColumn(jTable1.getColumnModel().getColumn(2));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(90, 240, 590, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/meubles4.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 380);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconearbre.jpg"))); // NOI18N
        jMenu1.setText("Retour à la fenêtre principale");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeplus.jpg"))); // NOI18N
        jMenu3.setText("Ajouter le représentant");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemodif.jpg"))); // NOI18N
        jMenu4.setText("Modifier le représentant");
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemoins.jpg"))); // NOI18N
        jMenu5.setText("Supprimer le représentant");
        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeaide.jpg"))); // NOI18N
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

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // Je recupere le nombre de ligne (soit le nombre de représentant.
        int nbdeligne = jTable1.getRowCount() ;
        //Je récupére les caractéristique du nouveau representant.
        String repnom = chpNom.getText() ;
        String repprenom = chpPrenom.getText() ;
        String repSalaire = chpSalaire.getText () ; 
        String repTxtCommission = chpTxCommission.getText() ;
        String repActif = "Oui" ;
        String chaine = ((nbdeligne+1) + ";" + repnom + ";" + repprenom + ";" + repSalaire + ";" + repTxtCommission + ";" + repActif + "\n");
        System.out.println(chaine);
        try {
            EcritureFichier ("Data/Representants.txt", chaine) ;
            //jTable1.setValueAt(nbdeligne + 1, nbdeligne + 1, 0) ;
            //jTable1.setValueAt(repnom, nbdeligne + 1, 1) ;
            //jTable1.setValueAt(repprenom, nbdeligne + 1, 1) ;
            //jTable1.setValueAt(repSalaire, nbdeligne + 1, 1) ;
            //jTable1.setValueAt(repTxtCommission, nbdeligne + 1, 1) ;
            // DataFileTableModel model = jTable1.getModel ();
            //  jTable1.setModel(new DataFileTableModel("Data/Representants.txt"));
            } catch (IOException ex) {
            Logger.getLogger(AddRep.class.getName()).log(Level.SEVERE, null, ex);
            }
       
               
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
         dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Je récupére le nom, colonne 1.
        chpNom.setText ((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1));
        // Je récupére le Prenom, colonne 2.
        chpPrenom.setText ((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(),2));
        // Je récupére le salaire, colonne 3.
        chpSalaire.setText ((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(),3));
        // Je récupére le taux de commission, colonne 4.
        chpTxCommission.setText ((String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(),4));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // Action sur le bouton Effacer, purge des champs de saisies et suppression de la selection dans la table.
        chpNomenseigne.setText ("") ;
        chpSiret.setText ("") ;
        chpDatevisite.setText ("") ;
        chpAdresse1.setText ("") ;
        chpAdresse2.setText ("") ;
        chpCodepostal.setText ("") ;
        chpVille.setText ("") ;

        chpNom.setText ("") ;
        chpPrenom.setText ("") ;
        chpEmail.setText ("") ;
        chpTelfixe.setText ("") ;
        chpTelportable.setText ("") ;
        chpCommandes.setText ("") ;

        TableClients.getSelectionModel().clearSelection();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
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
    private javax.swing.JLabel Titre;
    private javax.swing.JTextField chpNom;
    private javax.swing.JTextField chpPrenom;
    private javax.swing.JTextField chpSalaire;
    private javax.swing.JTextField chpTxCommission;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbSalaire;
    private javax.swing.JLabel lbTxCommission;
    // End of variables declaration//GEN-END:variables
}
