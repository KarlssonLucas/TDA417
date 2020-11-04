public class SortingAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,10};
        new SortingAlgo().InsertionSort(arr);

    }

    private void InsertionSort(int[] arr) {
        int[] tempArray = new int[arr.length];
         
        int indexJ = 0;
        for (int indexI = 0; indexI < arr.length - 1; indexI++) 
        {
            Integer currentElement = arr[indexI];
             
            if (currentElement != arr[indexI+1]) {
                tempArray[indexJ++] = currentElement;
            }
        }
         
        tempArray[indexJ++] = arr[arr.length-1];
         
        for(int i = 0; i< tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }
    }
}
