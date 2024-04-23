/*
Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:
Grade is A if score is > best - 10
Grade is D if score is > best - 20
Grade is C if score is > best - 30
Grade is D if score is > best - 40
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores,
and concludes by displaying the grades.
Sample Run
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is D
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is D
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        int[] studentScores = new int[numStudents];
        char[] studentGrades = new char[numStudents];
        System.out.printf("Enter %d scores: ", numStudents);
        //populate studentScores array
        for (int i = 0; i < numStudents; i++) {
            int score = in.nextInt();
            studentScores[i] = score;
        }

        //determine best score
        int[] arrayForRankingScores = new int[studentScores.length];
        for (int i = 0; i < arrayForRankingScores.length; i++) {
            arrayForRankingScores[i] = studentScores[i];
        }
        Arrays.sort(arrayForRankingScores);
        int bestScore = arrayForRankingScores[studentScores.length - 1];

        //set grading
        int A = bestScore - 10;
        int B = bestScore - 20;
        int C = bestScore - 30;
        int D = bestScore - 40;
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentScores[i] >= A) {
                studentGrades[i] = 'A';
            } else if (studentScores[i] >= B ) {
                studentGrades[i] = 'B';
            } else if (studentScores[i] >= C ) {
                studentGrades[i] = 'C';
            } else if (studentScores[i] >= D ) {
                studentGrades[i] = 'D';
            }
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d score is %d and grade is %s %n", i, studentScores[i], studentGrades[i]);
        }
    }
}
