import java.util.Arrays;

public class PrefixExtractor {

    public static String getLongestCommonPrefix(String[] words) {

        String longestCommonPrefix = "";

        if (words == null || words.length == 0) return "";
        else if (words.length == 1) return words[0];

        Arrays.sort(words);

        for (int i = 0; i < words[0].length(); ++i) {
            if (words[0].charAt(i) == words[words.length - 1].charAt(i)) {
                longestCommonPrefix += words[0].charAt(i);
            } else {
                break;
            }
        }
        return longestCommonPrefix;
    }
}
