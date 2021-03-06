package Dice;

public class FakeDice implements DiceIf{
	//フィールド
	//各クラスが持っている変数みたいなイメージ
	int[] values = {2, 4, 5, 3, 6, 1};
	int current = 0;
	
	//インターフェイスを実装？しているので
	//インターフェイスで宣言した形と「全く同じ形」を取らなければいけない
	//つまり、「public void roll()」や「public int roll(int i)」などのちょっとした違いでもだめ
	public int roll() {
		//currentに１を足す
		current++;
		//配列は０からスタートするので、今回はvaluesは０〜５番目までの長さしかない
		//そのため、values[6]と入力した場合は、
		//例外の一つである「IndexOutOfBoundsException」というものが投げられる
		//それを回避するために、currentが５よりも大きい値になったら０に戻している
		if(current == 6) {
			current = 0;
		}
		//valuesのcurrent番目の値を返している
		//例：values[4] == 6
		return this.values[current];
	}
}
