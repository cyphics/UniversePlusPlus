package physics;

import util.BigNum;

public enum DistanceUnit {
	
	// Main distances
	yoctometer(new BigNum(1)),
	zeptometer(yoctometer.value().multiply(Math.pow(10,3))),
	attometer(yoctometer.value().multiply(Math.pow(10,6))),
	femtometer(yoctometer.value().multiply(Math.pow(10,9))),
	picometer(yoctometer.value().multiply(Math.pow(10,12))),
	nanometer(yoctometer.value().multiply(Math.pow(10,15))),
	micrometer(yoctometer.value().multiply(Math.pow(10,18))),
	millimeter(yoctometer.value().multiply(Math.pow(10,21))),
	meter(yoctometer.value().multiply(Math.pow(10,24))),
	kilometer(meter.value().multiply(1000)),
	astro_unit(kilometer.value().multiply(14959787.07)),
	light_year(astro_unit.value().multiply(63241)),
	
	// Secondary distances
	radius_proton(femtometer.value().multiply(0.8)),
	radius_gold_nucleus(femtometer.value().multiply(8.45)),
	radius_hydrogen(picometer.value().multiply(25)),
	radius_carbon(picometer.value().multiply(60)),
	angstrom(meter.value().multiply(Math.pow(10,-10))),
	red_lightwave(nanometer.value().multiply(700)),
	diameter_adn_helix(nanometer.value().multiply(2)),
	diameter_hair(micrometer.value().multiply(75)),
	diameter_galaxy(light_year.value().multiply(30000)),
	space_between_galaxies(light_year.value().multiply(3000000)),
	diameter_universe(light_year.value().multiply(91000000000000.0));
	
	private BigNum _num;
	private DistanceUnit(BigNum value) {
		_num = value;
	}
	
	public BigNum value() {
		return _num;
	}
	
}
