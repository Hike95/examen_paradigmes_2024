package ecole;

import java.util.Date;

public class Etudiant extends Individu {
    protected Date dateInscription;
    protected String niveauEtudes;
	public Etudiant(String nom, String prenom,int identifiant,Date dateInscription,String niveauEtudes) {
		

	//	this.dateinscription=dateinscription;
	super(nom,prenom,identifiant);	
	this.dateInscription=dateInscription;
	this.niveauEtudes=niveauEtudes;
	}

	public void montrerDetails() {
	   // TODO Auto-generated method stub
	   System.out.println(" Etudiant nom "+this.nom+" prenom "+this.prenom+" identifiant "+this.identifiant+" dateInsritption "+this.dateInscription+" niveauEtudes "+this.niveauEtudes+"   "); 
		  
	}

	
}
