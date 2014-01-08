package JavaSwing;

import javax.swing.JFrame;

//基本は、Mainメソッドが含まれるクラスが以下のような形を取る
public class MajorJFrameClass extends JFrame{
	//これを付けると警告が消える
	//シリアライズに関係するもの（詳しくは知らないので、気になった人は調べてください）
	static final long serialVersionUID = 1;
	
	public static void main(String[] args) {
		MajorJFrameClass frame = new MajorJFrameClass();
		frame.setVisible(true);
	}
	
	public MajorJFrameClass() {
		setTitle("オッペケペー");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
