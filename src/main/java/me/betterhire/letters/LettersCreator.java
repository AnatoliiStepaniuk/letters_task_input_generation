package me.betterhire.letters;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import lombok.SneakyThrows;

import static me.betterhire.letters.FileUtils.lettersFile;

public class LettersCreator {

	@SneakyThrows
	public void createLetters(String wordsFile, double rate) {
		List<String> input = Files.readAllLines(Paths.get(wordsFile));
		List<String> allLetters = input.subList(1, input.size())
				.stream()
				.flatMap( s -> Arrays.stream(s.split( "" ) ) )
				.collect( Collectors.toList() );

		Collections.shuffle(allLetters);

		List<String> someLetters = allLetters.subList(0, (int) (allLetters.size() * rate));

		writeToFile(lettersFile(wordsFile), someLetters);
	}

	@SneakyThrows
	private void writeToFile(String lettersFile, List<String> someLetters){
		BufferedWriter lettersWriter = new BufferedWriter(new FileWriter(lettersFile));
		lettersWriter.write(String.valueOf(someLetters.size()));
		lettersWriter.newLine();
		FileUtils.writeStrings(lettersWriter, someLetters);
	}

}
