class Solution {
  public static int solution(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			int temp = n%i;
			int num = n/i;
			if(temp == 0 && num*num == n) {
				result = 1;
				return result;
			}
		}
		result = 2;
		return result;
	}
	
    public static void main(String[] args) {
     	int n = 976;
    	int result = solution(n);
    	System.out.println(result);
    }
}