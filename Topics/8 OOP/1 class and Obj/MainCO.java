// package 1 class and Obj;

public class MainCO {
    public static void main(String[] args) {
        Student Kunal = new Student();

        Kunal.rno = 23;
        Kunal.marks = 98.23f;
        Kunal.name = "CEO";


        System.out.println(Kunal.rno); // bydefault O/P : 0
        System.out.println(Kunal.name); // bydefault O/P : null
        System.out.println(Kunal.marks); // bydefault O/P : 0.0
        
        Student Raj = new Student(233,"df",23.3f);
     
        System.out.println(Raj.rno); 
        System.out.println(Raj.name); 
        System.out.println(Raj.marks);

        Student random1 = new Student(Raj);
        System.out.println("r1 : "+random1.marks);

        Student r2d2 = new Student();
        System.out.println(r2d2.name);
        System.out.println(r2d2.marks);

        Student one = new Student();
        Student two = one;
        one.name = "Somdev";
        System.out.println(two.name);

        System.out.println("About Final keyword");

        final A Ravan = new A("Ram");
        // Ravan.name = "Shiv";
        System.out.println(Ravan.name = "Shiv");

        // When non premative is final you cannot reassign it(like below statement)
        // Ravan = new A("Shyam");

    }

}

class Student {
    int rno = 1;
    String name = "shubham mankar";
    float marks = 81.00f;

    Student(Student otherStd){
        this.name=otherStd.name;
        this.rno=otherStd.rno;
        this.marks=otherStd.marks;
    }

    Student(){
        // this is how you can call constructor from another constructor
        this(81, "Shubham Mankar", 81.00f);
        // this above 'this()' function reffer to below parameterized constructor
    }

    Student(int rn, String nam, float mar) {
        this.rno = rn;
        this.name = nam;
        this.marks = mar;
    }
    
}

class A {
    final int NUM = 10;
    String  name ;

    public A(String name){
        this.name=name;
    }
}