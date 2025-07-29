import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("From (Celsius/Fahrenheit/Kelvin): ");
        String from = sc.next();

        System.out.print("To (Celsius/Fahrenheit/Kelvin): ");
        String to = sc.next();

        double result = convert(temp, from.toLowerCase(), to.toLowerCase());
        System.out.printf("%.2f° %s = %.2f° %s\n", temp, from, result, to);
    }

    static double convert(double value, String from, String to) {
        if (from.equals(to)) return value;

        if (from.equals("celsius")) {
            if (to.equals("fahrenheit")) return (value * 9 / 5) + 32;
            else if (to.equals("kelvin")) return value + 273.15;
        } else if (from.equals("fahrenheit")) {
            if (to.equals("celsius")) return (value - 32) * 5 / 9;
            else if (to.equals("kelvin")) return (value - 32) * 5 / 9 + 273.15;
        } else if (from.equals("kelvin")) {
            if (to.equals("celsius")) return value - 273.15;
            else if (to.equals("fahrenheit")) return (value - 273.15) * 9 / 5 + 32;
        }
        return 0;
    }
}
