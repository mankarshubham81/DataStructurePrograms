import java.util.Scanner;

public class factorialUsingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("which number's factorial you wan't Enter here : ");
        int ip = sc.nextInt();
        int ans = factorialUsing8(ip);
        System.out.print(" Factorial is : "+ ans);
    }

    public static int factorialUsing8(int num) {
        if(num == 0 || num == 1){
            return 1;
        }
        else {
            return num * factorialUsing8(num - 1);
        }
    }
}
