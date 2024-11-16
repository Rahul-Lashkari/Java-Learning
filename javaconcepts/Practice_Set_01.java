package javaconcepts;
import java.util.Scanner;

public class Practice_Set_01 {
    public static void main(String[] args) {



        //        Question 1 - Write a program to sum three numbers in Java.
//        int a = 4;
//        int b = 17;
//        int c =6;
//        int sum = a + b+c;
//        System.out.println(sum);

//        Question 2 - Write a program to calculate CGPA using marks of three subjects (out of 100).
//    float subject1 = 45;
//    float subject2 = 95;
//    float subject3 = 48;
//    float cgpa = (subject1 + subject2 +subject3)/30;
//    System.out.println(cgpa);

//        Question 3 - Write a Java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day!" text.
//        System.out.println("What is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " have a good day!");

//        Question 4 - Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your Physics marks : ");
//        int physics = scan.nextInt();
//        System.out.println("Enter your English marks : ");
//        int English = scan.nextInt();
//        System.out.println("Enter your Chemistry marks : ");
//        int chemistry = scan.nextInt();
//        System.out.println("Enter your Mathematics marks : ");
//        int mathematics = scan.nextInt();
//        System.out.println("Enter your Computer Science marks : ");
//        int computer = scan.nextInt();
//
//        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;
//
//        System.out.println("percentage : ");
//        System.out.println(percentage);

//        Question 5 - Write a Java program to detect whether a number entered by the user is integer or not.
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
