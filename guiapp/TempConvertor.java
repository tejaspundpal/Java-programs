package guiapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TempConvertor extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    String text;
    double ans;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    guiapp.TempConvertor frame = new guiapp.TempConvertor();
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
    public TempConvertor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField_1.setBounds(10, 11, 154, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        textField_2.setBounds(234, 11, 176, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel = new JLabel("INPUT");
        lblNewLabel.setBounds(46, 54, 95, 14);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("OUTPUT");
        lblNewLabel_1.setBounds(280, 54, 80, 14);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("DEGREE TO FARANITE");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sres;
                text = textField_1.getText();
                ans = Double.valueOf(text);
                ans = ((ans*1.8)+32);
                sres = String.valueOf(ans);
                textField_2.setText(sres);
            }
        });
        btnNewButton.setBounds(10, 139, 154, 44);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("FARANITE TO DEGREE");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sres;
                text = textField_1.getText();
                ans = Double.valueOf(text);
                ans = (((ans-32)*5)*0.11);
                sres = String.valueOf(ans);
                textField_2.setText(sres);
            }
        });
        btnNewButton_1.setBounds(234, 139, 170, 44);
        contentPane.add(btnNewButton_1);
    }
}
