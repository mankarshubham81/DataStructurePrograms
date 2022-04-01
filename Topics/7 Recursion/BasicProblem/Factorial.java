public class Factorial {
    public static void main(String[] args) {
        int n =5;
        int res = facto(n);
        System.out.println(n+" Factorial is : "+res);
    }

    public static int facto(int n){
        if(n <= 1){
            return 1;
        }
        return n * facto(n - 1);
    }
}
