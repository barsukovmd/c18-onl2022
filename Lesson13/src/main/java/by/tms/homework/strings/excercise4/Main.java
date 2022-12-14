package by.tms.homework.strings.excercise4;

public class Main {
    //     * 4) Есть строка в которой содержится текст, предложения разделены точками.
//     * После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
//     * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
//     * Пишем все в ООП стиле.
//     * 1. Метод принимает строку и возвращает кол-во слов в строке.
//     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//     * В main создаем строку с текстом, также можно текст задавать с консоли.
//     * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//     * Если подходит, то выводим на экран.
    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatter("Hello, my name is Eugene. I like to walk and run. " +
                                                        "Especially during summer season. My favourite season is autumn");
        System.out.println(textFormatter.getSentencesWithPalindromes());
    }

}
