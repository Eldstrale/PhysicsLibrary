package enums;

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
 //en metod som gör grader kelvin till celcius
    public static double kelvinToCelsius(double kelvin) {
        double celsius = kelvin + 273.15;
        return celsius;
        
        
    }
    
    //en moted som räknar ut vätske trycket i en vätska vid ett visst tryck
    public static double fluidPressure(FluidTable fluid, double deep) {
        double p;
        p = fluid.density * G * deep;
        return p;
        
    }
    //en metod som räknar vätsketrycket i vatten
    public static double pressureUnderWater(double deep) {
        
        
    }