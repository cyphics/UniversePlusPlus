package physics;

import util.BigNum;

public class Speed extends PhysicalUnit {
	private DistanceUnit _unit;
	public Speed(BigNum value) {
		super(value);
		_unit = DistanceUnit.yoctometer;
	}
	public Speed(BigNum value, DistanceUnit unit) {
		super(value);
		_unit = unit;
	}
	public String toString() {
		BigNum num = _num_value.divide(_unit.value());
		String output = num.toString();
		output += " ";
		output += _unit.name();
		output += "/s";
		
		return output;
	}
}
