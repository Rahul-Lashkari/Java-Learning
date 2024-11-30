package javaconcepts;

import java.util.Scanner;
import java.util.Random;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Stacy");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
}


public class Sandbox {

    static void multiplication(int n){
        for(int i=0;i<=10;i++){
            System.out.format("%d x %d = %d\n", n, i, n*i);
        }
    }

    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n){
        //Base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        } else{
            return fib(n-1) + fib(n-2);
        }
    }

    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }





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
        // Find the max. element in an array~~
        int [] arr = {1, 2, 3, 4, 500, 999};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: " + max);

------------------------------------------------------------------------------------------------------------
        // Q7~
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

------------------------------------------------------------------------------------------------------------
        // Find whether an array is sorted or not~~
        boolean isSorted = true;
        int [] arr = {1, 2, 13, 4, 5, 6, 70};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
------------------------------------------------------------------------------------------------------------
        // multiplication using method~~
        multiplication(4);

------------------------------------------------------------------------------------------------------------
        // printing a pattern~~
        pattern1(4);

------------------------------------------------------------------------------------------------------------
        // sum of 1st n natural numbers using recursive function~~
        int c = sumRec(4);
        System.out.println(c);

------------------------------------------------------------------------------------------------------------
        // print nth term of fibonacchi series~~
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int result = fib(9);
        System.out.println(result);

------------------------------------------------------------------------------------------------------------
        // printing a pattern using recursive func~~
        pattern1_rec(8);
------------------------------------------------------------------------------------------------------------
        // Class Emp with adequate properties & methods~~
        Employee4 Joe = new Employee4();
        Joe.setName("Joe Cullen");
        Joe.salary = 250;
        System.out.println(Joe.getName());
        System.out.println(Joe.getSalary());
------------------------------------------------------------------------------------------------------------
        // Class CellPh with adequate methods~~
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
------------------------------------------------------------------------------------------------------------
        // Class square with adequate methods~~
        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
------------------------------------------------------------------------------------------------------------
        // Class TommyVercetti for Rockstar Games with adequate methods~~
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
------------------------------------------------------------------------------------------------------------
        // Rock, Paper, Scissor, Shoot! Game!~~~~
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissors

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Draw");
        }
        else if ( userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1){
            System.out.println("You Win!");
        }else{
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput == 0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput == 1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput == 2){
            System.out.println("Computer choice: Scissor");
        }
------------------------------------------------------------------------------------------------------------
        // Guess the Number Game!~~~
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
------------------------------------------------------------------------------------------------------------
 */
        // Class Cylinder with adequate getters & setters~~
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder4.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder4.setRadius(9);
        System.out.println(myCylinder.getRadius());
    }
}