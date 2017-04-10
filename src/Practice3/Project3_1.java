package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;
		int y;

		// x入力
		System.out.println("xを入力してください。");
		x = Integer.parseInt(br.readLine());

		// y入力
		System.out.println("yを入力してください。");
		y = Integer.parseInt(br.readLine());
		if (x > y)
			System.out.println("xはyより大きい");

	}
}
