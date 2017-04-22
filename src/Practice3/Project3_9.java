package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_9 {

	public static void main(String[] args) throws IOException {
		// TODO ©“®¶¬‚³‚ê‚½ƒƒ\ƒbƒhEƒXƒ^ƒu
		/*
		 * —ûK–â‘è3-9 
		 * —j“ú‚ÆAŒß‘OAŒßŒãA–éŠÔ‚Ì‹æ•Ê‚ğ“ü—Í‚µA•a‰@‚ªŠJ‚¢‚Ä‚¢‚é‚©A‹xf‚Å‚ ‚é‚©‚ğ•\¦‚·‚éƒvƒƒOƒ‰ƒ€‚ğì¬‚µ‚È‚³‚¢B
		 * ŠJ‚¢‚Ä‚¢‚é‚©A‹xf‚Å‚ ‚é‚©‚ÍAŸ‚Ì•\‚É]‚¢‚Ü‚·B 
		 *      “ú—j  Œ—j  ‰Î—j  …—j  –Ø—j  ‹à—j  “y—j
		 *  Œß‘O ‹xf   ›   ‹xf     ›    ›  ‹xf     › 
		 *  ŒßŒã ‹xf   ›    ›    ›    ›   ›  ‹xf
		 *  –éŠÔ ‹xf   ›    ›   ‹xf     ›   ›  ‹xf 
		 *  
		 * —j“ú‚Ì“ü—ÍAŒß‘OAŒßŒã‚Ì“ü—Í‚ÍAŸ‚Ì‚æ‚¤‚ÈƒKƒCƒh‚ğ•\¦‚µ‚Ä”’l‚Ås‚¢‚Ü‚·B
		 * >0=“ú—jA1=Œ—jA2=‰Î—jA3=…—jA4=–Ø—jA5=‹à—jA6=“y—j 
		 * >0=Œß‘OA1=ŒßŒãA2=–éŠÔ
		 * 
		 */
		
		// •Ï”éŒ¾
		int weekday = 0; // —j“ú
		int time = 0; // ŠÔ‘Ñ

		System.out.println("**************•a‰@‚Ìf@ˆÄ“à**************");
		// “ü—Í
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Šm”F‚µ‚½‚¢—j“ú‚Ì”Ô†‚ğ“ü—Í‚ğ‚µ‚Ä‚­‚¾‚³‚¢B");
		System.out.println("0=“ú—jA1=Œ—jA2=‰Î—jA3=…—jA4=–Ø—jA5=‹à—jA6=“y—j");
		weekday = Integer.parseInt(br.readLine());

		System.out.println("Šm”F‚µ‚½‚¢ŠÔ‘Ñ‚Ì”Ô†‚ğ“ü—Í‚ğ‚µ‚Ä‚­‚¾‚³‚¢B");
		System.out.println("0=Œß‘OA1=ŒßŒãA2=–éŠÔ");
		weekday = Integer.parseInt(br.readLine());

		// ”»’è
		if (weekday == 0) {
			System.out.println("“ú—j“ú‚ÍI“ú‹xf‚Å‚·B");
		} else if (weekday==1) {
			System.out.println("Œ—j“ú‚ÍI“úŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==2 && time==0) {
			System.out.println("‰Î—j“ú‚ÌŒß‘O’†‚Í‹xf‚Å‚·B");
		} else if (weekday==2 && time==1) {
			System.out.println("‰Î—j“ú‚ÌŒßŒã‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==2 && time==2) {
			System.out.println("‰Î—j“ú‚Ì–éŠÔ‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==3 && time==0) {
			System.out.println("…—j“ú‚ÌŒß‘O‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==3 && time==1) {
			System.out.println("…—j“ú‚ÌŒßŒã‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==3 && time==2) {
			System.out.println("…—j“ú‚Ì–éŠÔ‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==4) {
			System.out.println("Œ—j“ú‚ÍI“úŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==5 && time==0) {
			System.out.println("‹à—j“ú‚ÌŒß‘O‚Í‹xf‚Å‚·B");
		} else if (weekday==5 && time==1) {
			System.out.println("‹à—j“ú‚ÌŒßŒã‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==5 && time==2) {
			System.out.println("‹à—j“ú‚Ì–éŠÔ‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==6 && time==0) {
			System.out.println("“y—j“ú‚ÌŒß‘O‚ÍŠJ‚¢‚Ä‚¨‚è‚Ü‚·B");
		} else if (weekday==6 && time==1) {
			System.out.println("“y—j“ú‚ÌŒßŒã‚Í‹xf‚Å‚·B");
		} else if (weekday==6 && time==2) {
			System.out.println("“y—j“ú‚ÌŒßŒã‚Í‹xf‚Å‚·B");
		}

	}

}
