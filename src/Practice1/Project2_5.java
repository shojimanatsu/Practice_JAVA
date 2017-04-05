package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		int z;

		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());

		z = (x + y) / 2;
		System.out.println("平均は、" + z);
	}

}
