package rs.ac.bg.fon.projekatklijentmvn.kontroler;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import rs.ac.bg.fon.projekatklijentmvn.sesija.Sesija;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Autor;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Clan;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Izdavac;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Knjiga;
import rs.ac.bg.fon.projekatzajednickimvn.domen.KnjigaAutor;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Korisnik;
import rs.ac.bg.fon.projekatzajednickimvn.domen.PrimerakKnjige;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Zaduzenje;
import rs.ac.bg.fon.projekatzajednickimvn.domen.Zanr;
import rs.ac.bg.fon.projekatzajednickimvn.komunikacija.Operacije;
import rs.ac.bg.fon.projekatzajednickimvn.komunikacija.StatusOdgovora;
import rs.ac.bg.fon.projekatzajednickimvn.komunikacija.transfer.Odgovor;
import rs.ac.bg.fon.projekatzajednickimvn.komunikacija.transfer.Zahtev;



/**
 *
 * @author MRDAK-PC
 */
public class KlijentKontroler {

    public static KlijentKontroler instanca;

    private KlijentKontroler() {
    }

    public static KlijentKontroler getInstanca() {
        if (instanca == null) {
            instanca = new KlijentKontroler();
        }
        return instanca;
    }

    public Korisnik logovanje(Korisnik k) throws Exception {
        return (Korisnik) posaljiZahtev(Operacije.LOGOVANJE, k);

    }

    public int dodajClana(Clan c) throws Exception {
        return (int) posaljiZahtev(Operacije.DODAJ_CLANA, c);

    }

    public void izmeniClana(Clan c) throws Exception {
        posaljiZahtev(Operacije.AZURIRAJ_CLANA, c);

    }


    public ArrayList<Clan> vratiSveClanove(Clan c) throws Exception {
        return (ArrayList<Clan>) posaljiZahtev(Operacije.VRATI_SVE_CLANOVE, c);
    }
    
    public ArrayList<Clan> vratiClanovePoUslovu(Clan c) throws Exception{
        return (ArrayList<Clan>) posaljiZahtev(Operacije.VRATI_CLANOVE_SA_USLOVOM, c);
    
    }
    
    public ArrayList<Knjiga> vratiKnjigevePoUslovu(Knjiga k) throws Exception{
        return (ArrayList<Knjiga>) posaljiZahtev(Operacije.VRATI_KNJIGE_SA_USLOVOM, k);
    
    }

    public ArrayList<Autor> vratiSveAutore(Autor a) throws Exception {
        return (ArrayList<Autor>) posaljiZahtev(Operacije.VRATI_SVE_AUTORE, a);

    }

    public ArrayList<Izdavac> vratiSveIzdavace(Izdavac i) throws Exception {
        return (ArrayList<Izdavac>) posaljiZahtev(Operacije.VRATI_SVE_IZDAVACE, i);
    }

    public int dodajKnjigu(Knjiga k) throws Exception {
        return (int) posaljiZahtev(Operacije.DODAJ_KNJIGU, k);

    }

    public void obrisiKnjigu(Knjiga k) throws Exception {
        posaljiZahtev(Operacije.OBRSI_KNJIGU, k);

    }

    public ArrayList<Knjiga> vratiSveKnjige(Knjiga k) throws Exception {
        return (ArrayList<Knjiga>) posaljiZahtev(Operacije.VRATI_SVE_KNJIGE, k);

    }
    
    public void izmeniPrimerak(PrimerakKnjige pk) throws Exception{
        posaljiZahtev(Operacije.IZMENI_PRIMERAK, pk);
    }
    
    public int dodajAutoreKnjige(KnjigaAutor ka) throws Exception {
        return (int) posaljiZahtev(Operacije.DODAJ_AUTORE_KNJIGE, ka);

    }

    public ArrayList<KnjigaAutor> vratiSveAutoreKnjige(KnjigaAutor ka) throws Exception {
        return (ArrayList<KnjigaAutor>) posaljiZahtev(Operacije.VRATI_SVE_AUTORE_KNJIGE, ka);

    }

    public ArrayList<Zanr> vratiSveZanrove(Zanr z) throws Exception {
        return (ArrayList<Zanr>) posaljiZahtev(Operacije.VRATI_SVE_ZANROVE, z);

    }

    public void zaduziKnjigu(Zaduzenje z) throws Exception {
        posaljiZahtev(Operacije.DODAJ_ZADUZENJE, z);

    }

    public void razduziKnjigu(Zaduzenje z) throws Exception {
        posaljiZahtev(Operacije.RAZDUZI, z);

    }
    
    public ArrayList<Zaduzenje> vratiSvaZaduzenja(Zaduzenje z) throws Exception{
        return (ArrayList<Zaduzenje>)posaljiZahtev(Operacije.VRATI_SVA_ZADUZENJA, z);
    }
    
    public ArrayList<PrimerakKnjige> vratiSvePrimerke(PrimerakKnjige pk) throws Exception{
        return (ArrayList<PrimerakKnjige>)posaljiZahtev(Operacije.VRATI_SVE_PRIMERKE,pk);
    }
    
    public int dodajPrimerakKnjige(PrimerakKnjige pk) throws Exception{
        return (int)posaljiZahtev(Operacije.DODAJ_PRIMERAK, pk);
    }
    
    public void odjava() throws Exception{
        posaljiZahtev(Operacije.ODJAVA, Sesija.getInstanca().getAdmin());
    }

    public Object posaljiZahtev(Operacije op, Object podaci) throws Exception {
        Zahtev z = new Zahtev(op, podaci);
        ObjectOutputStream out = new ObjectOutputStream(Sesija.getInstanca().getSoket().getOutputStream());
        out.writeObject(z);
        ObjectInputStream in = new ObjectInputStream(Sesija.getInstanca().getSoket().getInputStream());
        Odgovor o = (Odgovor) in.readObject();
        if (o.getStatus().equals(StatusOdgovora.ERROR)) {
            throw o.getGreska();
        } else {
            return o.getPodaci();
        }

    }

}
