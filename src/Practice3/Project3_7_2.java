package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_7_2 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;

		// ����
		System.out.println("�����̓_������͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		// ��������
		if (x >= 80) {
			System.out.println("�����ւ�悭�ł��܂���");

		} else if ((60 <= x) && (x < 80)) {
			System.out.println("�悭�ł��܂���");

		} else if (x < 60) {
			System.out.println("����˂�ł���");
		}
	}

}
