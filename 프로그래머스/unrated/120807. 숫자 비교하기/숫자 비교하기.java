class Solution {
    public static int solution(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        } else {
            return -1;
        }
        
    }
     public static void main(String[] args) {
        System.out.println(solution(2,3));
        System.out.println(solution(11,11));
        System.out.println(solution(7,99));
    }
}