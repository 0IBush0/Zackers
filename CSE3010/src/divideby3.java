package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class divideby3 {

	private JFrame frame; 
	private JTextField Text;
	private JTextField Display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try { 
					divideby3 window = new divideby3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public divideby3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel EnterInt = new JLabel("Enter A Integer:");
		EnterInt.setBounds(24, 68, 146, 47);
		frame.getContentPane().add(EnterInt);
	
		Text = new JTextField();
		Text.setBounds(123, 74, 195, 34);
		frame.getContentPane().add(Text);
		Text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(123, 76, 207, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Check = new JButton("Check");
		Check.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int num; //declare variable
			num = Integer.parseInt(Text.getText());//get text from the field
			
			if(num%3==0) //check if is divisible by 3
			{
				Display.setText("The integer is divisible by 3");    
				//if divisible by 3, display divisible message
				   
			}
				   
			else  
			{
				Display.setText("The integer is not divisible by 3");   
				//if not, display not divisible message
				   
			}
				
			}
		});
		
		Check.setBounds(20, 145, 93, 39);
		frame.getContentPane().add(Check);
		
		Display = new JTextField();
		Display.setBounds(123, 145, 207, 39);
		frame.getContentPane().add(Display);
		Display.setColumns(10);
	}
}
