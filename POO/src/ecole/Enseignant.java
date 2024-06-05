package ecole;

public class Enseignant extends Individu{
    private String specialisation;
    private int salaireMensuel;
    
	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public int getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(int salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	public Enseignant(String nom, String prenom, int identifiant,String specialisation,int salaireMensuel) {
		super(nom, prenom, identifiant);
		this.specialisation=specialisation;
		this.salaireMensuel=salaireMensuel;	
	
	}

	@Override
	public void montrerDetails() {
		// TODO Auto-generated method stub
	  System.out.println("Ensignant nom "+this.nom+" prenom "+this.prenom+" identifiant "+this.identifiant+"   specialisation "+this.specialisation+", salaireMensuel"+this.salaireMensuel+"  "); 
	}

}
