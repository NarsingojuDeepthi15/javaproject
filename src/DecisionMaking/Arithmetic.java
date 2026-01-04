package DecisionMaking;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();
        System.out.println("Enter the target operation");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }

}
