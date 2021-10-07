package Chapter9;

import java.util.Scanner;

class L3P23 { //Attempt 2
    private static final char BLANK = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        int index, wordCount, numberOfCharacters;

        System.out.println("Enter a sentence: ");
        String sentence = scanner.next();
        sentence = sentence.trim();
        numberOfCharacters = sentence.length();
        index = 0;
        wordCount = 0;
        while (index < numberOfCharacters) {
            //ignore blank spaces
            while (index < numberOfCharacters && sentence.charAt(index) == BLANK) {
                index++;
            }
            //now locate the end of the word
            while (index < numberOfCharacters && sentence.charAt(index) != BLANK) {
                index++;
            }
            //another word is found, so increment the counter
            wordCount++;
        }

        //display the result
        System.out.println("input sentence: " + sentence);
        System.out.println("Word count:" + wordCount + " words ");
    }
}