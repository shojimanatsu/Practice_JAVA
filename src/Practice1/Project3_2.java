package Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_2 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;
		int y;

		// ����
		// 1�ڂ̐�������
		System.out.println("1�ڂ̐�������͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		// 2�ڂ̐�������
		System.out.println("2�ڂ̐�������͂��Ă��������B");
		y = Integer.parseInt(br.readLine());

		// ��������
		if (x > y)
			System.out.println(x);
		else
			System.out.println(y);

	}

}
