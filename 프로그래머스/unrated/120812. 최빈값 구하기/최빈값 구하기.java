class Solution {
    public static int solution(int[] array) {
        int maxCount = 0;   
        int mode = -1;      

        for (int i = 0; i < array.length; i++) {
            int count = 0;   
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            } else if (count == maxCount && mode != array[i]) {
                mode = -1;
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int result = solution(arr);
        System.out.println(result);
    }
}