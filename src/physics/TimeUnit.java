package physics;
import util.BigNum;

public enum TimeUnit {
	second(new BigNum(1)),
	minute(second.value().multiply(60)),
	hour(minute.value().multiply(60)),
	day(hour.value().multiply(24)),
	year(day.value().multiply(365)),
	galactic_year(year.value().multiply(250000000));
	
	private BigNum _num;
	private TimeUnit(BigNum value) {
		_num = value;
	}
	
	public BigNum value() {
		return _num;
	}
	
}
