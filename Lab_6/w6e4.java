import java.util.Arrays;

public class w6e4 {
  public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  public static void main(String[] args) {
    int[] numbers = {3, 2, 5, 4, 8};

    System.out.println(Arrays.toString(numbers));

    swap(numbers, 1, 0);
    System.out.println(Arrays.toString(numbers));

    swap(numbers, 0, 3);
    System.out.println(Arrays.toString(numbers));
  }
}

