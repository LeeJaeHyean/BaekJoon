class Solution {
    public static int solution(int[] arr, int tall) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > tall) {
				result++;
			}
		}
		return result;
	}
	 
    public static void main(String[] args) {
    	int[] arr = {149, 180, 192, 170};
    	int tall = 167;
    	int result = solution(arr, tall);
    	System.out.println(result);
    }
}