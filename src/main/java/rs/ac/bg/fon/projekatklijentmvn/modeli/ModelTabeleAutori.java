
package rs.ac.bg.fon.projekatklijentmvn.modeli;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Autor;

/**
 *
 * @author MRDAK-PC
 */
public class ModelTabeleAutori extends AbstractTableModel {
    private String[] columnName={"Ime","Prezime"};
    private Class[] columnClass={String.class,String.class};
    private ArrayList<Autor> autori=new ArrayList<>();
    @Override
    public int getRowCount() {
        return autori.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Autor a=autori.get(rowIndex);
        switch(columnIndex){
            case 0:
                return a.getIme();
            case 1:
                return a.getPrezime();
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
    
    public void  dodajAutora(Autor a){
        autori.add(a);
        fireTableDataChanged();
    }
    
    public ArrayList<Autor> vratiAutore(){
        return autori;
    }
    
    
    
    
    
}
