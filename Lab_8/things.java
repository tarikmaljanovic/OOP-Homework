public class things {
  public static void main(String[] args) {
    Book book1 = new Book("Writer1", "Book1", 2);
    Book book2 = new Book("Wrter2", "Book2", 1.5);
    Book book3 = new Book("Writer3", "Book3", 3);

    CD cd1 = new CD("Artist1", "Title1", 1989);
    CD cd2 = new CD("Artist2", "Title2", 2009);
    CD cd3 = new CD("Artist3", "Title3", 2002);

    Box box = new Box(5.0);
    box.add(book1);
    box.add(book2);
    box.add(book3);
    box.add(cd1);
    box.add(cd2);
    box.add(cd3);

    System.out.println(box);
  }
}
