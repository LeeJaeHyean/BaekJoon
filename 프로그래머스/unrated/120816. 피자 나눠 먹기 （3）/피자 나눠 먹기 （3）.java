class Solution {
   public static int solution(int slice, int n) {
        int pizzaCount = 0;

        pizzaCount = (n + slice - 1) / slice;

        return pizzaCount;
    }

    public static void main(String[] args) {
        int slice1 = 7;
        int people1 = 10;

        int slice2 = 4;
        int people2 = 12;

        int result1 = solution(slice1, people1);
        int result2 = solution(slice2, people2);

        System.out.println(result1); // 출력: 1
        System.out.println(result2); // 출력: 1
    }
}