package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_8 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/*
		 * ���K���3-8 ���Ԏ����ƁA���������̓_���i���ꂼ�� 0 �` 100�_�j����͂��A
		 * ���̏����ɏ]���č��i�A�s���i�𔻒肷��v���O�������쐬���Ȃ����B 
		 * �����Ƃ� 60 �_�ȏ�̏ꍇ�A���i 
		 * ���v�� 130�_�ȏ�̏ꍇ�A���i
		 * ���v�� 100 �_�ȏ�ŁA�ǂ��炩�̎����� 90 �_�ȏ�ł���΍��i 
		 * ��L�ȊO�͕s���i�j
		 */
		// �ϐ��錾
		int ch_point = 0; // ���Ԏ����̓_��
		int ki_point = 0; // ���������̓_��
		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���Ԏ����̓_������͂��Ă��������B");
		ch_point = Integer.parseInt(br.readLine());

		System.out.println("���������̓_������͂��Ă��������B");
		ki_point = Integer.parseInt(br.readLine());

		// ����
		if (ch_point >= 60 && ki_point >= 60) {
			System.out.println("���i");
		} else if (ch_point + ki_point >= 130) {
			System.out.println("���i");
		} else if (ch_point + ki_point >= 100 && (ch_point >= 90 || ki_point >= 90)) {
			System.out.println("���i");
		} else {
			System.out.println("�s���i");
		}
	}

}
