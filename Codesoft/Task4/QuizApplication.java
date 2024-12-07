package Task4;

import java.util.Scanner;

public class QuizApplication {
    static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] questions = {
            {"What is the capital of France?", "1. Berlin", "2. Madrid", "3. Paris", "4. Rome", "3"},
            {"Which planet is known as the Red Planet?", "1. Earth", "2. Mars", "3. Jupiter", "4. Venus", "2"},
            {"Who wrote 'Hamlet'?", "1. Charles Dickens", "2. William Shakespeare", "3. Mark Twain", "4. Leo Tolstoy", "2"}
        };

        for (String[] question : questions) {
            System.out.println("\n" + question[0]);
            for (int i = 1; i <= 4; i++) {
                System.out.println(question[i]);
            }

            long startTime = System.currentTimeMillis();
            System.out.print("Enter your choice (1-4): ");
            int answer = scanner.nextInt();
            long endTime = System.currentTimeMillis();

            if ((endTime - startTime) / 1000 > 10) {
                System.out.println("Time's up! No points for this question.");
            } else if (String.valueOf(answer).equals(question[5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong answer.");
            }
        }

        System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.length);
        scanner.close();
    }
}

