public class Metoder {
	
	public static void main(String[] args) {

	    for (double i = 40; i >= 30; i=i-10) {
	        double j = 130;
	        double x = celsiusToFahrenheit(0);
	        double y = fahrenheitToCelsius(0);

	        System.out.println(i + "  " + (x + i) + " |  " + (j + i) + "  "
	                + (y + i));
	    }
	}

	public static double celsiusToFahrenheit(double celsius) {
	    return (9/5) * celsius + 32 ;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
	    return ((fahrenheit - 32)*5)/9;

	 }
	}