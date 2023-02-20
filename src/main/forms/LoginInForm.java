package main.forms;

import models.User;
import utilz.BaseDataUtilz;
//TODO: change *
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginInForm extends JFrame implements ActionListener {

    private JLabel labelFormName, labelName, labelPassword;
    private JTextField textfieldEmail;
    private JButton buttonSumbit;
    private JButton buttonRegistration;
    private JPasswordField passwordField;

    public LoginInForm() {
        setTitle("Login Form in Windows Form");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        checkData();
    }

    private boolean checkData() {
        String name = textfieldEmail.getText();
        char[] password = passwordField.getPassword();
        //TODO: переделать на относительный путь(почему то не видит)
        var data  = new BaseDataUtilz<User>().LoadData("D:\\Users\\MGaming\\Desktop\\logins.json");
        if (data==null) {
            return false;
        }
        return true;
    }

}
