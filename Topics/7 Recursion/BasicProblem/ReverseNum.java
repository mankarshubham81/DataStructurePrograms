public class ReverseNum {
    public static void main(String[] args) {

        reverseNo(1234);
        System.out.println(sum);
        System.out.print();
    }

    public static int sum = 0;

    public static void reverseNo(int n) {
        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNo(n/10);
    }
}
