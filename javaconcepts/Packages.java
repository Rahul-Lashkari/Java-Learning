package javaconcepts;

import java.util.Scanner;
//import java.util.*;

public class Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);

        // To use a Java package, the `import` keyword is used to import packages into the Java program.
        // Examples:
        // - `import java.lang.*;` - This imports all classes from the `java.lang` package (e.g., String, Math).
        // - `import java.lang.String;` - This imports only the `String` class from the `java.lang` package.
        // - Alternatively, you can use a fully qualified class name without importing. For example:
        //   `String s = new java.lang.String("Harry");` // Using `String` without an explicit import

        // How to create a package in Java:
        // 1. Write your Java code and include the `package` statement at the top. Example:
        //    `package myPackage;`
        // 2. Compile the file using: `javac -d . FileName.java`
        //    This creates the appropriate directory structure for the package based on its name.

    }
}