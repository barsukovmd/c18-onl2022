package homework.task6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
// *  - Book с полями Автор, Название, Год издания
public class Book {
    private String author;
    private String bookName;
    private int yearOfPublish;
}
