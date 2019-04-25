import java.util.Scanner;

public class Percentages
{
    public static void main(String[] args){
        double a;
        double b;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number >>>");
        a = input.nextInt();
        System.out.println("Please enter another whole number >>>");
        b = input.nextInt();

        computePercent(a, b);
    }
    public static void computePercent(double a, double b){
        double percent = (a/b)*100;
        System.out.print(a + "is" + percent + "percent of" + b);
    }
}
