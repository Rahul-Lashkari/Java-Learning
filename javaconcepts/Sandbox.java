package javaconcepts;

import java.util.Scanner;
import java.util.Random;

//----------------------------------------------------------------------------------------------
    // Revisions & Repeated Practices are done in Sandbox! ~~~~
    // I Try to do a fast Recap on the weekends just to brush up the concepts😞😙..
//----------------------------------------------------------------------------------------------

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

class Rectangle2{
    public int length;
    public int breadth;

    public Rectangle2(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle2(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}

class Base2{
    Base2(){
        System.out.println("I am a constructor");
    }
    Base2(int x){
        System.out.println("I'm an overloaded constructor with value of x as: " + x);
    }
}

class Derived2 extends Base2{
    Derived2(){
        //super(0);
        System.out.println("I'm a derived class constructor");
    }
    Derived2(int x, int y){
        super(x);
        System.out.println("I'm an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildofDerived2 extends Derived2{
    ChildofDerived2(){
        System.out.println("I'm a child of derived constructor");
    }
    ChildofDerived2(int x, int y, int z){
        super(x, y);
        System.out.println("I'm an overloaded constructor of Derived with value of z as: " + z);
    }
}

class oneClass{
    int a;
    public int getA(){
        return a;
    }
    oneClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class twoClass extends oneClass {
    twoClass(int c) {
        super(c);
        System.out.println("I'm a constructor");
    }
}

class A1{
    public int a;
    public int rahul(){
        return 5;
    }
    public void meth2(){
        System.out.println("I'm a method 2 of class A1");
    }
}

class B1 extends A1{
    @Override
    public void meth2(){
        System.out.println("I'm method 2 of class B1");
    }
    public void meth3(){
        System.out.println("I'm method 3 of class B1");
    }
}

class Phone1{
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}

class SmartPhone1 extends Phone1{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of circle1");
    }
    Circle1(int r){
        System.out.println("I am circle1 parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder2 extends Circle1{
    public int height;
    Cylinder2(int r, int h){
        super(r);
        System.out.println("I am cylinder2 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

abstract class Parent3{
    public Parent3(){
        System.out.println("Mai Parent3 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child4 extends Parent3{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child5 extends Parent3{
    public void test(){
        System.out.println("This is a test");
    }
}

interface Bicycle2{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle2{
    int x = 45;
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle2 implements Bicycle2, HornBicycle2{
    //public int x = 5;
    void blowHorn2(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po");
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}

interface Animal {
    void speak();

    default void sleep() {
        System.out.println("The animal is sleeping...");
    }
}

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof! Woof!");
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }
}

interface Calculator {
    int add(int a, int b);

    // Default method
    default int multiply(int a, int b) {
        return a * b;
    }
}

class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

abstract class Vehicle6 {
    abstract void fuelType();

    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

interface Electric {
    void charge();
}

class Tesla extends Vehicle6 implements Electric {
    @Override
    void fuelType() {
        System.out.println("This vehicle runs on electricity.");
    }

    @Override
    public void charge() {
        System.out.println("Charging the Tesla...");
    }
}

interface Drawable {
    void draw();
}

interface Colorable {
    void fillColor(String color);
}

class Circle2 implements Drawable, Colorable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void fillColor(String color) {
        System.out.println("Filling the circle with color: " + color);
    }
}

interface Addition {
    int add(int a, int b);
}

interface Subtraction {
    int subtract(int a, int b);
}

interface Multiplication {
    int multiply(int a, int b);
}

class Calculator2 implements Addition, Subtraction, Multiplication {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}

interface sampleInterface1{
    void meth1();
    void meth2();
}
interface childSampleInterface1 extends javaconcepts.sampleInterface1{
    void meth3();
    void meth4();
}
class MySampleClass1 implements javaconcepts.childSampleInterface1{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

interface MyCamera3{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi3{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone3{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone3 extends MyCellPhone3 implements  MyWifi3, MyCamera3{
    public void takesnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Taking Snap");
    }
//    public void record4kVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Rahul", "Harry", "Aaditya"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}

abstract class Pen1{
    abstract void write();
    abstract void refill();
}

class FountainPen1 extends Pen1{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

class Monkey1{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal1{
    void eat();
    void sleep();
}

class Human2 extends Monkey1 implements BasicAnimal1{
    void speak(){
        System.out.println("Hello sir!");
        }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Library1{
    String[] books;
    int no_of_books;
    Library1(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for(String book: this.books){
            if (book == null){
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}

abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void checkBalance() {
        System.out.println("Account " + accountNumber + " has balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

interface Appliance {
    void turnOn();
    void turnOff();
}

interface Adjustable {
    void increaseSetting();
    void decreaseSetting();
}

class Fan implements Appliance, Adjustable {
    private int speed;

    @Override
    public void turnOn() {
        System.out.println("Fan is now ON.");
        speed = 1;
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF.");
        speed = 0;
    }

    @Override
    public void increaseSetting() {
        if (speed < 5) {
            speed++;
            System.out.println("Fan speed increased to: " + speed);
        } else {
            System.out.println("Fan is already at maximum speed!");
        }
    }

    @Override
    public void decreaseSetting() {
        if (speed > 0) {
            speed--;
            System.out.println("Fan speed decreased to: " + speed);
        } else {
            System.out.println("Fan is already at minimum speed!");
        }
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
------------------------------------------------------------------------------------------------------------
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);
------------------------------------------------------------------------------------------------------------
        String mystring = "This string contains double and  triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
------------------------------------------------------------------------------------------------------------
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
------------------------------------------------------------------------------------------------------------
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
------------------------------------------------------------------------------------------------------------
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
------------------------------------------------------------------------------------------------------------
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
------------------------------------------------------------------------------------------------------------

        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);
------------------------------------------------------------------------------------------------------------

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

------------------------------------------------------------------------------------------------------------
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
------------------------------------------------------------------------------------------------------------
        int sum = 0;
        int n=4;
        for(int i=0;i<n; i++){
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
------------------------------------------------------------------------------------------------------------
        int n=2;
        int x=10;
        for(int i=1;i<=x;i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
------------------------------------------------------------------------------------------------------------
        int n=2;
        int x=0;
        for(int i=10;i>=x;i--){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
------------------------------------------------------------------------------------------------------------

        int n = 5;
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
------------------------------------------------------------------------------------------------------------
        int n = 8;
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += n*i;
        }
        System.out.println(sum);
------------------------------------------------------------------------------------------------------------
        float [] marks = {22.0f, 20.0f, 20.0f, 20.0f, 20.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum);
------------------------------------------------------------------------------------------------------------
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
------------------------------------------------------------------------------------------------------------

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
        // Class Cylinder with adequate getters & setters~~
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder4.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder4.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Surface Area & Vol~~
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
------------------------------------------------------------------------------------------------------------
        // Class Rectangle with adequate getters & setters~~
        Rectangle2 r = new Rectangle2(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
------------------------------------------------------------------------------------------------------------
        // Constructors in Inheritance~~
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
------------------------------------------------------------------------------------------------------------
        // this and super keyword~~
        oneClass e = new oneClass(66);
        twoClass d = new twoClass(5);
        System.out.println(e.getA());
------------------------------------------------------------------------------------------------------------
        // Method Overriding~~
        A1 a = new A1();
        a.meth2();

        B1 b = new B1();
        b.meth2();
------------------------------------------------------------------------------------------------------------
        // Dynamic Method Dispatch~~
        // Phone1 obj = new Phone1(); // Allowed
        // SmartPhone1 smobj = new SmartPhone1(); // Allowed

        Phone1 obj = new SmartPhone1(); // Yes, it's allowed
        // SmartPhone1 obj2 = new Phone1(); // Not Allowed

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed
------------------------------------------------------------------------------------------------------------
        // Practice Questions on Inheritance~~
        // Circle1 objc = new Circle1(12);
        Cylinder2 obj = new Cylinder2(12,4);
------------------------------------------------------------------------------------------------------------
        // Abstract Class & Abstract Methods revision~~
        // Parent3 p = new Parent3(); --error
        Child4 d = new Child4();
        // Child5 c5 = new Child5(); --error
------------------------------------------------------------------------------------------------------------
        // Interfaces revision~~
        AvonCycle2 cycleShreya = new AvonCycle2();
        cycleShreya.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleShreya.a);
        System.out.println(cycleShreya.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycle.Shreya.a = 454;
        // System.out.println(cycleShreya.a);

        cycleShreya.blowHornk3g();
        cycleShreya.blowHornmhn();
------------------------------------------------------------------------------------------------------------
        // Interfaces revision prob 2~~
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
------------------------------------------------------------------------------------------------------------
        // Interfaces revision prob 3~~
        Dog myDog = new Dog();
        myDog.speak();
        myDog.sleep(); // Calls the default method
------------------------------------------------------------------------------------------------------------
        // Interfaces revision prob 4~~
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
------------------------------------------------------------------------------------------------------------
        // Abstract Classes Vs Interfaces revision~~
        Calculator calc = new BasicCalculator();
        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Product: " + calc.multiply(10, 20));
------------------------------------------------------------------------------------------------------------
        // Abstract Classes Vs Interfaces revision prob 2~~
        Tesla myCar = new Tesla();
        myCar.displayInfo();
        myCar.fuelType();
        myCar.charge();
------------------------------------------------------------------------------------------------------------
        // Abstract Classes Vs Interfaces revision prob 3~~
        Circle2 myCircle = new Circle2();
        myCircle.draw();
        myCircle.fillColor("Blue");
------------------------------------------------------------------------------------------------------------
        // Abstract Classes Vs Interfaces revision prob 4~~
        Calculator2 calc = new Calculator2();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
------------------------------------------------------------------------------------------------------------
        // Inheritance in Interfaces revision~~
        MySampleClass1 obj = new MySampleClass1();
        obj.meth1();
        obj.meth2();
        obj.meth3();
------------------------------------------------------------------------------------------------------------
        // Polymorphism in Interfaces revision~~
        MyCamera3 cam2 = new MySmartPhone3(); // This is a smartphone but, use it as a camera
        // cam2.getNetworks(); --> Not allowed
        // cam2.sampleMeth(); --> Not allowed
        cam2.takesnap();

        MySmartPhone3 s = new MySmartPhone3();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(222444777);
------------------------------------------------------------------------------------------------------------
        // Abstract Classes & Interfaces Practice set revision prob 1 & 2~~
        FountainPen1 pen = new FountainPen1();
        pen.changeNib();
------------------------------------------------------------------------------------------------------------
        // Abstract Classes & Interfaces Practice set revision prob 3~~
        Human2 shreya = new Human2();
        shreya.sleep();
------------------------------------------------------------------------------------------------------------
        // Abstract Classes & Interfaces Practice set revision prob 4~~
        Monkey1 m1 = new Human2();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal1 lovish = new Human2();
        lovish.eat();
        // lovish.speak(); --> error
        lovish.sleep();
------------------------------------------------------------------------------------------------------------
        // Implemented a program for a Library along with many adequate features!~~~~~

        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library1 myLibrary = new Library1();
        myLibrary.addBook("Think and Grow Rich");
        myLibrary.addBook("Algorithms");
        myLibrary.addBook("Java");
        myLibrary.showAvailableBooks();

        myLibrary.issueBook("Java");
        myLibrary.showAvailableBooks();
        myLibrary.returnBook("Java");
        myLibrary.showAvailableBooks();
------------------------------------------------------------------------------------------------------------
        // Abstract Classes & Interfaces Practice set revision prob 5~~
        SavingsAccount myAccount = new SavingsAccount(12345, 1000.0, 2.5);
        myAccount.checkBalance();
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.checkBalance();
------------------------------------------------------------------------------------------------------------
 */
        // Abstract Classes & Interfaces Practice set revision prob 6~~
        Fan myFan = new Fan();
        myFan.turnOn();
        myFan.increaseSetting();
        myFan.increaseSetting();
        myFan.decreaseSetting();
        myFan.turnOff();
    }
}