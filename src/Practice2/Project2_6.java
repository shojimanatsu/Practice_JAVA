package Practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project2_6 {

	public static void main(String[] args) throws IOException {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �ϐ��錾
		int x;
		int y;

		System.out.println("�N�����͂��Ă��������B");
		x = Integer.parseInt(br.readLine());

		// �����v�Z
		y = x * 365;
		System.out.println("���Ȃ������܂�Ă��猻�݂܂ł̓����́A" + y + "�ł��B");

	}

}
