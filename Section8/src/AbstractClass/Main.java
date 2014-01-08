package AbstractClass;

public class Main {
	public static void main(String[] args) {
		Yuusya yuusya1 = new Yuusya("ドン", 234);
		Kenja  kenja   = new Kenja("賢者", 90);
		yuusya1.Attack();
		yuusya1.SpecialAttack();
		kenja.Attack();
		kenja.SpecialAttack();
	}

}
