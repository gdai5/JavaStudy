package SampleExtends;

//GreatPersonクラスを継承するクラス
public class Hamilton extends GreatPerson{
	
	/**
	 * @Override
	 * ここに書かれているのがオーバーライド
	 * メソッドの内容を上書きする
	 */
	public void say() {
		System.out.println("フレミング左手の法則！");
	}
	
	public void shout() {
		System.out.println("俺はフレミングじゃなーーーい！！");
	}
	
}
