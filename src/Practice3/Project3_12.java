package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_12 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/*
		 * ���K���R�|�P�Q 
		 * �D����齁i�����j��I�������A����ɑΉ��������b�Z�[�W��\������A齐肢�v���O�������쐬���Ȃ����B 
		 * �� switch�����g�p����B 
		 * �� �I���́A�g1�F�܂��� 2�F���� 3�F���͂��D�D�D�h�̂悤�ȃK�C�h��\���������œ��͂�����B
		 */

		// �ϐ��錾
		int x;

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("***�����肢***");
		System.out.println("�D���Ȃ����i��I��ł��������B");
		System.out.println("1.�܂���  2.������  3.�T�[����  4.����  5.����ς�");

		x = Integer.parseInt(br.readLine());

		switch (x) {
		case 1:
			System.out.println("�܂��܂��ǂ����Ƃ�����ł��傤");
			break;
		case 2:
			System.out.println("�ǂ����Ƃ�����ł��傤");
			break;
		case 3:
			System.out.println("���܂�ǂ����Ƃ��N���Ȃ��ł��傤");
			break;
		case 4:
			System.out.println("�ƂĂ��ǂ����Ƃ�����ł��傤");
			break;
		case 5:
			System.out.println("����܂łɂȂ��ǂ����Ƃ�����ł��傤");
			break;
		default:
			System.out.println("���͂��ꂽ�l�͔���ł��܂���B");
			break;
		}

	}

}
