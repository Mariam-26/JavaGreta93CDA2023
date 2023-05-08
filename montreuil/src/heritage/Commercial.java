package heritage;

public class Commercial extends Salarie {
	private double commission;

	public Commercial(double salaireBase, double commission) {
		super(salaireBase);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	@Override
	public double getSalaire() {
		return super.getSalaire() + commission;
	}
	
	
}
