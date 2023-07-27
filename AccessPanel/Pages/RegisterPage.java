package AccessPanel.Pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegisterPage implements ActionListener{
    JFrame window = new JFrame();
    JLabel registerTitle = new JLabel();

    JPanel usernamePanel = new JPanel();
    JLabel usernameLabel = new JLabel();
    JTextField usernameField = new JTextField();
    JLabel usernameFeedback = new JLabel();

    JPanel passwordPanel = new JPanel();
    JLabel passwordLabel = new JLabel();
    JPasswordField passwordField = new JPasswordField();
    JLabel passwordFeedback = new JLabel();

    JPanel emailPanel = new JPanel();
    JLabel emailLabel = new JLabel();
    JTextField emailField = new JTextField();
    JLabel emailFeedback = new JLabel();

    JPanel birthDatePanel = new JPanel();
    JLabel birthDateLabel = new JLabel();
    String[] monthes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    JComboBox<String> monthBox = new JComboBox<>(monthes);
    Integer[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,2,21,23,24,25,26,27,28,29,30};
    JComboBox<Integer> daysBox = new JComboBox<>(days);
    Integer[] years = new Integer[40];
    JComboBox<Integer> yearsBox;
    JLabel slashes = new JLabel();
    JLabel daysFeedback = new JLabel();
    JLabel yearsFeedback = new JLabel();
    JLabel monthsFeedback = new JLabel();
    

    JPanel buttonPanel = new JPanel();
    JButton registerButton = new JButton();

    public RegisterPage() {
        window.setTitle("Register");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(800,600);
        window.setLayout(null);
        window.getContentPane().setBackground(new Color(0x181818));

        registerTitle.setBounds(0, 30, 800, 70);
        registerTitle.setForeground(new Color(0x66ff66));
        registerTitle.setText("Register");
        registerTitle.setVerticalAlignment(JLabel.TOP);
        registerTitle.setHorizontalAlignment(JLabel.CENTER);
        registerTitle.setFont(new Font("Britannic Bold", Font.PLAIN, 50));
        window.add(registerTitle);

        usernamePanel.setBounds(70, 100, 500, 60);
        usernamePanel.setLayout(new BorderLayout(0, 0));
        // usernamePanel.setOpaque(false);
        usernamePanel.setBackground(Color.green);
        
        usernameLabel.setText(" Username: ");
        usernameLabel.setVerticalAlignment(JLabel.CENTER);
        usernameLabel.setHorizontalAlignment(JLabel.LEFT);
        usernameLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        usernameLabel.setForeground(new Color(0x52b4ff));
        usernamePanel.add(usernameLabel, BorderLayout.WEST);

        usernameField.setPreferredSize(new Dimension(300, 60));
        usernameField.setCaretColor(Color.WHITE);
        usernameField.setForeground(Color.WHITE);
        usernameField.setBackground(new Color(0x585555));
        usernameField.setFont(new Font("Bahnschrift SemiLight", Font.ITALIC, 30));
        usernamePanel.add(usernameField, BorderLayout.EAST);

        passwordPanel.setBounds(70, 190, 500, 60);
        passwordPanel.setLayout(new BorderLayout(0, 0));
        // passwordPanel.setOpaque(false);
        passwordPanel.setBackground(Color.red);

        passwordLabel.setText(" Password: ");
        passwordLabel.setVerticalAlignment(JLabel.CENTER);
        passwordLabel.setHorizontalAlignment(JLabel.LEFT);
        passwordLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        passwordLabel.setForeground(new Color(0x52b4ff));
        passwordPanel.add(passwordLabel, BorderLayout.WEST);

        passwordField.setPreferredSize(new Dimension(300, 60));
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(new Color(0x585555));
        passwordField.setFont(new Font("Bahnschrift SemiLight", Font.ITALIC, 30));
        passwordPanel.add(passwordField, BorderLayout.EAST);

        emailPanel.setBounds(70, 280, 500, 60);
        emailPanel.setLayout(new BorderLayout(0, 0));
        // emailPanel.setOpaque(false);
        emailPanel.setBackground(Color.BLUE);

        emailLabel.setText(" Email: ");
        emailLabel.setVerticalAlignment(JLabel.CENTER);
        emailLabel.setHorizontalAlignment(JLabel.LEFT);
        emailLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        emailLabel.setForeground(new Color(0x52b4ff));
        emailPanel.add(emailLabel, BorderLayout.WEST);

        emailField.setPreferredSize(new Dimension(300, 60));
        emailField.setCaretColor(Color.WHITE);
        emailField.setForeground(Color.WHITE);
        emailField.setBackground(new Color(0x585555));
        emailField.setFont(new Font("Bahnschrift SemiLight", Font.ITALIC, 30));
        emailPanel.add(emailField, BorderLayout.EAST);

        birthDatePanel.setBounds(70, 370, 500, 60);
        birthDatePanel.setLayout(null);
        birthDatePanel.setOpaque(false);
        birthDatePanel.setBackground(Color.YELLOW);

        birthDateLabel.setBounds(0,0, 500, 60);
        birthDateLabel.setText(" Birth Date:");
        birthDateLabel.setVerticalAlignment(JLabel.CENTER);
        birthDateLabel.setHorizontalAlignment(JLabel.LEFT);
        birthDateLabel.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        birthDateLabel.setForeground(new Color(0x52b4ff));
        birthDatePanel.add(birthDateLabel);

        slashes.setBounds(0,0, 500, 60);
        slashes.setText("/               /             ");
        slashes.setVerticalAlignment(JLabel.CENTER);
        slashes.setHorizontalAlignment(JLabel.RIGHT);
        slashes.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 30));
        slashes.setForeground(Color.WHITE);
        birthDatePanel.add(slashes);
 
        for (int i = 0, j = 2023; i < years.length; i++, j--) {
            years[i] = j;
        }
        yearsBox = new JComboBox<>(years);
        yearsBox.setBounds(405, 0, 90, 60);
        yearsBox.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 20));
        birthDatePanel.add(yearsBox);

        monthBox.setBounds(280, 0, 90, 60);
        monthBox.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 16));
        birthDatePanel.add(monthBox);

        daysBox.setBounds(155, 0, 90, 60);
        daysBox.setFont(new Font("Bahnschrift SemiBold", Font.PLAIN, 20));
        birthDatePanel.add(daysBox);

        window.add(birthDatePanel);
        window.add(emailPanel);
        window.add(passwordPanel);
        window.add(usernamePanel);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        new RegisterPage();
    }

}