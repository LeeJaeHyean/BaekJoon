class Solution {
   public static int[] solution(int[] numbers) {
        int arr[] = new int[numbers.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i] * 2;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] test = solution(arr);
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(test[i]);
        }
    }
}