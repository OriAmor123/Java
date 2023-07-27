package AccessPanel.Pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import AccessPanel.UserHandling.*;

public class LoginPage implements ActionListener {

    JFrame window = new JFrame();
    JLabel loginTitle = new JLabel();
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
    JButton register = new JButton();

    public LoginPage() {

        UserList.addUser(new User(
            "hey",
            "Av1239545", 
            "abdf@h.d", 
            "gfd"));

        window.setTitle("Login");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(700,450);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(0x181818));

        loginTitle.setBounds(30, 30, 640, 70);
        loginTitle.setForeground(new Color(0x66ff66));
        loginTitle.setText("Login");
        loginTitle.setVerticalAlignment(JLabel.TOP);
        loginTitle.setHorizontalAlignment(JLabel.CENTER);
        loginTitle.setFont(new Font("Britannic Bold", Font.PLAIN, 50));

        window.add(loginTitle);

        userNamePanel.setBounds(70, 100, 500, 60);
        userNamePanel.setLayout(new BorderLayout());
        userNamePanel.setBackground(Color.RED);
        userNamePanel.setOpaque(false);

        userNameLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        userNameLabel.setText(" User Name: ");
        userNameLabel.setVerticalAlignment(JLabel.CENTER);
        userNameLabel.setHorizontalAlignment(JLabel.LEFT);
        userNameLabel.setForeground(new Color(0x52b4ff));
        userNamePanel.add(userNameLabel, BorderLayout.WEST);

        userName.setFont(new Font("Bahnschrift SemiLight", Font.ITALIC, 30));
        userName.setPreferredSize(new Dimension(300, 60));
        userName.setBackground(new Color(0x585555));
        userName.setForeground(Color.WHITE);
        userName.setCaretColor(Color.WHITE);
        userNamePanel.add(userName, BorderLayout.EAST);

        passwordPanel.setBounds(70, 190, 500, 60);
        passwordPanel.setLayout(new BorderLayout());
        passwordPanel.setBackground(Color.BLUE);
        passwordPanel.setOpaque(false);

        passwordLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        passwordLabel.setText(" Password: ");
        passwordLabel.setVerticalAlignment(JLabel.CENTER);
        passwordLabel.setHorizontalAlignment(JLabel.LEFT);
        passwordLabel.setForeground(new Color(0x52b4ff));
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

        register.setBounds(340, 350, 240, 30);
        register.setText("Don't have an accounts? register now.");
        register.setFocusable(false);
        register.addActionListener(this);
        register.setFont(new Font("Bahnschrift Condensed", Font.BOLD, 10));
        register.setBackground(new Color(0xbbff5c));
        window.add(register);
        
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
            for (String key : UserList.getUserNames()) {
                if (key.equals(userName.getText()) && pass.equals(UserList.getList().get(key).getPassword())) {
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
        if (e.getSource() == register) {
            window.dispose();
            new RegisterPage();
        }
    }

    public static void main(String[] args) {
        
        new LoginPage();
    }
    
}