package Sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//あとは、ここに様々な要素を追加していく
//目標：ボタン、フィールド、エリア（スクロール付き）、チェック、トグル、ドロップ
public class Sample1 extends JFrame{
	JPanel pane;
	
	public static void main(String[] args) {
		Sample1 frame = new Sample1();
	}
	
	private Sample1() {
		setTitle("Sample");
		setBounds(200, 200, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		pane = setText();
		contentPane.add(pane);
		setVisible(true);
	}
	
	private JPanel setText(){
		JPanel _fieldpane = new JPanel();
		//このパネルのレイアウトはグリッドレイアウトとした
		//細かい設定を行う場合はGridBagLayoutを使う
		_fieldpane.setLayout(new GridLayout(3,2));
		//ラベルと入力欄を作成している
		JLabel label1 = new JLabel("大学名");
		JTextField field1 = new JTextField();
		//上手く範囲調整してくれないのはボーダーレイアウトのせい
		field1.setPreferredSize(new Dimension(100, 30));
		//作成したラベルと入力欄をパネルに貼付け
		_fieldpane.add(label1);
		_fieldpane.add(field1);
		
		JLabel label2 = new JLabel("学部");
		JTextField field2 = new JTextField();
		_fieldpane.add(label2);
		_fieldpane.add(field2);
		
		JLabel label3 = new JLabel("学科");
		JTextField field3 = new JTextField();
		_fieldpane.add(label3);
		_fieldpane.add(field3);
		//作成したパネルを返す
		return _fieldpane;
	}
}