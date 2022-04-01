
// only inside classes can be static(like below comment) 
public class InnerClass {
    
    // static class Test{
    static class Test{
        String name ;

        public Test(String name ){
            this.name=name;
        }

    }

    public static void main(String[] args) {
        Test a = new Test("kumar");
        Test b = new Test("kuman");

    }
}
