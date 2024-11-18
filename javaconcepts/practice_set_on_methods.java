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

    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }




    public static void main(String[] args) {
        // Problem 1
//        multiplication(7);

        // Problem 2
//        pattern1(9);

        // Problem 3
//         int c = sumRec(4);
//         System.out.println(c);

         // Problem 4
//         fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
         int result = fib(7);
         System.out.println(result);


    }
}
