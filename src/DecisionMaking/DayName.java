package DecisionMaking;

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day name: ");
        String day = sc.nextLine().trim().toLowerCase();

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday")
                || day.equals("thursday") || day.equals("friday")) {

            System.out.println("Uff, It's a weekday");

        } else if (day.equals("saturday") || day.equals("sunday")) {

            System.out.println("Yayy, It's a weekend");

        } else {
            System.out.println("Invalid day name!");
        }

        sc.close();
    }

}
