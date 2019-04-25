import java.util.Scanner;

public class ComputeComission
{
    public static void main(String[] args){
        String vType;
        int value;
        double commRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the value of the vehicle >>>>>");
        value = input.nextInt();
        System.out.print("Please enter the commission rate of the vehicle >>>>");
        commRate = input.nextDouble();
        System.out.print("Please enter the type of vehicle >>>>");
        vType = input.next();

        computeComission(value, commRate, vType);

    }
    public static void computeComission(int value, double rate, char vehicle){
        double comission;
        comission = value * rate;
        System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
        System.out.println("With " +(rate * 100) + "% comission rate, the comission is $" + comission);
    }
}
