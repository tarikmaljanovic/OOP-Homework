public class w6e6 {
  public static void printElegantly(int[] array) {
    for(int i = 0; i < array.length; i++) {
      if(i == array.length - 1) {
        System.out.println(array[i]);
      } else {
        System.out.print(array[i] + ", ");
      }
    }
  }

  public static void main(String[] args) {
    int[] numbers = {5, 1, 3, 4, 2};
    printElegantly(numbers);
  }
}
