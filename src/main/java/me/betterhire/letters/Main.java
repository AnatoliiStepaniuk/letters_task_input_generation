package me.betterhire.letters;

public class Main {
    public static void main(String[] args) {
        LettersCreator lettersCreator = new LettersCreator();
        WordsCreator wordsCreator = new WordsCreator();

        wordsCreator.createWords("b_words.txt", 4, 7, 1000);
        lettersCreator.createLettersFromFile("b_words.txt", 0.8);
        wordsCreator.createWords("c_words.txt", 20, 30, 10000);
        lettersCreator.createLettersFromFile("c_words.txt", 0.7);
        wordsCreator.createWords("d_words.txt", 5, 50, 30000);
        lettersCreator.createLettersFromFile("d_words.txt", 0.65);

    }
}
