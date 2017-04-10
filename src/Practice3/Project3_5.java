package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;

		// 正の整数値を入力
		System.out.println("正の整数を入力してください");
		x = Integer.parseInt(br.readLine());

		// 条件分岐
		if (x % 2 == 0)
			// 表示
			System.out.println("入力された値は偶数です");
		else
			// 表示
			System.out.println("入力された値は奇数です");

	}

}
