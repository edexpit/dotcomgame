import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJava {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloJava");
		JLabel label = new JLabel("Hello, Java!");
		frame.getContentPane().add(label);
		frame.setSize(300, 300);
		frame.setVisible (true);
		
		
	}
	
}
