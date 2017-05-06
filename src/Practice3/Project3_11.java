package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_11 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 練習問題3-11 
		 * 月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
		 * 表示する祝日は以下の日とします。 
		 * １月：元日、成人の日 
		 * ２月：建国記念の日 
		 * ３月：春分の日 
		 * ４月：昭和の日
		 * ５月：憲法記念日、みどりの日、こどもの日 
		 * ７月：海の日 
		 * ９月：敬老の日、秋分の日 
		 * １０月：体育の日 
		 * １１月：文化の日、勤労感謝の日
		 * １２月：天皇誕生日 ※ switch 文を使用すること。
		 * 
		 */

		// 変数宣言
		int x;

		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("何月の祝日を見ますか。");
		x = Integer.parseInt(br.readLine());

		// 条件分岐
		switch (x) {
		case 1:
			System.out.println("1月の祝日は元旦と成人の日です。");
		case 2:
			System.out.println("2月の祝日は建国記念の日です。");
		case 3:
			System.out.println("3月の祝日は春分の日です。");
			break;
		case 4:
			System.out.println("4月の祝日は昭和の日です。");
			break;
		case 5:
			System.out.println("5月の祝日は憲法記念日とみどりの日とこどもの日です。");
			break;
		case 6:
			System.out.println("6月の祝日はありません");
			break;
		case 7:
			System.out.println("7月の祝日は海の日です。");
			break;
		case 8:
			System.out.println("8月の祝日はありません。");
			break;
		case 9:
			System.out.println("9月の祝日は敬老の日と秋分の日です。");
			break;
		case 10:
			System.out.println("10月の祝日は体育の日です。");
			break;
		case 11:
			System.out.println("11月の祝日は文化の日と勤労感謝の日です。");
			break;
		case 12:
			System.out.println("12月の祝日は天皇誕生日です。");
			break;
		default:
			System.out.println("入力された日は判定できません。");
			break;
		}

	}

}
