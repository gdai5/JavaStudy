package GeterSeter;

public class Main {
	public static void main(String[] args) {
		SampleGeterSeter sgs = new SampleGeterSeter();
		//セッターを使って、privateに値を入力
		sgs.setNum(5);
		//ゲッターを使って、privateの値を出力
		System.out.println(sgs.getNum());
	}
}
