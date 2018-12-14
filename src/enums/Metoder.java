package enums;

import enums.FluidTable;
import enums.GasTable;
import enums.SolidTable;

public class Metoder {

	static double G = 9.82;
	static double ATM = 101.3E3;
	static double g_swe = 9.82;
	static double c = 299792458;
	static double R = 8.3144621;
	static double p_0 = 1000;

	public static void main(String[] args) {

	}

	/**
	 * ändrar farenheit till celcius
	 * 
	 * @param fahrenheit
	 * @return
	 */

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}

	/**
	 * En metod som räknar ut vätsketrycket i en vätska vid ett visst djup.
	 * 
	 * @param kelvin
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin + 273.15;
		return celsius;

	}

	/**
	 * En metod som räknar ut vätsketrycket i vatten vid ett visst djup.
	 * 
	 * @param fluid
	 * @param deep
	 * @return
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double p;
		p = fluid.density * G * deep;
		return p;

	}

	/**
	 * En metod som räknar ut vätsketrycket i vatten vid ett visst djup.
	 * 
	 * @param deep
	 * @return
	 */
	public static double pressureUnderWater(double deep) {
		return FluidTable.WATER.density * G * deep;

	}

	/**
	 * En metod som räknar ut kinetisk energi med hjälp av massa och hastighet.
	 * 
	 * @param mass
	 * @param velocity
	 * @return
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double e = 0.5 * mass * velocity * velocity;
		return e;

	}

	/**
	 * En metod som räknar ut potentiell energi med hjälp av massa och höjd.
	 * 
	 * @param mass
	 * @param height
	 * @return
	 */
	public static double potentialEnergy(double mass, double height) {
		double ep = mass * G * height;
		return ep;

	}

	/**
	 * En metod som räknar ut hur hög hastighet man kommer upp i som man släpper ett
	 * föremål från en viss höjd.
	 * 
	 * @param height
	 * @return
	 */

	public static double fallSpeed(double height) {
		double speed = Math.sqrt(height * G * 2);
		return speed;
	}

	/**
	 * En metod som räknar ut skillnad mellan två givna värden.
	 * 
	 * @param first
	 * @param last
	 * @return
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}

	/**
	 * En metod som gör om en viss volym av vätska till en massa.
	 * 
	 * @param fluid
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = volume * fluid.density;
		return mass;
	}

	/**
	 * En metod som gör om en viss volym av gas till en massa.
	 * 
	 * @param gas
	 * @param volume
	 * @return
	 */

	public static double volumeToMass(GasTable gas, double volume) {
		double mass = volume * gas.density;
		return mass;
	}

	/**
	 * En metod som gör om en viss volym av materia till en massa.
	 * 
	 * @param solid
	 * @param volume
	 * @return
	 */

	public static double volumeToMass(SolidTable solid, double volume) {
		double mass = volume * solid.density;
		return mass;
	}

	/**
	 * En metod som räknar ut medelhastigheten med hjälp av sträcka och tid.
	 * 
	 * @param distance
	 * @param time
	 * @return
	 */

	public static double svtVelocity(double distance, double time) {
		double velocity = distance * time;
		return velocity;
	}

	/**
	 * En metod som räknar ut sträcka med hjälp av hastighet och tid.
	 * 
	 * @param velocity
	 * @param time
	 * @return
	 */

	static double svtDistance(double velocity, double time) {
		double distance = velocity * time;
		return distance;
	}

	/**
	 * En metod som räknar ut tid för hjälp av sträcka och hastighet.
	 * 
	 * @param distance
	 * @param velocity
	 * @return
	 */

	double svtTime(double distance, double velocity) {
		double time = distance * velocity;
		return time;
	}

	/**
	 * En metod som räknar ut arbete med hjälp av kraft och sträcka.
	 * 
	 * @param force
	 * @param distance
	 * @return
	 */

	static double work(double force, double distance) {
		double work = force * distance;
		return work;
	}

	/**
	 * En metod som räknar ut effekt med hjälp av arbete och tid.
	 * 
	 * @param work
	 * @param time
	 * @return
	 */

	static double power(double work, double time) {
		double power = work / time;
		return power;
	}

	/**
	 * En metod som räknar ut hur mycket energi som krävs för att värma ett visst
	 * material ett angivet antal grader.
	 * 
	 * @param solid
	 * @param mass
	 * @param deltaT
	 * @return
	 */

	static double heat(SolidTable solid, double mass, double deltaT) {
		double heat = solid.density * mass * deltaT;
		return heat;
	}

	/**
	 * En metod som räknar ut hur mycket energi som krävs för att värma en viss
	 * massa vätska ett angivet antal grader.
	 * 
	 * @param fluid
	 * @param mass
	 * @param deltaT
	 * @return
	 */

	static double heat(FluidTable fluid, double mass, double deltaT) {
		double heat = fluid.density * mass * deltaT;
		return heat;
	}

	/**
	 * En metod som räknar ut hur mycket energi som krävs för att värma en viss
	 * massa gas ett angivet antal grader.
	 * 
	 * @param gas
	 * @param mass
	 * @param deltaT
	 * @return
	 */

	double heat(GasTable gas, double mass, double deltaT) {
		double heat = gas.density * mass * deltaT;
		return heat;
	}

	/**
	 * En metod som räknar ut hur högt ett föremål med en viss hastighet uppåt
	 * kommer.
	 * 
	 * @param velocity
	 * @return
	 */

	static double velocityToHeight(double velocity) {
		double height = (velocity) / (2 * G);
		return height;
	}
}{}