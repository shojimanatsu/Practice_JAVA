package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_6 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ϐ��錾
		int x;

		// ��������
		System.out.println("��������͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		// ��������
		if ((x >= 0) && (x % 2 == 0)) {
			System.out.println("���͂��ꂽ�����́A���̋����ł��B");

		} else if ((x >= 0) && (x % 2 != 0)) {
			System.out.println("���͂��ꂽ�����́A���̊�ł��B");

		} else if ((x < 0) && (x % 2 == 0)) {
			System.out.println("���͂��ꂽ�����́A���̋����ł��B");
		} else if ((x < 0) && (x % 2 != 0)) {
			System.out.println("���͂��ꂽ�����́A���̊�ł��B");
		}
	}
}
