public class Parent extends B {
    int t  = 10;

    Parent(int t ){
        super();
        this.t = t;
    }
    
    @Override
    void carrer() {
        System.out.println("carrer method overidden");
    }
    
    @Override
    void cot() {
        System.out.println("cot overridden");
    }
    
    @Override
    void bot() {
        System.out.println("bot same");
    }
    
    public static void main(String[] args) {
        Parent o = new Parent(1);
        o.bot();       
    }
    
}

 abstract class B {
    abstract void carrer();
    abstract void bot();
    abstract void cot();
 
    int n = 10;

    B(){
      System.out.println("jdh");
    }
    // B(int n){
    //     this.n = n;
    // }
}