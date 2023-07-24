package corejavaassignm.assignment2.dessert;

public class Candy extends DessertItem {

	private double candyPrice;
	public Candy(double candyprice,double tax) {
		super(tax);
		this.candyPrice = candyprice;
	}

	@Override
	public double getCost() {
		return candyPrice*60;
	}

}
