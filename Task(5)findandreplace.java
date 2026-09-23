import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class w5_findandreplace {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }
    private static boolean matches(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        int[] wordToPattern = new int[256];
        int[] patternToWord = new int[256];
        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if (wordToPattern[w] != 0 && wordToPattern[w] != p) {
                return false;
            }
            if (patternToWord[p] != 0 && patternToWord[p] != w) {
                return false;
            }
            wordToPattern[w] = p;
            patternToWord[p] = w;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = scanner.next();
            }
            String pattern = scanner.next();
            List<String> matchedWords = findAndReplacePattern(words, pattern);
            System.out.println(matchedWords);
        }
        scanner.close();
    }
}