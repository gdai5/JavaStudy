package DragonQuest;

//色々なキャラクターを作成して遊ぶクラス
public class Main {
	public static void main(String[] args) {
		Yuusya yuusya1 = new Yuusya("魔王", 255, 255);
		Yuusya yuusya2 = new Yuusya("勇者", 5, 5);
		Magician witch = new Magician("マリー", 89, 98);
		Magician wizard = new Magician("ハミルトン先生", 2, 1);
		
		//ここから実際に色々と叫んでもらう
		yuusya1.Attack();
		yuusya2.Attack();
		witch.SpecialAttack();
		wizard.Defense();
		
	}
}
