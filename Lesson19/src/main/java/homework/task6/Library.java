package homework.task6;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    public List<Reader> getReaders() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return readers;
    }
}
