package FamilyCount2;

public class Main {
	public static void main(String[] args) {
		Investigator investigator = new Investigator();
		//インスタンスフィールドを初期化している
		investigator.humancunter  = 0;
		investigator.familycunter = 0;
		
		//家族A&家族Bを作成
		FamilyA family_a = new FamilyA(3, 5);
		FamilyB family_b = new FamilyB(8, 7);
		
		//家族A&家族Bの調査
		//比較すると分かるが、非常に長ったらしい！！
		investigator.humancunter  = family_a.HumanCount(investigator.humancunter);
		investigator.familycunter = family_a.FamilyCount(investigator.familycunter);
		
		investigator.humancunter  = family_b.HumanCount(investigator.humancunter);
		investigator.familycunter = family_b.FamilyCount(investigator.familycunter);
		
		System.out.println(investigator.familycunter+"世帯の合計人数 ＝ " + investigator.humancunter);
	}
}
