package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_12 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 練習問題３－１２ 
		 * 好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。 
		 * ※ switch文を使用する。 
		 * ※ 選択は、“1：まぐろ 2：えび 3：こはだ．．．”のようなガイドを表示し数字で入力させる。
		 */

		// 変数宣言
		int x;

		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("***すし占い***");
		System.out.println("好きなお寿司を選んでください。");
		System.out.println("1.まぐろ  2.いくら  3.サーモン  4.たこ  5.かんぱち");

		x = Integer.parseInt(br.readLine());

		switch (x) {
		case 1:
			System.out.println("まぁまぁ良いことがあるでしょう");
			break;
		case 2:
			System.out.println("良いことがあるでしょう");
			break;
		case 3:
			System.out.println("あまり良いことが起きないでしょう");
			break;
		case 4:
			System.out.println("とても良いことがあるでしょう");
			break;
		case 5:
			System.out.println("これまでにない良いことがあるでしょう");
			break;
		default:
			System.out.println("入力された値は判定できません。");
			break;
		}

	}

}
