package by.tms.homework.strings.service;

public class Task1 {
    //     * 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).
    public static void main(String[] args) {
        System.out.println(cutString("Apricot, Applicable, Addiction, Bishop, Bifunctional"));
    }

    public static String cutString(String string) {
        return string.substring(string.indexOf("A"), string.lastIndexOf("B") + 1);
    }
}
