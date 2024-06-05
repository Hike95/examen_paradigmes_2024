package ecole;



public class Cours {

protected  String titre;
protected  String formateur;
protected int duree;
protected int placesRestantes;

public Cours(String titre,String formateur,int duree,int placesRestantes) {
	
	this.titre=titre;
	this.formateur=formateur;
	this.duree=duree;
	this.placesRestantes=placesRestantes;
	
	
	
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public String getFormateur() {
	return formateur;
}

public void setFormateur(String formateur) {
	this.formateur = formateur;
}

public int getDuree() {
	return duree;
}

public void setDuree(int duree) {
	this.duree = duree;
}

public int getPlacesRestantes() {
	return placesRestantes;
}

public void setPlacesRestantes(int placesRestantes) {
	this.placesRestantes = placesRestantes;
}

public void montrerDetails() {
	
	System.out.println(" titrle "+this.titre+" formateur"+this.formateur+",duree "+this.duree+", placesRestantes"+this.placesRestantes+"");
	
}




}
