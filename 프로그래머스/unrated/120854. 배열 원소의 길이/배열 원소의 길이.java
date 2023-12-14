class Solution {
    public static int[] solution(String[] str) {
		int[] result = new int[str.length];
		for (int i = 0; i < result.length; i++) {
			int temp = str[i].length();
			result[i] = temp;
		}
		return result;
	}
	 
    public static void main(String[] args) {
    	String[] str = {"We", "are", "the", "world!"};
    	int[] result = solution(str);
    	for (int i = 0; i < result.length; i++) {
    		System.out.println(result[i]);
		}
    }
}