package ecole;

public abstract class Individu {

   protected String nom;
   protected String prenom;
   protected int identifiant;
   
   public Individu(String nom,String prenom,int identifiant) {
	   
	   this.nom=nom;
	   this.prenom=prenom;
	   this.identifiant=identifiant;
	   
	   
   }

   public void SetNom(String nom) {
	   this.nom=nom;
	   
   }
   public void SetPrenom(String prenom) {
	   this.prenom=prenom;
	   
   }

   public void setIdentifiant(int identifiant) {
	   this.identifiant=identifiant;
   }
   public String getNom() {
	   
	   return nom;
   }
	
   public String getPrenom() {
	   
	   return prenom;
	   
   }
   
   public int getIdentifiant() {
	   
	   return identifiant;
	   
   }
   public abstract void montrerdetails(); //{
	   
	//  System.out.println(" nom "+this.nom+" prenom "+this.prenom+" identtifiant "this.identifiant"   "); 
	   
	   
  // }
}
