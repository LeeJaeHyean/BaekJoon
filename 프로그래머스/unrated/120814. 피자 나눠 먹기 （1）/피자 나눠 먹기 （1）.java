class Solution {
   	public static int solution(int n) {
		int slicePizza = 7;
		int pizza = 0;
		if(n > 7 && n%7 != 0) {
			for(int i = 1; i <= (n/slicePizza)+1; i++) {
				pizza++;
			}
		} else if (n%7 == 0) {
			for(int i = 1; i <= n/slicePizza; i++) {
				pizza++;
			}
		} else {
			for(int i = 0; i <= n/slicePizza; i++) {
				pizza++;
			}
		}
		return pizza;
	}

	public static void main(String[] args) {
		int people = 1;
		int result = solution(people);
		System.out.println(result);
	}
}