public class Pangram {
    /*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is,
False if not. Ignore numbers and punctuation.
     */

    public boolean isPangram(String sentence) {
        char[] alphabetLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        if (sentence.length() < alphabetLetters.length) return false;

        for (char letter : alphabetLetters) {
            if (!sentence.toUpperCase().contains(String.valueOf(letter))) return false;
        }
        return true;
    }
}
