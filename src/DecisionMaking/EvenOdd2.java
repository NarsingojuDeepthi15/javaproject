package DecisionMaking;

import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println("Given number is Even");
                break;
            case 1:
                System.out.println("Given number is Odd");
                break;
            default:
                System.out.println("The input is invalid");
                break;
        }
        sc.close();

    }

}
