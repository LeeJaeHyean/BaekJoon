class Solution {
  public static int solution(String str) {
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int temp = ch;
			if(temp >= 48 && temp <= 57) {
				result += (temp - 48);
			}
		}
		return result;
	}
	
    public static void main(String[] args) {
     	String str = "1a2b3c4d123";
    	int result = solution(str);
    	System.out.println(result);
    }
}