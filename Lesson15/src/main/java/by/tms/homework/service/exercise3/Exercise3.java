package by.tms.homework.service.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static by.tms.homework.service.TextFormatter.getSentencesFromText;
import static by.tms.homework.service.TextFormatter.hasBlacklistWordInString;

public class Exercise3 {
    private static final String BLACKLIST = "Lesson15/src/main/java/by/tms/homework/service/Exercise3/blacklist.txt";
    private static final String BLACKLIST_SEPARATOR = "[,\\s]+";
    private static final String TEXT = "Lesson15/src/main/java/by/tms/homework/service/Exercise3/text.txt";

    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of(TEXT));
            String[] blacklist = Files.readString(Path.of(BLACKLIST)).split(BLACKLIST_SEPARATOR);
            if (hasBlacklistWordInString(text, blacklist)) {
                System.out.println("Слова из черного списка и предложения подлежащие исправлению: ");
                List<String> sentences = getSentencesFromText(text);
                int sentencesWithBLWords = 0;
                for (String sentence : sentences) {
                    if (hasBlacklistWordInString(sentence, blacklist)) {
                        System.out.println(sentence);
                        sentencesWithBLWords++;
                    }
                }
                System.out.println("Предложения для исправления: " + sentencesWithBLWords);
            } else {
                System.out.println("Нет слов из чёрного списка.");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
