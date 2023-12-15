class Solution {
   public static int solution(int a) {
        int result = 0;

        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                int j = a / i;
                if (i == j) {
                    result++;
                } else {
                    result += 2; 
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 100;
        int result = solution(a);
        System.out.println(result);
    }
}