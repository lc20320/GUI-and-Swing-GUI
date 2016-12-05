import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class SwingGUI extends JFrame {
		
		public SwingGUI() {
			GridLayout grid = new GridLayout(2,2);
			JPanel panel = new JPanel(grid);
			JLabel label = new JLabel("Enter numbers");
			
			JTextField num[] = new JTextField[4];
			for(int i = 0;i < 4;i++)
			{
			    JTextField sum = new JTextField(String.valueOf(0));
			    sum.setBounds(150, 350 + i * 25, 20, 20);
			    num[i] = sum;
			}
			
			JButton button = new JButton("Add");
			button.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent arg0) {	
			JOptionPane.showMessageDialog(null, "The total is: " + (Integer.parseInt(num[1].getText()) + (Integer.parseInt(num[2].getText()))));
		}
	}); 
							
		panel.add(label);
		panel.add(num[1]);
		panel.add(num[2]);
		panel.add(button);
		
		
			
		add(panel);
		setSize(200,200);
		setVisible(true);				
		}
			
	
		public static void main(String [] args) {
			new SwingGUI(); }
}
