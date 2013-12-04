package Dice;

public class Dice {
	int[] values = new int[] {3, 4, 2, 1, 5, 6};
	int current = 0;
	java.util.Random r = new java.util.Random();
	int maxNum = 6;
	
	
	//method1
	int roll() {
		this.current++;
		if (this.current == 6) this.current = 0;
		return values[this.current];
	}
	
	//method2
	public int roll2() {
		return r.nextInt(maxNum) + 1;
	}
}
