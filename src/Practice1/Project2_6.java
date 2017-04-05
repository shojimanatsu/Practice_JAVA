package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_6 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 変数宣言
		int x;
		int y;

		System.out.println("年齢を入力してください。");
		x = Integer.parseInt(br.readLine());

		// 日数計算
		y = x * 365;
		System.out.println("あなたが生まれてから現在までの日数は、" + y + "です。");

	}

}
