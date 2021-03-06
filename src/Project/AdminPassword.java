package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AdminPassword extends JDialog implements ActionListener, KeyListener {

    static final String JDBC_URL = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/health_care_management?autoReconnect=true&useSSL=false";
    static final String userName = "root";
    static final String user_Password = "1";

    TextField passwordField, nameField;
    TextField field;
    JLabel l, name;
    JButton okButton;
    JButton cancelButton;
    JPanel p;

    String pass = null, nameString = null;
    int i = 0;

    public AdminPassword(JFrame f) {
        super(f, "Administrative Password", true);
        setLayout(null);

        name = new JLabel("Admin");
        name.setFont(new Font("arial", Font.BOLD, 20));
        name.setBounds(50, 20, 200, 30);
        add(name);

        nameField = new TextField(10);
        nameField.setFont(new Font("arial", Font.BOLD, 15));
        nameField.setBounds(90, 50, 150, 25);
        add(nameField);

        l = new JLabel("Password");
        l.setFont(new Font("arial", Font.BOLD, 20));
        l.setBounds(50, 70, 200, 30);
        add(l);

        passwordField = new TextField(10);
        passwordField.setEchoChar('*');

        passwordField.setFont(new Font("arial", Font.BOLD, 15));
        passwordField.setBounds(90, 100, 150, 25);
        add(passwordField);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                dispose();
            }
        });

        okButton = new JButton("OK");
        cancelButton = new JButton("CANCLE");
        okButton.setMnemonic(KeyEvent.VK_O);
        //okButton.setDisplayedMnemonicIndex(0);
        okButton.addActionListener(this);
        okButton.addKeyListener(this);
        okButton.setToolTipText("Press it after entering Password");
        cancelButton.setDisplayedMnemonicIndex(0);
        cancelButton.addActionListener(this);
        cancelButton.addKeyListener(this);
        cancelButton.setToolTipText("Press it to exit");
        p = new JPanel();
        p.setLayout(new GridLayout(1, 2));
        p.setBounds(90, 150, 200, 30);
        p.add(okButton);
        p.add(cancelButton);
        getContentPane().add(p);
        setBounds(320, 350, 400, 220);
        setVisible(true);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AdminPassword adminPassword = new AdminPassword(null);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (e.getSource() == okButton) {
            if (key == KeyEvent.VK_ENTER) {
                passwordCheck();
            }
        } else if (key == KeyEvent.VK_C) {
            dispose();
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if (e.getActionCommand().equals("OK")) {
            passwordCheck();
        } else if (e.getActionCommand().equals("CANCLE")) {
            dispose();

        }
    }


    private void passwordCheck() {
        pass = passwordField.getText();
        nameString = nameField.getText();
        String password1 = "";
        String name1 = "";

        System.out.println(pass + ' ' + nameString);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conn = DriverManager.getConnection(DB_URL, userName, user_Password);
                PreparedStatement stmt;
                stmt = conn.prepareStatement("select * from password where name = ? and password = ? limit 1");
                stmt.setString(1, nameString);
                stmt.setString(2, pass);
                ResultSet rs;
                rs = stmt.executeQuery();

                if (rs.first()) {
                    dispose();
                    //todo;
                    Home home = new Home();
                    //home.setBounds(0,0,1020,1000);
                    //home.setVisible(true);
                    i = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Password", "Wrong Password", JOptionPane.ERROR_MESSAGE);
                    passwordField.setText("");
                    i++;
                    if (i >= 3) {
                        System.exit(0);
                    }
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
