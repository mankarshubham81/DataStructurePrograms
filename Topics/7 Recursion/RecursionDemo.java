public class RecursionDemo {
    public static void main(String[] args) {

        // printNum(1);
        int n =5;
        int res  =factorial(n);
        System.out.println("Factorial of "+n+" is : "+res);
    }

    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    public static int factorial(int n) {
        if(n ==  0 ){
            return 1;
        }else{
            return n * factorial(n -1);   
        }
    }
}
