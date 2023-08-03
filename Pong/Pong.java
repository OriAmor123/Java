package Pong;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pong implements KeyListener {
    static final int WINDOW_HEIGHT = 500, WINDOW_WIDTH = 800;
    static final Dimension WINDOW_SIZE = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);

    static final int BORDER_HEIGHT = WINDOW_HEIGHT, BORDER_WIDTH = 15;
    static final Dimension BORDER_SIZE = new Dimension(BORDER_WIDTH, BORDER_HEIGHT);
    static final int BORDER_X = (WINDOW_WIDTH / 2 - BORDER_WIDTH / 2), BORDER_Y = 0;

    static final int RIGHT_SCORE_X = BORDER_X + BORDER_WIDTH, RIGHT_SCORE_Y = 0;
    static final int LEFT_SCORE_X = BORDER_X - 20, LEFT_SCORE_Y = 0;

    static final int PADDLE_HEIGHT = 30, PADDLE_WIDTH = 10;

    static final int BALL_HEIGHT_AND_WIDTH = 15;

    JFrame window = new JFrame();

    JLabel rightPaddle = new JLabel();
    JLabel rightScore = new JLabel();
    JLabel leftPaddle = new JLabel();
    JLabel leftScore = new JLabel();

    ImageIcon ballIcon = new ImageIcon("whiteBall.png");
    JLabel ball = new JLabel(ballIcon);

    JLabel border = new JLabel();

    Pong() {
        window.setTitle("Pong Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(WINDOW_SIZE);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(0x181818));

        border.setBounds(BORDER_X, BORDER_Y, BORDER_WIDTH, BORDER_HEIGHT);
        border.setBackground(Color.white);
        border.setOpaque(true);
        window.add(border);

        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        new Pong();
    }

}
