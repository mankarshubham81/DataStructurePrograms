// package 0 Palindrome;

public class Fibon {
    public static void main(String[] args) {
        // finding n^th Fibonacii number
        // SERIES: 0, 1, 1, 2, 3, 5, 8, 13
        // INDEX : 0, 1, 2, 3, 4, 5, 6, 7
        int n = 2;
        System.out.println(n + " th Fibonaciee Number is " + fibonacii(n));

    }

    public static int fibonacii(int n) {
        // Base Condition
        if (n < 2) {
            return n;
        }
        return fibonacii(n - 1) + fibonacii(n - 2);
    }
}
