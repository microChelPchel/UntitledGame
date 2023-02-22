package main.forms;

import adapters.AuthorizationAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupForm extends JPanel implements ActionListener {

    private JLabel nameLabel, passwordLabel, repeatLabel;
    private JTextField textField;
    private JButton buttonRegister, buttonBack;
    private JPasswordField passwordField1, passwordField2;
    private AuthorizationAdapter authorizationAdapter;

    public SignupForm() {
        authorizationAdapter = new AuthorizationAdapter();
        setVisible(false);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        passwordLabel = new JLabel("Create Passowrd:");
        repeatLabel = new JLabel("Repeat Passowrd:");

        textField = new JTextField();

        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();

        buttonRegister = new JButton("Submit");
        buttonBack = new JButton("Back");

        buttonRegister.addActionListener(this);
        buttonBack.addActionListener(this);

        nameLabel.setBounds(80, 70, 200, 30);
        passwordLabel.setBounds(80, 110, 200, 30);
        repeatLabel.setBounds(80, 150, 200, 30);

        textField.setBounds(300, 70, 200, 30);
        passwordField1.setBounds(300, 110, 200, 30);
        passwordField2.setBounds(300, 150, 200, 30);

        buttonRegister.setBounds(100, 200, 100, 30);
        buttonBack.setBounds(300, 200, 100, 30);

        add(nameLabel);
        add(passwordLabel);
        add(repeatLabel);
        add(textField);
        add(buttonRegister);
        add(buttonBack);
        add(passwordField1);
        add(passwordField2);

    }

    public void actionPerformed(ActionEvent e) {
        //add message from the user
        authorizationAdapter.saveData(textField.getText(), passwordField1.getPassword().toString());
    }

}
