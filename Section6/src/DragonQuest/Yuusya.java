package DragonQuest;

public class Yuusya extends Character{
	
	//コンストラクター
	Yuusya(String name, int attack_point, int defense_point) {
		//親のコンストラクターを呼んでいる
		super(name, attack_point, defense_point);
	}
	
	//勇者のみが持つ特技
	public void SpecialAttack() {
		//自分の親であるCharacterクラスのgetNameメソッドを呼んでいる
		String name = super.getName();
		System.out.println(name + "はギガデインを放った!");
	}
	
}
