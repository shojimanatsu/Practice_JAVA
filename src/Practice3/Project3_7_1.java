package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.PersistentMBean;

public class Project3_7_1 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;

		// �_������
		System.out.println("�����̓_������͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		// ��������
		if (x >= 60) {
			System.out.println("���i");

		} else if (x < 60) {
			System.out.println("�s���i");

		}
	}

}
