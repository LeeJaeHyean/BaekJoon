class Solution {
    public static int[] solution(int n) {
		int temp = 0;
		int index = 0;
		if(n%2 == 0) {
			temp = n/2;
		} else {
			temp = (n/2)+1;
		}
		int[] result = new int[temp];
		for(int i = 0; i <= n; i++) {
			if(i%2 != 0) {
				result[index] = i;
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 15;
		int[] result = solution(n);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}