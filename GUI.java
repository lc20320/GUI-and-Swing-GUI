import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class GUI extends JFrame {
		
		public GUI() {
			JPanel panel = new JPanel();
			JLabel label = new JLabel("Enter numbers");
			JTextField num1 = new JTextField(10);
			JTextField num2 = new JTextField(10);
			JButton button = new JButton("Add");
			button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {	
			JOptionPane.showMessageDialog(null, "The total is: " + (Integer.parseInt(num1.getText()) + (Integer.parseInt(num2.getText()))));
		}
	}); 
						
		panel.add(label);
		panel.add(num1);
		panel.add(num2);
		panel.add(button);
		
		add(panel);
		setSize(200,200);
		setVisible(true);				
		
		}	
	
		public static void main(String [] args) {
			new GUI(); }
}
