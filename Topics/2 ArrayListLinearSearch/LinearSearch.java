// package randomProgram.ArrayListLinearSearch;

public class LinearSearch {
    // Search in the array : return the index if item found
    // Otherwise if item not found : return -1 or index number of array
    public static void main(String[] args) {
        int[] arr = {2,3,23,4,5,56,7,67,74,67};
        int searchNum = 67;
        int result = linearSearch(arr,searchNum);
        System.out.println("result is :"+ result); 
    }
    
        public static int linearSearch(int[] arr,int searchN) {
            if(arr.length == 0){
                return -1;
            }
            
            // for (int index = 0; index < arr.length; index++) {
            //     if(arr[index] == searchN){
            //         return index;
            //     }
            // }
            // OR use inhanced for loop
            
            // If you want to return element use for loop
            for (int element : arr) {
                if(element == searchN){
                    return element;
                }
            }

            return -1;
            // your future task : return false instead of -1 and as like true
            // hint : also mention boolean when defining function cause it going to return boolean value
        }
}
