package Demo;
import java.util.*;
public class TemperatureConversion {
	
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	
	public static double celsiusToKelvin(double celsius) {
		return celsius + 273.15;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
	
	public static double fahrenheitToKelvin(double fahrenheit) {
		return (fahrenheit + 459.67) * 5/9;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}
	
	public static double kelvinToFahrenheit(double kelvin) {
		return (kelvin * 9/5) - 459.67;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature value");
		double temperature = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the unit of temperature (Enter C for Celsius, F for Fahrenheit and K for Kelvin)");
		String unit = sc.nextLine().toUpperCase();
		
		switch(unit) {
        case "C":
            double celsiusToFahrenheit = celsiusToFahrenheit(temperature);
            double celsiusToKelvin = celsiusToKelvin(temperature);
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit and %.2f Kelvin.%n",
                    temperature, celsiusToFahrenheit, celsiusToKelvin);
            break;

        case "F":
            double fahrenheitToCelsius = fahrenheitToCelsius(temperature);
            double fahrenheitToKelvin = fahrenheitToKelvin(temperature);
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius and %.2f Kelvin.%n",
                    temperature, fahrenheitToCelsius, fahrenheitToKelvin);
            break;

        case "K":
            double kelvinToCelsius = kelvinToCelsius(temperature);
            double kelvinToFahrenheit = kelvinToFahrenheit(temperature);
            System.out.printf("%.2f Kelvin is equal to %.2f Celsius and %.2f Fahrenheit.%n",
                    temperature, kelvinToCelsius, kelvinToFahrenheit);
            break;

        default:
            System.out.println("Invalid unit of temperature entered please enter valid unit of temperature.");

		}

	}

}
