// package randomProgram.ArrayListLinearSearch;

public class SerachInStringVarible {
    public static void main(String[] args) {
        String str = "shubham";
        char target = 'n';
        boolean result = searchInStr(str,target);
        System.out.println("Result(String target found or not) : "+result);
        boolean result1 = searchInStr1(str,target);
        System.out.println("Result(String target found or not) : "+result1);
    }

    public static boolean searchInStr(String s,char t) {
        if(s.length() == 0){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(t == s.charAt(i)){
                return true;
            }
        }

        return false;
    }

    // searchInStr1 method for using foreach loop  
    public static boolean searchInStr1(String s,char t) {
        if(s.length() == 0){
            return false;
        }

        for (char character : s.toCharArray()) {
            if(character == t){
                return true;
            }
        }

        // for (int i = 0; i < s.length(); i++) {
        //     if(t == s.charAt(i)){
        //         return true;
        //     }
        // }

        return false;
    }
}
