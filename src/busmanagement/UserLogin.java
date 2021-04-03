package busmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton resetButton;
    private JButton loginButton;
    private JButton createAccountButton;

    public UserLogin() {
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String...sk)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

}
