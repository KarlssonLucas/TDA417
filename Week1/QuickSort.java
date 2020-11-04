import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        program(arr);
    }

    public static void program(List<Integer> arr) {
        if (isSorted(arr)) {
            System.out.println(arr.toString());
            System.exit(1);
        }

        List<Integer> less = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        List<Integer> equals = new ArrayList<>();

        int pivot = pivot(arr);
        for (int i : arr) {
            if(i < pivot) {
                less.add(i);
            } else if (i > pivot) {
                bigger.add(i);
            } else {
                equals.add(i);
            }
        }
        List<Integer> newArr = concat(less, equals, bigger);
        program(newArr);
    }

    private static List<Integer> concat(List<Integer> less, List<Integer> equals, List<Integer> bigger) {
        List<Integer> newArr = new ArrayList<>();
        newArr.addAll(less);
        newArr.addAll(equals);
        newArr.addAll(bigger);
        return newArr;
    }

    private static int pivot(List<Integer> arr) {
        int a = arr.get(0);
        int b = arr.get(arr.size()-1);
        int c = arr.get(arr.size()/2);
        if (a < b && a > c) {
            return a;
        } else if (a > b && b > c) {
            return b;
        } else return c;
    }

    private static boolean isSorted(List<Integer> arr) {
        for(int i = 0; i<arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
