package WhileLoop.Lecture;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i = i * 2 + 1;
        }
    }
}
