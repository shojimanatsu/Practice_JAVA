package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_10 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/*
		 * ���K���3-10 �����l x, y ����͂��A�ȉ��̏����ɊY������ꍇ�A�����ł��邱�Ƃ���������\�����Ȃ����B 
		 * �E x �� y��菬�����A���Ax �� y �͋��ɋ����ł���B 
		 * �Ex �� y �͓������A���A���̐��ł���B 
		 * �Ex �� y ��菬�����A�܂��́Ax�͋����ł���B 
		 * �Ex �� 10 �ȉ��܂��� 100 �ȏ�ŁA���Ay �� 10 �ȏォ�� 100 �ȉ��ł���B
		 * �Ex �� y�����̐��ł���A�ł͂Ȃ��B�i x �� y �����̐��ł���A�̔ے�j
		 */
		// �ϐ��錾
		int x;
		int y;

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�����lx����͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		System.out.println("�����ly����͂��Ă��������B");
		y = Integer.parseInt(br.readLine());

		if (x<y && x%2==0) {
			System.out.println("x��y��菬�����A���Ax��y�͋��ɋ����ł���B");
		} else if (x==y && x<0 && y<0) {
			System.out.println("x��y�͓������A���A���̐��ł���B");
		} else if (x<y || x%2==0) {
			System.out.println("x��y��菬�����A�܂��́Ax�͋����ł���B");
		} else if ((x<=10 || x>=100) && (y>=10 && y<=100)) {
			System.out.println("x��10�ȉ��܂���100�ȏ�ŁA���Ay��10�ȏォ��100�ȉ��ł���B");
		} else if (x>0 && y>0) {
			System.out.println("x��y�����̐��ł͂Ȃ��B");
		} else {
			System.out.println("���͂��ꂽ�l�͔���ł��܂���B");
		}

	}

}
