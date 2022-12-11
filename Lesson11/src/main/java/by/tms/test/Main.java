package by.tms.test;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Lords of the Rings", new Author("Tolkien"), 1954);
        System.out.println(book);
        try {
            Book bookClone = book.clone();
            bookClone.setName("Harry Potter");
            bookClone.setAuthor(new Author("J.K.Rowlings"));
            bookClone.setYear(1997);
            System.out.println(bookClone);
        } catch (CloneNotSupportedException exception) {
            System.out.println("Cloning not supported");
        }
    }
}
