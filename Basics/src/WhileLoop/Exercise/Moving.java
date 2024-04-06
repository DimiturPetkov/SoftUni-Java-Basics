package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int box = width * length * height;
        int countPackage = 0;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int packageCount = Integer.parseInt(command);

            countPackage = countPackage + packageCount;

            if (countPackage > box) {
                int diff = Math.abs(box - countPackage);
                System.out.printf("No more free space! You need %d Cubic meters more.", diff);
                break;
            }
            command = scanner.nextLine();
        }
        int diff = Math.abs(box - countPackage);
        if (box >= countPackage) {
            System.out.printf("%d Cubic meters left.", diff);
        }
    }
}
