package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_9 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/*
		 * ���K���3-9 
		 * �j���ƁA�ߑO�A�ߌ�A��Ԃ̋�ʂ���͂��A�a�@���J���Ă��邩�A�x�f�ł��邩��\������v���O�������쐬���Ȃ����B
		 * �J���Ă��邩�A�x�f�ł��邩�́A���̕\�ɏ]���܂��B 
		 *      ���j  ���j  �Ηj  ���j  �ؗj  ���j  �y�j
		 *  �ߑO �x�f   ��   �x�f     ��    ��  �x�f     �� 
		 *  �ߌ� �x�f   ��    ��    ��    ��   ��  �x�f
		 *  ��� �x�f   ��    ��   �x�f     ��   ��  �x�f 
		 *  
		 * �j���̓��́A�ߑO�A�ߌ�̓��͂́A���̂悤�ȃK�C�h��\�����Đ��l�ōs���܂��B
		 * >0=���j�A1=���j�A2=�Ηj�A3=���j�A4=�ؗj�A5=���j�A6=�y�j 
		 * >0=�ߑO�A1=�ߌ�A2=���
		 * 
		 */
		
		// �ϐ��錾
		int weekday = 0; // �j��
		int time = 0; // ���ԑ�

		System.out.println("**************�a�@�̐f�@�ē�**************");
		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�m�F�������j���̔ԍ�����͂����Ă��������B");
		System.out.println("0=���j�A1=���j�A2=�Ηj�A3=���j�A4=�ؗj�A5=���j�A6=�y�j");
		weekday = Integer.parseInt(br.readLine());

		System.out.println("�m�F���������ԑт̔ԍ�����͂����Ă��������B");
		System.out.println("0=�ߑO�A1=�ߌ�A2=���");
		weekday = Integer.parseInt(br.readLine());

		// ����
		if (weekday == 0) {
			System.out.println("���j���͏I���x�f�ł��B");
		} else if (weekday==1) {
			System.out.println("���j���͏I���J���Ă���܂��B");
		} else if (weekday==2 && time==0) {
			System.out.println("�Ηj���̌ߑO���͋x�f�ł��B");
		} else if (weekday==2 && time==1) {
			System.out.println("�Ηj���̌ߌ�͊J���Ă���܂��B");
		} else if (weekday==2 && time==2) {
			System.out.println("�Ηj���̖�Ԃ͊J���Ă���܂��B");
		} else if (weekday==3 && time==0) {
			System.out.println("���j���̌ߑO�͊J���Ă���܂��B");
		} else if (weekday==3 && time==1) {
			System.out.println("���j���̌ߌ�͊J���Ă���܂��B");
		} else if (weekday==3 && time==2) {
			System.out.println("���j���̖�Ԃ͊J���Ă���܂��B");
		} else if (weekday==4) {
			System.out.println("���j���͏I���J���Ă���܂��B");
		} else if (weekday==5 && time==0) {
			System.out.println("���j���̌ߑO�͋x�f�ł��B");
		} else if (weekday==5 && time==1) {
			System.out.println("���j���̌ߌ�͊J���Ă���܂��B");
		} else if (weekday==5 && time==2) {
			System.out.println("���j���̖�Ԃ͊J���Ă���܂��B");
		} else if (weekday==6 && time==0) {
			System.out.println("�y�j���̌ߑO�͊J���Ă���܂��B");
		} else if (weekday==6 && time==1) {
			System.out.println("�y�j���̌ߌ�͋x�f�ł��B");
		} else if (weekday==6 && time==2) {
			System.out.println("�y�j���̌ߌ�͋x�f�ł��B");
		}

	}

}
