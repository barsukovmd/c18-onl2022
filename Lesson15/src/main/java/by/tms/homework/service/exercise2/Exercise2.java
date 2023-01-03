package by.tms.homework.service.exercise2;

import by.tms.homework.service.TextFormatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static final String INPUT = "Lesson15/src/main/java/by/tms/homework/service/Exercise2/input.txt";
    public static final String OUTPUT = "Lesson15/src/main/resources/output2";

    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of(INPUT));
            List<String> sentences = TextFormatter.getSentencesFromText(text);
            List<String> filteredSentences = new ArrayList<>();
            for (String sentence : sentences) {
                int numberOfWords = TextFormatter.getCountWordsInString(sentence);
                if (numberOfWords >= 3 && numberOfWords <= 5 || TextFormatter.hasPalindromeInString(sentence)) {
                    filteredSentences.add(sentence);
                }
            }
            Files.write(Path.of(OUTPUT), filteredSentences);
        } catch (IOException e) {
            System.out.println("Files has been written");
        }
    }
}
