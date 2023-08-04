import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int first = 0, second = 0;
			for (int i = 0; i < n; i++) {
				String s = fs.next();
				if (s.equals("START38")) {
					first++;
				} else {
					second++;
				}
			}
			System.out.println(first + " " + second);
		}
		fs.close();
	}
}
