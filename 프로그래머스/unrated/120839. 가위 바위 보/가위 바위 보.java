class Solution {
   public static String solution(String hp) {
		String result = "";
		
		for(int i = 0; i < hp.length(); i++) {
			char ch = hp.charAt(i);
			if(ch == '2') {
				result += "0";
			} if (ch == '0') {
				result += "5";
			} if (ch == '5') {
				result += "2";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "205";
		String result = solution(str);
		System.out.println(result);
	}
}