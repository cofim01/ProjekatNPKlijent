
package rs.ac.bg.fon.projekatklijentmvn.modeli;



import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Knjiga;
import rs.ac.bg.fon.projekatzajednickimvn.domen.KnjigaAutor;

/**
 *
 * @author MRDAK-PC
 */
public class ModelTabeleKnjige extends AbstractTableModel {

    private String[] columnName = {"Naziv", "Autor", "Žanr"};
    private Class[] columnClass = {String.class, String.class, String.class};
    private ArrayList<Knjiga> knjige = new ArrayList<>();
    private ArrayList<KnjigaAutor> knjigaAutor = new ArrayList<>();

    @Override
    public int getRowCount() {
        return knjige.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Knjiga k = knjige.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getNaziv();
            case 1:
                return vratiAutoreKnjige(k);
            case 2:
                return k.getZanr();
            default:
                return "";

        }
    }

    public String vratiAutoreKnjige(Knjiga k) {
        String autori = "";
        for (KnjigaAutor ka : knjigaAutor) {
            if (ka.getKnjiga().getNaziv().equals(k.getNaziv())) {
                if (!autori.isEmpty()) {
                    autori = autori + ",";
                }
                autori = autori + ka.getAutor().getIme() + " " + ka.getAutor().getPrezime();
            }
        }
        return autori;
    }

    public Knjiga vratiKnjigu(int index) {
        return knjige.get(index);
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    public void dodajKnjigu(Knjiga k) {
        knjige.add(k);
        fireTableDataChanged();
    }

    public void setKnjigaAutor(ArrayList<KnjigaAutor> knjigaAutor) {
        this.knjigaAutor = knjigaAutor;
    }

    public void setKnjige(ArrayList<Knjiga> knjige) {
        this.knjige = knjige;
        fireTableDataChanged();
    }

    

    

    

}
