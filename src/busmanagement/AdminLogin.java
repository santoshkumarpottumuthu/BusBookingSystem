package busmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton button2;


            public void actionPerformed(ActionEvent e) {
                dispose();
                UserLogin ul = new UserLogin();
                ul.setVisible(true);

        }
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
