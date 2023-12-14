class Solution {
    public static String solution(String str, String testCase) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char ch2 =testCase.charAt(0);
			if(ch != ch2) {
				result += String.valueOf(ch);
			}
		}
		return result;
	}
	
    public static void main(String[] args) {
    	String str = "abcdef";
    	String testCase = "f";
    	String result = solution(str, testCase);
    	System.out.println(result);
    }
}