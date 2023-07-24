package AccessPanel;

import java.awt.*;
import java.awt.event.*;
import java.util.*; 
import javax.swing.*;

public class AccessPanel implements ActionListener {

    JFrame window = new JFrame();
    JLabel background;
    JPanel userNamePanel = new JPanel();
    JPanel passwordPanel = new JPanel();
    JLabel userNameLabel = new JLabel();
    JLabel passwordLabel = new JLabel();
    JPanel buttonPanel = new JPanel();
    JButton login = new JButton();
    JButton reset = new JButton();
    JLabel feedback = new JLabel();
    JTextField userName = new JTextField();
    JPasswordField password = new JPasswordField();
    HashMap<String, String> userList;

    public AccessPanel(HashMap<String, String> loginList) {
        userList = loginList;

        window.setTitle("Access Panel");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(700,450);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(0x181818));
        
        userNamePanel.setBounds(100, 100, 500, 60);
        userNamePanel.setLayout(new BorderLayout());
        userNamePanel.setBackground(Color.RED);
        userNamePanel.setOpaque(false);

        userNameLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        userNameLabel.setText(" User Name: ");
        userNameLabel.setVerticalAlignment(JLabel.CENTER);
        userNameLabel.setHorizontalAlignment(JLabel.LEFT);
        userNameLabel.setForeground(new Color(0xd6d6d6));
        userNamePanel.add(userNameLabel, BorderLayout.WEST);

        userName.setFont(new Font("Bahnschrift SemiLight", Font.ITALIC, 30));
        userName.setPreferredSize(new Dimension(300, 60));
        userName.setBackground(new Color(0x585555));
        userName.setForeground(Color.WHITE);
        userName.setCaretColor(Color.WHITE);
        userNamePanel.add(userName, BorderLayout.EAST);

        passwordPanel.setBounds(100, 190, 500, 60);
        passwordPanel.setLayout(new BorderLayout());
        passwordPanel.setBackground(Color.BLUE);
        passwordPanel.setOpaque(false);

        passwordLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        passwordLabel.setText(" Password: ");
        passwordLabel.setVerticalAlignment(JLabel.CENTER);
        passwordLabel.setHorizontalAlignment(JLabel.LEFT);
        passwordLabel.setForeground(new Color(0xd6d6d6));
        passwordPanel.add(passwordLabel, BorderLayout.WEST);

        password.setFont(new Font("Bahnschrift SemiLight", Font.ITALIC, 30));
        password.setPreferredSize(new Dimension(300, 60));
        password.setBackground(new Color(0x585555));
        password.setForeground(Color.WHITE);
        password.setCaretColor(Color.WHITE);
        passwordPanel.add(password, BorderLayout.EAST);

        buttonPanel.setBounds(100, 280, 500, 60);
        buttonPanel.setLayout(null);
        buttonPanel.setBackground(Color.GREEN);
        buttonPanel.setOpaque(false);
        
        login.setBounds(260, 10, 80, 40);
        login.setText("Login");
        login.addActionListener(this);
        login.setFocusable(false);
        login.setBackground(new Color(0x84d2ba));
        login.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 15));
        buttonPanel.add(login);

        reset.setBounds(380, 10, 80, 40);
        reset.setText("Reset");
        reset.addActionListener(this);
        reset.setFocusable(false);
        reset.setBackground(new Color(0x84d2ba));
        reset.setFont(new Font("Bahnschrift Condensed", Font.PLAIN, 15));
        buttonPanel.add(reset);

        feedback.setBounds(0, 0, 250, 50);
        feedback.setVerticalAlignment(JLabel.BOTTOM);
        feedback.setHorizontalAlignment(JLabel.RIGHT);
        feedback.setFont(new Font("Bahnschrift Condensed", Font.BOLD, 13));
        buttonPanel.add(feedback);
        
        window.add(buttonPanel);
        window.add(passwordPanel);
        window.add(userNamePanel);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String pass = new String(password.getPassword());
            boolean good = false;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            for (String key : userList.keySet()) {
                if (key.equals(userName.getText()) && pass.equals(userList.get(key))) {
                    good = true;
                    feedback.setForeground(Color.GREEN);
                    feedback.setText("Your'e successfully logged in");
                }
            }
            if (!good){
                feedback.setForeground(Color.RED);
                feedback.setText("Username or Password is incorrect.");
            }
        }
        if (e.getSource() == reset) {
            userName.setText("");
            password.setText("");
            feedback.setText("");
        }
    }

    public static void main(String[] args) {
        PasswordList userList = new PasswordList();
        new AccessPanel(userList.getHashMap());
    }
    
}