class Solution {
    public static int[] solution(int money) {
        final int AMERICANO_PRICE = 5500;
        int[] result = new int[2];

        result[0] = money / AMERICANO_PRICE;  // 아메리카노 잔 수
        result[1] = money % AMERICANO_PRICE;  // 남은 돈

        return result;
    }

    public static void main(String[] args) {
        int money = 11000;  // 머쓱이가 가지고 있는 돈
        int[] result = solution(money);

        System.out.println("아메리카노 잔 수: " + result[0]);
        System.out.println("남은 돈: " + result[1]);
    }
}