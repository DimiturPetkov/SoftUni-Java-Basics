package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;
        int piecesLeft = 0;
        int sumPiedes = 0;

        String text = scanner.nextLine();
        while (!text.equals("STOP")) {
            int n = Integer.parseInt(text);

            sumPiedes = sumPiedes + n;
            piecesLeft = pieces - sumPiedes;

            if (piecesLeft <= 0) {
                break;
            }

            text = scanner.nextLine();
        }
        if (piecesLeft <= 0) {
            System.out.printf("No more cake left! You need %d pieces more." , Math.abs(piecesLeft));
        } else {
            System.out.printf("%d pieces are left." , piecesLeft);
        }
    }
}
