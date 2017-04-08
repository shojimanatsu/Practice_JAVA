package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;
		int y;

		// 入力
		// 1つ目の整数入力
		System.out.println("1つ目の整数を入力してください。");
		x = Integer.parseInt(br.readLine());

		// 2つ目の整数入力
		System.out.println("2つ目の整数を入力してください。");
		y = Integer.parseInt(br.readLine());

		// 条件分岐
		if (x > y)
			System.out.println(x);
		else
			System.out.println(y);

	}

}
