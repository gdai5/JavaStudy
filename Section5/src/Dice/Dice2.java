package Dice;
/**
 * ここではDiceと違って、FakeDiceとRealDiceにインターフェイスを実装しなかった時のことを書く
 */
public class Dice2 {
	
	public static void main(String[] args) {
		System.out.println("Dice2での出力");
		Dice2 dice = new Dice2();
		System.out.println("FakeDiceでの出力");
		dice.rolls1(new FakeDice());
		System.out.println("RealDiceでの出力");
		dice.rolls2(new RealDice());
		
	}
	
	/**
	 * Diceクラスと比べて、ほとんど同じメソッドが二つもある
	 * そして、引数には「より具体的なクラス」を書いている
	 * 抽象度　DiceIf > FakeDice, RealDice
	 * もし、これ以降にさらに新しいサイコロを作っていく場合には
	 * 同じようなメソッドをどんどんコピペすることになる
	 */
	
	public void rolls1(FakeDice fdice) {
		for(int i = 0; i < 6; i++) {
			System.out.println(fdice.roll());
		}
	}
	
	public void rolls2(RealDice rdice) {
		for(int i = 0; i < 6; i++) {
			System.out.println(rdice.roll());
		}
	}

}
