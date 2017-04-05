package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		int z;

		x = Integer.parseInt(br.readLine());
		// 1乗
		System.out.println("結果:" + x);

		// 2乗
		y = x * x;
		System.out.println("結果:" + y);

		// 3乗
		z = x * y;
		System.out.println("結果:" + z);
	}

}
