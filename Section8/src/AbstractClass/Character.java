package AbstractClass;

public abstract class Character {
	protected String name;
	protected int attack;
	
	public Character(String name, int attack) {
		this.name = name;
		this.attack = attack;
	}
	
	//具体的なメソッド
	public void Attack() {
		System.out.println(this.name + "の攻撃");
		System.out.println(this.attack + "のダメージを与えた");
	}
	
	//抽象メソッド
    public abstract void SpecialAttack();
	
}
