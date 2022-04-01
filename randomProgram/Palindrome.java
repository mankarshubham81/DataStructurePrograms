public class Palindrome {
    public static void main(String[] args) {
        String s = "";
        if (isPalindrome1(s)) {
            System.out.println("Yes! it is a Palindrome");
        } else {
            System.out.println("No!! it is not a Palindrome");
        }
        int x = 22322;

    }

    public static boolean isPalindrome1(String str) {
        if (str == null || str == 0) {
            return true;
        }
        str = str.toLowerCase();

        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length / 2; i++) {
            if (strArr[i] == strArr[strArr.length - 1 - i]) {

            } else {
                return false;
            }
        }
        return true;

    }

    public static boolean isPalindrome2(String str) {
        if (str == null || str == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }

        }
        return true;
    }

}
