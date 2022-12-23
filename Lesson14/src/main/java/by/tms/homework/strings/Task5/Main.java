package by.tms.homework.strings.Task5;

/*  *  5*)со звездочкой! В метод на вход приходит строка
    *
    *  public static boolean validate(String str) {
           return false;
       }
    * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
    * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
    * - Длина строки должна быть от 4 до 20 символов.
    *
    * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
    *
    * */
public class Main {
    public static void main(String[] args) {
        System.out.println(validate("15155151fv"));
        System.out.println(validate("1515ahjfrfbew15155151"));
        System.out.println(validate("bew15155151"));
        System.out.println(validate("bew155151"));
        System.out.println(validate("bew155151йаицй"));
    }

    public static boolean validate(String string) {
        return string.matches("[a-z15]{4,20}");
    }
}
