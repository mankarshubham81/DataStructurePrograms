public class StaticBlock {
    static int a = 10;
    static int b;

    // will only run once, when the first object is create i.e. when the class is loaded for the first time
    static{
        System.out.println("this is stasic block");
        b = a *2;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
