package physics;

import util.BigNum;

public class Time extends PhysicalUnit {
	public Time(BigNum num) {
		super(num);
	}
	public String toString() {
		BigNum total = num();
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		int days = 0;
		double galac = 0;
		String output = "";
		
		// Treat galactic years
		
		galac = (total.divide(TimeUnit.galactic_year.value())).get_value();
	}
}
