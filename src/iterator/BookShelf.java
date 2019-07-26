package iterator;
import java.util.ArrayList;

public class BookShelf implements Aggregate {
//	private Book[] books;
//	private int last = 0;
//	public BookShelf(int maxsize) {
//		this.books = new Book[maxsize];
//	}
	private ArrayList books;
	public BookShelf(int initialsize) {
		this.books = new ArrayList(initialsize);
	}
	public Book getBookAt(int index) {
//		return books[index];
		return (Book)books.get(index);
	}
	public void appendBook(Book book) {
//		this.books[last] = book;
//		last++;
		books.add(book);
	}
	public int getLength() {
//		return last;
		return books.size();
	}
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
