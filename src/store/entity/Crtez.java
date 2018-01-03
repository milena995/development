package store.entity;
// Generated Jan 3, 2018 7:59:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Crtez generated by hbm2java
 */
public class Crtez  implements java.io.Serializable {


     private int id;
     private Korisnik korisnik;
     private String naslov;
     private String tip;
     private Integer counter1;
     private Integer counter2;
     private Set klasas = new HashSet(0);
     private Set dijagramKonekcijas = new HashSet(0);
     private Set aktors = new HashSet(0);
     private Set useCases = new HashSet(0);
     private Set korisniks = new HashSet(0);
     private Set aktorKonekcijas = new HashSet(0);
     private Set interfejses = new HashSet(0);
     private Set useCaseKonekcijas = new HashSet(0);

    public Crtez() {
    }

	
    public Crtez(int id) {
        this.id = id;
    }
    public Crtez(int id, Korisnik korisnik, String naslov, String tip, Integer counter1, Integer counter2, Set klasas, Set dijagramKonekcijas, Set aktors, Set useCases, Set korisniks, Set aktorKonekcijas, Set interfejses, Set useCaseKonekcijas) {
       this.id = id;
       this.korisnik = korisnik;
       this.naslov = naslov;
       this.tip = tip;
       this.counter1 = counter1;
       this.counter2 = counter2;
       this.klasas = klasas;
       this.dijagramKonekcijas = dijagramKonekcijas;
       this.aktors = aktors;
       this.useCases = useCases;
       this.korisniks = korisniks;
       this.aktorKonekcijas = aktorKonekcijas;
       this.interfejses = interfejses;
       this.useCaseKonekcijas = useCaseKonekcijas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Korisnik getKorisnik() {
        return this.korisnik;
    }
    
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    public String getNaslov() {
        return this.naslov;
    }
    
    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }
    public String getTip() {
        return this.tip;
    }
    
    public void setTip(String tip) {
        this.tip = tip;
    }
    public Integer getCounter1() {
        return this.counter1;
    }
    
    public void setCounter1(Integer counter1) {
        this.counter1 = counter1;
    }
    public Integer getCounter2() {
        return this.counter2;
    }
    
    public void setCounter2(Integer counter2) {
        this.counter2 = counter2;
    }
    public Set getKlasas() {
        return this.klasas;
    }
    
    public void setKlasas(Set klasas) {
        this.klasas = klasas;
    }
    public Set getDijagramKonekcijas() {
        return this.dijagramKonekcijas;
    }
    
    public void setDijagramKonekcijas(Set dijagramKonekcijas) {
        this.dijagramKonekcijas = dijagramKonekcijas;
    }
    public Set getAktors() {
        return this.aktors;
    }
    
    public void setAktors(Set aktors) {
        this.aktors = aktors;
    }
    public Set getUseCases() {
        return this.useCases;
    }
    
    public void setUseCases(Set useCases) {
        this.useCases = useCases;
    }
    public Set getKorisniks() {
        return this.korisniks;
    }
    
    public void setKorisniks(Set korisniks) {
        this.korisniks = korisniks;
    }
    public Set getAktorKonekcijas() {
        return this.aktorKonekcijas;
    }
    
    public void setAktorKonekcijas(Set aktorKonekcijas) {
        this.aktorKonekcijas = aktorKonekcijas;
    }
    public Set getInterfejses() {
        return this.interfejses;
    }
    
    public void setInterfejses(Set interfejses) {
        this.interfejses = interfejses;
    }
    public Set getUseCaseKonekcijas() {
        return this.useCaseKonekcijas;
    }
    
    public void setUseCaseKonekcijas(Set useCaseKonekcijas) {
        this.useCaseKonekcijas = useCaseKonekcijas;
    }




}


