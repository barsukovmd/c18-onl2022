package by.tms.homework.strings.excercise4;

public class TextFormatter {
    private String string;

    public TextFormatter(String string) {
        this.string = string;
    }

    public String showWords() {
        StringBuilder newString = new StringBuilder();
        int count = 0;
        for (String words : TextCorrecter.splitSentencesByPoint(string)) {
            String[] strings = string.split(" ");
            if (TextCorrecter.checkForWordsAndPalindromes(strings)) {
                newString.append(words).append(" .");
                count++;
            }
        }
        return newString + " " + count;
    }
}
