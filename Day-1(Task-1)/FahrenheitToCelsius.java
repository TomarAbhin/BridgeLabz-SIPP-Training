import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Temperature in Fahrenheit:");
        double TempInFahrenheit=sc.nextInt();
        double TempInCelsius = (TempInFahrenheit - 32) * 5.0 / 9.0;
        System.out.println("The temperature in celsius is:"+TempInCelsius);
    }
}
