public class ShapeP {
    void area(){
        System.out.println("This is ShapeP Area : ");
    }
    public static void main(String[] args) {
        //     Square sw = new Square();
        Square obj = new Square();
        System.out.println(obj instanceof ShapeP);
        
        //     sw.area();
    }
}

class Square extends ShapeP{
    // this will run when obj of circle is created 
    // hence it is overriding the parent method
    
    //  You can uncomment below code 
    // @Override // this is called Annotation (note : if you want to check if method is override or not, Add @Override to it )
    // void area(){
        //     System.out.println("This is Square Area : ");
        // }
        
        
        public static void main(String[] args) {
            
    }
}
