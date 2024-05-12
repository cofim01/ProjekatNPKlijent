
package rs.ac.bg.fon.projekatklijentmvn.formeKnjiga;



import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import rs.ac.bg.fon.projekatklijentmvn.kontroler.KlijentKontroler;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Izdavac;
import rs.ac.bg.fon.projekatzajednickimvn.domen.PrimerakKnjige;

/**
 *
 * @author MRDAK-PC
 */
public class NoviPrimerak extends javax.swing.JDialog {

    /**
     * Creates new form NoviPrimerak
     */
    
    private PrimerakKnjige primerak;
    public NoviPrimerak(java.awt.Frame parent, boolean modal,PrimerakKnjige pk) {
        super(parent, modal);
        initComponents();
        setTitle("Novi primerak");
        pripremiFormu();
        primerak=pk;
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBrojPolice = new javax.swing.JTextField();
        txtGodinaIzdanja = new javax.swing.JTextField();
        cbIzdavac = new javax.swing.JComboBox();
        dodajPrimerak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primerak knjige", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Broj police:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Godina izdanja:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Izdavac:");

        cbIzdavac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dodajPrimerak.setText("Dodaj primerak");
        dodajPrimerak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajPrimerakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbIzdavac, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtBrojPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dodajPrimerak, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrojPolice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbIzdavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(dodajPrimerak)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dodajPrimerakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajPrimerakActionPerformed
        // TODO add your handling code here:
        if(txtBrojPolice.getText().isEmpty() || txtGodinaIzdanja.getText().isEmpty()
                || cbIzdavac.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Sva polja su obavezna");
            return;
        }
        int godina;
        int polica;
        try {
            godina=Integer.parseInt(txtGodinaIzdanja.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Polje godina izdanja mora biti brojevnog tipa");
            return;
        }
        try {
            polica=Integer.parseInt(txtBrojPolice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Polje broj police mora biti brojevnog tipa");
            return;
        }
        DefaultComboBoxModel<Izdavac> model=(DefaultComboBoxModel<Izdavac>) cbIzdavac.getModel();
        Izdavac i=(Izdavac) model.getSelectedItem();
        //primerak=new PrimerakKnjige();
        primerak.setBrojPolice(polica);
        primerak.setGodinaIzdanja(godina);
        primerak.setIzdavac(i);
        primerak.setStatus("Dostupna");
        this.dispose();
        
        
    }//GEN-LAST:event_dodajPrimerakActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbIzdavac;
    private javax.swing.JButton dodajPrimerak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBrojPolice;
    private javax.swing.JTextField txtGodinaIzdanja;
    // End of variables declaration//GEN-END:variables

    private void pripremiFormu() {
        popuniIzdavace();
        AutoCompleteDecorator.decorate(cbIzdavac);
    }
    

    private void popuniIzdavace() {
        try {
            Izdavac i = new Izdavac();
            ArrayList<Izdavac> izdavaci = new ArrayList<>();
            izdavaci = KlijentKontroler.getInstanca().vratiSveIzdavace(i);
            DefaultComboBoxModel<Izdavac> modeli = new DefaultComboBoxModel(izdavaci.toArray());
            cbIzdavac.setModel(modeli);
            cbIzdavac.setSelectedIndex(-1);
        } catch (Exception e) {
        }
    }
    
}
