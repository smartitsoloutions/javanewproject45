import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private Container container;
    private JLabel titleLabel, nameLabel, emailLabel, passwordLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("User Registration");
        setBounds(300, 90, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setSize(200, 30);
        titleLabel.setLocation(100, 10);
        container.add(titleLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(50, 60);
        container.add(nameLabel);

        nameField = new JTextField();
        nameField.setSize(200, 20);
        nameField.setLocation(150, 60);
        container.add(nameField);

        emailLabel = new JLabel("Email:");
        emailLabel.setSize(100, 20);
        emailLabel.setLocation(50, 100);
        container.add(emailLabel);

        emailField = new JTextField();
        emailField.setSize(200, 20);
        emailField.setLocation(150, 100);
        container.add(emailField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(50, 140);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setSize(200, 20);
        passwordField.setLocation(150, 140);
        container.add(passwordField);

        registerButton = new JButton("Register");
        registerButton.setSize(100, 30);
        registerButton.setLocation(150, 190);
        registerButton.addActionListener(this);
        container.add(registerButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText

