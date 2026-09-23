import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class w5_kadanesubarray {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarraySum = arr.get(0);
        int currentSubarraySum = arr.get(0);
        int maxSubsequenceSum = 0;
        int maxElement = arr.get(0);
        boolean hasPositive = false;
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            if (i > 0) {
                currentSubarraySum = Math.max(val, currentSubarraySum + val);
                maxSubarraySum = Math.max(maxSubarraySum, currentSubarraySum);
            }
            if (val > 0) {
                maxSubsequenceSum += val;
                hasPositive = true;
            }
            maxElement = Math.max(maxElement, val);
        }
        if (!hasPositive) {
            maxSubsequenceSum = maxElement;
        }
        List<Integer> result = new ArrayList<>();
        result.add(maxSubarraySum);
        result.add(maxSubsequenceSum);
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String[] arrTemp = bufferedReader.readLine().trim().split(" ");
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(arrTemp[i]));
            }
            List<Integer> result = maxSubarray(arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
        bufferedReader.close();
    }
}