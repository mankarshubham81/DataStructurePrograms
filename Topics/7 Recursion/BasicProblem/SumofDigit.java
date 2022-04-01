public class SumofDigit {
    public static void main(String[] args) {
        int n = 2334;
        int res = sOD(n);
        int res1 = sODusingRecursion(n);
        int res2 = pOD(n);

        System.out.println(n + " Sun of Digit is : " + res);
        System.out.println(n + " Sun of Digit is : " + res1);
        System.out.println(n + " Product of Digit is : " + res2);
    }

    public static int sOD(int n) {
        int count = 0;
        while (n != 0) {
            int pop = n % 10;
            n = n / 10;
            count += pop;
        }
        return count;
    }

    public static int sODusingRecursion(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sODusingRecursion(n / 10);
    }

    public static int pOD(int n) {
        if (n % 10 == n) {
            return n;
        }

        return n % 10 * pOD(n / 10);
    }
}
