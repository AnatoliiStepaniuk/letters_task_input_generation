package me.betterhire.letters;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WordsWriter {

    @SneakyThrows
    public void write(String wordsFile, List<String> words){
        try(BufferedWriter wordsWriter = new BufferedWriter(new FileWriter(wordsFile))){
            FileUtils.writeStrings(wordsWriter, words);
        }

    }

}
