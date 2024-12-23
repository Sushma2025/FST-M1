package activities;

public class Activity4 {
      public static void insertionSort (int[] arr) {
    	     int n = arr.length;
    	     
    	     for (int i = 1; i < n; i++) {
    	            int key = arr[i];
    	            int j = i - 1;
    	            
    	            
    	            while (j >= 0 && arr[j] > key) {
    	                arr[j + 1] = arr[j];
    	                j = j - 1;
    	            }
    	            arr[j + 1] = key;
    	     }
    	         	     
      }
      
      public static void main(String[] args) {
          int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};
          
          System.out.println("Array before sorting:");
          for (int num : arr) {
              System.out.println(num + " ");
          }
          System.out.println();
          
          insertionSort(arr);
          
          System.out.println("Array after sorting:");
          for (int num : arr) {
              System.out.println(num + " ");
          }
      }
}
