import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your GPA >>>");
        a = input.nextInt();
        computeCash(a);
    }
    public static void computeCash(int a){
        double percent = (a)*10;
        System.out.print(a + "is your cash");
        }
}
