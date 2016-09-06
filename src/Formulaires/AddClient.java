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
public class AddClient extends javax.swing.JDialog {

    /**
     * Creates new form AddClient
     */
    public AddClient(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        
         /**
        * changer l'icone de la fenêtre
        */
            BufferedImage img = ImageIO.read(AddClient.class.getResource("/Formulaires/logo.png"));
            
            setIconImage(img);
        initComponents();
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
        titreContact = new javax.swing.JLabel();
        lbNomenseigne = new javax.swing.JLabel();
        chpNomenseigne = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fondcouleur1 = new javax.swing.JPanel();
        lbAddresse1 = new javax.swing.JLabel();
        lbCodepostal = new javax.swing.JLabel();
        chpAdresse1 = new javax.swing.JTextField();
        chpAdresse2 = new javax.swing.JTextField();
        chpCodepostal = new javax.swing.JTextField();
        lbDatevisite = new javax.swing.JLabel();
        lbVille = new javax.swing.JLabel();
        chpVille = new javax.swing.JTextField();
        lbPays = new javax.swing.JLabel();
        lbSiret = new javax.swing.JLabel();
        chpSiret = new javax.swing.JTextField();
        chpDatevisite = new javax.swing.JTextField();
        comboPays = new javax.swing.JComboBox<>();
        fondcouleur2 = new javax.swing.JPanel();
        chpPrenom = new javax.swing.JTextField();
        lbTelfixe = new javax.swing.JLabel();
        chpTelfixe = new javax.swing.JTextField();
        lbTelportable = new javax.swing.JLabel();
        chpTelportable = new javax.swing.JTextField();
        lbNom = new javax.swing.JLabel();
        chpNom = new javax.swing.JTextField();
        lbPrenom = new javax.swing.JLabel();
        chpEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataFileTableModel model;
        String nomFichier="Data/Clients.txt";
        TableClients = new javax.swing.JTable();
        lbCommandes = new javax.swing.JLabel();
        chpCommandes = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        imagefond = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mRetour = new javax.swing.JMenu();
        mAjouter = new javax.swing.JMenu();
        mModifier = new javax.swing.JMenu();
        mAide = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ToutBois - Gestion Clients");

        jPanel1.setBackground(new java.awt.Color(187, 235, 219));
        jPanel1.setLayout(null);

        Titre.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Titre.setText("Gestion des clients");
        jPanel1.add(Titre);
        Titre.setBounds(20, 10, 270, 30);

        titreContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titreContact.setText("Contact de l'enseigne");
        jPanel1.add(titreContact);
        titreContact.setBounds(20, 170, 210, 22);

        lbNomenseigne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNomenseigne.setText("Nom de l'enseigne");
        lbNomenseigne.setFocusable(false);
        jPanel1.add(lbNomenseigne);
        lbNomenseigne.setBounds(320, 20, 110, 20);

        chpNomenseigne.setColumns(10);
        chpNomenseigne.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpNomenseigne.setNextFocusableComponent(chpSiret);
        jPanel1.add(chpNomenseigne);
        chpNomenseigne.setBounds(460, 20, 126, 23);

        jButton1.setText("Effacer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 250, 120, 23);

        fondcouleur1.setBackground(new java.awt.Color(191, 191, 179));

        lbAddresse1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAddresse1.setText("Adresse 1");

        lbCodepostal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodepostal.setText("Code Postal");

        chpAdresse1.setColumns(20);
        chpAdresse1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpAdresse1.setText("numero, nom de rue");
        chpAdresse1.setToolTipText("");

        chpAdresse2.setColumns(20);
        chpAdresse2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpAdresse2.setText("complément d'adresse");

        chpCodepostal.setColumns(5);
        chpCodepostal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbDatevisite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatevisite.setText("Date de la dernière visite");

        lbVille.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbVille.setText("Ville");

        chpVille.setColumns(10);
        chpVille.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbPays.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPays.setText("Pays");

        lbSiret.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbSiret.setText("SIRET");

        chpSiret.setColumns(14);
        chpSiret.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpSiret.setNextFocusableComponent(chpDatevisite);

        chpDatevisite.setColumns(10);
        chpDatevisite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpDatevisite.setText("jj/mm/aaaa");

        comboPays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "France", "Belgique", "Suisse", "Pays bas", "-----------", "Afghanistan ", "Afrique du Sud ", "Albanie ", "Algérie ", "Allemagne ", "Angola ", "Antigua-et-Barbuda ", "Arabie saoudite ", "Argentine ", "Arménie ", "Australie ", "Autriche ", "Azerbaïdjan ", "Bahamas ", "Bahreïn ", "Bangladesh ", "Barbade ", "Belau ", "Belgique ", "Belize ", "Bénin ", "Bhoutan ", "Biélorussie ", "Birmanie ", "Bolivie ", "Bosnie-Herzégovine ", "Botswana ", "Brésil ", "Brunei ", "Bulgarie ", "Burkina ", "Burundi ", "Cambodge ", "Cameroun ", "Canada ", "Cap-Vert ", "Chili ", "Chine ", "Chypre ", "Colombie ", "Comores ", "Congo ", "Cook ", "Corée du Nord ", "Corée du Sud ", "Costa Rica ", "Côte d'Ivoire ", "Croatie ", "Cuba ", "Danemark ", "Djibouti ", "Dominique ", "Écosse ", "Égypte ", "Émirats arabes unis ", "Équateur ", "Érythrée ", "Espagne ", "Estonie ", "États-Unis ", "Éthiopie ", "Fidji ", "Finlande ", "France ", "Gabon ", "Gambie ", "Géorgie ", "Ghana ", "Grèce ", "Grenade ", "Guatemala ", "Guinée ", "Guinée-Bissao ", "Guinée équatoriale ", "Guyana ", "Haïti ", "Honduras ", "Hongrie ", "Inde ", "Indonésie ", "Iran ", "Irak ", "Irlande ", "Islande ", "Israël ", "Italie ", "Jamaïque ", "Japon ", "Jordanie ", "Kazakhstan ", "Kenya ", "Kirghizistan ", "Kiribati ", "Koweït ", "Laos ", "Lesotho ", "Lettonie ", "Liban ", "Liberia ", "Libye ", "Liechtenstein ", "Lituanie ", "Luxembourg ", "Macédoine ", "Madagascar ", "Malaisie ", "Malawi ", "Maldives ", "Mali ", "Malte ", "Maroc ", "Marshall ", "Maurice ", "Mauritanie ", "Mexique ", "Micronésie ", "Moldavie ", "Monaco ", "Mongolie ", "Mozambique ", "Namibie ", "Nauru ", "Népal ", "Nicaragua ", "Niger ", "Nigeria ", "Niue ", "Norvège ", "Nouvelle-Zélande ", "Oman ", "Ouganda ", "Ouzbékistan ", "Pakistan ", "Palestine ", "Panama ", "Papouasie - Nouvelle Guinée ", "Paraguay ", "Pays-Bas ", "Pérou ", "Philippines ", "Pologne ", "Portugal ", "Qatar ", "République centrafricaine ", "République démocratique du Con ", "République dominicaine ", "République tchèque ", "Roumanie ", "Royaume-Uni ", "Russie ", "Rwanda ", "Saint-Christophe-et-Niévès ", "Sainte-Lucie ", "Saint-Marin ", "Saint-Siège ", "Saint-Vincent-et-les-Grenadine ", "Salomon ", "Salvador ", "Samoa occidentales ", "Sao Tomé-et-Principe ", "Sénégal ", "Seychelles ", "Sierra Leone ", "Singapour ", "Slovaquie ", "Slovénie ", "Somalie ", "Soudan ", "Sri Lanka ", "Suède ", "Suisse ", "Suriname ", "Swaziland ", "Syrie ", "Tadjikistan ", "Tanzanie ", "Tchad ", "Thaïlande ", "Togo ", "Tonga ", "Trinité-et-Tobago ", "Tunisie ", "Turkménistan ", "Turquie ", "Tuvalu ", "Ukraine ", "Uruguay ", "Vanuatu ", "Venezuela ", "Viêt Nam ", "Yémen ", "Yougoslavie ", "Zambie ", "Zimbabwe " }));

        javax.swing.GroupLayout fondcouleur1Layout = new javax.swing.GroupLayout(fondcouleur1);
        fondcouleur1.setLayout(fondcouleur1Layout);
        fondcouleur1Layout.setHorizontalGroup(
            fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondcouleur1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondcouleur1Layout.createSequentialGroup()
                        .addComponent(lbCodepostal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chpCodepostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondcouleur1Layout.createSequentialGroup()
                        .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSiret)
                            .addComponent(lbAddresse1))
                        .addGap(25, 25, 25)
                        .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fondcouleur1Layout.createSequentialGroup()
                                .addComponent(chpSiret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lbDatevisite)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chpDatevisite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondcouleur1Layout.createSequentialGroup()
                                .addComponent(chpAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chpAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur1Layout.createSequentialGroup()
                                .addComponent(lbVille)
                                .addGap(18, 18, 18)
                                .addComponent(chpVille, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbPays)
                                .addGap(18, 18, 18)
                                .addComponent(comboPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondcouleur1Layout.setVerticalGroup(
            fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSiret, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpSiret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDatevisite, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpDatevisite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpAdresse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpAdresse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPays, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVille, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpCodepostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodepostal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(fondcouleur1);
        fondcouleur1.setBounds(50, 50, 600, 110);

        fondcouleur2.setBackground(new java.awt.Color(191, 191, 179));

        chpPrenom.setColumns(10);
        chpPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpPrenomActionPerformed(evt);
            }
        });

        lbTelfixe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelfixe.setText("Téléphone fixe");

        chpTelfixe.setColumns(10);
        chpTelfixe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbTelportable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelportable.setText("Téléphone portable");

        chpTelportable.setColumns(10);
        chpTelportable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbNom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNom.setText("Nom");

        chpNom.setColumns(10);
        chpNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chpNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chpNomActionPerformed(evt);
            }
        });

        lbPrenom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPrenom.setText("Prénom");

        chpEmail.setColumns(10);
        chpEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEmail.setText("Email");

        javax.swing.GroupLayout fondcouleur2Layout = new javax.swing.GroupLayout(fondcouleur2);
        fondcouleur2.setLayout(fondcouleur2Layout);
        fondcouleur2Layout.setHorizontalGroup(
            fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondcouleur2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNom)
                .addGap(30, 30, 30)
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondcouleur2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondcouleur2Layout.createSequentialGroup()
                        .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrenom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondcouleur2Layout.createSequentialGroup()
                        .addComponent(lbTelfixe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chpTelportable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondcouleur2Layout.createSequentialGroup()
                        .addComponent(lbTelportable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chpTelfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        fondcouleur2Layout.setVerticalGroup(
            fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondcouleur2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrenom)
                    .addComponent(chpPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelportable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpTelfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondcouleur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chpTelportable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(fondcouleur2);
        fondcouleur2.setBounds(50, 200, 600, 70);

        model = new DataFileTableModel(nomFichier);
        TableClients.setModel(model);
        TableClients.createDefaultColumnsFromModel();

        // Retirer les colonnes qu'on ne veut pas afficher dans le tableau
        // Le numéro des colonnes se décale à chaque retrait, d'où les nombreux retraits de la colonne 7
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(2));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(4));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(7));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(7));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(7));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(7));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(7));
        TableClients.removeColumn(TableClients.getColumnModel().getColumn(8));
        TableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClientsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableClients);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 280, 770, 120);

        lbCommandes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCommandes.setText("Nombre de commandes");
        jPanel1.add(lbCommandes);
        lbCommandes.setBounds(640, 0, 150, 20);

        chpCommandes.setColumns(10);
        jPanel1.add(chpCommandes);
        chpCommandes.setBounds(720, 20, 59, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemoins.jpg"))); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 220, 120, 27);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemodif.jpg"))); // NOI18N
        jButton3.setText("Modifier");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButton3);
        jButton3.setBounds(660, 190, 120, 27);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeplus.jpg"))); // NOI18N
        jButton4.setText("Ajouter");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jButton4);
        jButton4.setBounds(660, 160, 120, 27);

        imagefond.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        imagefond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/meubles4.jpg"))); // NOI18N
        jPanel1.add(imagefond);
        imagefond.setBounds(0, -30, 790, 480);

        mRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconearbre.jpg"))); // NOI18N
        mRetour.setText("Retour à la fenêtre principale");
        mRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mRetourMouseClicked(evt);
            }
        });
        jMenuBar1.add(mRetour);

        mAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeplus.jpg"))); // NOI18N
        mAjouter.setText("Ajouter le nouveau client");
        mAjouter.setToolTipText("");
        jMenuBar1.add(mAjouter);

        mModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconemodif.jpg"))); // NOI18N
        mModifier.setText("Modifier le client");
        jMenuBar1.add(mModifier);

        mAide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formulaires/iconeaide.jpg"))); // NOI18N
        mAide.setText("Aide");
        jMenuBar1.add(mAide);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
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
        chpCommandes.setText ("") ;
  
        TableClients.getSelectionModel().clearSelection();

    }//GEN-LAST:event_jButton1MouseClicked

    private void TableClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClientsMouseClicked
     // Je récupére le nom de l'enseigne, colonne 1.
        chpNomenseigne.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),1));
        // Je récupére le numéro de Siret, colonne 2.
        chpSiret.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),2));
       // Je récupére la date de la dernière visite, colonne 3.
         chpDatevisite.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),3));
         // Je récupére l'adresse, colonne 4.
        chpAdresse1.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),4));
        // Je récupére le complément d'adresse, colonne 5.
        chpAdresse2.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),5));
        // Je récupére le code postal, colonne 6.
        chpCodepostal.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),6));
        // Je récupére la ville, colonne 7.
        chpVille.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),7));
        // Je récupére le pays, colonne 8.
       // comboPays.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),8));
        // Je récupére le nom de contact, colonne 9.
        chpNom.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),9));
        // Je récupére le prénom, colonne 10.
        chpPrenom.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),10));
         // Je récupére le téléphone fixe, colonne 11.
        chpTelfixe.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),11));
        // Je récupére le téléphone portable, colonne 12.
        chpTelportable.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),12));
        // Je récupére l'email, colonne 13.
        chpEmail.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),13));
         // Je récupére le nombre des commandes, colonne 14.
        chpCommandes.setText ((String) TableClients.getModel().getValueAt(TableClients.getSelectedRow(),14));
       
    }//GEN-LAST:event_TableClientsMouseClicked

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
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddClient dialog = null;
                try {
                    dialog = new AddClient(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTable TableClients;
    private javax.swing.JLabel Titre;
    private javax.swing.JTextField chpAdresse1;
    private javax.swing.JTextField chpAdresse2;
    private javax.swing.JTextField chpCodepostal;
    private javax.swing.JTextField chpCommandes;
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAddresse1;
    private javax.swing.JLabel lbCodepostal;
    private javax.swing.JLabel lbCommandes;
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
