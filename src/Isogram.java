/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.
 */

public class Isogram {

    public static boolean isIsogram(String word) {
        if (word.isEmpty()) return true;
        char[] letters = word.toUpperCase().toCharArray();
        StringBuilder nonRepeatedLetters = new StringBuilder(" ");

        for (char letter : letters) {
            if (nonRepeatedLetters.toString().contains(String.valueOf(letter))) {
                return false;
            } else {
                nonRepeatedLetters.append(letter);
            }
        }
        return true;
    }
}

// Other way
/*
  public static boolean  isIsogram(String str) {
     return str.length() == str.toLowerCase().chars().distinct().count();
  }

 */