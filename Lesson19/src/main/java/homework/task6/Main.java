package homework.task6;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

// * 6) Пишем библиотеку.
// * Для каждой книги библиотечного фонда известны автор, название и год издания.
// * Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
// * Ещё нам понадобится флаг читательского согласия на уведомления по электронной почте.
// * Рассылки организуют сотрудники библиотеки: напоминают о сроке возврата книг, сообщают новости.
// * Создаем классы:
// *  - Book с полями Автор, Название, Год издания
// *  - Reader(читатель) с полями ФИО, электронный адрес, флаг согласия на рассылку, список взятых книг
// *  - EmailAddress с полями электронный адрес, дополнительная информация
// *  - Library содержит список книг и список читателей.
// *
// *  Задачи:
// *  a) Получить список всех книг библиотеки, отсортированных по году издания.
// *  b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
// *      При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
// *  c) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
// *      Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
// *  d) Получить список всех книг, взятых читателями.
// *      Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
// *  e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
// *
// *  Задачи со ЗВЕЗДОЧКОЙ:
// *  а) Узнать наибольшее число книг, которое сейчас на руках у читателя.
// *  b) Необходимо рассылать разные тексты двум группам:
// *      * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
// *      * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
// *      То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
// *      или TOO_MUCH — если их две и больше. Порядок групп не важен.
// *  с) Для каждой группы (OK, TOO_MUCH) получить списки читателей в каждой группе.
// *  d) Для каждой группы (OK, TOO_MUCH) получить ФИО читателей в каждой группе, перечисленные через запятую.
// *      И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
// *      Пример: TOO_MUCH {Иванов Иван Иванович, Васильев Василий Васильевич}
// *              OK {Семёнов Семён Семёнович}
// *
// */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.setBooks(Arrays.asList(
                new Book("Лев Толстой", "Смерть Ивана Ильича", 1886),
                new Book("Фёдор Михайлович Достоевский", "Преступление и наказание", 1886),
                new Book("Чарлз Диккенс", "Повесть о двух городах", 1859),
                new Book("Чарлз Диккенс", "Оливер Твист", 1839),
                new Book("Антон Павлович Чехов", "Вишнёвый сад", 1901),
                new Book("Антон Павлович Чехов", "Попрыгунья", 1891),
                new Book("Виктор Гюго", "Человек, который смеётся", 1860),
                new Book("Виктор Гюго", "Собор Парижской Богоматери", 1831),
                new Book("Виктор Гюго", "Отверженные", 1862),
                new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940),
                new Book("Эрнест Хемингуэй", "Снега Килиманджаро", 1936),
                new Book("Александр Сергеевич Пушкин", "Руслан и Людмила", 1820),
                new Book("Александр Сергеевич Пушкин", "Медный всадник", 1833),
                new Book("Александр Сергеевич Пушкин", "Борис Годунов", 1825)));
        library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getYearOfPublish))
                .forEach(System.out::println);

        library.setReaders(Arrays.asList(
                new Reader("Владимир", "Гуляев", true, "gulyaev@mail.ru"),
                new Reader("Игорь", "Аминов", true, "aminov@mail.ru"),
                new Reader("Алексей", "Рималов", true, "rimalov@mail.ru"),
                new Reader("Михаил", "Шифун", false, "shifun@mail.ru"),
                new Reader("Наум", "Расулов", true, "rasulov@mail.ru"),
                new Reader("Евгений", "Антоненко", false, "antonenko@mail.ru"),
                new Reader("Анастасия", "Гуляев", true, "gulyaev23@mail.ru"),
                new Reader("Наталья", "Гуляев", false, "gulyaev30@mail.ru"),
                new Reader("Кирилл", "Гуляев", true, "gulyaev37@mail.ru")));
        //подскажите как заполнить читателей книгами через Random?

        List<EmailAddress> emailAddresses = library.getReaders().stream()
                .map(Reader::getEmail)
                .map(EmailAddress::new)
                .toList();
        emailAddresses.forEach(System.out::println);

        List<Reader> readersWithAgreement = library.getReaders().stream()
                .filter(Reader::isAgreementForSharing)
                .toList();
        readersWithAgreement.forEach(System.out::println);


        List<Reader> readerTookBooks = library.getReaders().stream()
                .filter(Reader::isAgreementForSharing)
                .filter(reader -> reader.getBooks().size() > 1)
                .toList();
        readerTookBooks.forEach(System.out::println);


        List<Book> bookSetList = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .toList();
        bookSetList.forEach(System.out::println);

        boolean readersTookPushkin = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> "Александр Сергеевич Пушкин".equalsIgnoreCase(book.getAuthor()));
//                .allMatch(book -> book.getAuthor().equalsIgnoreCase(("Александр Сергеевич Пушкин")));
// так нельзя. т.к allMatch проверяет что все книги пушкина у читателя, а нам нужно хотя бы одна была пушкина.
//Т.е пушкин, пушкин, тургенев - allMatch вернет false
//т.е пушкин, пушкин, тургенев - anyMatch вернет true


        Map<String, List<Reader>> listOfReadersToSendInfo = library.getReaders().stream()
                .filter(Reader::isAgreementForSharing)
                .filter(reader -> reader.getBooks().size() > 2)
                .collect(groupingBy(reader -> reader.getBooks().size() > 2 ? "TOO MUCH" : "OK"));
    }

    public static Map<String, List<EmailAddress>> sendInfo(Library library) {
        Map<String, List<EmailAddress>> listOfSharing = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isAgreementForSharing()) {
                if (reader.getBooksToTake().size() > 2) {
                    if (!listOfSharing.containsKey("TOO MUCH")) {
                        listOfSharing.put("TOO MUCH", new ArrayList<>());
                    }
                    listOfSharing.get("TOO MUCH").add(new EmailAddress(reader.getEmail()));
                } else {
                    if (!listOfSharing.containsKey("OK")) {
                        listOfSharing.put("OK", new ArrayList<>());
                    }
                }
            }
        }
        return listOfSharing;
    }

    private static boolean checkBooks(Reader reader) {
        for (Book book : reader.getBooks()) {
            if (book.getAuthor().equalsIgnoreCase(("Александр Сергеевич Пушкин"))) {
                return true;
            }
        }
        return false;
    }
}
