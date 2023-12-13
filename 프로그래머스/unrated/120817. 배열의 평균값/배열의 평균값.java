class Solution {
     public static double solution(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        double result1 = solution(numbers1);
        double result2 = solution(numbers2);

        System.out.println(result1); 
        System.out.println(result2); 
    }
}