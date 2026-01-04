package DecisionMaking;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks < 35) {
            System.out.println("fail");

        } else if (marks == 35) {
            System.out.println("Pass");
        } else if (35 < marks && marks < 70) {
            System.out.println("third class");
        } else if (70 < marks && marks < 85) {
            System.out.println("Second class");
        } else {
            System.out.println("First class");
        }
        sc.close();
    }

}
