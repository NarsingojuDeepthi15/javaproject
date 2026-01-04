package DecisionMaking;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Given number is Even");
        } else {
            System.out.println("Given number is Odd");
        }
        sc.close();
    }

}
