package guis;

import db_objs.User;

import javax.swing.*;
import java.awt.*;

public class BankingAppGui extends BaseFrame{

    private JTextField currentBalanceField;
    public JTextField getCurrentBalanceField() {
        return currentBalanceField;
    }

    public BankingAppGui(User user) {
        super("Banking App", user);
    }

    @Override
    protected void addGuiComponents() {

        String welcomeMessage = "<html>" + "<body style='text-align:center'>" +
                "<b>Hello " + user.getUsername() + "</b><br>" +
                "What would you like to do today?</body></html>";

        JLabel welcomeMessageLabel = new JLabel(welcomeMessage);
        welcomeMessageLabel.setBounds(0, 20, getWidth() -10, 40);
        welcomeMessageLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        welcomeMessageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeMessageLabel);

        JLabel currentBalanceLabel = new JLabel("Current Balance");
        currentBalanceLabel.setBounds(0, 80, getWidth() -10, 30);
        currentBalanceLabel.setFont(new Font("Dialog", Font.PLAIN, 22));
        currentBalanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(currentBalanceLabel);

        // current balance field
        currentBalanceField = new JTextField("$" + user.getCurrentBalance());
        currentBalanceField.setBounds(15, 120, getWidth() -50, 40);
        currentBalanceField.setFont(new Font("Dialog", Font.PLAIN, 22));
        currentBalanceField.setHorizontalAlignment(SwingConstants.CENTER);
        currentBalanceField.setEditable(false);
        add(currentBalanceField);

        // deposit button
        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(15, 180, getWidth() -50, 50);
        depositButton.setFont(new Font("Dialog", Font.PLAIN, 22));
        depositButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(depositButton);

        // withdraw button
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(15, 240, getWidth() -50, 50);
        withdrawButton.setFont(new Font("Dialog", Font.PLAIN, 22));
        withdrawButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(withdrawButton);

        // past transaction button
        JButton pastTransactionButton = new JButton("Past Transaction");
        pastTransactionButton.setBounds(15, 300, getWidth() -50, 50);
        pastTransactionButton.setFont(new Font("Dialog", Font.PLAIN, 22));
        pastTransactionButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(pastTransactionButton);

        // transfer button
        JButton transferButton = new JButton("Transfer");
        transferButton.setBounds(15, 360, getWidth() -50, 50);
        transferButton.setFont(new Font("Dialog", Font.PLAIN, 22));
        transferButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(transferButton);

        // logout button
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(15, 480, getWidth() -50, 50);
        logoutButton.setFont(new Font("Dialog", Font.PLAIN, 22));
        logoutButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(logoutButton);

    }
}
