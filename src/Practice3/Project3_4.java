package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_4 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;
		int y;

		// ����
		// x����
		System.out.println("x����͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		// y����
		System.out.println("y����͂��Ă��������B");
		y = Integer.parseInt(br.readLine());

		// ��������
		if (x > y)
			System.out.println("x��y���傫��");
		else if (x < y)
			System.out.println("y��x���傫��");
		else if (x == y)
			System.out.println("x��y�͓�����");

	}

}
