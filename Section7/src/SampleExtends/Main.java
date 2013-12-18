package SampleExtends;

//アホな偉人たちを叫ばせて遊ぶ
public class Main {
	public static void main(String[] args) {
		GreatPerson gp = new GreatPerson();
		Hamilton h = new Hamilton();
		
		//実際に名言を言ってもらう
		gp.say();
		h.say();
		h.shout();
	}
}
