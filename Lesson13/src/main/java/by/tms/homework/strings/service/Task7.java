package by.tms.homework.strings.service;

import lombok.ToString;

@ToString
public class Task7 {
    //     * 7*(Можно не делать!))Найти количество слов, содержащих только символы латинского алфавита. Пример:
//     * "Методы доступа называют ещё аксеcсорами (от англ. access — доступ), или по отдельности — геттерами (англ. get — чтение) and сеттерами (англ. set — запись)"
//     */
    public static void main(String[] args) {
        String string = """
                Метод чтения, геттер (англ. getter — получатель) — (в программировании) специальный метод,
                 позволяющий получить данные, доступ к которым напрямую ограничен. Это один из методов
                 объектно-ориентированного программирования, который помогает реализовать гибкий механизм
                 инкапсуляции. В паре с сеттером (Setter) он может использоваться для организации свойств
                 и методов в языках, где они не поддерживаются.""";
        
        System.out.println("Words with latin are: " + countEnglishWords(string));
    }

    public static int countEnglishWords(String string) {
        int count = 0;
        String[] strings = string.split(" ");
        for (String word : strings) {
            if (word.matches("[A-Za-z]+")) {
                count++;
            }
        }
        return count;
    }
}
