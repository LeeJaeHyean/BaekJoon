import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BigInteger bi = new BigInteger(sc.next());
		String str = bi.toString();
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String temp = String.valueOf(ch);
			arr.add(Integer.parseInt(temp));
		}
		Collections.sort(arr);
		Collections.reverse(arr);
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
		}
	}
}