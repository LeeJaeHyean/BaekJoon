class Solution {
    public static String solution(String str, int n) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < n; j++) {
				char ch = str.charAt(i);
				result += String.valueOf(ch);
			}
		}
		return result;
	}
	 
    public static void main(String[] args) {
    	int num = 3;
    	String str = "hello";
    	String result = solution(str, num);
    	System.out.println(result);
    }
}