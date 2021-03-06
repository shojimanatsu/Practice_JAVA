package Practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project3_9 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 練習問題3-9 
		 * 曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
		 * 開いているか、休診であるかは、次の表に従います。 
		 *      日曜  月曜  火曜  水曜  木曜  金曜  土曜
		 *  午前 休診   ○   休診     ○    ○  休診     ○ 
		 *  午後 休診   ○    ○    ○    ○   ○  休診
		 *  夜間 休診   ○    ○   休診     ○   ○  休診 
		 *  
		 * 曜日の入力、午前、午後の入力は、次のようなガイドを表示して数値で行います。
		 * >0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜 
		 * >0=午前、1=午後、2=夜間
		 * 
		 */
		
		// 変数宣言
		int weekday = 0; // 曜日
		int time = 0; // 時間帯

		System.out.println("**************病院の診察案内**************");
		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("確認したい曜日の番号を入力をしてください。");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		weekday = Integer.parseInt(br.readLine());

		System.out.println("確認したい時間帯の番号を入力をしてください。");
		System.out.println("0=午前、1=午後、2=夜間");
		weekday = Integer.parseInt(br.readLine());

		// 判定
		if (weekday == 0) {
			System.out.println("日曜日は終日休診です。");
		} else if (weekday==1) {
			System.out.println("月曜日は終日開いております。");
		} else if (weekday==2 && time==0) {
			System.out.println("火曜日の午前中は休診です。");
		} else if (weekday==2 && time==1) {
			System.out.println("火曜日の午後は開いております。");
		} else if (weekday==2 && time==2) {
			System.out.println("火曜日の夜間は開いております。");
		} else if (weekday==3 && time==0) {
			System.out.println("水曜日の午前は開いております。");
		} else if (weekday==3 && time==1) {
			System.out.println("水曜日の午後は開いております。");
		} else if (weekday==3 && time==2) {
			System.out.println("水曜日の夜間は開いております。");
		} else if (weekday==4) {
			System.out.println("月曜日は終日開いております。");
		} else if (weekday==5 && time==0) {
			System.out.println("金曜日の午前は休診です。");
		} else if (weekday==5 && time==1) {
			System.out.println("金曜日の午後は開いております。");
		} else if (weekday==5 && time==2) {
			System.out.println("金曜日の夜間は開いております。");
		} else if (weekday==6 && time==0) {
			System.out.println("土曜日の午前は開いております。");
		} else if (weekday==6 && time==1) {
			System.out.println("土曜日の午後は休診です。");
		} else if (weekday==6 && time==2) {
			System.out.println("土曜日の午後は休診です。");
		} else{
			System.out.println("該当する曜日/時間帯を入力してください。");
		}

	}

}
