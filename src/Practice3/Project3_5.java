package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_5 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;

		// ���̐����l�����
		System.out.println("���̐�������͂��Ă�������");
		x = Integer.parseInt(br.readLine());

		// ��������
		if (x % 2 == 0)
			// �\��
			System.out.println("���͂��ꂽ�l�͋����ł�");
		else
			// �\��
			System.out.println("���͂��ꂽ�l�͊�ł�");

	}

}
