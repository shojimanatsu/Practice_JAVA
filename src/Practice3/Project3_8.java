package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_8 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 練習問題3-8 中間試験と、期末試験の点数（それぞれ 0 ～ 100点）を入力し、
		 * 次の条件に従って合格、不合格を判定するプログラムを作成しなさい。 
		 * 両方とも 60 点以上の場合、合格 
		 * 合計が 130点以上の場合、合格
		 * 合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格 
		 * 上記以外は不合格）
		 */
		// 変数宣言
		int ch_point = 0; // 中間試験の点数
		int ki_point = 0; // 期末試験の点数
		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("中間試験の点数を入力してください。");
		ch_point = Integer.parseInt(br.readLine());

		System.out.println("期末試験の点数を入力してください。");
		ki_point = Integer.parseInt(br.readLine());

		// 判定
		if (ch_point >= 60 && ki_point >= 60) {
			System.out.println("合格");
		} else if (ch_point + ki_point >= 130) {
			System.out.println("合格");
		} else if (ch_point + ki_point >= 100 && (ch_point >= 90 || ki_point >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}
