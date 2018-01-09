package store.entity;
// Generated Jan 9, 2018 4:38:35 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MetodDb generated by hbm2java
 */
public class MetodDb  implements java.io.Serializable {


     private MetodDbId id;
     private KlasaDb klasaDb;
     private String naziv;
     private String vidljivost;
     private Byte isStatic;
     private Byte isAbstract;
     private String povratnaVrednost;
     private Integer atributCounter;
     private Set argumentDbs = new HashSet(0);

    public MetodDb() {
    }

	
    public MetodDb(MetodDbId id, KlasaDb klasaDb) {
        this.id = id;
        this.klasaDb = klasaDb;
    }
    public MetodDb(MetodDbId id, KlasaDb klasaDb, String naziv, String vidljivost, Byte isStatic, Byte isAbstract, String povratnaVrednost, Integer atributCounter, Set argumentDbs) {
       this.id = id;
       this.klasaDb = klasaDb;
       this.naziv = naziv;
       this.vidljivost = vidljivost;
       this.isStatic = isStatic;
       this.isAbstract = isAbstract;
       this.povratnaVrednost = povratnaVrednost;
       this.atributCounter = atributCounter;
       this.argumentDbs = argumentDbs;
    }
   
    public MetodDbId getId() {
        return this.id;
    }
    
    public void setId(MetodDbId id) {
        this.id = id;
    }
    public KlasaDb getKlasaDb() {
        return this.klasaDb;
    }
    
    public void setKlasaDb(KlasaDb klasaDb) {
        this.klasaDb = klasaDb;
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
    public Set getArgumentDbs() {
        return this.argumentDbs;
    }
    
    public void setArgumentDbs(Set argumentDbs) {
        this.argumentDbs = argumentDbs;
    }




}


