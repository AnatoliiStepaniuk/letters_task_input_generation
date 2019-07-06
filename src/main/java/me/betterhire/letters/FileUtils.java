package me.betterhire.letters;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.util.List;

public class FileUtils {
    public static String lettersFile(String wordsFile){
        return wordsFile.replace("words", "letters");
    }

    @SneakyThrows
    public static void writeStrings(BufferedWriter writer, List<String> strings){
        for (int i = 0; i < strings.size(); i++){
            writer.write(strings.get(i));
            if(i != strings.size()-1){
                writer.newLine();
            }
        }
        writer.flush();

    }
}
