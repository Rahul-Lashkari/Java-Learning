package javaconcepts;

public class practice_set_on_methods {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        // Problem 1
        multiplication(7);
    }
}
