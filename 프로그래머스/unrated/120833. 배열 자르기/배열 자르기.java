class Solution {
    public static int[] solution(int[] numbers, int startIndex, int endIndex) {
	    int subArrayLength = endIndex - startIndex + 1;
	    int[] result = new int[subArrayLength];

	    for (int i = 0; i < subArrayLength; i++) {
	        result[i] = numbers[startIndex + i];
	    }

	    return result;
	}

	public static void main(String[] args) {
	    int[] numbers = {1, 3, 5, 7, 9};
	    int num1 = 1;
	    int num2 = 3;

	    int[] result = solution(numbers, num1, num2);

	    for (int value : result) {
	        System.out.println(value);
	    }
	}
}