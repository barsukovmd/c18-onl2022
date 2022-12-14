package by.tms.authorization.service;

import by.tms.authorization.model.Authorization;
import by.tms.authorization.model.WrongLoginException;
import by.tms.authorization.model.WrongPasswordException;

/**
 * Создать статический метод "checkAuthorization" который будет вызваться из метода main и принимает на вход три параметра: login, password и confirmPassword. Поле login должен содержать:
 * - Tолько латинские буквы, цифры и знак подчеркивания.
 * - Длина login должна быть меньше 20 символов.
 * (Если не знаете как проверить первое условие, то проверяем только 2 условие - вызываем метод length())
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать:
 * - Только латинские буквы, цифры и знак подчеркивания.
 * - Длина password должна быть меньше 20 символов.
 * (Если не знаете как проверить первое условие, то проверяем только 2 условие - вызываем метод length())
 * Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода "checkAuthorization".
 * Используем multi-catch block. Метод "checkAuthorization" возвращает true, если значения верны или false в другом случае.
 * В методе main вызываем метод checkAuthorization и печатаем на консоль результат выполнения метода.
 * <p>
 * PS: если не знаем как сделать проверку, то можно просто оставить пустую реализацию! Прорабатываем работу с исключениями
 */
public class Main {

    //    @SneakyThrows
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Authorization.checkAuthorization("login", "123", "123");
        Authorization.checkAuthorization("loginewbverberbertevewewvgwe", "123", "123");
        Authorization.checkAuthorization("login", "1234", "123");
    }
}
