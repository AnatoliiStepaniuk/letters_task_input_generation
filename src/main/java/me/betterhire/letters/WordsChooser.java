package me.betterhire.letters;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class WordsChooser {

    private final String FILE = "all_words.txt";

    @SneakyThrows
    List<String> choose(int num){
        List<String> allWords = Files.readAllLines(Path.of(FILE));
        Collections.shuffle(allWords);
        return allWords.subList(0, num);
    }
}
