package Practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_3 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		int z;

		x = Integer.parseInt(br.readLine());
		// 1��
		System.out.println("����:" + x);

		// 2��
		y = x * x;
		System.out.println("����:" + y);

		// 3��
		z = x * y;
		System.out.println("����:" + z);
	}

}
