package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_13 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/*
		 * ���K���R�|�P�R 
		 * ����\�����l����͂��A���̌��̓�����\������v���O�������쐬���Ȃ����B
		 * 2 ���� 28 ���Ƃ��܂��B 
		 * �܂��A1 �` 12�ȊO�̐��l�����͂��ꂽ�ꍇ�ɁA�g���͂��Ԉ���Ă��܂��h�ƕ\�����Ȃ����B
		 */

		// �ϐ��錾
		int x;

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�����̓��������܂����H");

		x = Integer.parseInt(br.readLine());

		switch (x) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31���ł��B");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30���ł��B");
			break;
		case 2:
			System.out.println("28���ł��B");
			break;
		default:
			System.out.println("���͂��Ԉ���Ă��܂��B");
			break;
		}
	}

}
