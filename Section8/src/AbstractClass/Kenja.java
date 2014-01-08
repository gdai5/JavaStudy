package AbstractClass;

public class Kenja extends Character{
	
	public Kenja(String name, int attack) {
		super(name, attack);
	}
	
	public void SpecialAttack() {
		System.out.println(this.name + "物理で殴る");
	}
	
}
