import java.util.Arrays;

class Solution {
    public static int[] solution(int[] sequence, int k) {
        int[] result = {0, sequence.length - 1};
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < sequence.length; right++) {
            currentSum += sequence[right];

            while (currentSum > k) {
                currentSum -= sequence[left];
                left++;
            }

            if (currentSum == k) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    result[0] = left;
                    result[1] = right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        int[] result = solution(sequence, k);
        System.out.println(Arrays.toString(result)); 
    }
}

