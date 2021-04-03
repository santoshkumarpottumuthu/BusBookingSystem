package busmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JButton adminLoginButton;
    private JButton userLoginButton;

    public MainScreen() {
        adminLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserLogin ul =  new UserLogin();
                ul.setVisible(true);
            }
        });
        userLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLogin al = new AdminLogin();
                al.setVisible(true);
            }
        });
    }

}
