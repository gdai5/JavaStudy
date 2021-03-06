package Dice;
/**
 * ここで、インターフェイスの最も大きな利点として
 * インターフェイスを実装したクラス同士では、インターフェイスで定義した「メソッド」を
 * 使ってひとまとめに処理を書く事ができる
 */
public class Dice {
	//フィールド
	//実際に使うわけではないが、少し分かりやすくするために設置
	int a = 0;
	int b = 3;
	boolean flag = true;
	String honzitunotenkiyohou = "本日は晴天なり";
	
	//mainメソッド
	public static void main(String[] args) {
		/**
		 * 分かりにくいと思うが、まずDice型の変数diceを生成
		 * つまり、「dice」自身はDiceクラスの中で宣言されている「フィールド」と「メソッド」を自由に呼び出すことができる
		 * 具体的に列挙すると
		 * 「dice.a」「dice.b」「dice.flag」「dice.honzitunotenkiyohou」「dice.rolls()」が使える
		 * ただし、mainメソッドだけは完全に別扱いのため使えないと考える方が良い
		 */
		Dice dice = new Dice();
		System.out.println("FakeDiceでの出力");
		//FakeDiceはDiceIfを実装しているのでFakeDiceでもあるが、DiceIfでもある
		dice.rolls(new FakeDice());
		System.out.println("RealDiceでの出力");
		//RealDiceはDiceIfを実装しているのでRealDiceでもあるが、DiceIfでもある
		dice.rolls(new RealDice());
		//課題１の分
		System.out.println("ZeroDiceでの出力");
		dice.rolls(new ZeroDice());
	}
	
	//復習：メソッドの宣言＝「アクセス修飾子 返り値 メソッド名(引数[型 変数名, ....])」という形で宣言する
	//今回は
	//アクセス修飾子＝ public
	//返り値　　　　＝ void（つまり何も返さない＝returnを使わない）	
	//メソッド名　　＝ rolls
	//引数　　　　　＝ 型：DiceIf    変数名：dice
	//＊注意
	//mainメソッドで宣言しているdiceとは異なる
	public void rolls(DiceIf dice) {
		for(int i = 0; i < 6; i++) {
			System.out.println(dice.roll());
		}
	}
	
}
