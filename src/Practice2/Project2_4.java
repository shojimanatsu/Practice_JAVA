package Practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_4 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;
		int y;
		int z;

		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());

		// �a
		z = x + y;
		System.out.println("�a�́A" + z);

		// ��
		z = x - y;
		System.out.println("���́A" + z);

		// ��
		z = x * y;
		System.out.println("�ς́A" + z);
		// ���Ƃ��܂�
		z = x / y;
		System.out.println("���́A" + z);
		z = z % y;
		System.out.println("���܂�́A" + z);

	}

}
