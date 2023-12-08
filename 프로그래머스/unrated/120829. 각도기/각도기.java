class Solution {
    public static int solution(int angle) {
        if( angle == 180) {
	    		return 4;
	    	} else if(angle == 90) {
	    		return 2;
	    	} else if(angle < 90) {
	    		return 1;
	    	} else {
	    		return 3;
	    	}
	    }
	    
	    public static void main(String[] args) {
	        int angle = 70;
	        solution(angle);
	    }
}