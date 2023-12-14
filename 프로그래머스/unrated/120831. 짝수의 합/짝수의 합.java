class Solution {
    public static int solution(int n) {
		int result = 0;
		for(int i = 0; i <= n; i++) {
			if(i%2 == 0) {
				result += i;
			}
		}
		return result;
	}
	 
    public static void main(String[] args) {
    	int num = 10;
    	int result = solution(num);
    	System.out.println(result);
    }
}