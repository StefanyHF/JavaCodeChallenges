import java.util.Arrays;


public class Strings {

    /*
    Take 2 strings s1 and s2 including only letters from a to z.
    Return a new sorted string, the longest possible, containing distinct letters
    - each taken only once - coming from s1 or s2.
     */

    public static String twoToOneLongString(String s1, String s2) {
        char[] letters = (s1 + s2).toCharArray();
        Arrays.sort(letters);
        String longString = String.valueOf(letters[0]);

        for (char letter : letters) {
            if (!longString.contains(String.valueOf(letter))) {
                longString += String.valueOf(letter);
            }
        }
        return longString;
    }
}
