import java.util.Scanner;

public class TemperatureConverter {
    private static double celsius;
    private static double fahrenheit;
    private static final int TEMPCHANGE = 32;

    public TemperatureConverter() {
        String input;
        Scanner scan = new Scanner(System.in);
        boolean cOrF;

        System.out.println("_________________________________________________");
        System.out.println("___________________WELCOME_______________________");
        System.out.println("_______TEMPERATURE CONVERTER PROGRAM_____________");
        System.out.println("_________________________________________________");

        System.out.println("Fahrenheit or Celcius?");
        do {
            System.out.println("Please enter F for fahrenheit or C for Celcius:");
            input = scan.next();
        } while (!(input.equalsIgnoreCase("F") || input.equalsIgnoreCase("C")));

        if(input.equalsIgnoreCase("F")){
            cOrF=true;
            setFahrenheit(scan);
        } else {
            cOrF =false;
            setCelsius(scan);
        }
        System.out.println(toString(cOrF));

    }

    public static void setFahrenheit(Scanner sc) {
        System.out.println("Enter your temperature number (fahrenheit)");
        TemperatureConverter.fahrenheit = sc.nextDouble();
        System.out.println("Fahrenheit set to " + fahrenheit);
    }

    public static void setCelsius(Scanner sc) {
        System.out.println("Enter your temperature number (celcius)");
        TemperatureConverter.celsius = sc.nextDouble();
        System.out.println("Celsius set to " + celsius);
    }

    public static double celsiusToFahrenheit() {
        fahrenheit = 1.8 * celsius + TEMPCHANGE;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius() {
        celsius = (fahrenheit - TEMPCHANGE) *5/9;
        return celsius;
    }


    public String toString(boolean cOrF) {
        if(cOrF) {
            return fahrenheit + " degrees fahrenheit is equal to " + fahrenheitToCelsius() +
                    "\ndegrees celsius";
        } else {
            return celsius + " degrees celsius is equal to " + celsiusToFahrenheit() +
                    "\ndegrees fahrenheit";
        }
    }
}

/*
// --- Variable Declaration ---

    Declare Real Celsius // Celsius tempature that we are beginning with

        Declare Real Fahrenheit // Fahrenheit tempature that the Celsius tempature needs to be converted to

        Constant Integer TEMPCHANGE // creating the integer that the tempature changes by

// --- Input ---

        Set TEMPCHANGE = 32 // setting this TEMPCHANGE integer to a constant, that will not change

        Display "please input the Celsius tempature" // Asking the user to display the Celsius tempature that they are starting with

        Input Celsius // storing/assigning the value to variable Celsius

// --- Processing ---

        Set Fahrenheit = 1.8 * Celsius + TEMPCHANGE // setting the Fahrenheit variable = to 1.8 * the original celsius tempature + the tempature change of 32

// --- Output ---

        Display "your Celsius tempature in Fahrenheit is" // letting the user know the next number will be their answer

        Display Fahrenheit = 1.8 * Celsius + TEMPCHANGE // Displaying the result of the calculation creating the fahrenheit tempature
        the comments were a requirement for the assignment so you can ignore them lol
        */
