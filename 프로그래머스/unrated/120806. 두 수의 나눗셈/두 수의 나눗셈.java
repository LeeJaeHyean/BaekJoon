class Solution {
    public static int solution(int num1, int num2) {
         return (num1*1000)/num2;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(3,2));
        System.out.println(solution(7,3));
        System.out.println(solution(1,16));
    }
}