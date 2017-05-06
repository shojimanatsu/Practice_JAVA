package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_13 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 練習問題３－１３ 
		 * 月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。
		 * 2 月は 28 日とします。 
		 * また、1 ～ 12以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
		 */

		// 変数宣言
		int x;

		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("何月の日数を見ますか？");

		x = Integer.parseInt(br.readLine());

		switch (x) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31日です。");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日です。");
			break;
		case 2:
			System.out.println("28日です。");
			break;
		default:
			System.out.println("入力が間違っています。");
			break;
		}
	}

}
