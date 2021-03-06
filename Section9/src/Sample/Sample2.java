package Sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sample2 extends JFrame{
	String[] favoriteSport = {"好きなスポーツ", "サッカー", "野球", "ラグビー"};
	String[] favoriteDrink = {"好きな飲み物", "日本酒", "ビール", "ワイン", "焼酎"};
	
	public static void main(String[] args) {
		Sample2 frame = new Sample2();
	}
	
	public Sample2() {
		setTitle("自己紹介");
		setBounds(100, 100, 500, 400);
		//出現場所を真ん中にする
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		JPanel _pane = new JPanel();
		_pane = setItems(); 
		contentPane.add(_pane, BorderLayout.CENTER);
		setVisible(true);
	}
	
	private JPanel setItems() {
		JPanel _itempane       = new JPanel();
		//グリッドバックレイアウトを用いる
		GridBagLayout gbl      = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		//レイアウトの指定
		_itempane.setLayout(gbl);
		//各設置場所を定める
		JLabel label1 = new JLabel("好きなスポーツは？");
		JComboBox combox1 = new JComboBox(favoriteSport);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbl.setConstraints(label1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbl.setConstraints(combox1, gbc);
		
		JLabel label2 = new JLabel("好きなお酒は？");
		JComboBox combox2 = new JComboBox(favoriteDrink);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbl.setConstraints(label2, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbl.setConstraints(combox2, gbc);
		
		_itempane.add(label1);
		_itempane.add(combox1);
		_itempane.add(label2);
		_itempane.add(combox2);
		
		return _itempane;
	}
	
}
