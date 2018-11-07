package enums;

import enums.FluidTable;

public class Method_table {
    
    static double G = 9.82;
    static double ATM = 101.3E3; 
    
    public static void main(String[] args) {
        
    }
    /**
     * ändrar farenheit till celcius
     * @param fahrenheit
     * @return
     */
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit -32) / 1.8;
    }
    //En metod som räknar ut vätsketrycket i en vätska vid ett visst djup.
    public static double kelvinToCelsius(double kelvin) {
        double celsius = kelvin + 273.15;
        return celsius;
        
        
    }
    
    /** En metod som räknar ut vätsketrycket i vatten vid ett visst djup.
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
    /** En metod som räknar ut vätsketrycket i vatten vid ett visst djup
     * 
     * @param deep
     * @return
     */
    public static double pressureUnderWater(double deep) {
        return FluidTable.WATER.density * G * deep;
        
    }
    /** En metod som räknar ut kinetisk energi med hjälp av massa och hastighet.
     * @param mass
     * @param velocity
     * @return
     */
    public static double kineticEnergy(double mass, double velocity)
    return fluidPressure(FluidTable.WATER, 10)


	//double speed = Math.sqrt(height * g * 2);
	
