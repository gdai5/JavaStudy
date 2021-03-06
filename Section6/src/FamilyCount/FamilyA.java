package FamilyCount;

//ある家族Aを表すクラス
class FamilyA {
	//フィールド
	//家族Aにおける男性の数
	private int man;
	//家族Aにおける女性の数
	private int woman;
	
	/**
	 * （学習ポイント）コンストラクター
	 * コンストラクターとは、そのクラスが生成されたのと同時に実行される特別なメソッドのこと
	 * 具体的に使われるクラスはMain.javaに書かれている
	 */
	FamilyA(int man, int woman) {
		//復習
		//this.manとmanの違いはどうだったでしょうか？
		this.man = man;
		this.woman = woman;
	}
	
	//家族Aの人数を数えている
	public void HumanCount() {
		//このように書けることがstatic(静的)の特徴
		Investigator.humancunter += man + woman;
	}
	
	//家族Aは１つの家族であるので、家族数をカウントしている変数に１を足している
	public void FamilyCount() {
		//このように書けることがstatic(静的)の特徴
		Investigator.familycunter += 1;
	}
	
}
