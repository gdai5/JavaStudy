package Challenge;

//勇者クラス
public class Yuusya extends Character{
	//コンストラクター
	Yuusya(String name, int hp, int mp, int attack, int diffence) {
		super(name, hp, mp, attack, diffence);
	}
	
	//@Override
	public void Attack() {
		//課題：ダメージを常に９９与えるように変更してください
	}
	
	public void Hoimi() {
		//課題：ゲッター、セッターを利用して、MP2消費して、HPを30回復させるようにしてください
	}
	
}
