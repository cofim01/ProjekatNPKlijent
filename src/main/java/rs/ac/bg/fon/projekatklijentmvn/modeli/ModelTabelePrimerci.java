
package rs.ac.bg.fon.projekatklijentmvn.modeli;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.projekatklijentmvn.kontroler.KlijentKontroler;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Knjiga;
import rs.ac.bg.fon.projekatzajednickimvn.domen.PrimerakKnjige;


public class ModelTabelePrimerci extends AbstractTableModel{
    private String[] columnName = {"Sifra", "Broj police", "Godina izdanja","Izdavac","Status"};
    private Class[] columnClass = {Integer.class, Integer.class, Integer.class,String.class,String.class};
    private ArrayList<PrimerakKnjige> listaPrimeraka=new ArrayList<>();
    private Knjiga k;

    public ModelTabelePrimerci(Knjiga k) {
        this.k = k;
    }

    public ModelTabelePrimerci() {
    }
    
    
    
    @Override
    public int getRowCount() {
        return listaPrimeraka.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    public void setListaPrimeraka(ArrayList<PrimerakKnjige> listaPrimeraka) {
        this.listaPrimeraka = listaPrimeraka;
        fireTableDataChanged();
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PrimerakKnjige pk=listaPrimeraka.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pk.getPrimerakId();
            case 1:
                return pk.getBrojPolice();
            case 2:
                return pk.getGodinaIzdanja();
            case 3:
                return pk.getIzdavac().getNaziv();
            case 4:
                return pk.getStatus();
            default:return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }
    
    public void dodajPrimerak(PrimerakKnjige pk){
        listaPrimeraka.add(pk);
        fireTableDataChanged();
    }
    
    public PrimerakKnjige vratiPrimerak(int sifra){
        for(PrimerakKnjige pk:listaPrimeraka){
            if(pk.getPrimerakId()==sifra){
                return pk;
            }
        }
        return null;
        
    }
    
    public ArrayList<PrimerakKnjige> vratiPrimerke(){
        return listaPrimeraka;
    }
    public PrimerakKnjige vratiPrimerakIndex(int index){
        return listaPrimeraka.get(index);
    }
    
    public void obrisiPrimerak(int index){
        listaPrimeraka.remove(index);
        fireTableDataChanged();
    }
    
    public void refresh(Knjiga k){
        try {
            PrimerakKnjige pk=new PrimerakKnjige();
            pk.setKnjiga(k);
            ArrayList<PrimerakKnjige> primerciKnjige=KlijentKontroler.getInstanca().vratiSvePrimerke(pk);
            listaPrimeraka=primerciKnjige;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    
    
    
    
    
    
}
