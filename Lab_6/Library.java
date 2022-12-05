import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  public Library() {
    this.books = new ArrayList<Book>();
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public void searchByTitle(String title) {
    for(int i = 0; i < books.size(); i++) {
      if(((books.get(i)).title()).equals(title)) {
        System.out.print(books.get(i));
      }
    }
  }

  public void searchByPublisher(String publisher) {
    for(int i = 0; i < books.size(); i++) {
      if(((books.get(i)).publisher()).equals(publisher)) {
        System.out.print(books.get(i));
      }
    }
  }

  public void searchByYear(int year) {
    for(int i = 0; i < books.size(); i++) {
      if(((books.get(i)).year()) == year) {
        System.out.print(books.get(i));
      }
    }
  }
}
