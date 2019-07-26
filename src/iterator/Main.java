package iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(3);
		bookShelf.appendBook(new Book("Hello World!"));
		bookShelf.appendBook(new Book("My PHP Code"));
		bookShelf.appendBook(new Book("My Laravel Code"));
		bookShelf.appendBook(new Book("My C++ Code"));
		bookShelf.appendBook(new Book("My Java Code"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
