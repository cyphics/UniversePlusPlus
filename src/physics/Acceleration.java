package physics;

import util.BigNum;


public class Acceleration extends PhysicalUnit {
	private DistanceUnit _unit;
	
	public Acceleration(BigNum val) {
		super(val);
	}
	public Acceleration(BigNum val, DistanceUnit unit) {
		super(val);
		_unit = unit;
	}
	public void set_unit(DistanceUnit unit) {
		_unit = unit;
	}
	
}
