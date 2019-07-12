package me.betterhire.letters;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        LettersCreator lettersCreator = new LettersCreator();
        WordsChooser wordsChooser = new WordsChooser();
        WordsWriter wordsWriter = new WordsWriter();

        List<String> wordsB = wordsChooser.choose(100);
        wordsWriter.write("b_words.txt", wordsB);
        lettersCreator.createLetters("b_letters.txt", wordsB, 0.8);

        List<String> wordsC = wordsChooser.choose(1000);
        wordsWriter.write("c_words.txt", wordsC);
        lettersCreator.createLetters("c_letters.txt", wordsC, 0.7);

        List<String> wordsD = wordsChooser.choose(3000);
        wordsWriter.write("d_words.txt", wordsD);
        lettersCreator.createLetters("d_letters.txt", wordsD, 0.65);

    }
}
