package store.entity;
// Generated Jan 2, 2018 5:10:25 PM by Hibernate Tools 4.3.1



/**
 * Interfejs generated by hbm2java
 */
public class Interfejs  implements java.io.Serializable {


     private InterfejsId id;
     private Crtez crtez;
     private String naziv;
     private String metoda;

    public Interfejs() {
    }

	
    public Interfejs(InterfejsId id, Crtez crtez) {
        this.id = id;
        this.crtez = crtez;
    }
    public Interfejs(InterfejsId id, Crtez crtez, String naziv, String metoda) {
       this.id = id;
       this.crtez = crtez;
       this.naziv = naziv;
       this.metoda = metoda;
    }
   
    public InterfejsId getId() {
        return this.id;
    }
    
    public void setId(InterfejsId id) {
        this.id = id;
    }
    public Crtez getCrtez() {
        return this.crtez;
    }
    
    public void setCrtez(Crtez crtez) {
        this.crtez = crtez;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getMetoda() {
        return this.metoda;
    }
    
    public void setMetoda(String metoda) {
        this.metoda = metoda;
    }




}


