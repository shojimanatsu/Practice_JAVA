package Practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_4 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 変数宣言
		int x;
		int y;
		int z;

		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());

		// 和
		z = x + y;
		System.out.println("和は、" + z);

		// 差
		z = x - y;
		System.out.println("差は、" + z);

		// 積
		z = x * y;
		System.out.println("積は、" + z);
		// 商とあまり
		z = x / y;
		System.out.println("商は、" + z);
		z = z % y;
		System.out.println("あまりは、" + z);

	}

}
