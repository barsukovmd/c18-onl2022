package tms.homework.task1.jdbc;

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
        System.out.println("Get all students and cities");
        System.out.println("\t" + CRUDUtils.getStudents() + "\n");
        System.out.println("!!!");
        System.out.println("Get all cities");
        CRUDUtils.getCities()
                .forEach(System.out::println);
    }
}
