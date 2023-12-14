class Solution {
   public static String solution(String str) {
		String reversString = "";
		for(int i = str.length(); i > 0; i--) {
			char ch = str.charAt(i-1);
			reversString += String.valueOf(ch);
		}
		
		return reversString;
	}

    public static void main(String[] args) {
    	String str = "jaron";
    	String result = solution(str);
    	System.out.println(result);
    }
}