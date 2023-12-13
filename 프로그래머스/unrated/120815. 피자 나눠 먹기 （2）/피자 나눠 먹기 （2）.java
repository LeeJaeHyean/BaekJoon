class Solution {
      
    public static int solution(int n) {
        int slicePizza = 6;
        int lcm = getLCM(n, slicePizza);
        return lcm / slicePizza;
    }

    public static int getGCD(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }

    public static void main(String[] args) {
        int people1 = 6;
        int people2 = 10;
        int people3 = 4;

        int result1 = solution(people1);
        int result2 = solution(people2);
        int result3 = solution(people3);

        System.out.println(result1); 
        System.out.println(result2); 
        System.out.println(result3);
    }
}