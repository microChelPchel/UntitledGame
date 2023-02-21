package main.forms;

import adapters.AuthorizationAdapter;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginInForm extends JPanel implements ActionListener {

    private JLabel labelFormName, labelName, labelPassword;
    private JTextField textfieldEmail;
    private JButton buttonSumbit;
    private JButton buttonRegistration;
    private JPasswordField passwordField;
    private AuthorizationAdapter authorizationAdapter;

    public LoginInForm() {
        authorizationAdapter = new AuthorizationAdapter();
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        
        labelFormName = new JLabel("Login Form in Windows Form:");
        labelFormName.setForeground(Color.blue);
        labelFormName.setFont(new Font("Serif", Font.BOLD, 20));
        labelName = new JLabel("Enter Email:");
        labelPassword = new JLabel("Enter Password:");
        textfieldEmail = new JTextField();
        passwordField = new JPasswordField();
        buttonSumbit = new JButton("Submit");
        buttonRegistration = new JButton("Registration");
        labelFormName.setBounds(100, 30, 400, 30);
        labelPassword.setBounds(80, 70, 200, 30);
        labelName.setBounds(80, 110, 200, 30);
        textfieldEmail.setBounds(300, 70, 200, 30);
        passwordField.setBounds(300, 110, 200, 30);
        buttonSumbit.setBounds(150, 160, 100, 30);
        buttonRegistration.setBounds(300, 160, 200, 30);
        add(labelFormName);
        add(labelPassword);
        add(textfieldEmail);
        add(passwordField);
         add(labelName);
        add(buttonSumbit);
        add(buttonRegistration);
        buttonSumbit.addActionListener(this);
        buttonRegistration.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        authorizationAdapter.checkData(textfieldEmail.getText(),passwordField.getPassword().toString());
    }

}
