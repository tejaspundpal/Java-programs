import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MouseKeyboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseKeyboard frame = new MouseKeyboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MouseKeyboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getButton();
				if(x==1)
				{
					textField_2.setText("Left key click.");
				}
				if(x==2)
				{
					textField_2.setText("Middle key click.");
				}
				if(x==3)
				{
					textField_2.setText("Right key click.");
				}
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				textField_1.setText("X: "+e.getX()+" Y: "+e.getY());
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int x = e.getKeyCode();
				String str="";
				if(x==KeyEvent.VK_F1)
				{
					str+="F1";
				}
				if(x==KeyEvent.VK_F2)
				{
					str+="F2";
				}
				if(x==KeyEvent.VK_F3)
				{
					str+="F3";
				}
				if(x==KeyEvent.VK_F4)
				{
					str+="F4";
				}
				if(x==KeyEvent.VK_F5)
				{
					str+="F5";
				}
				if(x==KeyEvent.VK_F6)
				{
					str+="F6";
				}
				if(x==KeyEvent.VK_F7)
				{
					str+="F7";
				}
				if(x==KeyEvent.VK_F8)
				{
					str+="F8";
				}
				if(x==KeyEvent.VK_F9)
				{
					str+="F9";
				}
				if(x==KeyEvent.VK_F10)
				{
					str+="F10";
				}
				if(x==KeyEvent.VK_F11)
				{
					str+="F11";
				}
				if(x==KeyEvent.VK_F12)
				{
					str+="F12";
				}
				if(x==KeyEvent.VK_ESCAPE)
				{
					str+="Escape";
				}
				if(x==KeyEvent.VK_CAPS_LOCK)
				{
					str+="CAPS_LOCK";
				}
				if(x==KeyEvent.VK_ALT)
				{
					str+="ALT";
				}
				if(x==KeyEvent.VK_UP)
				{
					str+="UP";
				}
				if(x==KeyEvent.VK_TAB)
				{
					str+="TAB";
				}
				textField.setText(str);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				textField.setText("");
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		textField.setBounds(10, 10, 201, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 65, 201, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 129, 201, 28);
		contentPane.add(textField_2);
	}

}
