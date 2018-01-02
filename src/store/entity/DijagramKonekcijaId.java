package store.entity;
// Generated Jan 2, 2018 5:10:25 PM by Hibernate Tools 4.3.1



/**
 * DijagramKonekcijaId generated by hbm2java
 */
public class DijagramKonekcijaId  implements java.io.Serializable {


     private int crtezId;
     private int vezeId;

    public DijagramKonekcijaId() {
    }

    public DijagramKonekcijaId(int crtezId, int vezeId) {
       this.crtezId = crtezId;
       this.vezeId = vezeId;
    }
   
    public int getCrtezId() {
        return this.crtezId;
    }
    
    public void setCrtezId(int crtezId) {
        this.crtezId = crtezId;
    }
    public int getVezeId() {
        return this.vezeId;
    }
    
    public void setVezeId(int vezeId) {
        this.vezeId = vezeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DijagramKonekcijaId) ) return false;
		 DijagramKonekcijaId castOther = ( DijagramKonekcijaId ) other; 
         
		 return (this.getCrtezId()==castOther.getCrtezId())
 && (this.getVezeId()==castOther.getVezeId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCrtezId();
         result = 37 * result + this.getVezeId();
         return result;
   }   


}


