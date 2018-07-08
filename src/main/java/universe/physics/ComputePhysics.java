package physics;

import physics.Acceleration;
import physics.Distance;
import physics.Speed;
import physics.Time;
import util.BigNum;

public class ComputePhysics {
	public static Time remainingTime(Distance distance_to_travel, Speed current_speed, Acceleration acceleration) {
		/*
	     Return time it takes to travel distance with given speed and acceleration

	    d=v0t+(at^2/2)d=v0t+(at^2/2)
	    =>
	    t = ( -2v0 +- sqrt( pow(2v0) + 4a * 2d ) ) / 2a
		 */
		if (distance_to_travel.num().isSmaller(new BigNum(0))) {
			System.out.println("Error! Can't compute remaining time with negative distance");
		}
		else if (current_speed.num().isSmaller(new BigNum(0))) {
			System.out.println("Error! Can't compute remaining time with negative speed");
		}
		else if (acceleration.num().isSmaller(new BigNum(0))) {
			System.out.println("Error! Can't compute remaining time with negative acceleration");
		}

		if (acceleration.num().equals(new BigNum(0))) {
			if (current_speed.num().equals(new BigNum(0))) {
				double inf = Double.POSITIVE_INFINITY;
				return new Time(new BigNum(inf));
			}
		}
		
		double delta = Math.sqrt( Math.pow(2 * current_speed.num().get_value(), 2) + 8 * acceleration.num().get_value() * distance_to_travel.num().get_value());
		double numerator_one = -2 * current_speed.num().get_value() + delta;
		double numerator_two = -2 * current_speed.num().get_value() - delta;
		double denominator = 2 * acceleration.num().get_value();
		
		double answer_one = numerator_one / denominator;
		double answer_two = numerator_two / denominator;
		
		if (answer_one > answer_two) return new Time(new BigNum(answer_one));
		return new Time(new BigNum(answer_two));

	}
}
