package JavaProejct;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Project extends JFrame {
    private JLabel firstName, lastName, street, city, ZIP, state, phone, ethnicity, gender, username, password; 
    private JTextField jfirstName, jlastName, jstreet, jcity, jZIP, jstate, jphone, jethnicity, jgender, jusername;
    private JPasswordField jpassword; 
    private JButton submitButton, clearButton;
    private Container c;
    private Font f;
    boolean isLong = true;
    boolean registerSuccess = true;
    boolean stateAcc = true;
    Project(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(850, 950);
        this.setLocationRelativeTo(null);
        this.setTitle("Benjamin Graham Foundation");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        f = new Font("Lato", Font.BOLD, 15);
        
        firstName = new JLabel("First Name");
        firstName.setFont(f);
        firstName.setBounds(50, 40, 250, 50);
        c.add(firstName);
        
        jfirstName = new JTextField();;
        jfirstName.setFont(f);
        jfirstName.setBounds(250, 40, 520, 50);
        c.add(jfirstName);
        
        lastName = new JLabel("Last Name");
        lastName.setFont(f);
        lastName.setBounds(50, 110, 250, 50);
        c.add(lastName);
        
        jlastName = new JTextField();;
        jlastName.setFont(f);
        jlastName.setBounds(250, 110, 520, 50);
        c.add(jlastName);
        
        street = new JLabel("Street Adress");
        street.setFont(f);
        street.setBounds(50, 180, 200, 50);
        c.add(street);
        
        jstreet = new JTextField();;
        jstreet.setFont(f);
        jstreet.setBounds(250, 180, 520, 50);
        c.add(jstreet);
        
        city = new JLabel("City");
        city.setFont(f);
        city.setBounds(50, 250, 250, 50);
        c.add(city);
        
        jcity = new JTextField();;
        jcity.setFont(f);
        jcity.setBounds(250, 250, 520, 50);
        c.add(jcity);
        
        ZIP = new JLabel("ZIP (5 digits number)");
        ZIP.setFont(f);
        ZIP.setBounds(50, 390, 200, 50);
        c.add(ZIP);
        
        jZIP = new JTextField();;
        jZIP.setFont(f);
        jZIP.setBounds(250, 390, 520, 50);
        c.add(jZIP);
        
        state = new JLabel("State");
        state.setFont(f);
        state.setBounds(50, 320, 200, 50);
        c.add(state);
        
        jstate = new JTextField();;
        jstate.setFont(f);
        jstate.setBounds(250, 320, 520, 50);
        c.add(jstate);
        
        phone = new JLabel("Primary Phone");
        phone.setFont(f);
        phone.setBounds(50, 460, 200, 50);
        c.add(phone);
        
        jphone = new JTextField();;
        jphone.setFont(f);
        jphone.setBounds(250, 460, 520, 50);
        c.add(jphone);
        
        gender = new JLabel("Gender");
        gender.setFont(f);
        gender.setBounds(50, 530, 200, 50);
        c.add(gender);
        
        jgender = new JTextField();;
        jgender.setFont(f);
        jgender.setBounds(250, 530, 520, 50);
        c.add(jgender);
        
        ethnicity = new JLabel("Ethnicity");
        ethnicity.setFont(f);
        ethnicity.setBounds(50, 600, 200, 50);
        c.add(ethnicity);
        
        jethnicity = new JTextField();;
        jethnicity.setFont(f);
        jethnicity.setBounds(250, 600, 520, 50);
        c.add(jethnicity);
        
        username = new JLabel("Username");
        username.setFont(f);
        username.setBounds(50, 680, 200, 50);
        c.add(username);
        
        jusername = new JTextField();;
        jusername.setFont(f);
        jusername.setBounds(250, 680, 520, 50);
        c.add(jusername);
        
        password = new JLabel("Password");
        password.setFont(f);
        password.setBounds(50, 750, 200, 50);
        c.add(password);
        
        jpassword = new JPasswordField();
        jpassword.setFont(f);
        jpassword.setEchoChar('*');
        jpassword.setBounds(250, 750, 520, 50);
        c.add(jpassword);
        
        submitButton = new JButton("Submit");
        
        submitButton.setBounds(650, 830, 120, 50);
        submitButton.setFont(f);
        c.add(submitButton);
        
        clearButton = new JButton("Clear");
        
        clearButton.setBounds(500, 830, 120, 50);
        clearButton.setFont(f);
        c.add(clearButton);
        
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                jfirstName.setText("");
                jlastName.setText("");
                jstreet.setText("");
                jcity.setText("");
                jZIP.setText("");
                jstate.setText("");
                jphone.setText("");
                jusername.setText("");
                jpassword.setText("");
                jethnicity.setText("");
                jgender.setText("");}
        });
        
        submitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String firstName = jfirstName.getText();
                String lastName = jlastName.getText();
                String street = jstreet.getText();
                String city = jcity.getText();
                String sZIP = jZIP.getText();
                String state = jstate.getText();
                String sphone = jphone.getText();
                String gender = jgender.getText();
                String ethnicity = jethnicity.getText();
                String username = jusername.getText();
                String password = jpassword.getText();
                String stateUpper;
                if(firstName.length() == 0 || lastName.length() == 0 || state.length() == 0 || city.length() == 0 || sphone.length() == 0 || street.length() == 0 || gender.length() == 0 || ethnicity.length() == 0 || username.length() == 0 || password.length() == 0){
                    registerSuccess = false;
                    JOptionPane.showMessageDialog(null, "Please enter all information", "Information required", JOptionPane.ERROR_MESSAGE);                    
                }
                else {
                    stateUpper = state.toUpperCase();
                    if(stateUpper != "AK" || stateUpper != "AL" || stateUpper != "AR" || stateUpper !="AZ" || stateUpper !="CA" || stateUpper !="CO" || stateUpper !="CT" || stateUpper !="DE" || stateUpper !="FL" || stateUpper !="GA" || stateUpper !="HI" || stateUpper !="IA" || stateUpper !="ID" || stateUpper !="IL" || stateUpper !="IN" || stateUpper !="KS" || stateUpper !="KY" || stateUpper !="LA" || stateUpper !="MA" || stateUpper !="MD" || stateUpper !="ME" || stateUpper !="MI" || stateUpper !="MN" || stateUpper !="MO" || stateUpper !="MS" || stateUpper !="MT" || stateUpper !="NC" || stateUpper !="ND" || stateUpper !="NE" || stateUpper !="NH" || stateUpper !="NJ" || stateUpper !="NM" || stateUpper !="NV" || stateUpper != "NY" || stateUpper !="OH" || stateUpper !="OK" || stateUpper !="OR" || stateUpper !="PA" || stateUpper !="RI" || stateUpper !="SC" || stateUpper !="SD" || stateUpper !="TN" || stateUpper !="TX" || stateUpper !="UT" || stateUpper !="VA" || stateUpper !="VT"|| stateUpper !="WA" || stateUpper !="WI" || stateUpper !="WV" || stateUpper !="WY"){                        
                    }
                    else {
                        registerSuccess = false;
                        JOptionPane.showMessageDialog(null, "Please enter proper state code", "Invalid State", JOptionPane.ERROR_MESSAGE);
                    }
                    try {
                        int ZIP = Integer.parseInt(sZIP);
                        if(ZIP < 1000 || ZIP > 99999){
                            JOptionPane.showMessageDialog(null, "Please enter a valid ZIP code", "Invalid ZIP", JOptionPane.ERROR_MESSAGE);
                            registerSuccess = false;
                        }
                    }
                    catch(NumberFormatException ZIP){
                        JOptionPane.showMessageDialog(null, "Please enter a valid ZIP", "Invalid ZIP", JOptionPane.ERROR_MESSAGE);
                        registerSuccess = false;
                    }
                    try {
                        long phone = Long.parseLong(sphone);
                        if(sphone.length() != 10){
                            JOptionPane.showMessageDialog(null, "Phone number must have 10 digits", "Invalid Phone number", JOptionPane.ERROR_MESSAGE);
                            registerSuccess = false;
                        }
                    }
                    catch(NumberFormatException phone){
                        JOptionPane.showMessageDialog(null, "Enter a valid phone number", "Invalid Phone number", JOptionPane.ERROR_MESSAGE);
                        registerSuccess = false;
                    }
                    
                    gender = gender.toLowerCase();
                    if(gender.equals("male") || gender.equals("female")){
                    
                    }
                    else {
                        registerSuccess = false;
                        JOptionPane.showMessageDialog(null, "Gender must be male or female", "Invalid gender", JOptionPane.ERROR_MESSAGE);
                    }
                    if (password.length() < 8){
                        registerSuccess = false;
                        JOptionPane.showMessageDialog(null, "Password must have at least 8 characters", "Invalid password", JOptionPane.ERROR_MESSAGE);
                    }
                    else if (password.length() > 32){
                        registerSuccess = false;
                        JOptionPane.showMessageDialog(null, "Password cannot have more than 32 characters", "Invalid password", JOptionPane.ERROR_MESSAGE);
                    }
                    if(password.length() >= 8 && password.length() <= 32){
                        if(password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9")){
                        }
                        else {
                            registerSuccess = false;
                            JOptionPane.showMessageDialog(null, "Password must contain at least one number", "Invalid password", JOptionPane.ERROR_MESSAGE);
                        }
                        if(password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")")){
                        }
                        else {
                            registerSuccess = false;
                            JOptionPane.showMessageDialog(null, "Password must contain at least one speical character", "Invalid password", JOptionPane.ERROR_MESSAGE);
                        }
                        String tempPass = password.toLowerCase();
                        String tempUser = username.toLowerCase();
                        if(tempPass.contains(tempUser)){
                            JOptionPane.showMessageDialog(null, "Username and password must be different", "Registration Error", JOptionPane.ERROR_MESSAGE);
                            registerSuccess = false;
                        }
                    }
                }
                if(registerSuccess == true){
                    JOptionPane.showMessageDialog(null, "Registration Successful");
                }
                System.exit(0);
            }
            
        });
    }
    
    public static void main(String[] args) {
        Project frame = new Project();
        int register = JOptionPane.showConfirmDialog(null, "Read before you proceed\n\n\nDear customer, \nOur company is famous worldwide. So we provide seervice to only a few people around the world. In that case. If you really want to have our service then you have to very sincere. First of all enter all the information correctly and don't make any mistake.\n\nYou won't get a second chance\n\n\nIf you fail to do so, you may not register because submit button will not work.", "Disclaimer", JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
        
        if(register == JOptionPane.CANCEL_OPTION){
        System.exit(0);
        }
        frame.setVisible(true);
    }
}
