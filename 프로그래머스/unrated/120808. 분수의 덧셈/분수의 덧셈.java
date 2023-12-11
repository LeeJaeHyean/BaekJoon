class Solution {
    public static void main(String[] args) {
        int[] result = solution(1, 2, 2, 3);
        System.out.println("Result: " + result[0] + "/" + result[1]); 
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];

        result[0] = numer1 * denom2 + numer2 * denom1;
        result[1] = denom1 * denom2;

        int gcd = gcd(result[0], result[1]);
        result[0] /= gcd;
        result[1] /= gcd;

        return result;
    }
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}