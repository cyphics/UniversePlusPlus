package physics;

import util.BigNum;

public class PhysicalUnit {
	protected BigNum _num_value;

	public PhysicalUnit(BigNum num) {
		_num_value = num;
	}

	public BigNum num() {
		return _num_value;
	}

	public void set(PhysicalUnit val) {
		_num_value = val.num();
	}
	public PhysicalUnit add(PhysicalUnit val) {
		_num_value.add(val.num());
		return this;
	}
	public PhysicalUnit sub(PhysicalUnit val) {
		_num_value.sub(val.num());
		return this;
	}
	public String toString() {
		return _num_value.toString();
	}
	public boolean isEqual(PhysicalUnit val) {
		return _num_value.isEqual(val.num());
	}
	public boolean isBigger(PhysicalUnit val) {
		return _num_value.isBigger(val.num());
	}
	public boolean isBiggerOrEqual(PhysicalUnit val) {
		return _num_value.isBiggerOrEqual(val.num());
	}
	public boolean isSmallerOrEqual(PhysicalUnit val) {
		return !isBigger(val); 
	}
	public boolean isSmaller(PhysicalUnit val) {
		return !isBiggerOrEqual(val);
	}
}
