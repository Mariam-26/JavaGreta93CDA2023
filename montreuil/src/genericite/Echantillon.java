package genericite;

import java.util.ArrayList;

public class Echantillon {
	private ArrayList<Double> valeurs;
	
	public Echantillon() {
		valeurs = new ArrayList<Double>();
	}
	
	public int getTaille() {
		return valeurs.size();
	}

	public double getMinimum() {
		double result = valeurs.get(0);
		for (int i = 1 ; i < valeurs.size() ; i++) {
			if (valeurs.get(i) < result) {
				result = valeurs.get(i);
			}
		}
		return result;
	}

	public double getMoyenne() {
		double somme = 0;
		for (double element : valeurs) {
			somme += element;
		}
		return somme / valeurs.size();
	}

	public double getMaximum() {
		double result = valeurs.get(0);
		for (double element : valeurs) {
			if (element > result) {
				result = element;
			}
		}
		return result;
	}

	public void ajouter(double valeur) {
		valeurs.add(valeur);
	}
}
