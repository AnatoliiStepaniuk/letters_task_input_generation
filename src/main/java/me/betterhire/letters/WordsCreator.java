package me.betterhire.letters;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class WordsCreator {
    private static String letters = "abcdefghijklmnopqrstuvwxyz";
    private static Random random = new Random();

    @SneakyThrows
    public void createWords(String wordsFile, int min, int max, int number) {
        List<String> words = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            words.add(generateWord(generateLength(min, max)));
        }
        writeToFile(wordsFile, min, max, words);
    }

    private String generateWord(int length) {
        return random.ints(length, 0, letters.length() - 1)
                .boxed()
                .map(i -> String.valueOf(letters.charAt(i)))
                .collect(Collectors.joining());
    }

    private int generateLength(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    @SneakyThrows
    private void writeToFile(String wordsFile, int min, int max, List<String> words) {
        BufferedWriter wordsWriter = new BufferedWriter(new FileWriter(wordsFile));
        wordsWriter.write(String.valueOf(words.size()));
        wordsWriter.write(" ");
        wordsWriter.write(String.valueOf(min));
        wordsWriter.write(" ");
        wordsWriter.write(String.valueOf(max));
        wordsWriter.newLine();

        FileUtils.writeStrings(wordsWriter, words);
    }

}
