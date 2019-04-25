import java.util.Scanner;

public class MetricConversion
{
    public static void main(String[] args) {
        int numberOfCentimetersInputed;
        int numberOfCentimetersInAInch = 2;
        int remainderOfCentimeters;
        int numberOfCentimeters;

        int numberOfLitersInputed;
        int numberOfLitersInAGallon = 3;
        int remainderOfLiters;
        int numberOfLiters;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of centimeters needed to do the job >>> ");
        numberOfCentimetersInputed = keyboard.nextInt();

        numberOfCentimeters = numberOfCentimetersInputed / numberOfCentimetersInAInch;
        remainderOfCentimeters = numberOfCentimetersInputed % numberOfCentimetersInAInch;

        System.out.println("The number of miles ordered is " + numberOfCentimeters +
                " and the numbers of kilometers remaining is " + remainderOfCentimeters);

        System.out.println("Please enter the number of liters needed to do the job >>> ");
        numberOfLitersInputed = keyboard.nextInt();

        numberOfLiters = numberOfLitersInputed / numberOfLitersInAGallon;
        remainderOfLiters = numberOfLitersInputed % numberOfLitersInAGallon;

        System.out.println("The number of miles ordered is " + numberOfLiters +
                " and the numbers of kilometers remaining is " + remainderOfLiters);
    }
}
