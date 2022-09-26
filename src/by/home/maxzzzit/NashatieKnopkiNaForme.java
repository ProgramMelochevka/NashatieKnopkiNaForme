package by.home.maxzzzit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JPanel;

public class NashatieKnopkiNaForme extends JFrame {

	public static void main(String[] args) {
		NashatieKnopkiNaForme win =new NashatieKnopkiNaForme();
		JPanel pan =new JPanel();
		win.setSize(500,300);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
		win.setResizable(false);
		JLabel lab = new JLabel("Результат");
		lab.setVisible(true);
		JButton btn = new JButton("Нажми меня");
		btn.setSize(50, 100);
		win.add(pan);
		pan.add(btn);
		pan.add(lab);
		win.setVisible(true);
		btn.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				lab.setText("Была нажата кнопка");
			}
		});
	}
}
