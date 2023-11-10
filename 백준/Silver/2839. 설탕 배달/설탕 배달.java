
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int count = 0;
        // 5킬로그램 봉지로 최대한 많이 채우기
        count = sugar / 5;
        sugar %= 5;
        // 남은 설탕의 무게에 따라 3킬로그램 봉지 사용
        while (sugar > 0) {
            if (sugar % 3 == 0) {
                count += sugar / 3;
                sugar = 0;
            } else {
                count--;
                sugar += 5;
            }
            // 봉지로 정확하게 N킬로그램을 만들 수 없는 경우
            if (count < 0) {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
