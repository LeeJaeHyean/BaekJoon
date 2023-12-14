class Solution {
   public static int solution(int[] arr) {
		int result = 0;
		if(arr[0] > 0 && arr[1] > 0) {
			result = 1;
		} else if(arr[0] < 0 && arr[1] > 0) {
			result = 2;
		} else if(arr[0] < 0 && arr[1] < 0) {
			result = 3;
		} else {
			result = 4;
		}
		return result;
	}
	
    public static void main(String[] args) {
    	int[] arr = {2,4};
    	int result = solution(arr);
    	System.out.println(result);
    }
}