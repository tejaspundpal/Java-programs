package guiapp;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.awt.event.ActionEvent;

public class CaseChange extends JFrame {

    private JPanel contentPane;
    private JTextField txtAsgn;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CaseChange frame = new CaseChange();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public CaseChange() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtAsgn = new JTextField();
        txtAsgn.setBounds(39, 11, 352, 42);
        contentPane.add(txtAsgn);
        txtAsgn.setColumns(10);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("BOLD");
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f=new Font("Times New Roman",Font.BOLD,23);
                txtAsgn.setFont(f);
            }
        });
        rdbtnNewRadioButton.setBounds(39, 83, 109, 23);
        contentPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnUnderline = new JRadioButton("Underline");
        rdbtnUnderline.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f=new Font("Times New Roman",Font.PLAIN,23);
                Map attributes =f.getAttributes();

                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                txtAsgn.setFont(f.deriveFont(attributes));


            }
        });
        rdbtnUnderline.setBounds(177, 83, 109, 23);
        contentPane.add(rdbtnUnderline);

        JRadioButton rdbtnItalic = new JRadioButton("Italic");
        rdbtnItalic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f=new Font("Times New Roman",Font.ITALIC,23);
                txtAsgn.setFont(f);
            }
        });
        rdbtnItalic.setBounds(301, 83, 109, 23);
        contentPane.add(rdbtnItalic);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Centre");
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                txtAsgn.setHorizontalAlignment(JTextField.CENTER);
            }
        });
        rdbtnNewRadioButton_1.setBounds(156, 141, 109, 23);
        contentPane.add(rdbtnNewRadioButton_1);
    }
}
