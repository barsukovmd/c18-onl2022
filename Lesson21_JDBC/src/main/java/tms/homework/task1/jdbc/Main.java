package tms.homework.task1.jdbc;

import tms.homework.task1.jdbc.models.Student;
import tms.homework.task1.jdbc.utils.CRUDUtils;

// /**
//     * Основное задание
//     * 1. Скачать и установить СУБД PostgresSQL. Создать таблицу с данными
//     * студентов группы. Создать Java приложение для получения списка всех
//     * студентов группы.
//     * Дополнительное задание
//     * 2. Улучшить основное задание. Создать таблицу с городами, где живут
//     * студенты. Вывести информацию о каждом студенте группы и его родном
//     * городе. Предусмотреть операции добавления новых городов, новых
//     * студентов, удаления студентов и удаления городов.
//     *
//     * За основу можно взять из моего репозитория приложение и его доработать!
//     */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Michael", "Johnson", 1995, 2);
        Student student2 = new Student(2, "Olivia", "Davies", 1996, 1);
        Student student3 = new Student(3, "Charlie", "Parson", 1995, 2);
        Student student4 = new Student(4, "James", "Ellington", 1994, 3);
        Student student5 = new Student(5, "Isabelle", "Brown", 1993, 4);
        Student student6 = new Student(6, "Sophia", "Young", 1995, 2);
        Student student7 = new Student(7, "Jack", "Parson", 1994, 3);
        System.out.println("New Student");
        System.out.println(CRUDUtils.insertNewStudents(new Student(8, "Gilbert", "King", 1994, 4)));
        System.out.println("All Students");
        while (true) {
        }
    }
}
