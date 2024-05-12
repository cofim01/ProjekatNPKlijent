
package rs.ac.bg.fon.projekatklijentmvn.formeKnjiga;


import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import rs.ac.bg.fon.projekatklijentmvn.kontroler.KlijentKontroler;
import rs.ac.bg.fon.projekatklijentmvn.modeli.ModelTabeleAutori;
import rs.ac.bg.fon.projekatklijentmvn.modeli.ModelTabelePrimerci1;
import rs.ac.bg.fon.projekatklijentmvn.sesija.Sesija;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Autor;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Knjiga;
import rs.ac.bg.fon.projekatzajednickimvn.domen.KnjigaAutor;
import rs.ac.bg.fon.projekatzajednickimvn.domen.PrimerakKnjige;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Zanr;


/**
 *
 * @author MRDAK-PC
 */
public class NovaKnjiga extends javax.swing.JDialog {

    private Knjiga k;
    public NovaKnjiga(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        pripremiFormu();
        setTitle("Unos nove knjige");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAutori = new javax.swing.JTable();
        cbAutori = new javax.swing.JComboBox();
        btnDodajAutora = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbZanrovi = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaPrimerci = new javax.swing.JTable();
        btnDodajPrimerak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nova knjiga", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Naziv:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autori knjige", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaAutori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaAutori);

        cbAutori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDodajAutora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDodajAutora.setText("Dodaj autora");
        btnDodajAutora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajAutoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbAutori, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDodajAutora, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAutori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajAutora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Žanr:");

        cbZanrovi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbZanrovi, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbZanrovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Sačuvaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primerci knjige", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tabelaPrimerci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaPrimerci);

        btnDodajPrimerak.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDodajPrimerak.setText("Dodaj primerak");
        btnDodajPrimerak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPrimerakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDodajPrimerak, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDodajPrimerak)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ( txtNaziv.getText().isEmpty() || cbZanrovi.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Sva polja su obavezna!");
            return;
        }

        k = new Knjiga();
        k.setNaziv(txtNaziv.getText());
        k.setKorisnik(Sesija.getInstanca().getAdmin());
        k.setZanr(vratiIzabraniZanr());
        ArrayList<PrimerakKnjige> primerci=((ModelTabelePrimerci1)tabelaPrimerci.getModel()).vratiPrimerke();
        k.setPrimerci(primerci);
        
        KnjigaAutor ka = new KnjigaAutor();
        ModelTabeleAutori modelTabele = (ModelTabeleAutori) tabelaAutori.getModel();
        ArrayList<Autor> autori = modelTabele.vratiAutore();
        try {
            int pkk = KlijentKontroler.getInstanca().dodajKnjigu(k);
            k.setKnjigaId(pkk);
            ka.setKnjiga(k);
            for (Autor autor : autori) {
                ka.setAutor(autor);
                KlijentKontroler.getInstanca().dodajAutoreKnjige(ka);
            }
        
            int option=JOptionPane.showConfirmDialog(this, "Sistem je zapamtio knjigu sa primercima. Da li zelite novi unos?", "Info", JOptionPane.YES_NO_OPTION);
            if(option==JOptionPane.YES_OPTION){
                pripremiFormuZaNoviUnos();
            }else{
                this.dispose();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDodajAutoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajAutoraActionPerformed
        // TODO add your handling code here:
        if(cbAutori.getSelectedIndex()!=-1){
        DefaultComboBoxModel<Autor> model = (DefaultComboBoxModel<Autor>) cbAutori.getModel();
        Autor a = (Autor) model.getSelectedItem();
        ModelTabeleAutori modelTabele = (ModelTabeleAutori) tabelaAutori.getModel();
        modelTabele.dodajAutora(a);
        }else{
            JOptionPane.showMessageDialog(this, "Niste izabrali autora.");
        }
    }//GEN-LAST:event_btnDodajAutoraActionPerformed

    private void btnDodajPrimerakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPrimerakActionPerformed
        // TODO add your handling code here:
        PrimerakKnjige pk=new PrimerakKnjige();
        NoviPrimerak frmPrimerak=new NoviPrimerak((Frame)this.getParent(), true, pk);
        frmPrimerak.setVisible(true);
        frmPrimerak.setLocationRelativeTo(null);
        if(pk.getIzdavac()!=null){
            dodajPrimerak(pk);
        }
    }//GEN-LAST:event_btnDodajPrimerakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajAutora;
    private javax.swing.JButton btnDodajPrimerak;
    private javax.swing.JComboBox cbAutori;
    private javax.swing.JComboBox cbZanrovi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaAutori;
    private javax.swing.JTable tabelaPrimerci;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void pripremiFormu() {
        popuniAutore();
        pupuniZanrove();
        pripremiTabelu1();
        pripremiTabelu2();
        AutoCompleteDecorator.decorate(cbAutori); 
        AutoCompleteDecorator.decorate(cbZanrovi);
        
    }

    private void popuniAutore() {
        try {
            Autor a = new Autor();
            ArrayList<Autor> autori = new ArrayList<>();
            autori = KlijentKontroler.getInstanca().vratiSveAutore(a);
            DefaultComboBoxModel<Autor> modela = new DefaultComboBoxModel(autori.toArray());
            cbAutori.setModel(modela);
            cbAutori.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pupuniZanrove() {
        try {
            Zanr z = new Zanr();
            ArrayList<Zanr> zanrovi = new ArrayList<>();
            zanrovi = KlijentKontroler.getInstanca().vratiSveZanrove(z);
            DefaultComboBoxModel<Zanr> modelz = new DefaultComboBoxModel(zanrovi.toArray());
            cbZanrovi.setModel(modelz);
            cbZanrovi.setSelectedIndex(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    private void pripremiTabelu1() {
        ModelTabeleAutori model = new ModelTabeleAutori();
        tabelaAutori.setModel(model);
    }

    private Zanr vratiIzabraniZanr() {
        Zanr z = new Zanr();
        DefaultComboBoxModel<Zanr> model = (DefaultComboBoxModel<Zanr>) cbZanrovi.getModel();
        z = (Zanr) model.getSelectedItem();
        return z;
    }



    private void pripremiFormuZaNoviUnos() {

        txtNaziv.setText("");
        cbAutori.setSelectedIndex(-1);
        cbZanrovi.setSelectedIndex(-1);
        ModelTabeleAutori model=new ModelTabeleAutori();
        tabelaAutori.setModel(model);
        
        ModelTabelePrimerci1 model1=new ModelTabelePrimerci1(k);
        tabelaPrimerci.setModel(model);
    }

    void dodajPrimerak(PrimerakKnjige primerak) {
        ModelTabelePrimerci1 model=(ModelTabelePrimerci1) tabelaPrimerci.getModel();
        model.dodajPrimerak(primerak);
    }

    private void pripremiTabelu2() {
        ModelTabelePrimerci1 model=new ModelTabelePrimerci1(k);
        tabelaPrimerci.setModel(model);
    }
}
