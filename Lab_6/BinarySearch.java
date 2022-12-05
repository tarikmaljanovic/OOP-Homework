import java.lang.Math;

public class BinarySearch {
  public boolean search(int[] array, int number) {
    int start = 0;
    int end = array.length - 1;
    boolean result = false;

    while(start <= end) {
      int middle = (start + end) / 2;

      if(number > array[middle]) {
        start = middle + 1;
      } else if(number < array[middle]) {
        end = middle - 1;
      } else {
        result = true;
        break;
      }
    }
    return result;
  }
}