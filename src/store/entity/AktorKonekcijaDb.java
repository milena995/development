package store.entity;
// Generated Jan 9, 2018 4:38:35 PM by Hibernate Tools 4.3.1



/**
 * AktorKonekcijaDb generated by hbm2java
 */
public class AktorKonekcijaDb  implements java.io.Serializable {


     private AktorKonekcijaDbId id;
     private CrtezDb crtezDb;
     private int aktorId;
     private int uceCaseId;

    public AktorKonekcijaDb() {
    }

    public AktorKonekcijaDb(AktorKonekcijaDbId id, CrtezDb crtezDb, int aktorId, int uceCaseId) {
       this.id = id;
       this.crtezDb = crtezDb;
       this.aktorId = aktorId;
       this.uceCaseId = uceCaseId;
    }
   
    public AktorKonekcijaDbId getId() {
        return this.id;
    }
    
    public void setId(AktorKonekcijaDbId id) {
        this.id = id;
    }
    public CrtezDb getCrtezDb() {
        return this.crtezDb;
    }
    
    public void setCrtezDb(CrtezDb crtezDb) {
        this.crtezDb = crtezDb;
    }
    public int getAktorId() {
        return this.aktorId;
    }
    
    public void setAktorId(int aktorId) {
        this.aktorId = aktorId;
    }
    public int getUceCaseId() {
        return this.uceCaseId;
    }
    
    public void setUceCaseId(int uceCaseId) {
        this.uceCaseId = uceCaseId;
    }




}


