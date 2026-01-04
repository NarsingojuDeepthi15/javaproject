package DecisionMaking;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().trim().toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Uff, It's a weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Yayy, It's a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        sc.close();

    }

}
