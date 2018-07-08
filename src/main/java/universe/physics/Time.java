package physics;

import util.BigNum;

public class Time extends PhysicalUnit {
	public Time(BigNum num) {
		super(num);
	}
	
	public String toString() {
		double total = num().get_value();
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		int days = 0;
		int years = 0;
		double galac = 0;
		String output = "";
		
		// Treat galactic years
		galac = total / TimeUnit.galactic_year.value().get_value();
		
		if(galac > 1) {
			output += galac + " galactic years";
			return output;
		}
		
		years = (int)(total / 31536000);
		total %= 31536000;
		days = (int)(total / 86400);
		total %= 86400;
		hours = (int)(total / 3600);
		total %= 3600;
		minutes = (int)(total / 60);
		total %= 60;
		seconds = (int)total;

		if(years > 0) {
			output += years + " years ";
		}
		if (days > 0) {
			output += days + " days ";	
		}
		if (hours > 0) {
			output += hours + " hours ";
		}
		if (minutes > 0) {
			output += minutes + " minutes ";
		}
		output += seconds + " seconds ";
		
		return output;
	}
}
