public class gen {
  public static void main(String[] args) {
    Generic<String, Integer> obj1 = new Generic<String,Integer>("str", 1);
    Generic<Integer, String> obj2 = new Generic<Integer,String>(2, "hello");

    System.out.println(obj1.var1);
    System.out.println(obj1.var2);
    System.out.println(obj2.var1);
    System.out.println(obj2.var2);
  }
}
