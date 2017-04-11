package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_6 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;

		// 整数入力
		System.out.println("整数を入力してください。");
		x = Integer.parseInt(br.readLine());

		// 条件分岐
		if ((x >= 0) && (x % 2 == 0)) {
			System.out.println("入力された整数は、正の偶数です。");

		} else if ((x >= 0) && (x % 2 != 0)) {
			System.out.println("入力された整数は、正の奇数です。");

		} else if ((x < 0) && (x % 2 == 0)) {
			System.out.println("入力された整数は、負の偶数です。");
		} else if ((x < 0) && (x % 2 != 0)) {
			System.out.println("入力された整数は、負の奇数です。");
		}
	}
}
