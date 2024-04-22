import java.util.Scanner;

public class Addition {

    public static void main(String[] args){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("Addition of " + a + " and " + b + " is " + c);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
