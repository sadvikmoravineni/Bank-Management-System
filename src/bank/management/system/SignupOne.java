package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame {
SignupOne(){
    setLayout(null);
    Random ran= new Random();
    long random =Math.abs((ran.nextLong()%9000L)+1000L);
    
    JLabel formno =new JLabel("APPLICATION FORM NO. "+random );
    formno.setFont(new Font("Raleway",Font.BOLD,38));
    formno.setBounds(140,20,600,40);
    add(formno);
    
     JLabel personalDetails =new JLabel("Page 1: personal Details " );
   personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
   personalDetails.setBounds(290,80,400,30);
    add(personalDetails);
    
     JLabel name =new JLabel("Name:  " );
   name.setFont(new Font("Raleway",Font.BOLD,22));
   name.setBounds(100,140,100,30);
    add(name);
    
    JTextField nameTextField =new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300,140,400,30);
    add(nameTextField);
    
    JLabel fname =new JLabel("Fathers Name:  " );
   fname.setFont(new Font("Raleway",Font.BOLD,22));
   fname.setBounds(100,190,200,30);
    add(fname);
    
    JTextField fnameTextField =new JTextField();
    fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    fnameTextField.setBounds(300,190,400,30);
    add(fnameTextField);
    
    JLabel dob =new JLabel("Date of Birth:  " );
   dob.setFont(new Font("Raleway",Font.BOLD,22));
   dob.setBounds(100,240,200,30);
    add(dob);
    
    JDateChooser dateChooser = new JDateChooser();
    dateChooser.setBounds(300,240,400,30);
    dateChooser.setForeground(new Color(105,105,105));
    add(dateChooser);
    

    
     JLabel gender =new JLabel("Gender:  " );
   gender.setFont(new Font("Raleway",Font.BOLD,22));
   gender.setBounds(100,290,200,30);
    add(gender);
    
    JRadioButton male=new JRadioButton("Male");
    male.setBounds(300,290,60,30);
    male.setBackground(Color.WHITE);
    add(male);
    
    JRadioButton female=new JRadioButton("Female");
    female.setBounds(450,290,120,30);
    female.setBackground(Color.WHITE);
    add(female);
    
    ButtonGroup gendergroup =new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(female);
    
    JLabel email =new JLabel("Email Address:  " );
   email.setFont(new Font("Raleway",Font.BOLD,22));
   email.setBounds(100,340,200,30);
    add(email);
    
     JTextField emailTextField =new JTextField();
    emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
    emailTextField.setBounds(300,340,400,30);
    add(emailTextField);
    
    JLabel marital =new JLabel("Marital Status: " );
   marital.setFont(new Font("Raleway",Font.BOLD,22));
   marital.setBounds(100,390,200,30);
    add(marital);
    
     
    
     JLabel address =new JLabel("Address:" );
   address.setFont(new Font("Raleway",Font.BOLD,22));
   address.setBounds(100,440,200,30);
    add(address);
    
     JTextField addressTextField =new JTextField();
    addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
    addressTextField.setBounds(300,440,400,30);
    add(addressTextField);
    
     JLabel city =new JLabel("City:" );
   city.setFont(new Font("Raleway",Font.BOLD,22));
   city.setBounds(100,490,200,30);
    add(city);
   
     JTextField cityTextField =new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300,490,400,30);
    add(cityTextField);
    
     JLabel state=new JLabel("State:" );
   state.setFont(new Font("Raleway",Font.BOLD,22));
   state.setBounds(100,540,200,30);
    add(state);
    
     JTextField stateTextField =new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300,540,400,30);
    add(stateTextField);
    
         JLabel pincode=new JLabel("Pincode:" );
   pincode.setFont(new Font("Raleway",Font.BOLD,22));
   pincode.setBounds(100,590,200,30);
    add(pincode);
    
     JTextField pincodeTextField =new JTextField();
    pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pincodeTextField.setBounds(300,590,400,30);
    add(pincodeTextField);

   
     getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,20);
    setVisible(true);
}
 
    public static void main(String args[]) {
        new SignupOne();
    }
}
