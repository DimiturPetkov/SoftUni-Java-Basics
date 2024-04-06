package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysSpend = 0;
        int countDays = 0;

        String text1 = scanner.nextLine();
        while (money < neededMoney) {
            String text = text1;
            double sum = Double.parseDouble(scanner.nextLine());

            if (text.equals("spend")) {
                money = money - sum;
                daysSpend++;
                if (money < 0) {
                    money = 0;
                }
            }
            else if (text.equals("save")) {
                money = money + sum;
                daysSpend = 0;
            }
            countDays++;

            if (daysSpend >= 5) {
                break;
            }
            if (money >= neededMoney) {
                break;
            }

            text1 = scanner.nextLine();
        }

        if (daysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d" , countDays);
        } else {
            System.out.printf("You saved the money for %s days.", countDays);
        }
    }
}
