/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaires;

import Tables.DataFileTableModel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author sociepka
 */
public class AddProspect1 extends javax.swing.JDialog {

    /**
     * Creates new form AddClient
     */
    public AddProspect1(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
         /**
        * changer l'icone de la fenêtre
        */
            BufferedImage img = ImageIO.read(AddProspect1.class.getResource("/Formulaires/logo.png"));
            
            setIconImage(img);
         /**
        * Commande pour centrer la fenêtre dans l'écran
        */
       setLocationRelativeTo(null);
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
        lbPrenom = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        chpPrenom = new javax.swing.JTextField();
        chpNom = new javax.swing.JTextField();
        lbNomenseigne = new javax.swing.JLabel();
        chpNomenseigne = new javax.swing.JTextField();
        lbAddresse1 = new javax.swing.JLabel();
        lbCodepostal = new javax.swing.JLabel();
        chpAdresse1 = new javax.swing.JTextField();
        chpAdresse2 = new javax.swing.JTextField();
        chpCodepostal = new javax.swing.JTextField();
        lbVille = new javax.swing.JLabel();
        chpVille = new javax.swing.JTextField();
        lbPays = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        chpEmail = new javax.swing.JTextField();
        lbSiret = new javax.swing.JLabel();
        chpSiret = new javax.swing.JTextField();
        lbTelfixe = new javax.swing.JLabel();
        chpTelfixe = new javax.swing.JTextField();
        lbTelportable = new javax.swing.JLabel();
        chpTelportable = new javax.swing.JTextField();
        lbDatevisite = new javax.swing.JLabel();
        chpDatevisite = new javax.swing.JTextField();
        titreContact = new javax.swing.JLabel();
        fondcouleur1 = new javax.swing.JPanel();
        comboPays = new javax.swing.JComboBox<>();
        fondcouleur2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataFileTableModel model;
        String nomFichier="Data/Prospects.txt";
        TableProspects = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        imagefond = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mRetour = new javax.swing.JMenu();
        mAjouter = new javax.swing.JMenu();
        mModifier = new javax.swing.JMenu();
        mAide = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ToutBois - Gestion prospects");

        jPanel1.setBackground(new java.awt.Color(187, 235, 219));
        jPanel1.setLayout(null);

        Titre.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Titre.setText("Gestion des prospects");
        jPanel1.add(Titre);
        Titre.setBounds(20, 10, 310, 30);

        lbPrenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPrenom.setText("Prénom");
        jPanel1.add(lbPrenom);
        lbPrenom.setBounds(10, 200, 47, 15);

        lbNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNom.setText("Nom");
        jPanel1.add(lbNom);
        lbNom.setBounds(210, 200, 27, 20);

        chpPrenom.setColumns(10);
        chpPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpPrenomActionPerformed(evt);
            }
        });
        jPanel1.add(chpPrenom);
        chpPrenom.setBounds(90, 200, 106, 21);

        chpNom.setColumns(10);
        chpNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpNomActionPerformed(evt);
            }
        });
        jPanel1.add(chpNom);
        chpNom.setBounds(240, 200, 106, 21);

        lbNomenseigne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNomenseigne.setText("Nom de l'enseigne");
        jPanel1.add(lbNomenseigne);
        lbNomenseigne.setBounds(340, 20, 110, 20);

        chpNomenseigne.setColumns(10);
        chpNomenseigne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpNomenseigne);
        chpNomenseigne.setBounds(460, 20, 126, 23);

        lbAddresse1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAddresse1.setText("Adresse 1");
        jPanel1.add(lbAddresse1);
        lbAddresse1.setBounds(10, 90, 60, 20);

        lbCodepostal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodepostal.setText("Code Postal");
        jPanel1.add(lbCodepostal);
        lbCodepostal.setBounds(10, 120, 73, 15);

        chpAdresse1.setColumns(20);
        chpAdresse1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpAdresse1.setText("numero, nom de rue");
        chpAdresse1.setToolTipText("");
        jPanel1.add(chpAdresse1);
        chpAdresse1.setBounds(90, 90, 260, 21);

        chpAdresse2.setColumns(20);
        chpAdresse2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpAdresse2.setText("complément d'adresse");
        jPanel1.add(chpAdresse2);
        chpAdresse2.setBounds(356, 90, 230, 21);

        chpCodepostal.setColumns(10);
        chpCodepostal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpCodepostal);
        chpCodepostal.setBounds(90, 120, 106, 21);

        lbVille.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbVille.setText("Ville");
        jPanel1.add(lbVille);
        lbVille.setBounds(210, 120, 24, 20);

        chpVille.setColumns(10);
        chpVille.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpVille);
        chpVille.setBounds(240, 120, 110, 21);

        lbPays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPays.setText("Pays");
        jPanel1.add(lbPays);
        lbPays.setBounds(360, 120, 28, 20);

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmail.setText("Email");
        jPanel1.add(lbEmail);
        lbEmail.setBounds(20, 230, 31, 20);

        chpEmail.setColumns(10);
        chpEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpEmail);
        chpEmail.setBounds(90, 230, 106, 21);

        lbSiret.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSiret.setText("SIRET");
        jPanel1.add(lbSiret);
        lbSiret.setBounds(10, 60, 36, 20);

        chpSiret.setColumns(14);
        chpSiret.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpSiret);
        chpSiret.setBounds(90, 60, 146, 21);

        lbTelfixe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelfixe.setText("Téléphone fixe");
        jPanel1.add(lbTelfixe);
        lbTelfixe.setBounds(360, 200, 89, 20);

        chpTelfixe.setColumns(10);
        chpTelfixe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpTelfixe);
        chpTelfixe.setBounds(480, 200, 106, 21);

        lbTelportable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelportable.setText("Téléphone portable");
        jPanel1.add(lbTelportable);
        lbTelportable.setBounds(360, 230, 119, 20);

        chpTelportable.setColumns(10);
        chpTelportable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(chpTelportable);
        chpTelportable.setBounds(480, 230, 106, 21);

        lbDatevisite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatevisite.setText("Date de la dernière visite");
        jPanel1.add(lbDatevisite);
        lbDatevisite.setBounds(280, 60, 152, 20);

        chpDatevisite.setColumns(10);
        chpDatevisite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpDatevisite.setText("jj/mm/aaaa");
        jPanel1.add(chpDatevisite);
        chpDatevisite.setBounds(480, 60, 106, 21);

        titreContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titreContact.setText("Contact de l'enseigne");
        jPanel1.add(titreContact);
        titreContact.setBounds(20, 160, 220, 22);

        fondcouleur1.setBackground(new java.awt.Color(191, 191, 179));

        comboPays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "France", "Belgique", "Suisse", "Pays bas", "-----------", "Afghanistan ", "Afrique du Sud ", "Albanie ", "Algérie ", "Allemagne ", "Angola ", "Antigua-et-Barbuda ", "Arabie saoudite ", "Argentine ", "Arménie ", "Australie ", "Autriche ", "Azerbaïdjan ", "Bahamas ", "Bahreïn ", "Bangladesh ", "Barbade ", "Belau ", "Belgique ", "Belize ", "Bénin ", "Bhoutan ", "Biélorussie ", "Birmanie ", "Bolivie ", "Bosnie-Herzégovine ", "Botswana ", "Brésil ", "Brunei ", "Bulgarie ", "Burkina ", "Burundi ", "Cambodge ", "Cameroun ", "Canada ", "Cap-Vert ", "Chili ", "Chine ", "Chypre ", "Colombie ", "Comores ", "Congo ", "Cook ", "Corée du Nord ", "Corée du Sud ", "Costa Rica ", "Côte d'Ivoire ", "Croatie ", "Cuba ", "Danemark ", "Djibouti ", "Dominique ", "Écosse ", "Égypte ", "Émirats arabes unis ", "Équateur ", "Érythrée ", "Espagne ", "Estonie ", "États-Unis ", "Éthiopie ", "Fidji ", "Finlande ", "France ", "Gabon ", "Gambie ", "Géorgie ", "Ghana ", "Grèce ", "Grenade ", "Guatemala ", "Guinée ", "Guinée-Bissao ", "Guinée équatoriale ", "Guyana ", "Haïti ", "Honduras ", "Hongrie ", "Inde ", "Indonésie ", "Iran ", "Irak ", "Irlande ", "Islande ", "Israël ", "Italie ", "Jamaïque ", "Japon ", "Jordanie ", "Kazakhstan ", "Kenya ", "Kirghizistan ", "Kiribati ", "Koweït ", "Laos ", "Lesotho ", "Lettonie ", "Liban ", "Liberia ", "Libye ", "Liechtenstein ", "Lituanie ", "Luxembourg ", "Macédoine ", "Madagascar ", "Malaisie ", "Malawi ", "Maldives ", "Mali ", "Malte ", "Maroc ", "Marshall ", "Maurice ", "Mauritanie ", "Mexique ", "Micronésie ", "Moldavie ", "Monaco ", "Mongolie ", "Mozambique ", "Namibie ", "Nauru ", "Népal ", "Nicaragua ", "Niger ", "Nigeria ", "Niue ", "Norvège ", "Nouvelle-Zélande ", "Oman ", "Ouganda ", "Ouzbékistan ", "Pakistan ", "Palestine ", "Panama ", "Papouasie - Nouvelle Guinée ", "Paraguay ", "Pays-Bas ", "Pérou ", "Philippines ", "Pologne ", "Portugal ", "Qatar ", "République centrafricaine ", "République démocratique du Con ", "République dominicaine ", "République tchèque ", "Roumanie ", "Royaume-Uni ", "Russie ", "Rwanda ", "Saint-Christophe-et-Niévès ", "Sainte-Lucie ", "Saint-Marin ", "Saint-Siège ", "Saint-Vincent-et-les-Grenadine ", "Salomon ", "Salvador ", "Samoa occidentales ", "Sao Tomé-et-Principe ", "Sénégal ", "Seychelles ", "Sierra Leone ", "Singapour ", "Slovaquie ", "Slovénie ", "Somalie ", "Soudan ", "Sri Lanka ", "Suède ", "Suisse ", "Suriname ", "Swaziland ", "Syrie ", "Tadjikistan ", "Tanzanie ", "Tchad ", "Thaïlande ", "Togo ", "Tonga ", "Trinité-et-Tobago ", "Tunisie ", "Turkménistan ", "Turquie ", "Tuvalu ", "Ukraine ", "Uruguay ", "Vanuatu ", "Venezuela ", "Viêt Nam ", "Yémen ", "Yougoslavie ", "Zambie ", "Zimbabwe " }));

        javax.swing.GroupLayout fondcouleur1Layout = new javax.swing.GroupLayout(fondcouleur1);
        fondcouleur1.setLayout(fondcouleur1Layout);
        fondcouleur1Layout.setHorizontalGroup(
            fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur1Layout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addComponent(comboPays, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        fondcouleur1Layout.setVerticalGroup(
            fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(comboPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(fondcouleur1);
        fondcouleur1.setBounds(0, 50, 600, 100);

        fondcouleur2.setBackground(new java.awt.Color(191, 191, 179));

        javax.swing.GroupLayout fondcouleur2Layout = new javax.swing.GroupLayout(fondcouleur2);
        fondcouleur2.setLayout(fondcouleur2Layout);
        fondcouleur2Layout.setHorizontalGroup(
            fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        fondcouleur2Layout.setVerticalGroup(
            fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(fondcouleur2);
        fondcouleur2.setBounds(0, 190, 600, 70);

        model = new DataFileTableModel(nomFichier);
        TableProspects.setModel(model);
        TableProspects.createDefaultColumnsFromModel();

        // Retirer les colonnes qu'on ne veut pas afficher dans le tableau
        // Le numéro des colonnes se décale à chaque retrait, d'où les nombreux retraits de la colonne 7
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(2));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(4));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(7));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(7));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(7));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(7));
        TableProspects.removeColumn(TableProspects.getColumnModel().getColumn(7));
        TableProspects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProspectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProspects);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 280, 580, 120);

        jButton1.setText("Effacer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 230, 80, 23);

        imagefond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        imagefond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/meubles3.jpg"))); // NOI18N
        jPanel1.add(imagefond);
        imagefond.setBounds(0, -100, 780, 620);

        mRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconearbre.jpg"))); // NOI18N
        mRetour.setText("Retour à la fenêtre principale");
        mRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mRetourMouseClicked(evt);
            }
        });
        jMenuBar1.add(mRetour);

        mAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeplus.jpg"))); // NOI18N
        mAjouter.setText("Ajouter le nouveau prospect");
        jMenuBar1.add(mAjouter);

        mModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemodif.jpg"))); // NOI18N
        mModifier.setText("Modifier le prospect");
        jMenuBar1.add(mModifier);

        mAide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeaide.jpg"))); // NOI18N
        mAide.setText("Aide");
        jMenuBar1.add(mAide);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chpPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpPrenomActionPerformed

    }//GEN-LAST:event_chpPrenomActionPerformed

    private void chpNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chpNomActionPerformed

    }//GEN-LAST:event_chpNomActionPerformed

    private void mRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mRetourMouseClicked
        dispose();
    }//GEN-LAST:event_mRetourMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
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

        TableProspects.getSelectionModel().clearSelection();
    }//GEN-LAST:event_jButton1MouseClicked

    private void TableProspectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProspectsMouseClicked
      // Je récupére le nom de l'enseigne, colonne 1.
        chpNomenseigne.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),1));
        // Je récupére le numéro de Siret, colonne 2.
        chpSiret.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),2));
       // Je récupére la date de la dernière visite, colonne 3.
         chpDatevisite.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),3));
         // Je récupére l'adresse, colonne 4.
        chpAdresse1.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),4));
        // Je récupére le complément d'adresse, colonne 5.
        chpAdresse2.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),5));
        // Je récupére le code postal, colonne 6.
        chpCodepostal.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),6));
        // Je récupére la ville, colonne 7.
        chpVille.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),7));
        // Je récupére le pays, colonne 8.
       // comboPays.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),8));
        // Je récupére le nom de contact, colonne 9.
        chpNom.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),9));
        // Je récupére le prénom, colonne 10.
        chpPrenom.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),10));
         // Je récupére le téléphone fixe, colonne 11.
        chpTelfixe.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),11));
        // Je récupére le téléphone portable, colonne 12.
        chpTelportable.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),12));
        // Je récupére l'email, colonne 13.
        chpEmail.setText ((String) TableProspects.getModel().getValueAt(TableProspects.getSelectedRow(),13));
    }//GEN-LAST:event_TableProspectsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AddProspect1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProspect1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProspect1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProspect1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProspect1 dialog = null;
                try {
                    dialog = new AddProspect1(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(AddProspect1.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTable TableProspects;
    private javax.swing.JLabel Titre;
    private javax.swing.JTextField chpAdresse1;
    private javax.swing.JTextField chpAdresse2;
    private javax.swing.JTextField chpCodepostal;
    private javax.swing.JTextField chpDatevisite;
    private javax.swing.JTextField chpEmail;
    private javax.swing.JTextField chpNom;
    private javax.swing.JTextField chpNomenseigne;
    private javax.swing.JTextField chpPrenom;
    private javax.swing.JTextField chpSiret;
    private javax.swing.JTextField chpTelfixe;
    private javax.swing.JTextField chpTelportable;
    private javax.swing.JTextField chpVille;
    private javax.swing.JComboBox<String> comboPays;
    private javax.swing.JPanel fondcouleur1;
    private javax.swing.JPanel fondcouleur2;
    private javax.swing.JLabel imagefond;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAddresse1;
    private javax.swing.JLabel lbCodepostal;
    private javax.swing.JLabel lbDatevisite;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbNomenseigne;
    private javax.swing.JLabel lbPays;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbSiret;
    private javax.swing.JLabel lbTelfixe;
    private javax.swing.JLabel lbTelportable;
    private javax.swing.JLabel lbVille;
    private javax.swing.JMenu mAide;
    private javax.swing.JMenu mAjouter;
    private javax.swing.JMenu mModifier;
    private javax.swing.JMenu mRetour;
    private javax.swing.JLabel titreContact;
    // End of variables declaration//GEN-END:variables
}
