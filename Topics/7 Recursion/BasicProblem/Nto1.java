import javax.xml.validation.Validator;

// Using recursion, make a function like 
// input : minusOne(5)
// Output : 5 4 3 2 1

public class Nto1 {
    public static void main(String[] args) {
        minusOne(5);
        System.out.println();
        plusOne(5);
        System.out.println();
        funBoth(5);
        System.out.println("this is using prefix kind");
        minus1(5);
    }

    
    public static void minusOne(int n) {
        if(n == 0){
            return ;
        }
        System.out.print(n+" ");
        minusOne(n -1);
    }
    
    // Another way
    public static void minus1(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        minus1(--n);
    }


    public static void plusOne(int n){
        if(n == 0){
            return ;
        }
        plusOne(n-1);
        System.out.print(n+" ");
    }

    public static void funBoth(int n) {
        if(n == 0){
            return ;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");


    }
}
