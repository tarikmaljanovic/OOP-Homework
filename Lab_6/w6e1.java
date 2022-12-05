public class w6e1 {
  public static int smallest(int[] array) {
    int min = array[0];

    for(int i = 0; i < array.length; i++) {
      if(array[i] < min) {
        min = array[i];
      }
    }
    
    return min;
  }

  public static void main(String[] args) {
    int[] numbers = {6, 5, 8, 7, 11};
    System.out.println("The smalles number is: " + smallest(numbers));
  }
}