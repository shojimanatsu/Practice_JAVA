package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_11 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/*
		 * ���K���3-11 
		 * ����\�����l����͂��A���̌��̏��߂���N���܂łɂ���j����\������v���O�������쐬���Ȃ����B
		 * �\������j���͈ȉ��̓��Ƃ��܂��B 
		 * �P���F�����A���l�̓� 
		 * �Q���F�����L�O�̓� 
		 * �R���F�t���̓� 
		 * �S���F���a�̓�
		 * �T���F���@�L�O���A�݂ǂ�̓��A���ǂ��̓� 
		 * �V���F�C�̓� 
		 * �X���F�h�V�̓��A�H���̓� 
		 * �P�O���F�̈�̓� 
		 * �P�P���F�����̓��A�ΘJ���ӂ̓�
		 * �P�Q���F�V�c�a���� �� switch �����g�p���邱�ƁB
		 * 
		 */

		// �ϐ��錾
		int x;

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�����̏j�������܂����B");
		x = Integer.parseInt(br.readLine());

		// ��������
		switch (x) {
		case 1:
			System.out.println("1���̏j���͌��U�Ɛ��l�̓��ł��B");
		case 2:
			System.out.println("2���̏j���͌����L�O�̓��ł��B");
		case 3:
			System.out.println("3���̏j���͏t���̓��ł��B");
			break;
		case 4:
			System.out.println("4���̏j���͏��a�̓��ł��B");
			break;
		case 5:
			System.out.println("5���̏j���͌��@�L�O���Ƃ݂ǂ�̓��Ƃ��ǂ��̓��ł��B");
			break;
		case 6:
			System.out.println("6���̏j���͂���܂���");
			break;
		case 7:
			System.out.println("7���̏j���͊C�̓��ł��B");
			break;
		case 8:
			System.out.println("8���̏j���͂���܂���B");
			break;
		case 9:
			System.out.println("9���̏j���͌h�V�̓��ƏH���̓��ł��B");
			break;
		case 10:
			System.out.println("10���̏j���͑̈�̓��ł��B");
			break;
		case 11:
			System.out.println("11���̏j���͕����̓��ƋΘJ���ӂ̓��ł��B");
			break;
		case 12:
			System.out.println("12���̏j���͓V�c�a�����ł��B");
			break;
		default:
			System.out.println("���͂��ꂽ���͔���ł��܂���B");
			break;
		}

	}

}
