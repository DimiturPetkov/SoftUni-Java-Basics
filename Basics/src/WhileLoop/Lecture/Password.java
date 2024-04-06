package WhileLoop.Lecture;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String tryOut = scanner.nextLine();
        while (!tryOut.equals(password)) {
            tryOut = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
