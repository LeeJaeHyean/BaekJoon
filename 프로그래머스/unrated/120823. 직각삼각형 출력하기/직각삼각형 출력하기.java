import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int starCount = sc.nextInt();
    	
    	for(int i = 1; i <= starCount; i++) {
    		for(int j = 1; j <= i; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}