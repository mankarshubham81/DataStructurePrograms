import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// package Topics;

public class MultiDArrayList {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println('s');
        // multi Dimentional ArrayList in java
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
        // inatiolazation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        
        // add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(ip.nextInt());
            }
        }
        
        System.out.println("fsd");
        System.out.println(list);
    }
}
