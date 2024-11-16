package javaconcepts;
import java.util.Scanner;

public class Practice_Set_02 {
    public static void main(String[] args) {
        // Q1 Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
//        char grade = 'B';
//        grade = (char)(grade + 8);
//        System.out.println(grade);
//        // Decrypting the grade
//        grade = (char)(grade - 8);
//        System.out.println(grade);

        // Q2 Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}