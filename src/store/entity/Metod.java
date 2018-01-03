package store.entity;
// Generated Jan 3, 2018 7:59:26 PM by Hibernate Tools 4.3.1



/**
 * Metod generated by hbm2java
 */
public class Metod  implements java.io.Serializable {


     private MetodId id;
     private Interfejs interfejs;
     private Klasa klasa;
     private String naziv;
     private String vidljivost;
     private Byte isStatic;
     private Byte isAbstract;
     private String povratnaVrednost;
     private Integer atributCounter;
     private Argument argument;

    public Metod() {
    }

	
    public Metod(MetodId id, Interfejs interfejs, Klasa klasa) {
        this.id = id;
        this.interfejs = interfejs;
        this.klasa = klasa;
    }
    public Metod(MetodId id, Interfejs interfejs, Klasa klasa, String naziv, String vidljivost, Byte isStatic, Byte isAbstract, String povratnaVrednost, Integer atributCounter, Argument argument) {
       this.id = id;
       this.interfejs = interfejs;
       this.klasa = klasa;
       this.naziv = naziv;
       this.vidljivost = vidljivost;
       this.isStatic = isStatic;
       this.isAbstract = isAbstract;
       this.povratnaVrednost = povratnaVrednost;
       this.atributCounter = atributCounter;
       this.argument = argument;
    }
   
    public MetodId getId() {
        return this.id;
    }
    
    public void setId(MetodId id) {
        this.id = id;
    }
    public Interfejs getInterfejs() {
        return this.interfejs;
    }
    
    public void setInterfejs(Interfejs interfejs) {
        this.interfejs = interfejs;
    }
    public Klasa getKlasa() {
        return this.klasa;
    }
    
    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getVidljivost() {
        return this.vidljivost;
    }
    
    public void setVidljivost(String vidljivost) {
        this.vidljivost = vidljivost;
    }
    public Byte getIsStatic() {
        return this.isStatic;
    }
    
    public void setIsStatic(Byte isStatic) {
        this.isStatic = isStatic;
    }
    public Byte getIsAbstract() {
        return this.isAbstract;
    }
    
    public void setIsAbstract(Byte isAbstract) {
        this.isAbstract = isAbstract;
    }
    public String getPovratnaVrednost() {
        return this.povratnaVrednost;
    }
    
    public void setPovratnaVrednost(String povratnaVrednost) {
        this.povratnaVrednost = povratnaVrednost;
    }
    public Integer getAtributCounter() {
        return this.atributCounter;
    }
    
    public void setAtributCounter(Integer atributCounter) {
        this.atributCounter = atributCounter;
    }
    public Argument getArgument() {
        return this.argument;
    }
    
    public void setArgument(Argument argument) {
        this.argument = argument;
    }




}


