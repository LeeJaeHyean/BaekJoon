class Solution {
    public static String solution(int n) {
		String result = "";
		String temp = String.valueOf(n);
		for(int i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			int dump = ch+49;
			ch = (char)dump;
			result += String.valueOf(ch);
		}
	    return result;
	}

	public static void main(String[] args) {
	    int n = 23;
		String result = solution(n);
	    System.out.println(result);
	}
}