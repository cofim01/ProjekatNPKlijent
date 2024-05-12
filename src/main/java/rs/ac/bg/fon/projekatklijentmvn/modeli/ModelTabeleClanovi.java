package rs.ac.bg.fon.projekatklijentmvn.modeli;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.projekatklijentmvn.formClan.PretragaClanova;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Clan;

/**
 *
 * @author MRDAK-PC
 */
public class ModelTabeleClanovi extends AbstractTableModel {

    private String[] columnName = {"Ime", "Prezime", "Adresa", "Broj telefona"};
    private Class[] columnClass = {String.class, String.class, String.class, String.class};
    private ArrayList<Clan> clanovi = new ArrayList<>();
    private PretragaClanova pretagaClanovaFrm;
    @Override
    public int getRowCount() {
        return clanovi.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clan c = clanovi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getIme();
            case 1:
                return c.getPrezime();
            case 2:
                return c.getAdresa();
            case 3:
                return c.getBrTelefona();
            default:
                return "";

        }
    }
    
    public Clan vratiClana(int index){
        return clanovi.get(index);
    }

    public void setPretagaClanovaFrm(PretragaClanova pretagaClanovaFrm) {
        this.pretagaClanovaFrm = pretagaClanovaFrm;
    }

    public void setSviClanovi(ArrayList<Clan> sviClanovi) {
        this.clanovi = sviClanovi;
        fireTableDataChanged();
    }

    

    public ArrayList<Clan> getSviClanovi() {
        return clanovi;
    }



    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClass[columnIndex];
    }
    
    

}
