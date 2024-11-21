package javaconcepts;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

public class ch10ps {
    public static void main(String[] args) {
        // Problem 1
        Circle objC = new Circle(12);
    }
}
