import java.util.ArrayList;
import java.util.Scanner;

// package Topics;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax of ArrayList
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> list1 = new ArrayList<>(10);
        
        list.add(12);
        list.add(11);
        list.add(15);
        list.add(14);
        list.add(13);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(144);
        list.add(20);
        list.add(1);

        // you can update element inside it by set method by passing position and value
        System.out.println(list);
        list.set(8, 823);
        System.out.println(list);
        // Contsins element or not
        System.out.println(list.contains(20));
        // Removing element in list
        list.remove(3);       
        System.out.println(list);


        // How to provide input to array
        Scanner ip = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list1.add(ip.nextInt());            
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));//pass index in here, list[index] will not work here

        }


    }
}
