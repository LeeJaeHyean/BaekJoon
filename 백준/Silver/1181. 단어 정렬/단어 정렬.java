import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            String word = sc.next();
            if (!wordList.contains(word)) {
                wordList.add(word);
            }
        }

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int cmp = Integer.compare(str1.length(), str2.length());
                if (cmp == 0) {
                    cmp = str1.compareTo(str2);
                }
                return cmp;
            }
        });
        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
