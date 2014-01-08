package JavaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

//frameには、Pane(ペイン)と呼ばれる層がいくつも重なって見えている
//このペインを何十にも重ねることで、望みのシステムを作っている
public class TestPanel extends JFrame{
	public static void main(String[] args) {
		TestPanel tp = new TestPanel();
		tp.setVisible(true);
	}
	
	public TestPanel() {
		setTitle("パネルの例");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//1つ目のパネルを生成して、色を黄色にした
		JPanel p1 = new JPanel();
		p1.setBackground(Color.yellow);
		//２つ目のパネルを生成
		JPanel p2 = new JPanel();
		p2.setBackground(Color.blue);
		//コンポーネントと呼ばれるもの
		//フレームに何か追加したい場合はここに書き込んでいく
		Container contentPane = getContentPane();
		//もし、TestJFrame.javaで同じことをやる場合は、下のように書く
		//Container contentPane = frame.getContentPane();
		contentPane.add(p1, BorderLayout.NORTH);
		contentPane.add(p2, BorderLayout.SOUTH);
	}
}
