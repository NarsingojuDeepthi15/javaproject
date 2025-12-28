package DecisionMaking;

public class Condition2 {
    public static void main(String[] args) {
        String test = "Pass";
        if (test == "Pass") {
            System.out.println("Please wait for Further rounds");
            String round1 = "Pass";
            if (round1 == "Pass") {
                System.out.println("You have cleared round1 interview,Please wait for round2");
                String round2 = "Fail";
                if (round2 == "Pass") {
                    System.out.println("You have cleared round2 interview,Please wait for HR round");
                } else {
                    System.out.println("You can go to home");
                }

            } else {
                System.out.println("You can go to home");

            }
        } else {
            System.out.println("You can go to home");
        }

    }
}
