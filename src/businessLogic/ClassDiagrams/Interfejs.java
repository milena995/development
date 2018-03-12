package businessLogic.ClassDiagrams;

import businessLogic.AbstractClassHierarchy.ClassDiagramElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import store.entity.*;

public class Interfejs extends ClassDiagramElement {

	private int crtezID;
	private int ID;
	private String naziv;
	private int metodCounter;
	private ArrayList<Metod> metode;
        
        public Interfejs()
        {
            this.metodCounter=0;
            this.metode=new ArrayList<Metod>();
        }

	public int getCrtezID() {
		return this.crtezID;
	}
	public void setCrtezID(int crtezID) {
		this.crtezID = crtezID;
	}

	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}

	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getMetodCounter() {
		return this.metodCounter;
	}
	public void setMetodCounter(int metodCounter) {
		this.metodCounter = metodCounter;
	}

	public ArrayList<Metod> getMetode() {
		return this.metode;
	}
	public void setMetode(ArrayList<Metod> metode) {
		this.metode = metode;
	}
        
	public void dodajMetodu(Metod met) {
		met.setCrtezID(this.crtezID);
                met.setKlasaIliInterfejsID(this.ID);
                met.setID(this.metodCounter);
                this.metodCounter++;
                this.metode.add(met);
	}
	public void obrisiMetodu(int id) {
		this.metode.removeIf((Metod obj) -> obj.getID() == id);
	}

        @Override
        public int getElemId() {
            return this.ID;
        }
        
        @Override
        public void setElemId(int id){
            this.ID=id;
        }

        @Override
        public void setCrtezIdentifikator(int id) {
            this.crtezID=id;
        }
        

}