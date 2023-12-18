import java.util.Arrays;
import java.util.Stack;

public class Solution {

	public static int[] solution(int[] arr) {
		int[] result = new int[arr.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				int index = stack.pop();
				result[index] = arr[i];
			}
			stack.push(i);
		}

		// 남아있는 스택의 인덱스에 해당하는 값들은 뒷 큰수가 없으므로 -1로 설정
		while (!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 3, 5};
		int[] result = solution(arr);

		System.out.println(Arrays.toString(result));
	}
}
