import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args) {
        int numberOfFahrenheitsInputed;
        int numberOfFahrenheitsInCelsius = 32;
        int remainderOfFahrenheits;
        int numberOfFahrenheits;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of degrees needed to do the job >>> ");
        numberOfFahrenheitsInputed = keyboard.nextInt();

        numberOfFahrenheits = numberOfFahrenheitsInputed / numberOfFahrenheitsInCelsius;
        remainderOfFahrenheits = numberOfFahrenheitsInputed % numberOfFahrenheitsInCelsius;

        System.out.println("The number of degrees used is " + numberOfFahrenheits +
                " and the numbers of degrees remaining is " + remainderOfFahrenheits);
    }
}
