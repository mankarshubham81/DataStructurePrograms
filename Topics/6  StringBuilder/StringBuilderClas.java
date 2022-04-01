import java.util.Arrays;

// because String is immutable in java, we need something different datatype that can modify the current object pointed by varible  

public class StringBuilderClas {
    public static void main(String[] args) {
        StringBuilder Sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            Sb.append(ch);    
        }

        System.out.println(Sb.toString());
        Sb.reverse();
        System.out.println(Sb.toString());

        // converting string into character array 
        String name = "   shubham Mankar";
        System.out.println(name);
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip());
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('a'));
        System.out.println(name.toLowerCase());
    }
}
