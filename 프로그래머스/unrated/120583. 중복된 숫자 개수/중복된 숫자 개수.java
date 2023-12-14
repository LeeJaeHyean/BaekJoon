class Solution {
    public static int solution(int[] arr, int number) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == number) {
				result++;
			}
		}
		return result;
	}
	
    public static void main(String[] args) {
    	int[] arr = {1, 1, 2, 3, 4, 5};
    	int number = 1;
     	int result = solution(arr, number);
    		System.out.println(result);
    }
}