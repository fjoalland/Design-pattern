	
// **********	Cette application a pour objectif de changer la couleur de l'arrière plan 
// **********	du JTextfield et de pouvoir revenir en arrière en cliquant sur 'Undo'.

package Command;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener{

	public static void main(String[] args){
		Fenetre fen = new Fenetre();
	}
	
	private JTextField text;
	private JPanel pan = new JPanel();
	private JButton boutonCommand;
	private JButton boutonUndo;
	private ChangeBackgroundColor command;
	
	public Fenetre() {
		text = new JTextField();
		boutonCommand = new JButton();
		boutonUndo = new JButton();
		command = new ChangeBackgroundColor(text, Color.cyan);

		text.setText("Design Pattern Command");
		boutonCommand.setText("Change background Color");
		boutonUndo.setText("Undo");
		
		pan.add(text);
		pan.add(boutonCommand);
		pan.add(boutonUndo);
		this.setContentPane(pan);

		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		boutonCommand.addActionListener(this);
		boutonUndo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        Object  source=e.getSource();
        if  (source==boutonCommand)
        	command.Now();
        if (source==boutonUndo)
        	command.Undo();
	}

}
