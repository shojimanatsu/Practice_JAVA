package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_4 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;
		int y;

		// 入力
		// x入力
		System.out.println("xを入力してください。");
		x = Integer.parseInt(br.readLine());

		// y入力
		System.out.println("yを入力してください。");
		y = Integer.parseInt(br.readLine());

		// 条件分岐
		if (x > y)
			System.out.println("xはyより大きい");
		else if (x < y)
			System.out.println("yはxより大きい");
		else if (x == y)
			System.out.println("xとyは等しい");

	}

}
