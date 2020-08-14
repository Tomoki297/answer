package answer;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while (true) {
			method();
		}

	}

	public static void method() {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int check = 0;
		int count = 0;
		int intMax = 0;
		int intMin = 1000;

		int checker = scanner.nextInt();
		int[] scores = new int[checker];

		if (checker > 0) {

			for (int i = 0; i < checker; i++) {
				scores[i] = scanner.nextInt();

				if (intMax < scores[i]) {
					intMax = scores[i];
				}
				if (intMin > scores[i]) {
					intMin = scores[i];
				}

				count++;

			}

			for (int score : scores) {
				sum += score;
			}

			sum -= (intMax + intMin);
			check = sum / (count - 2);
			System.out.println(check);

		} else {
			System.exit(0);
		}

	}

}
