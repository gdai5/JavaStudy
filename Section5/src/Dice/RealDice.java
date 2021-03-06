package Dice;

public class RealDice implements DiceIf{
	//フィールド
	//javaのライブラリ群の中にある、乱数を生成するRandomを呼び出している
	java.util.Random r = new java.util.Random();
	int maxNum = 6;
	
	public int roll() {
		//nextIntメソッドはRandomクラスが持つメソッド
		//生成される整数の範囲は「０〜(入力した整数-1)」である
		//今回は１〜６としたいので、最後に１を足している
		return r.nextInt(maxNum) + 1;
	}
}
