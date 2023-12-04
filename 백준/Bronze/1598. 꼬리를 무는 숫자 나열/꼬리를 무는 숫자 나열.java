import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int f = firstNum%4;
		int s = secondNum%4;
		int cnt = 0;
		int cnt2 = 0;
		if(f <= 0) {
			f = 4;
		}
		if(s <= 0) {
			s = 4; 
		}
		int result = f - s;
		if (result < 0) {
			result = -(result);
		}
		for(int i = f; i <= firstNum; i+=4) {
			cnt++;
		}
		for(int i = s; i <= secondNum; i+=4) {
			cnt2++;
		}
		if(cnt > cnt2) {
			System.out.println((cnt-cnt2)+result);
		} else {
			System.out.println((cnt2-cnt)+result);
		}
	}
}
