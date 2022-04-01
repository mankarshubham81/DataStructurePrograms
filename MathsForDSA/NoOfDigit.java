public class NoOfDigit {
    public static void main(String[] args) {
        int num = 6;
        int base = 02;

        int ans = (int) (Math.log(num) / Math.log(base)) + 1;
        int ans1 = (int) Math.log10(num) + 1;
        System.out.println("Number of Digits in " + num + " is : " + ans);
        System.out.println("Number of Digits in " + num + " is : " + ans1);
    }
}
