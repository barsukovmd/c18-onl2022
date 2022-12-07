package by.tms.test;

public class Main {
    public static void main(String[] args) {
        try {
            Book book = new Book("Lords of the Rings", new Author("Tolkien"), 1983);
            Book book1 = book.clone();
            book1.setName("Harry Potter");
            book1.setAuthor(new Author("J.K.Rowlings"));
            System.out.println(book);
            System.out.println(book1);
        } catch (CloneNotSupportedException exception) {
            System.out.println("Cloning not supported");
        }
    }
}
