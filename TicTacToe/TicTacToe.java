package TicTacToe;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TicTacToe implements ActionListener {
    JFrame window = new JFrame();
    JLabel title = new JLabel();
    JPanel titlePanel = new JPanel();
    JButton[] buttons = new JButton[9];
    JPanel symbolPanel = new JPanel();

    public TicTacToe() {
        window.setTitle("TicTacToe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(800,900);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.GRAY);
        window.setLayout(new BorderLayout());

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setPreferredSize(new Dimension(800, 100));;
        titlePanel.setBackground(new Color(0x5E5A60));
        window.add(titlePanel, BorderLayout.NORTH);

        symbolPanel.setLayout(new GridLayout(3,3));
        window.add(symbolPanel, BorderLayout.CENTER);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            symbolPanel.add(buttons[i]);
        }
        
        title.setText("Welcome to TicTacToe");
        title.setFont(new Font("Serif", Font.BOLD, 70));
        title.setForeground(new Color(0x0CFF00));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        titlePanel.add(title, BorderLayout.CENTER);

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
