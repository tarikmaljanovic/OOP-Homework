public class w6e2 {
  public static int indexOfTheSmallest(int[] array) {
    int indexOfSmallest = 0;

    for(int i = 0; i < array.length; i++) {
      if(array[i] < array[0]) {
        indexOfSmallest = i;
      }
    }
    return indexOfSmallest;
  }

  public static void main(String[] args) {
    int[] numbers = {6, 5, 8, 7, 11};
    System.out.println("The index of the smallest number is: " + indexOfTheSmallest(numbers));
  }
}
