class Solution {
    public static int solution(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		result = arr[0] * arr[1];
		return result;
	}
	
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5};
     	int result = solution(arr);
    		System.out.println(result);
    }
}