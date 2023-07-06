package heritage;

import java.util.ArrayList;

public class Entreprise {
	ArrayList<Salarie> salaries;

	public Entreprise() {
		salaries = new ArrayList<Salarie>();
	}
	
	public ArrayList<Salarie> getSalaries() {
		return salaries;
	}

	public double getMasseSalariale() {
		double result = 0;
		for (Salarie salarie : salaries) {
			result += salarie.getSalaire();
		}
		return result;
	}
}

