package enums;

public enum GasTable {

	AIR(1.29, 1.01), O2(1.43, 0.92), OXYGEN(1.43, 0.92), ARGON(1.78, 0.52), HELIUM(0.18, 5.1);

	public double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}