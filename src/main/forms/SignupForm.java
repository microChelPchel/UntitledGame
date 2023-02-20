package main.forms;

import models.User;
import utilz.BaseDataUtilz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupForm extends JFrame implements ActionListener {

    private static final String PATH = "D:\\Users\\MGaming\\Desktop\\logins.json";

    JLabel nameLabel, passwordLabel, repeatLabel;
    JTextField textField;
    JButton buttonRegister, buttonBack;
    JPasswordField passwordField1, passwordField2;

    public SignupForm() {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form in Java");

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
        saveData();
    }

    //вынести в произвольный класс от basedata
    private void saveData() {

        String login = nameLabel.getText();
        String password = passwordField1.getPassword().toString();
        //TODO: переделать на относительный путь(почему то не видит)
        var utilz = new BaseDataUtilz<User>();
        var data = utilz.LoadData(PATH);
        if (data == null) {
            data = new ArrayList<>();
        }
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setVisibleName(login);
        data.add(user);

        utilz.SaveData(PATH, data);

    }

}
