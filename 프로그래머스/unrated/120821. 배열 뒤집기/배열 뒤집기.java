class Solution {
   public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = num_list[length - 1 - i];
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = solution(num_list);

        for (int num : result) {
            System.out.print(num);
        }
    }
}