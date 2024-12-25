package javaconcepts;
import java.util.ArrayList;

class Thread1 extends Thread{
    public void run(){
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Good Morning");
    }
}

public class practice13 {
    public static void main(String[] args) {
        // Q1
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//        t1.start();
//        t2.start();

        // Q2
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();

    }
}
