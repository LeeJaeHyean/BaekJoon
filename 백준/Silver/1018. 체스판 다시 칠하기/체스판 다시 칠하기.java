import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int N = scanner.nextInt();
	        int M = scanner.nextInt();

	        char[][] board = new char[N][M];
	        for (int i = 0; i < N; i++) {
	            String row = scanner.next();
	            board[i] = row.toCharArray();
	        }

	        int minRepaint = Integer.MAX_VALUE;
	        int subSize = 8;

	        for (int i = 0; i <= N - subSize; i++) {
	            for (int j = 0; j <= M - subSize; j++) {
	                int repaintCountForW = countRepaint(board, i, j, 'W', subSize);
	                int repaintCountForB = countRepaint(board, i, j, 'B', subSize);

	                int minRepaintInSubmatrix = Math.min(repaintCountForW, repaintCountForB);
	                minRepaint = Math.min(minRepaint, minRepaintInSubmatrix);
	            }
	        }
	        System.out.println(minRepaint);
	    }

	    private static int countRepaint(char[][] board, int startX, int startY, char startColor, int subSize) {
	        int repaintCount = 0;

	        for (int i = startX; i < startX + subSize; i++) {
	            for (int j = startY; j < startY + subSize; j++) {
	                if (board[i][j] != startColor) {
	                    repaintCount++;
	                }
	                startColor = (startColor == 'W') ? 'B' : 'W';
	            }
	            startColor = (startColor == 'W') ? 'B' : 'W';
	        }
	        return repaintCount;
	    }
	}