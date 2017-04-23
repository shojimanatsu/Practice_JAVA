package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_10 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 練習問題3-10 整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。 
		 * ・ x は yより小さく、かつ、x と y は共に偶数である。 
		 * ・x と y は等しく、かつ、負の数である。 
		 * ・x は y より小さい、または、xは偶数である。 
		 * ・x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
		 * ・x も yも負の数である、ではない。（ x も y も負の数である、の否定）
		 */
		// 変数宣言
		int x;
		int y;

		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("整数値xを入力してください。");
		x = Integer.parseInt(br.readLine());

		System.out.println("整数値yを入力してください。");
		y = Integer.parseInt(br.readLine());

		if (x<y && x%2==0) {
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		} else if (x==y && x<0 && y<0) {
			System.out.println("xとyは等しく、かつ、負の数である。");
		} else if (x<y || x%2==0) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		} else if ((x<=10 || x>=100) && (y>=10 && y<=100)) {
			System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
		} else if (x>0 && y>0) {
			System.out.println("xもyも負の数ではない。");
		} else {
			System.out.println("入力された値は判定できません。");
		}

	}

}
