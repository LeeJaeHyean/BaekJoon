class Solution {
   public static int solution(String str) {
		int result = str.length()*2;
		return result;
	}
	
    public static void main(String[] args) {
    	String str = "happy birthday!";
    	int result = solution(str);
    	System.out.println(result);
    }
}