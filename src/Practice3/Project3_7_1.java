package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.PersistentMBean;

public class Project3_7_1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;

		// 点数入力
		System.out.println("試験の点数を入力してください。");
		x = Integer.parseInt(br.readLine());

		// 条件分岐
		if (x >= 60) {
			System.out.println("合格");

		} else if (x < 60) {
			System.out.println("不合格");

		}
	}

}
