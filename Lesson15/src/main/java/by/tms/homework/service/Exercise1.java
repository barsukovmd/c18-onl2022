package by.tms.homework.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

///**
//     * 1)В исходном файле hw1/input.txt находятся слова, каждое слово на новой строке.
//     * После запуска программы должен создать файл output.txt, который будет содержать в себе только палиндромы.
//     * 2)Текстовый файл hw2/input.txt содержит текст.
//     * После запуска программы в другой файл должны записаться только те предложения, в которых от 3-х до 5-ти слов.
//     * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в output.txt файл.
//     * Пишем все в ООП стиле. Создаем класс TextFormatter
//     * в котором два метода:
//     * 1. Метод принимает строку и возвращает кол-во слов в строке.
//     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//     * В main считываем файл.
//     * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//     * Если подходит добавляем его в output.txt файл
//     * 3) Проверка на цензуру:
//     * Создаете 2 файла.
//     * 1 - й. Содержит исходный текст.
//     * 2 - й. Содержит слова недопустимые в тексте (black list). Структура файла определите сами, хотите каждое слово на новой строке, хотите через запятую разделяйте.
//     * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного недопустимого слова, то выводите сообщение о том что текст прошел проверку на цензуру.
//     * Если нет, то выводите соответствующее сообщение, кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению.
//     * 4) Сериализовать объект Автомобиль(Марка, Двигатель(тип двигателя, количество цилиндров), бак(тип топлива, объем), скорость, цена). Количество цилиндров не должно сереализоватся в файл(это конфедициальная информация)
//     * После сериализации произвести обратный процесс(из потока в объект) и вывести на консоль
//     *
//     */
public class Exercise1 {
    public static final String INPUT = "Lesson15/src/main/java/by/tms/homework/hw1/input.txt";
    public static final String OUTPUT = "Lesson15/src/main/resources/output";

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream(INPUT);
             FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT, false)) {
            StringBuilder stringBuilder = new StringBuilder();
            int i;
            while ((i = fileInputStream.read()) != -1) {
                if (TextFormatter.checkPalindromes(fileInputStream.toString()) != TextFormatter.checkWordLength(fileInputStream.toString())) {
                    StringBuilder s = stringBuilder.append((char) i);
                    byte[] s1 = new byte[s.length()];
                    fileOutputStream.write(new String(s1).getBytes());
                }
            }
            System.out.println(TextFormatter.countWordsInString(stringBuilder.toString()) + " number of palindromes");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("File was written");
    }
}
