import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class w5_alternatecharacters {
    public static int alternatingCharacters(String s) {
        int deletions = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        return deletions;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        while (q-- > 0) {
            String s = bufferedReader.readLine().trim();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        bufferedReader.close();
    }
}