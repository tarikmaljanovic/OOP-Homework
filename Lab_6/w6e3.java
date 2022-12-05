public class w6e3 {
  public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int indexOfMin = index;

    for(int i = index; i < array.length; i++) {
      if(array[i] < array[indexOfMin]) {
        indexOfMin = i;
      }
    }

    return indexOfMin;
  }

  public static void main(String[] args) {
    int[] numbers = {-1, 6, 9, 8, 12};

    System.out.println(indexOfTheSmallestStartingFrom(numbers, 1));
    System.out.println(indexOfTheSmallestStartingFrom(numbers, 2));
    System.out.println(indexOfTheSmallestStartingFrom(numbers, 4));
  }
}
