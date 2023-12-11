import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String str = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                str += Character.toLowerCase(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                str += Character.toUpperCase(ch);
            } else {
                // 다른 문자는 그대로 추가
                str += ch;
            }
        }

        System.out.println(str);
    }
}