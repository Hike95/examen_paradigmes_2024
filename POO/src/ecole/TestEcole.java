package ecole;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TestEcole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Individu> listIndividus = new ArrayList<Individu>();

		Date d1 = new Date();

		Etudiant etu1 = new Etudiant("marc", "jim", 989799, d1, "M1");
		Etudiant etu2 = new Etudiant("steve", "jon", 989790, d1, "M2");
		Etudiant etu3 = new Etudiant("marc", "jim", 989796, d1, "L1");

		Enseignant ens1 = new Enseignant("Smith", "Sam", 909090, "programmation", 2300 );
		Enseignant ens2 = new Enseignant("Luc", "Paul", 909090, "Maths", 2300 );
		Enseignant ens3 = new Enseignant("Blaise", "Lucie", 909090, "Physique", 2000);

		listIndividus.add(etu1);
		listIndividus.add(etu2);
		listIndividus.add(etu3);

		listIndividus.add(ens1);
		listIndividus.add(ens2);
		listIndividus.add(ens3);

		for (Individu individu : listIndividus) {

			individu.montrerDetails();
			
		}

	}

}
