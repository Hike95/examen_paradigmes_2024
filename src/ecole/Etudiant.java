package ecole;

import java.util.Date;

public class Etudiant extends Individu {
    protected Date dateinscription;
    protected String niveauEtudes;
	public Etudiant(String nom, String prenom,int identifiant,Date dateinscription,String niveauEtudes) {
		

	//	this.dateinscription=dateinscription;
	super(nom,prenom,identifiant);	
	this.dateinscription=dateinscription;
	this.niveauEtudes=niveauEtudes;
	}

	@Override
	public void montrerdetails() {
	   // TODO Auto-generated method stub
	   System.out.println(" nom "+this.nom+" prenom "+this.prenom+" identtifiant "+this.identifiant+" dateInsritption "+this.dateinscription+" niveauEtudes "+niveauEtudes+"   "); 
		  
	}

	
}
