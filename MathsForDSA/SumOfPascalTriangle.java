public class SumOfPascalTriangle {
    public static void main(String[] args) {
        // dicalre integer to find n th row
        int row = 3;
        int ans= (int)Math.pow(2,row-1);
        int a = 1 << (row-1);
        System.out.println(a);
        System.out.println(ans);
            ;
    
    }
}
