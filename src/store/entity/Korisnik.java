package store.entity;
// Generated Jan 2, 2018 5:10:25 PM by Hibernate Tools 4.3.1



/**
 * Korisnik generated by hbm2java
 */
public class Korisnik  implements java.io.Serializable {


     private int id;
     private Crtez crtez;
     private String ime;
     private String sifra;

    public Korisnik() {
    }

	
    public Korisnik(int id) {
        this.id = id;
    }
    public Korisnik(int id, Crtez crtez, String ime, String sifra) {
       this.id = id;
       this.crtez = crtez;
       this.ime = ime;
       this.sifra = sifra;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Crtez getCrtez() {
        return this.crtez;
    }
    
    public void setCrtez(Crtez crtez) {
        this.crtez = crtez;
    }
    public String getIme() {
        return this.ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getSifra() {
        return this.sifra;
    }
    
    public void setSifra(String sifra) {
        this.sifra = sifra;
    }




}


