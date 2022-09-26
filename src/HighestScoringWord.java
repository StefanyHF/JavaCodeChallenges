/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.

 */

import java.util.HashMap;

public class HighestScoringWord {

    public static String high(String s) {
        HashMap<Character, Integer> lettersScore = new HashMap<>();
        char[] alphabetLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int highestScore = 0;
        int secondHighestScore = 0;
        String highestScoreWord = "";

        int score = 1;
        for (char alphabetLetter : alphabetLetters) {
            lettersScore.put(alphabetLetter, score++);
        }

        String[] words = s.toLowerCase().split(" ");
        char[] firstWord = words[0].toCharArray();

        for (char c : firstWord) {
            if (lettersScore.get(c) != null) highestScore += lettersScore.get(c);
            highestScoreWord = words[0];
        }

        for (String word : words) {
            char[] wordArray = word.toCharArray();
            for (char letter : wordArray) {
                if (lettersScore.get(letter) != null) secondHighestScore += lettersScore.get(letter);
            }
            if (secondHighestScore > highestScore) {
                highestScore = secondHighestScore;
                highestScoreWord = word;
            }
            secondHighestScore = 0;
        }
        return highestScoreWord;
    }
}
