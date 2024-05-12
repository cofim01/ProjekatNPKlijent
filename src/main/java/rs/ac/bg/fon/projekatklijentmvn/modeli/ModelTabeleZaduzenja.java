package rs.ac.bg.fon.projekatklijentmvn.modeli;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Zaduzenje;

/**
 *
 * @author MRDAK-PC
 */
public class ModelTabeleZaduzenja extends AbstractTableModel {

    private String[] columnName = {"Knjiga", "Datum zaduženja", "Datum razduženja","Sifra primerka"};
    private Class[] columnClass = {String.class, String.class, String.class,Integer.class};
    private ArrayList<Zaduzenje> zaduzenja = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");


    @Override
    public int getRowCount() {
        return zaduzenja.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Zaduzenje zaduzenje = zaduzenja.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return zaduzenje.getPrimerak().getKnjiga().getNaziv();
                
            case 1:
                return sdf.format(zaduzenje.getDatumZaduzenja());
            case 2:
                if(zaduzenje.getDatumRazduzenja()!=null){
                    return sdf.format(zaduzenje.getDatumRazduzenja());
                }else{
                    return "";
                }
            case 3:
                return zaduzenje.getPrimerak().getPrimerakId();
                

            default:
                return "";

        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    public void dodajZaduzenje(Zaduzenje z) {
        zaduzenja.add(z);
        fireTableDataChanged();
    }


    
    public Zaduzenje vratiZaduzenje(int index){
        return zaduzenja.get(index);
    }

    public void setZaduzenja(ArrayList<Zaduzenje> zaduzenja) {
        this.zaduzenja = zaduzenja;
        fireTableDataChanged();
    }

    public ArrayList<Zaduzenje> getZaduzenja() {
        return zaduzenja;
    }
    
    
    



}
