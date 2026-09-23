import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class w5_subarraydivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int currentSum = 0;
        if (s.size() < m) {
            return 0;
        }
        for (int i = 0; i < m; i++) {
            currentSum += s.get(i);
        }
        if (currentSum == d) {
            count++;
        }
        for (int i = m; i < s.size(); i++) {
            currentSum += s.get(i) - s.get(i - m);
            if (currentSum == d) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] sTemp = bufferedReader.readLine().trim().split(" ");
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(Integer.parseInt(sTemp[i]));
        }
        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
        int d = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);
        int result = birthday(s, d, m);
        System.out.println(result);
        bufferedReader.close();
    }
}