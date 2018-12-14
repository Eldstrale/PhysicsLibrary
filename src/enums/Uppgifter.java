package enums;

import enums.FluidTable;
import enums.GasTable;
import enums.SolidTable;

public class Uppgifter {

	public static void main(String[] args) {
		System.out.println("Uppgift 1: " + Metoder.volumeToMass(SolidTable.IRON, 1) + " Density");

		System.out.println("Uppgift 2: " + Metoder.svtDistance(2.8, 3600) + " m");

		System.out.println("Uppgift 3: " + Metoder.heat(FluidTable.WATER, 0.005, 1) + " J");

		System.out.println("Uppgift 4: " + Metoder.pressureUnderWater(100) + " pa");

		System.out.println("Uppgift 5: " + (Metoder.velocityToHeight(50 / 3.6) + 1.8) + " m");

		System.out.println("Uppgift 6: " + Metoder.power(Metoder.work(740, 100), 4.4) + " W");

		double height = 10;
		int s = 0;

		while (Metoder.velocityToHeight(Metoder.fallSpeed(height)) > 0.5) {
			height = height * 0.99;
			s++;
		}
		System.out.println("Uppgift 7: " + (s) + " ggr");

		System.out.println("Uppgift 8: " + Metoder.work(700 * 30, 100) + " W");

		System.out.println("Uppgift 9: " + (Metoder.heat(SolidTable.ICE, 0.5, 5) + 2260 * 1E3 * 0.5) + " J");

		System.out.println("Uppgift 11: " + Metoder.fallSpeed(100) + " m/s");

	}

}