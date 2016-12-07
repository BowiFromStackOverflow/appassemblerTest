package testProjectAppassembler;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class TestClass extends JFrame {
	private static final long serialVersionUID = -8406143058195153438L;

	public TestClass() {
		setTitle("TestClass");
		JLabel label = new JLabel("Hello!");
		add(label, BorderLayout.CENTER);
		this.setPreferredSize(new Dimension(200, 100));
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new TestClass();
			}
		});
	}
}
