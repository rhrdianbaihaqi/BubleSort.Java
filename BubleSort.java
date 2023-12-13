public class BubleSort {

  public static void main(String[] args) {
      int[] array = {64, 34, 25, 12, 22, 11, 90, 100};

      System.out.println("Array sebelum diurutkan:");
      printArray(array);

      bubbleSort(array);

      System.out.println("\nArray setelah diurutkan:");
      printArray(array);
  }

  static void bubbleSort(int[] arr) {
      int n = arr.length;
      boolean swapped;
      
      for (int i = 0; i < n - 1; i++) {
          swapped = false;
          for (int j = 0; j < n - i - 1; j++) {
              if (arr[j] > arr[j + 1]) {
                  int temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                  swapped = true;
              }
          }
          if (!swapped) {
              break;
          }
      }
  }
  static void printArray(int[] arr) {
      for (int value : arr) {
          System.out.print(value + " ");
      }
      System.out.println();
  }
}
