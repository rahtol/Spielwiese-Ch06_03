package org.eclipsebook.ch06;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7607614455424535085L;

	/**
	 * Create the panel.
	 */
	public Panel() {
		setBackground(Color.WHITE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hello from Eclipse and EGit!", 60, 100);
	}

}
