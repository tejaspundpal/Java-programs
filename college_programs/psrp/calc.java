package college_programs.psrp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

    private JFrame frame;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calc window = new calc();
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
    public calc() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 17));
        textField.setBounds(10, 10, 402, 73);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnBackspace = new JButton("\uF0E7");
        btnBackspace.addActionListener(new ActionListener() {
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
        btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 17));
        btnBackspace.setBounds(10, 93, 76, 62);
        frame.getContentPane().add(btnBackspace);

        final JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn7.getText();
                textField.setText(number);
            }


        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn7.setBounds(10, 165, 76, 62);
        frame.getContentPane().add(btn7);

        final JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn4.getText();
                textField.setText(number);
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn4.setBounds(10, 237, 76, 62);
        frame.getContentPane().add(btn4);

        final JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn1.getText();
                textField.setText(number);
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn1.setBounds(10, 309, 76, 62);
        frame.getContentPane().add(btn1);

        final JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn0.getText();
                textField.setText(number);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn0.setBounds(10, 381, 76, 62);
        frame.getContentPane().add(btn0);

        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnClear.setBounds(120, 93, 76, 62);
        frame.getContentPane().add(btnClear);

        final JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn8.getText();
                textField.setText(number);
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn8.setBounds(120, 165, 76, 62);
        frame.getContentPane().add(btn8);

        final JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn5.getText();
                textField.setText(number);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn5.setBounds(120, 237, 76, 62);
        frame.getContentPane().add(btn5);

        final JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn2.getText();
                textField.setText(number);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn2.setBounds(120, 309, 76, 62);
        frame.getContentPane().add(btn2);

        final JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnDot.getText();
                textField.setText(number);
            }
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnDot.setBounds(120, 381, 76, 62);
        frame.getContentPane().add(btnDot);

        final JButton btn00 = new JButton("00");
        btn00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn00.getText();
                textField.setText(number);
            }
        });
        btn00.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn00.setBounds(231, 93, 76, 62);
        frame.getContentPane().add(btn00);

        final JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn9.getText();
                textField.setText(number);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn9.setBounds(231, 165, 76, 62);
        frame.getContentPane().add(btn9);

        final JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn6.getText();
                textField.setText(number);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn6.setBounds(231, 237, 76, 62);
        frame.getContentPane().add(btn6);

        final JButton btn3 = new JButton("3\r\n");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btn3.getText();
                textField.setText(number);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
        btn3.setBounds(231, 309, 76, 62);
        frame.getContentPane().add(btn3);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second = Double.parseDouble(textField.getText());
                if(operation == "+") {
                    result = first + second;
                    answer = Double.toString(result);
                    textField.setText(answer);
                }
                else if(operation == "-") {
                    result = first - second;
                    answer = Double.toString(result);
                    textField.setText(answer);
                }
                else if(operation == "*") {
                    result = first * second;
                    answer = Double.toString(result);
                    textField.setText(answer);
                }
                else if(operation == "/") {
                    result = first / second;
                    answer = Double.toString(result);
                    textField.setText(answer);
                }
                else if(operation == "%") {
                    result = first % second;
                    answer = Double.toString(result);
                    textField.setText(answer);
                }
            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnEqual.setBounds(231, 381, 76, 62);
        frame.getContentPane().add(btnEqual);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnAdd.setBounds(336, 93, 76, 62);
        frame.getContentPane().add(btnAdd);

        JButton btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "-";
            }
        });
        btnSub.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnSub.setBounds(336, 165, 76, 62);
        frame.getContentPane().add(btnSub);

        JButton btnMul = new JButton("*");
        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
            }
        });
        btnMul.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnMul.setBounds(336, 237, 76, 62);
        frame.getContentPane().add(btnMul);

        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
            }
        });
        btnDiv.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnDiv.setBounds(336, 309, 76, 62);
        frame.getContentPane().add(btnDiv);

        JButton btnPercent = new JButton("%");
        btnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }
        });
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnPercent.setBounds(336, 381, 76, 62);
        frame.getContentPane().add(btnPercent);
    }
}
