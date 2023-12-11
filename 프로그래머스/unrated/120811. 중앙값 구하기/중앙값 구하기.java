class Solution {
    public static int solution(int[] temp) {
        int[] arr = new int[temp.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        // 정렬 코드를 solution 메소드 내로 이동
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int dump = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = dump;
                }
            }
        }

        return arr[(arr.length / 2)];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 10, 11};
        int temp = solution(arr);
        System.out.println(temp);
    }
}