package FamilyCount;

public class FamilyB {
	//家族Bにおける男性の数
	private int man;
	//家族Bにおける女性の数
	private int woman;

	public FamilyB(int man, int woman) {
		this.man = man;
		this.woman = woman;
	}

	//家族Bの人数を数えている
	public void HumanCount() {
		Investigator.humancunter += man + woman;
	}

	//家族Bは１つの家族であるので、家族数をカウントしている変数に１を足している
	public void FamilyCount() {
		Investigator.familycunter += 1;
	}
}
