package by.tms.homework.strings.excercise4;

import org.apache.commons.lang3.StringUtils;

public class TextFormatter {
    private String string;

    public TextFormatter(String string) {
        this.string = string;
    }

    public boolean checkWords(String string) {
        return string.length() >= 3 && string.length() <= 5 || string.equalsIgnoreCase(StringUtils.reverse(string));
    }

    public String showWords() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String word : string.split(" ")) {
            word = String.valueOf(stringBuilder.append(string));//почему так не могу сделать?
            count++;
            return word + " " + count;
        }
        return "not found";
    }
}
