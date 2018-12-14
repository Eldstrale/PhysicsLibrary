package enums;

public enum FluidTable {

	H20(0.998, 4.19, 0, 100, 2260), WATER(0.998, 4.19, 0, 100, 2260), H2SO4(1.84, 1.38, 10, 336, 511), ACETON(0.790,
			2.20, -95, 56, 509), BENSEN(0.879, 1.71, 6, 80, 393), METANOL(0.791, 2.50, -98, 65, 1100);

	public double density;
	double heatCapacity;
	double meltPoint;
	double boilPoint;
	double steamEntalpy;

	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}

}