package WhileLoop.Lecture;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int daw = Integer.parseInt(input);
            if (daw < min) {
                min = daw;
            }
            input= scanner.nextLine();
        }
        System.out.println(min);
    }
}
