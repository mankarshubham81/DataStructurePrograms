public class IsPowOf2 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPowerof2(num));
    }

    public static boolean isPowerof2(int num) {
        if(num == 0){
            return false;
        }
        boolean ans = (num & (num-1)) == 0;        
        return ans;
    }
}
