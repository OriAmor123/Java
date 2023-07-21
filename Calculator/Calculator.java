package Calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
    JFrame window = new JFrame();
    JLabel calculations = new JLabel();
    JPanel calcPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JButton[] buttons = new JButton[16];
    double num1;
    double num2;
    double result;
    String operator;

    JButton ansButton = new JButton();
    JPanel ansPanel = new JPanel();

    public Calculator() {
        window.setTitle("Calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(400,650);
        window.setLayout(new BorderLayout(0,0));

        calcPanel.setLayout(new BorderLayout());
        calcPanel.setPreferredSize(new Dimension(400, 150));
        calcPanel.setBackground(new Color(0x202020));

        calculations.setFont(new Font("Levenim MT", Font.PLAIN, 80));
        calculations.setText("0"); // Default
        calculations.setHorizontalAlignment(JLabel.RIGHT);
        calculations.setVerticalAlignment(JLabel.BOTTOM);
        calculations.setForeground(new Color(0xe9e9e9));
        calcPanel.add(calculations);

        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonPanel.setPreferredSize(new Dimension(400, 400));
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton();
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            buttons[i].setFocusable(false);
            if (i != 18) {
                buttons[i].setFont(new Font("Arial Black", Font.PLAIN, 40));
            }
            if (i == 3 || i == 7 || i == 11 || i == 15) {
                buttons[i].setBackground(new Color(0xf88f12));
                buttons[i].setForeground(new Color(0xffe6b1));
            } else {
                buttons[i].setBackground(new Color(0xd4d5d9));
            }
            buttonPanel.add(buttons[i]);
        }
        buttons[0].setText("7");
        buttons[1].setText("8");
        buttons[2].setText("9");
        buttons[3].setText("+");
        buttons[4].setText("4");
        buttons[5].setText("5");
        buttons[6].setText("6");
        buttons[7].setText("-");
        buttons[8].setText("1");
        buttons[9].setText("2");
        buttons[10].setText("3");
        buttons[11].setText("X");
        buttons[12].setText("0");
        buttons[13].setText(".");
        buttons[14].setText("=");
        buttons[15].setText("/");

        ansPanel.setLayout(new GridLayout(1, 1));
        ansPanel.setPreferredSize(new Dimension(400, 100));

        ansButton.addActionListener(this);
        ansButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
        ansButton.setFocusable(false);
        ansButton.setBackground(new Color(0xc8c9cb));
        ansButton.setText("AC");
        ansPanel.add(ansButton);

        window.add(ansPanel, BorderLayout.SOUTH);
        window.add(buttonPanel, BorderLayout.CENTER);
        window.add(calcPanel, BorderLayout.NORTH);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i ++) {
            if (e.getSource() == buttons[i]) {
                if (calculations.getText() == "0" || calculations.getText() == operator) {
                    calculations.setText(String.valueOf(buttons[i].getText()));
                } else {
                    calculations.setText(calculations.getText().concat(String.valueOf(buttons[i].getText())));
                }
            }
        }
        for (int i = 4; i < 7; i ++) {
            if (e.getSource() == buttons[i]) {
                if (calculations.getText() == "0" || calculations.getText() == operator) {
                    calculations.setText(String.valueOf(buttons[i].getText()));
                } else {
                    calculations.setText(calculations.getText().concat(String.valueOf(buttons[i].getText())));
                }
            }
        }
        for (int i = 8; i < 11; i ++) {
            if (e.getSource() == buttons[i]) {
                if (calculations.getText() == "0" || calculations.getText() == operator) {
                    calculations.setText(String.valueOf(buttons[i].getText()));
                } else {
                    calculations.setText(calculations.getText().concat(String.valueOf(buttons[i].getText())));
                }
            }
        }
        if (e.getSource() == buttons[12]) {
            if (calculations.getText() == "0" || calculations.getText() == operator) {
                calculations.setText(String.valueOf(buttons[12].getText()));
            } else {
                calculations.setText(calculations.getText().concat(String.valueOf(buttons[12].getText())));
            }
        }
        // for "."
        if (e.getSource() == buttons[13]) { 
            calculations.setText(calculations.getText().concat("."));
        }
        // for '+'
        if (e.getSource() == buttons[3]) { 
            operator = "+";
            num1 = Double.parseDouble(calculations.getText());
            calculations.setText("+");
        }
        // for '-'
        if (e.getSource() == buttons[7]) { 
            operator = "-";
            num1 = Double.parseDouble(calculations.getText());
            calculations.setText("-");
        }
        // for 'X'
        if (e.getSource() == buttons[11]) { 
            operator = "X";
            num1 = Double.parseDouble(calculations.getText());
            calculations.setText("X");
        }
        // for '/'
        if (e.getSource() == buttons[15]) { 
            operator = "/";
            num1 = Double.parseDouble(calculations.getText());
            calculations.setText("/");
        }
        // for '='
        if (e.getSource() == buttons[14]) {
            num2 = Double.parseDouble(calculations.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "X":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            calculations.setText(String.valueOf(result));
            num1 = result;
        }
        // for "AC"
        if (e.getSource() == ansButton) {
            calculations.setText("0");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}
