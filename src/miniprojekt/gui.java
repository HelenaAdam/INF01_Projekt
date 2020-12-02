/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojekt;

import miniprojekt.Patient;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Iris Grießmaier, Viktoria Hohenbichler, Helena Adam, Corinna Greiner
 */
public class gui extends javax.swing.JFrame {

    ArrayList<Patient> patienten;

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        patienten = new ArrayList<>();
        passwordpanel.setBackground(new Color(229, 242, 255));
        passwordpanel.setVisible(true);
        warteliste.setVisible(false);
        jl_warteliste.setVisible(false);
        pat_hinzu.setVisible(false);
        jp_naechster_pat.setVisible(false); 
        createPDF.setVisible(false);
        geschlecht_w.setActionCommand("weiblich");
        geschlecht_m.setActionCommand("männlich");
        notfall_ja.setActionCommand("ja");
        notfall_nein.setActionCommand("nein");
        createColums();
        this.getContentPane().setBackground(new Color(229, 242, 255));
        pat_hinzu.setBackground(new Color(229, 242, 255));
        jp_naechster_pat.setBackground(new Color(229, 242, 255));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bg_notfall = new javax.swing.ButtonGroup();
        bg_geschlecht = new javax.swing.ButtonGroup();
        warteliste = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pat_hinzu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        notfall_ja = new javax.swing.JRadioButton();
        notfall_nein = new javax.swing.JRadioButton();
        vorname = new javax.swing.JTextField();
        svnr = new javax.swing.JTextField();
        jl_notfall = new javax.swing.JLabel();
        jl_name = new javax.swing.JLabel();
        jl_vorname = new javax.swing.JLabel();
        jl_svnr = new javax.swing.JLabel();
        b_pat_hinzu = new javax.swing.JButton();
        jl_geschlecht = new javax.swing.JLabel();
        geschlecht_w = new javax.swing.JRadioButton();
        geschlecht_m = new javax.swing.JRadioButton();
        name = new javax.swing.JTextField();
        jl_gebdatum = new javax.swing.JLabel();
        gebdatum = new javax.swing.JTextField();
        jl_warteliste = new javax.swing.JLabel();
        jl_ambulanz = new javax.swing.JLabel();
        jp_naechster_pat = new javax.swing.JPanel();
        jl_naechster_pat = new javax.swing.JLabel();
        b_naechster_pat = new javax.swing.JButton();
        jl_pat_in_beh = new javax.swing.JLabel();
        b_ende = new javax.swing.JButton();
        pdfErstellen = new javax.swing.JButton();
        createPDF = new javax.swing.JButton();
        passwordpanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        hoppla = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        ende = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setColumnSelectionAllowed(true);
        warteliste.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Neue Aufnahme:");

        bg_notfall.add(notfall_ja);
        notfall_ja.setText("ja");

        bg_notfall.add(notfall_nein);
        notfall_nein.setText("nein");

        vorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vornameActionPerformed(evt);
            }
        });

        jl_notfall.setText("Notfall:");

        jl_name.setText("Name:");

        jl_vorname.setText("Vorname:");

        jl_svnr.setText("SVNr:");

        b_pat_hinzu.setText("hinzufügen");
        b_pat_hinzu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_pat_hinzuActionPerformed(evt);
            }
        });

        jl_geschlecht.setText("Geschlecht:");

        bg_geschlecht.add(geschlecht_w);
        geschlecht_w.setText("weiblich");

        bg_geschlecht.add(geschlecht_m);
        geschlecht_m.setText("männlich");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jl_gebdatum.setText("Geburtsdatum");

        javax.swing.GroupLayout pat_hinzuLayout = new javax.swing.GroupLayout(pat_hinzu);
        pat_hinzu.setLayout(pat_hinzuLayout);
        pat_hinzuLayout.setHorizontalGroup(
            pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pat_hinzuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_notfall)
                    .addComponent(jl_geschlecht)
                    .addComponent(jl_vorname)
                    .addComponent(jl_name)
                    .addComponent(jl_svnr)
                    .addComponent(jl_gebdatum))
                .addGap(90, 90, 90)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gebdatum, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(b_pat_hinzu)
                    .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(svnr, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(vorname)
                        .addComponent(name)
                        .addGroup(pat_hinzuLayout.createSequentialGroup()
                            .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(geschlecht_w)
                                .addComponent(notfall_ja))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(notfall_nein)
                                .addComponent(geschlecht_m)))))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        pat_hinzuLayout.setVerticalGroup(
            pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pat_hinzuLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notfall_ja)
                    .addComponent(notfall_nein)
                    .addComponent(jl_notfall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geschlecht_w)
                    .addComponent(geschlecht_m)
                    .addComponent(jl_geschlecht))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_vorname)
                    .addComponent(vorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_name)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_svnr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pat_hinzuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_gebdatum)
                    .addComponent(gebdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_pat_hinzu)
                .addGap(9, 9, 9))
        );

        jl_warteliste.setText("Warteliste:");

        jl_ambulanz.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jl_ambulanz.setText("Ambulanz Joanneum");
        jl_ambulanz.setToolTipText("");

        jl_naechster_pat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jl_naechster_pat.setText("Nächsten Patienten behandeln:");

        b_naechster_pat.setText("Patient aufrufen");
        b_naechster_pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_naechster_patActionPerformed(evt);
            }
        });

        jl_pat_in_beh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jp_naechster_patLayout = new javax.swing.GroupLayout(jp_naechster_pat);
        jp_naechster_pat.setLayout(jp_naechster_patLayout);
        jp_naechster_patLayout.setHorizontalGroup(
            jp_naechster_patLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_naechster_pat, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
            .addGroup(jp_naechster_patLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jp_naechster_patLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_pat_in_beh)
                    .addComponent(b_naechster_pat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_naechster_patLayout.setVerticalGroup(
            jp_naechster_patLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_naechster_patLayout.createSequentialGroup()
                .addComponent(jl_naechster_pat)
                .addGap(34, 34, 34)
                .addComponent(b_naechster_pat)
                .addGap(29, 29, 29)
                .addComponent(jl_pat_in_beh)
                .addGap(0, 96, Short.MAX_VALUE))
        );

        b_ende.setText("Programm schließen");
        b_ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_endeActionPerformed(evt);
            }
        });

        pdfErstellen.setText("PDF erstellen");
        pdfErstellen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfErstellenActionPerformed(evt);
            }
        });

        createPDF.setText("PDF erstellen");
        createPDF.setToolTipText("");
        createPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPDFActionPerformed(evt);
            }
        });

        passwordpanel.setVisible(true);
        passwordpanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordpanelKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Guten Tag, bitte geben Sie Ihr Passwort ein:");

        login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        login.setText("login");
        login.setToolTipText("einloggen erforderlich, um weitere Aktionen durchführen zu können!");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        hoppla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setText("geheimespasswort............");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        ende.setText("Programm schließen");
        ende.setToolTipText("Programm wird beendet");
        ende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordpanelLayout = new javax.swing.GroupLayout(passwordpanel);
        passwordpanel.setLayout(passwordpanelLayout);
        passwordpanelLayout.setHorizontalGroup(
            passwordpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordpanelLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(1, 1, 1))
            .addGroup(passwordpanelLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(passwordpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(passwordpanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(ende, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hoppla, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        passwordpanelLayout.setVerticalGroup(
            passwordpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordpanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoppla, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(ende)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jl_ambulanz, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createPDF)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pat_hinzu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jp_naechster_pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(104, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_ende)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_warteliste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(warteliste, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(passwordpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_ambulanz)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_warteliste)
                    .addComponent(warteliste, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_naechster_pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_ende))
                    .addComponent(pat_hinzu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(passwordpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void vornameActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void b_naechster_patActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            jl_pat_in_beh.setText("");
            jl_pat_in_beh.setText(patienten.get(0).toString() + " in Behandlung");
            dm.removeRow(0);
            patienten.remove(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Alle Patienten wurden behandelt!", "Fehler", JOptionPane.INFORMATION_MESSAGE);
        }
    }                                               

    private void b_endeActionPerformed(java.awt.event.ActionEvent evt) {                                       
        System.exit(0);
    }                                      

    private void b_pat_hinzuActionPerformed(java.awt.event.ActionEvent evt) {                                            

        String geschlecht = null;
        String notfall = "";
        boolean ok = true;
        try {
            try{
            for (int i = 0; i < vorname.getText().length(); i++) {
                    if (!Character.isLetter(vorname.getText().charAt(i))) {
                        try {
                            throw new NamenException();
                        } catch (NamenException ex) {
                            ok = false;
                            JOptionPane.showMessageDialog(this, "Nur Buchstaben erlaubt!", "Fehler", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
             for (int i = 0; i < name.getText().length(); i++) {
                    if (!Character.isLetter(name.getText().charAt(i))) {
                        try {
                            throw new NamenException();
                        } catch (NamenException ex) {
                            ok = false;
                            JOptionPane.showMessageDialog(this, "Nur Buchstaben erlaubt!", "Fehler", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            catch(Exception e){}
            
            if (!svnr.getText().matches("[0-9]*")) {
                throw new SVNException();
            }
            if (Integer.parseInt(svnr.getText()) > 9999 || Integer.parseInt(svnr.getText()) < 1000) {
                throw new SVNException();
            }
            
            try {                      
                if(ok == true){                   
                 geschlecht = bg_geschlecht.getSelection().getActionCommand();
                if (bg_notfall.getSelection().getActionCommand().equals("ja")) {
                    notfall = "ja";
                    patienten.add(0, new Patient(vorname.getText(), name.getText(), geschlecht, svnr.getText(), notfall,gebdatum.getText()));
                } else {
                    notfall = "nein";
                    patienten.add(new Patient(vorname.getText(), name.getText(), geschlecht, svnr.getText(), notfall,gebdatum.getText()));
                }
                erstelletable();
                vorname.setText("");
                name.setText("");
                svnr.setText("");
                gebdatum.setText("");
                bg_geschlecht.clearSelection();
                bg_notfall.clearSelection();
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Fehlende Eingabe!", "Fehler", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SVNException ex) {
            JOptionPane.showMessageDialog(this, "SVNr kann nur eine 4-stellige Zahl enthalten!", "Fehler", JOptionPane.ERROR_MESSAGE);
        }


    }                                           

    private void pdfErstellenActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Document document = new Document();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy - HH:mm");
        String zeitpunkt = sdf.format(date);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Patientlist.pdf"));
            document.open();
            document.add(new Paragraph("Patientenwarteliste (" + zeitpunkt + ")\n\n"));
            for (Patient patient : patienten) {
                 document.add(new Paragraph(patient.getSvnr() + " " + patient.getVorname() + " " + patient.getNachname() + "\n"));
            }
            document.close();
            JOptionPane.showMessageDialog(rootPane, "PDF für die Warteliste wurde erstellt");
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                            

    private void createPDFActionPerformed(java.awt.event.ActionEvent evt) {                                          
         Document document = new Document();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy - HH:mm");
        String zeitpunkt = sdf.format(date);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Patientlist.pdf"));
            document.open();
            document.add(new Paragraph("Patientenwarteliste (" + zeitpunkt + ")\n\n"));
            for (Patient patient : patienten) {
                 document.add(new Paragraph(patient.getSvnr() + " " + patient.getVorname() + " " + patient.getNachname() + "\n"));
            }
            document.close();
            JOptionPane.showMessageDialog(rootPane, "PDF für die Warteliste wurde erstellt");
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        login();
    }                                     

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {                                     
        password.setText("");
    }                                    

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {                                  
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            login();
        }
    }                                 

    private void endeActionPerformed(java.awt.event.ActionEvent evt) {                                     
         System.exit(0);
    }                                    

    private void passwordpanelKeyPressed(java.awt.event.KeyEvent evt) {                                         

    }                                        

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    DefaultTableModel dm;

    private void createColums() {
        dm = (DefaultTableModel) table.getModel();
        dm.addColumn("Vorname");
        dm.addColumn("Nachname");
        dm.addColumn("Geschlecht");
        dm.addColumn("SVNr");
        dm.addColumn("Notfall");
        dm.addColumn("Geburtsdatum");
    }

    private void populate(String vn, String nn, String sex, String svnr, String notfall,String geburtsdatum) {
        String[] rowData = {vn, nn, sex, svnr, notfall,geburtsdatum};
        dm.addRow(rowData);
    }

    private void erstelletable() {
        try {
            dm.getDataVector().removeAllElements();
        } catch (Exception e) {
        }
        for (int i = 0; i < patienten.size(); i++) {
            populate(patienten.get(i).getVorname(), patienten.get(i).getNachname(), patienten.get(i).getGeschlecht(), patienten.get(i).getSvnr(), patienten.get(i).getNotfall(),patienten.get(i).getGeburtsdatum());
        }
    }
    
    private void login() {
        String logincode = "admin";
        char[] zeichen = password.getPassword();
        String passwort = new String(zeichen);
        if (passwort.equals(logincode)) {
            passwordpanel.setVisible(false);
            warteliste.setVisible(true);
            jl_warteliste.setVisible(true);
            pat_hinzu.setVisible(true);
            jp_naechster_pat.setVisible(true);  
            createPDF.setVisible(true);
        } else {
            hoppla.setText("Achtung: Falsches Passwort!");
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b_ende;
    private javax.swing.JButton b_naechster_pat;
    private javax.swing.JButton b_pat_hinzu;
    private javax.swing.ButtonGroup bg_geschlecht;
    private javax.swing.ButtonGroup bg_notfall;
    private javax.swing.JButton createPDF;
    private javax.swing.JButton ende;
    private javax.swing.JButton ende1;
    private javax.swing.JButton ende2;
    private javax.swing.JTextField gebdatum;
    private javax.swing.JRadioButton geschlecht_m;
    private javax.swing.JRadioButton geschlecht_w;
    private javax.swing.JLabel hoppla;
    private javax.swing.JLabel hoppla1;
    private javax.swing.JLabel hoppla2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jl_ambulanz;
    private javax.swing.JLabel jl_gebdatum;
    private javax.swing.JLabel jl_geschlecht;
    private javax.swing.JLabel jl_naechster_pat;
    private javax.swing.JLabel jl_name;
    private javax.swing.JLabel jl_notfall;
    private javax.swing.JLabel jl_pat_in_beh;
    private javax.swing.JLabel jl_svnr;
    private javax.swing.JLabel jl_vorname;
    private javax.swing.JLabel jl_warteliste;
    private javax.swing.JPanel jp_naechster_pat;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JButton login2;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton notfall_ja;
    private javax.swing.JRadioButton notfall_nein;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JPanel passwordpanel;
    private javax.swing.JPanel passwordpanel1;
    private javax.swing.JPanel passwordpanel2;
    private javax.swing.JPanel pat_hinzu;
    private javax.swing.JButton pdfErstellen;
    private javax.swing.JTextField svnr;
    private javax.swing.JTable table;
    private javax.swing.JTextField vorname;
    private javax.swing.JScrollPane warteliste;
    // End of variables declaration                   
}
