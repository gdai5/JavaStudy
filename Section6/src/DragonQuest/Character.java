package DragonQuest;

//ドラクエで言う、勇者や魔法使いなどのキャラクターを指すクラス
public class Character {
	//アクセス修飾子のprivateは自分が所属するクラスのみ読み書きを許すことを示す
	//キャラの名前
	private String name;
	//攻撃力
	private int attack_point;
	//防御力
	private int defense_point;
	
	//コンストラクター
	Character(String name, int attack_point, int defense_point) {
		this.name = name;
		this.attack_point = attack_point;
		this.defense_point = defense_point;
	}
	//攻撃コマンド
	public void Attack() {
		System.out.println(name + "の攻撃");
		System.out.println("敵に" + attack_point + "のダメージを与えた！");
	}
	//防御コマンド
	public void Defense() {
		System.out.println(name + "は守りに入った");
		System.out.println("敵の攻撃を" + defense_point + "減らす");
	}
	
	//private領域のものを取り出すために使われるゲッター
	public String getName() {
		return this.name;
	}
	
}
