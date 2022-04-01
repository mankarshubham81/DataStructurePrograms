import java.util.ArrayList;
import java.util.Arrays;

// ArrayList Using Recursion
// find weather the element in the array is present or not

public class ArrayListUsingR {
    public static void main(String[] args) {
        int[] arr = { 22, 32, 53, 34, 44, 45, 53, 6, 10 };
        int target = 53;
        // System.out.println(searechingUsingArrayList(arr, target, 0));
        // System.out.println(findIndexUsingArrayList(arr, target, 0));
        // findAllIndexUsingArrayList(arr, target, 0);
        // System.out.println(list);
        // System.out.println(findAllIndexUsingArrayList2(arr, target, 0));
        System.out.println(findAllIndexWithoutPassingArrayList(arr, target, 0));
    }

    public static boolean searechingUsingArrayList(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || searechingUsingArrayList(arr, target, index + 1);
    }

    public static int findIndexUsingArrayList(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexUsingArrayList(arr, target, index + 1);
        }
    }

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void findAllIndexUsingArrayList(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndexUsingArrayList(arr, target, index + 1);

    }

    // or you can return arraylist
    public static ArrayList<Integer> list2 = new ArrayList<>();

    public static ArrayList findAllIndexUsingArrayList2(int[] arr, int target, int index) {
        if (index == arr.length) {
            return list2;
        }

        if (arr[index] == target) {
            list2.add(index);
        }
        return findAllIndexUsingArrayList2(arr, target, index + 1);

    }

    public static ArrayList findAllIndexWithoutPassingArrayList(int[] arr, int target, int index) {
        ArrayList<Integer> list3 = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list3.add(index);
        }
        ArrayList<Integer> listResult = findAllIndexWithoutPassingArrayList(arr, target, index + 1);
        list3.addAll(listResult);
        return list3;
    }
}
