
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    String authorToFind = "L. Frank Baum";
    String bookToFind = "Sky Island";
    double minimumrating = 0.0;
    for(Book book : childrensBooks){
        if(authorToFind.equals(book.getAuthor())){
            if(bookToFind.equals(book.getTitle())){
                minimumrating = book.getRating();
            }
        }
    }
    System.out.println(minimumrating);
    for(Book book : childrensBooks){
        if(book.getRating() == 4.14){
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
  }
}