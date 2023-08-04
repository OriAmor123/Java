package TicTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
    JFrame window = new JFrame();

    JLabel title = new JLabel();
    JPanel titlePanel = new JPanel();

    JButton[] buttons = new JButton[9];
    JPanel symbolPanel = new JPanel();

    boolean XPlayer, ifWon = false;

    public TicTacToe() {
        window.setTitle("TicTacToe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(800, 950);
        window.getContentPane().setBackground(Color.GRAY);
        window.setLayout(new BorderLayout());

        titlePanel.setPreferredSize(new Dimension(800, 150));
        titlePanel.setLayout(null);
        titlePanel.setBackground(new Color(0x5E5A60));

        symbolPanel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setFocusable(false);
            buttons[i].setEnabled(false);
            buttons[i].setBackground(new Color(0xddffcc));
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            symbolPanel.add(buttons[i]);
        }

        title.setText("Welcome to TicTacToe");
        title.setBounds(0, 0, 800, 150);
        title.setFont(new Font("Ink Free", Font.BOLD, 75));
        title.setForeground(new Color(0x0CFF00));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        titlePanel.add(title);

        window.add(titlePanel, BorderLayout.NORTH);
        window.add(symbolPanel, BorderLayout.CENTER);
        window.setVisible(true);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        firstTurn();

    }

    private void firstTurn() {
        long num = Math.round(2 * Math.random()) + 1;
        ifWon = false;
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(true);
            buttons[i].setText("");
            buttons[i].setBackground(new Color(0xddffcc));
        }

        if (num == 1) {
            XPlayer = true;
            title.setText("X turn");
        } else {
            XPlayer = false;
            title.setText("O turn");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (buttons[i].getText() == "") {
                    if (XPlayer) {
                        XPlayer = false;
                        buttons[i].setText("X");
                        buttons[i].setForeground(Color.BLUE);
                        title.setText("O turn");
                        check();
                    } else {
                        XPlayer = true;
                        buttons[i].setText("O");
                        buttons[i].setForeground(Color.red);
                        title.setText("X turn");
                        check();
                    }
                    if (drawCheck()) {
                        draw();
                    }
                }
            }
        }
    }

    private boolean drawCheck() {
        boolean draw = true;
        for (JButton b : buttons) {
            if (b.getText() == "") {
                draw = false;
            }
        }
        return draw;
    }

    private void check() {
        // X conditions
        if (buttons[0].getText() == "X" &&
                buttons[3].getText() == "X" &&
                buttons[6].getText() == "X") {
            xWins(0, 3, 6);
        }
        if (buttons[1].getText() == "X" &&
                buttons[4].getText() == "X" &&
                buttons[7].getText() == "X") {
            xWins(1, 4, 7);
        }
        if (buttons[2].getText() == "X" &&
                buttons[5].getText() == "X" &&
                buttons[8].getText() == "X") {
            xWins(2, 5, 8);
        }
        if (buttons[0].getText() == "X" &&
                buttons[1].getText() == "X" &&
                buttons[2].getText() == "X") {
            xWins(0, 1, 2);
        }
        if (buttons[3].getText() == "X" &&
                buttons[4].getText() == "X" &&
                buttons[5].getText() == "X") {
            xWins(3, 4, 5);
        }
        if (buttons[6].getText() == "X" &&
                buttons[7].getText() == "X" &&
                buttons[8].getText() == "X") {
            xWins(6, 7, 8);
        }
        if (buttons[0].getText() == "X" &&
                buttons[4].getText() == "X" &&
                buttons[8].getText() == "X") {
            xWins(0, 4, 8);
        }
        if (buttons[2].getText() == "X" &&
                buttons[4].getText() == "X" &&
                buttons[6].getText() == "X") {
            xWins(2, 4, 6);
        }

        // O conditions
        if (buttons[0].getText() == "O" &&
                buttons[3].getText() == "O" &&
                buttons[6].getText() == "O") {
            oWins(0, 3, 6);
        }
        if (buttons[1].getText() == "O" &&
                buttons[4].getText() == "O" &&
                buttons[7].getText() == "O") {
            oWins(1, 4, 7);
        }
        if (buttons[2].getText() == "O" &&
                buttons[5].getText() == "O" &&
                buttons[8].getText() == "O") {
            oWins(2, 5, 8);
        }
        if (buttons[0].getText() == "O" &&
                buttons[1].getText() == "O" &&
                buttons[2].getText() == "O") {
            oWins(0, 1, 2);
        }
        if (buttons[3].getText() == "O" &&
                buttons[4].getText() == "O" &&
                buttons[5].getText() == "O") {
            oWins(3, 4, 5);
        }
        if (buttons[6].getText() == "O" &&
                buttons[7].getText() == "O" &&
                buttons[8].getText() == "O") {
            oWins(6, 7, 8);
        }
        if (buttons[0].getText() == "O" &&
                buttons[4].getText() == "O" &&
                buttons[8].getText() == "O") {
            oWins(0, 4, 8);
        }
        if (buttons[2].getText() == "O" &&
                buttons[4].getText() == "O" &&
                buttons[6].getText() == "O") {
            oWins(2, 4, 6);
        }
    }

    private void xWins(int a, int b, int c) {
        ifWon = true;
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        buttons[a].setBackground(Color.BLUE);
        buttons[b].setBackground(Color.BLUE);
        buttons[c].setBackground(Color.BLUE);
        title.setText("X Won");
        askForRestart();
    }

    private void oWins(int a, int b, int c) {
        ifWon = true;
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        buttons[a].setBackground(Color.RED);
        buttons[b].setBackground(Color.RED);
        buttons[c].setBackground(Color.RED);
        title.setText("O Won");
        askForRestart();
    }

    private void draw() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        title.setText("Draw");
        askForRestart();
    }

    private void askForRestart() {
        int answer = JOptionPane.showConfirmDialog(
                null,
                "Do you want to restart?",
                "Restart",
                JOptionPane.YES_NO_OPTION);

        switch (answer) {
            case 0: // answer == yes
                firstTurn();
                break;
            case 1: // answer == no
                window.dispose();
                break;
            case -1:
                askForRestart();
                break;
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}