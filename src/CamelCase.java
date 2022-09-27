/*
Write simple .camelCase method for strings.
All words must have their first letter capitalized without spaces.
 */

public class CamelCase {

    public static String camelCase(String str) {
        String[] words = str.toLowerCase().split(" ");
        StringBuilder camelCaseWord = new StringBuilder();
        for (String word : words) {
            if (word.length() <= 1) {
                camelCaseWord.append(word.toUpperCase());
            } else {
                camelCaseWord.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            }
        }
        return camelCaseWord.toString();
    }
}
