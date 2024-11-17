package javaconcepts;

public class varargs {
    static int sum(int x, int ...arr){
        int result = x;
        for(int a : arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Concept Tutorial~~");
        System.out.println("The sum of 1 is: " + sum(1));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 1, 2, 4, 3, 5 is: " + sum(1, 2, 4, 3, 5));
    }
}
