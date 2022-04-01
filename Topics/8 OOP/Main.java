public class Main {
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
    }

}

class Student {
    int rno = 1;
    String name = "shubham mankar";
    float marks = 81.00f;

    Student(){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(int rn, String nam, float mar) {
        this.rno = rn;
        this.name = nam;
        this.marks = mar;
    }
}
