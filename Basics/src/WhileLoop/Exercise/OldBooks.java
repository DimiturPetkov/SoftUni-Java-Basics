package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int booksSearched = 0;
        boolean wasFound = false;

        String books = scanner.nextLine();
        while (!books.equals("No More Books")) {
            String currentBook = books;
            if (currentBook.equals(text)) {
                wasFound = true;
                break;
            }
            booksSearched++;

            books = scanner.nextLine();
        }
        if (wasFound) {
            System.out.printf("You checked %d books and found it.", booksSearched);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books." , booksSearched);
        }
    }
}
