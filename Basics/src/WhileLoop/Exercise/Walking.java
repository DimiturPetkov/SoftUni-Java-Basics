package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int purpose = 10000;

        int reachedSteps = 0;

        String text = scanner.nextLine();
        while (!text.equals("Going home")) {
            int steps = Integer.parseInt(text);

            reachedSteps = reachedSteps + steps;

            if (reachedSteps >= purpose) {
                break;
            }

            text = scanner.nextLine();
        }

        if (text.equals("Going home")) {
            int stepsAgain = Integer.parseInt(scanner.nextLine());
            reachedSteps = reachedSteps + stepsAgain;
        }

        int diff = Math.abs(reachedSteps - purpose);
        if (reachedSteps >= purpose) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!" ,  Math.abs(diff));
        } else  {
            System.out.printf("%d more steps to reach goal." , diff);
        }
    }
}
