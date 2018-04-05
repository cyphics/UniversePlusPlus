	package util;
	
	
	public class BigNum {
		private	double _num_value;
		private double _mantissa;
		private int _exponent;
		
		private void factorize() {
			// If value between 0.001 and 9999, do nothing
			if (_num_value >= 0.001 && _num_value < 10000) {
				_mantissa = _num_value;
				_exponent = 0;
				return;
			}
			// 1) Put absoute mantissa between 1 and 10
			// 2) adjust so exposant is % 3
			else {
				int exposant = (_num_value == 0) ? 0 : (int)(Math.log10(Math.abs(_num_value)));
				double mantissa = _num_value * Math.pow(10, -(exposant));
				
				// Put mantissa under 10
				while(Math.abs(mantissa) >= 10 ) {
					mantissa /= 10;
					exposant++;
				}
				
				// Put mantissa above 1
				if (mantissa != 0) {
					while(Math.abs(mantissa)<1 ) {
						mantissa *= 10;
						exposant--;
					}
				}
				
				// Put exposant as multiple of 3
				while(exposant % 3 != 0) {
					mantissa *= 10;
					exposant--;
				}
				
				_mantissa = mantissa;
				_exponent = exposant;
			}
		}
		
		public BigNum() {
			_num_value = 0;
		}
		
		public BigNum(double value) {
			set(value);
		}
		
		public BigNum(double num, int exp) {
			_mantissa = num;
			 _exponent = exp;
			set(num * Math.pow(10, exp));
		}
		
		public double get_value() {
			return _num_value;
		}
		
		public double get_mantissa() {
			return _mantissa;
		}
		
		public int get_exponant() {
			return _exponent;
		}
		
		public String toString() {
			double mantissa;
			int exponant;
			
			// If value is between 0.001 and 9999
			
			if (_num_value > 0.001 && _num_value < 9999) {
			    mantissa = _num_value;
			    exponant = 0;
			}
			else{
				mantissa = get_mantissa();
			    exponant = get_exponant();
			}
			
			// Build output
			String final_string = String.format("%.3f", mantissa);
			
			// Remove trailing 0
			final_string = final_string.indexOf(".") < 0 ? final_string : final_string.replaceAll("0*$", "").replaceAll("\\.$", "");
	
			if (exponant == 3) {
				final_string += "K";
			}
			else if (exponant == 6) {
				final_string += "M";
			}
			else if (exponant > 6 || exponant < 0){
				final_string += " * 10^";
				final_string += get_exponant();
			}
			
			return final_string;
		}
		
		public void set(double new_value) {
			_num_value = new_value;
			factorize();
		}
		
		// Operators
		public BigNum add(BigNum val) {
			set(_num_value + val.get_value());
			return this;	
		}
		public BigNum add(double val) {
			set(_num_value + val);
			return this;
		}
		public BigNum sub(BigNum val) {
			set(_num_value - val.get_value());
			return this;
		}
		public BigNum sub(double val) {
			set(_num_value - val);
			return this;
		}
		public BigNum multiply(double val) {
			set(_num_value * val);
			return this;
		}
		public BigNum multiply(int val) {
			set(_num_value * val);
			return this;
		}
		public BigNum multiply(BigNum val) {
			set(_num_value * val.get_value());
			return this;
		}
		public BigNum divide(double val) {
			set(_num_value / val);
			return this;
		}
		public BigNum divide(int val) {
			set(_num_value / val);
			return this;
		}
		public BigNum divide(BigNum val) {
			set(_num_value / val.get_value());
			return this;
		}
	}
