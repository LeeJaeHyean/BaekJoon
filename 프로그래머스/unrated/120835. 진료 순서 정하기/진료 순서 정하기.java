class Solution {
    public static int[] solution(int[] emergency) {
        int[] priorityNumbers = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int maxIndex = findMaxIndex(emergency);
            priorityNumbers[maxIndex] = i + 1;
            emergency[maxIndex] = Integer.MIN_VALUE;
        }

        return priorityNumbers;
    }

    private static int findMaxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {3, 76, 24};
        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}