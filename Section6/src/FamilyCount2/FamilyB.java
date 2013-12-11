package FamilyCount2;

public class FamilyB {
	// フィールド
	// 家族Bにおける男性の数
	private int man;
	// 家族Bにおける女性の数
	private int woman;

	FamilyB(int man, int woman) {
		this.man = man;
		this.woman = woman;
	}

	public int HumanCount(int humancunter) {
		humancunter += man + woman;
		return humancunter;
	}

	public int FamilyCount(int familycunter) {
		familycunter += 1;
		return familycunter;
	}

}
