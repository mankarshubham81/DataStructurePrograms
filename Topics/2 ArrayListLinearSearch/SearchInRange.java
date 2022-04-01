// package randomProgram.ArrayListLinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] ar = {2,32,4,12,74,64,59,8,48,5,23,54,78};
        int find = 5;
        int start = 5;
        int end =12;
        int result = searchBetweenRange(ar, start, end,find);
        System.out.println(result);
        
    }

    public static int searchBetweenRange(int[] ar,int start,int end,int find) {
        if(ar.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (find == ar[i]) {
                return i;
            }
        }

        return -1;
    }
}
