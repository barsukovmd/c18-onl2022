package homework.task6;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NonNull
@ToString
@Setter
@Getter
// *  - Reader(читатель) с полями ФИО, электронный адрес, флаг согласия на рассылку, список взятых книг
public class Reader {
    private String name;
    private String surname;
    private boolean agreementForSharing;
    private String email;
    private List<Book> booksToTake;

    public Reader(String name, String surname, boolean agreementForSharing, String email) {
        this.name = name;
        this.surname = surname;
        this.agreementForSharing = agreementForSharing;
        this.email = email;
    }

    public List<Book> getBooks() {
        if (booksToTake == null) {
            booksToTake = new ArrayList<>();
        }
        return booksToTake;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reader reader = (Reader) o;
        return name.equals(reader.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

