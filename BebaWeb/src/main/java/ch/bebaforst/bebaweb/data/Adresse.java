package ch.bebaforst.bebaweb.data;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;


@Entity

public class Adresse {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Key key;

private String anrede;
private String vorname;
private String name;
private String adresse;
private int plz;
private String ort;


public Key getKey() {
	return key;
}

public String getAnrede() {
	return anrede;
}
public void setAnrede(String anrede) {
	this.anrede = anrede;
}
public String getVorname() {
	return vorname;
}
public void setVorname(String vorname) {
	this.vorname = vorname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getPlz() {
	return plz;
}
public void setPlz(int plz) {
	this.plz = plz;
}
public String getOrt() {
	return ort;
}
public void setOrt(String ort) {
	this.ort = ort;
}

public void save(){
	EntityManager em = EMF.get().createEntityManager();
	try {
	em.persist(this);	
	} finally {
		em.close();
	}

	
}
public void setDummyadress() {
	anrede = "Herr";
	vorname= "Max";
	name="Mustermann";
	adresse= "irgendwo";
	plz=2134;
	ort="WeissnidWo";
	
}
	

	
	
}
