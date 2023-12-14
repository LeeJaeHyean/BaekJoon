class Solution {
    public static int solution(int[] arr) {
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
 				}
			}
		}
		if(arr[0] < arr[1] + arr[2]) {
			result = 1;
		} else {
			result = 2;
		}
		return result;
	}
	
    public static void main(String[] args) {
    	int[] arr = {1, 2, 3};
     	int result = solution(arr);
    	System.out.println(result);
    }
}