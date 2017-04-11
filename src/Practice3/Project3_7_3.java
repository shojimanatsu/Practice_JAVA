package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_7_3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;

		// 入力
		System.out.println("試験の点数を入力してください。");
		x = Integer.parseInt(br.readLine());

		// 条件分岐
		if (x >= 80) {
			System.out.println("優");

		} else if ((x >= 70) && (x < 80)) {
			System.out.println("良");

		} else if ((x >= 60) && (x < 70)) {
			System.out.println("可");

		} else if (x < 60) {
			System.out.println("不可");

		}
	}

}
