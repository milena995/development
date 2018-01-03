package store.entity;
// Generated Jan 3, 2018 7:59:26 PM by Hibernate Tools 4.3.1



/**
 * UseCaseKonekcijaId generated by hbm2java
 */
public class UseCaseKonekcijaId  implements java.io.Serializable {


     private int id;
     private int crtezId;

    public UseCaseKonekcijaId() {
    }

    public UseCaseKonekcijaId(int id, int crtezId) {
       this.id = id;
       this.crtezId = crtezId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getCrtezId() {
        return this.crtezId;
    }
    
    public void setCrtezId(int crtezId) {
        this.crtezId = crtezId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UseCaseKonekcijaId) ) return false;
		 UseCaseKonekcijaId castOther = ( UseCaseKonekcijaId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getCrtezId()==castOther.getCrtezId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getCrtezId();
         return result;
   }   


}


