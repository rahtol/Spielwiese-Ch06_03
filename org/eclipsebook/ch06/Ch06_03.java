package org.eclipsebook.ch06;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Ch06_03 extends JFrame {

	private static final long serialVersionUID = 4452117564998936705L;
	Panel p;

	public Ch06_03() throws HeadlessException {
		super("Swing Application");
		
		Container contentPane = getContentPane();
		p = new Panel();
		contentPane.add(p);
	}

	public static void main(String[] args) {
		final JFrame f = new Ch06_03 ();
		
		f.setBounds(100, 100,300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);;
			}
		});

	}

}
