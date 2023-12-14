class Solution {
    public static int solution(int menu, int drink) {
		int result = (menu * 12000) + (drink * 2000);
		if(menu >= 10) {
			int temp = menu/10;
			result -= (temp*2000);
		}
		return result;
	}
	
    public static void main(String[] args) {
    	int menu = 10;
    	int drink = 3;
    	int result = solution(menu, drink);
    	System.out.println(result);
    }
}