package GeterSeter;

//privateの値を参照どこからでも「間接的」にアクセスする方法
public class SampleGeterSeter {

	private int num;
	//ゲッター
	//publicのメソッドを通してnumにアクセスしている
	public int getNum() {
		return this.num;
	}
	//セッター
	//publicのメソッドを通してnumにアクセスしている
	public void setNum(int num) {
		this.num = num;
	}
}