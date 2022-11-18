package CAL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cls {

	private JFrame frame;
	private JTextField textField;
	private JButton btndouble;
	double first,result,second;
	String ans;
    String operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cls window = new cls();
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
	public cls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(100, 100, 447, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Sitka Small", Font.BOLD, 14));
		textField.setBounds(34, 10, 351, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setBounds(26, 77, 85, 21);
		frame.getContentPane().add(btnB);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(26, 108, 85, 21);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(26, 139, 85, 21);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(26, 170, 85, 21);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(26, 206, 85, 21);
		frame.getContentPane().add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(137, 77, 85, 21);
		frame.getContentPane().add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(137, 108, 85, 21);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(137, 139, 85, 21);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(137, 170, 85, 21);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setBounds(137, 206, 85, 21);
		frame.getContentPane().add(btndot);
		
		btndouble = new JButton("00");
		btndouble.setBounds(232, 77, 85, 21);
		frame.getContentPane().add(btndouble);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(232, 108, 85, 21);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(232, 139, 85, 21);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(232, 170, 85, 21);
		frame.getContentPane().add(btn3);
		
		JButton btneqal = new JButton("=");
		btneqal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				second = Double.parseDouble(textField.getText());
                  if(operation == "+") {
                	  result = first + second;
                	  answer = String.format("%.2f", result);
                	  textField.setText(answer);
                	  
                  }else if(operation == "-") {
                	  result = first - second;
                	  answer = String.format("%.2f", result);
                	  textField.setText(answer);
                	  
                  }else if(operation == "*") {
                	  result = first * second;
                	  answer = String.format("%.2f", result);
                	  textField.setText(answer);
                	  
                  }else if(operation == "/") {
                	  result = first / second;
                	  answer = String.format("%.2f", result);
                	  textField.setText(answer);
                	  
                  }else if(operation == "%") {
                	  result = first % second;
                	  answer = String.format("%.2f", result);
                	  textField.setText(answer);
                	  
                  }
 
			}
		});
		btneqal.setBounds(232, 206, 85, 21);
		frame.getContentPane().add(btneqal);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnadd.setBounds(327, 77, 85, 21);
		frame.getContentPane().add(btnadd);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnminus.setBounds(327, 108, 85, 21);
		frame.getContentPane().add(btnminus);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmul.setBounds(327, 139, 85, 21);
		frame.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndiv.setBounds(327, 170, 85, 21);
		frame.getContentPane().add(btndiv);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnper.setBounds(327, 206, 85, 21);
		frame.getContentPane().add(btnper);
	}
}
