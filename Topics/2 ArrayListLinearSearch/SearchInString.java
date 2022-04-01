// package randomProgram.ArrayListLinearSearch;

public class SearchInString {
   public static void main(String[] args) {
       String[] stringArray = {"raj","kunal","ram","raghav","ravi"};
       String targetString = "raghav";
       String resultString = linearSearchInString(stringArray,targetString);
       System.out.println(resultString);
   } 

   public static String linearSearchInString(String[] sa,String ts) {
       if(sa.length == 0){
           return "Array is Empty";
       }

       for (String string : sa) {
           if(string == ts){
               return "Given String is Present";
           }
       }

       return "given String Not Found";
   }

}
