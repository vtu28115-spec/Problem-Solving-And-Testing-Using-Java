class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        // Add even numbers first
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        // Add odd numbers next
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
