package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());

        int countProblems = 0;
        int countBadGrades = 0;
        double averageScore = 0;
        String lastProblem = "";

        String input = scanner.nextLine();
        while (!input.equals("Enough")) {
            String workName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                countBadGrades++;
            }
            if (countBadGrades >= badGrades) {
                break;
            }
            countProblems++;
            averageScore = averageScore + grade;
            lastProblem = workName;

            input = scanner.nextLine();
        }
        if (countBadGrades >= badGrades) {
            System.out.printf("You need a break, %d poor grades." , countBadGrades);
        } else {
            System.out.printf("Average score: %.2f\n" , averageScore / countProblems);
            System.out.printf("Number of problems: %d\n" , countProblems);
            System.out.printf("Last problem: %s" , lastProblem);
        }
    }
}
