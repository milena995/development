package store.entity;
// Generated Jan 3, 2018 7:59:26 PM by Hibernate Tools 4.3.1



/**
 * Argument generated by hbm2java
 */
public class Argument  implements java.io.Serializable {


     private ArgumentId id;
     private Metod metod;
     private Integer id_1;
     private String naziv;
     private String tip;

    public Argument() {
    }

	
    public Argument(Metod metod) {
        this.metod = metod;
    }
    public Argument(Metod metod, Integer id_1, String naziv, String tip) {
       this.metod = metod;
       this.id_1 = id_1;
       this.naziv = naziv;
       this.tip = tip;
    }
   
    public ArgumentId getId() {
        return this.id;
    }
    
    public void setId(ArgumentId id) {
        this.id = id;
    }
    public Metod getMetod() {
        return this.metod;
    }
    
    public void setMetod(Metod metod) {
        this.metod = metod;
    }
    public Integer getId_1() {
        return this.id_1;
    }
    
    public void setId_1(Integer id_1) {
        this.id_1 = id_1;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getTip() {
        return this.tip;
    }
    
    public void setTip(String tip) {
        this.tip = tip;
    }




}


