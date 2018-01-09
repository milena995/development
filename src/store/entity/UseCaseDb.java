package store.entity;
// Generated Jan 9, 2018 4:38:35 PM by Hibernate Tools 4.3.1



/**
 * UseCaseDb generated by hbm2java
 */
public class UseCaseDb  implements java.io.Serializable {


     private UseCaseDbId id;
     private CrtezDb crtezDb;
     private String naziv;
     private Double pocetnaKoorX;
     private Double pocetnaKoorY;
     private Double visina;
     private Double sirina;

    public UseCaseDb() {
    }

	
    public UseCaseDb(UseCaseDbId id, CrtezDb crtezDb) {
        this.id = id;
        this.crtezDb = crtezDb;
    }
    public UseCaseDb(UseCaseDbId id, CrtezDb crtezDb, String naziv, Double pocetnaKoorX, Double pocetnaKoorY, Double visina, Double sirina) {
       this.id = id;
       this.crtezDb = crtezDb;
       this.naziv = naziv;
       this.pocetnaKoorX = pocetnaKoorX;
       this.pocetnaKoorY = pocetnaKoorY;
       this.visina = visina;
       this.sirina = sirina;
    }
   
    public UseCaseDbId getId() {
        return this.id;
    }
    
    public void setId(UseCaseDbId id) {
        this.id = id;
    }
    public CrtezDb getCrtezDb() {
        return this.crtezDb;
    }
    
    public void setCrtezDb(CrtezDb crtezDb) {
        this.crtezDb = crtezDb;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public Double getPocetnaKoorX() {
        return this.pocetnaKoorX;
    }
    
    public void setPocetnaKoorX(Double pocetnaKoorX) {
        this.pocetnaKoorX = pocetnaKoorX;
    }
    public Double getPocetnaKoorY() {
        return this.pocetnaKoorY;
    }
    
    public void setPocetnaKoorY(Double pocetnaKoorY) {
        this.pocetnaKoorY = pocetnaKoorY;
    }
    public Double getVisina() {
        return this.visina;
    }
    
    public void setVisina(Double visina) {
        this.visina = visina;
    }
    public Double getSirina() {
        return this.sirina;
    }
    
    public void setSirina(Double sirina) {
        this.sirina = sirina;
    }




}


