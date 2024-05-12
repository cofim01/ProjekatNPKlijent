
package rs.ac.bg.fon.projekatklijentmvn.sesija;


import java.io.IOException;
import java.net.Socket;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Korisnik;

/**
 *
 * @author MRDAK-PC
 */
public class Sesija {
    
    private static Sesija instanca;
    private Korisnik admin;
    private Socket soket;

    public Sesija() {
        try {
            soket=new Socket("localhost", 9000);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Sesija getInstanca() {
        if(instanca==null){
            instanca=new Sesija();
        }
        return instanca;
    }

    public Socket getSoket() {
        return soket;
    }

    public void setAdmin(Korisnik admin) {
        this.admin = admin;
    }

    public Korisnik getAdmin() {
        return admin;
    }
    
    
    
    
    
    
}
