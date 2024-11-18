package javaconcepts;

public class practice_set_on_methods {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }





    public static void main(String[] args) {
        // Problem 1
//        multiplication(7);

        // Problem 2
//        pattern1(9);

        // Problem 3
         int c = sumRec(4);
         System.out.println(c);


    }
}
