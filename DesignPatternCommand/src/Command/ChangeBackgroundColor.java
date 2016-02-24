package Command;

import java.awt.Color;

import javax.swing.JTextField;

public class ChangeBackgroundColor extends Command{
	
	
	private JTextField text;
	private Color colorOld;
	private Color colorNow;
	
	
	public ChangeBackgroundColor(JTextField text, Color colorNow) {
		this.text = text;
		this.colorOld = text.getBackground();
		this.colorNow = colorNow;
	}
	
	public void Now() {
		text.setBackground(colorNow);
	}
	
	public void Undo() {
		text.setBackground(colorOld);
	}
	
}
