package FamilyCount;

public class Main {
	public static void main(String[] args) {
		//クラスフィールドの初期化
		//クラスフィールドであるため、最初っからこのように直接呼び出してあげることができる
		Investigator.humancunter  = 0;
		Investigator.familycunter = 0;
		
		//家族A&家族Bのクラス変数を宣言
		FamilyA family_a = new FamilyA(3, 4);
		FamilyB family_b = new FamilyB(2, 9);
		
		//家族A&家族Bの調査を行う
		family_a.HumanCount();
		family_a.FamilyCount();
		
		family_b.HumanCount();
		family_b.FamilyCount();
		System.out.println(Investigator.familycunter + "世帯の合計人数 ＝ " + Investigator.humancunter);
	}
}
