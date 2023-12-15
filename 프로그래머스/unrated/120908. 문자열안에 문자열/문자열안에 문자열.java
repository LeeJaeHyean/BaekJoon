class Solution {
 public static int solution(String str, String str2) {
		int result = 0;
		if(str.contains(str2)) {
			result = 1;
		} else {
			result = 2;
		}
		return result;
    }

    public static void main(String[] args) {
    	String str = "ab6CDE443fgh22iJKlmn1o";
    	String str2 = "6CD";
    	int result = solution(str, str2);
    	System.out.println(result);
    }
}