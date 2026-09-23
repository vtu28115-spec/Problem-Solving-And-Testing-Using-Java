import java.util.ArrayList;
import java.util.List;
public class w5_naivealgorithm {
    public static List<Integer> searchPattern(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String text1 = "geeksforgeeks";
        String pattern1 = "geeks";
        System.out.println("Output 1: " + searchPattern(text1, pattern1));
        String text2 = "aabaacaadaabaaba";
        String pattern2 = "aaba";
        System.out.println("Output 2: " + searchPattern(text2, pattern2));
    }
}