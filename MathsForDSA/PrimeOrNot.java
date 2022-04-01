class PrimeOrNot {
    public static void main(String[] args) {
        int n = 31;
        if (isPrime(n)) {
            System.out.println(n + " : Number is Prime");
        } else {
            System.out.println(n + " : is Not a Prime");
        }

        for(int i=47;i<=100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int n) {
        int i = 2;
        while (i*i<=n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isPrime1(int n) {
        if(n<1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}