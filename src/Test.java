

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class Test extends JFrame{

	static JTextPane text = new JTextPane();
	static JButton button = new JButton("bold");
	
	
	
	public static void main(String[] args) {
	JFrame frame = new JFrame("Styled");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new BorderLayout());
	frame.add(button, BorderLayout.NORTH);
	frame.add(text, BorderLayout.CENTER);
	frame.setSize(600, 400);
	frame.setVisible(true);
	
	button.addActionListener(new StyledEditorKit.BoldAction());
	}
}
