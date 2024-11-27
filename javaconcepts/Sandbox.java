package javaconcepts;
import java.util.Random;
import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {

        // Revisions & Repeated Practices are done in Sandbox! ~~~~

        // Trying to do a fast Recap on weekend just to brush up the concepts😞..
        // Dated - 24/11/24/Sunday

/*
        // Chapter 1-5 revision :-

        String name = "Rahul Lashkari";
        name = name.replace(" ", "_");
        System.out.println(name);
--
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);
--
        String mystring = "This string contains double and  triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
--
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
--
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phy marks");
        m1 = sc.nextByte();
        System.out.println("Enter your eng marks");
        m2 = sc.nextByte();
        System.out.println("Enter your sci marks");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations");
        }
        else{
            System.out.println("Sorry");
        }
--
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
--
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("mon");
            case 2 -> System.out.println("tue");
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("thr");
            case 5 -> System.out.println("fri");
            case 6 -> System.out.println("sat");
            case 7 -> System.out.println("sun");
        }
--

        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);
--

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("It is org site..");
        }
        else if(website.endsWith(".com")){
                System.out.println("It is com site..");
        }
        else if(website.endsWith(".in")){
            System.out.println("It is indian site..");
        }

--
 */

        // Chapter 6-10 revision :-
/*
        int n = 4;
        for (int i=n; i>0;  i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
-----
        int sum = 0;
        int n=4;
        for(int i=0;i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
-----
        int n=2;
        int x=10;
        for(int i=1;i<=x;i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
-----
        int n=2;
        int x=0;
        for(int i=10;i>=x;i--){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
----

        int n = 5;
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
-----
        int n = 8;
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += n*i;
        }
        System.out.println(sum);
-----
        float [] marks = {22.0f, 20.0f, 20.0f, 20.0f, 20.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum);
-----
        float [] marks = {20.2f, 20.2f,20.2f,20.2f,42.0f};
        float num = 42.0f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("It isn't");
        }

        float [] marks = {20.2f, 20.2f,20.2f,20.2f,42.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of avg marks is: " + sum/marks.length);

        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,6,13},
                         {3,7,1}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int i=0; i<result.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
------------------------------------------------------------------------------------------------------------
        // Reverse an array~~
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0;i<n;i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

------------------------------------------------------------------------------------------------------------
*/
        // Find the max. element in an array~~
        int [] arr = {1, 2, 3, 4, 500, 999};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: " + max);

    }
}
