package codingQue;

public class QuickSort {

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

            
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

      
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
         
            int pivotIndex = partition(arr, low, high);

      
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arrayToSort = {12, 4, 5, 6, 7, 3, 1, 15};

        System.out.println("Original array:");
        printArray(arrayToSort);

        quickSort(arrayToSort, 0, arrayToSort.length - 1);

        System.out.println("Sorted array using quicksort:");
        printArray(arrayToSort);
    }
}
