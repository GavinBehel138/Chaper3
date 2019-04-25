import java.util.Scanner;

public class ParadiseInfo {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter cutoff price for discount >>");
        price = keyboard.nextDouble();
        System.out.print("Enter a discount rate as a whole number >>");
        discount = keyboard.nextDouble();
        System.out.print("Enter an amount to save as a whole number >>")
        savings = keyboard.nextDouble();

        computeDiscountInfo(price, discount, savings);
    }
    public static void computeDiscountInfo(double price, double discount, double savings){
        savings = price - discount;
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
}
