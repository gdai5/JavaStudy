package Challenge;
//こいつは、全てのキャラクターの共通要素を書く
public class Character {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int diffence;
	
	
	Character(String name, int hp, int mp, int attack, int diffence) {
		//課題：キャラクターにパラメータを与えるように書け
		//ヒント：Section6のDragonQuestパッケージの中にあるクラス
	}
	
	public void Attack() {
		System.out.println(this.name + "の攻撃");
		System.out.println(this.attack + "のダメージを与えた");
	}
	
	//作ったキャラクターのステータス情報が全て出てくる
	public void Status() {
		System.out.println("名前：" + this.name);
		System.out.println("HP：" + this.hp);
		System.out.println("MP：" + this.mp);
		System.out.println("AP：" + this.attack);
		System.out.println("DP：" + this.diffence);
	}
	
	//課題：hpとmpのゲッターとセッターを作成してください
	
}
