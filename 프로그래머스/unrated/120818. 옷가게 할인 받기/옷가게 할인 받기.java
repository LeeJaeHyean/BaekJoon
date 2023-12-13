class Solution {
   public static int solution(int price) {
	        double discountRate = 0;

	        if (price >= 500000) {
	            discountRate = 0.2;
	        } else if (price >= 300000) {
	            discountRate = 0.1;
	        } else if (price >= 100000) {
	            discountRate = 0.05;
	        }

	        int discountedPrice = (int) (price - (price * discountRate));
	        return discountedPrice;
	    }

	    public static void main(String[] args) {
	        int price1 = 150000;
	        int price2 = 580000;

	        int result1 = solution(price1);
	        int result2 = solution(price2);

	        System.out.println(result1);
	        System.out.println(result2); 
	    }
}