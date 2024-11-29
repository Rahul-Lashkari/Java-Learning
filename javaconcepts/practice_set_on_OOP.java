package javaconcepts;

class Employee4 {
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

class CellPhone4 {
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Stacy...");
    }
}

class Square4 {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy4 {
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

public class practice_set_on_OOP {
    public static void main(String[] args) {
/*
        // Problem 1
        Employee4 Joe = new Employee4();
        Joe.setName("Joe Cullen");
        Joe.salary = 233;
        System.out.println(Joe.getSalary());
        System.out.println(Joe.getName());

        // Problem 2
        CellPhone4 asus = new CellPhone4();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        // Problem 3
        Square4 sq = new Square4();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
*/
        // Problem 4
        Tommy4 player1 = new Tommy4();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
