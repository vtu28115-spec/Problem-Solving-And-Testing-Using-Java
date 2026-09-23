import java.util.Scanner;
public class w5_maximumsumcircularsubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSoFar = nums[0];
        int currentMax = 0;
        int minSoFar = nums[0];
        int currentMin = 0;
        for (int num : nums) {
            totalSum += num;
            currentMax = Math.max(num, currentMax + num);
            maxSoFar = Math.max(maxSoFar, currentMax);
            currentMin = Math.min(num, currentMin + num);
            minSoFar = Math.min(minSoFar, currentMin);
        }
        if (maxSoFar < 0) {
            return maxSoFar;
        }
        return Math.max(maxSoFar, totalSum - minSoFar);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int result = maxSubarraySumCircular(nums);
            System.out.println(result);
        }
        scanner.close();
    }
}