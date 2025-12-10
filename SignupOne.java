
// package bank.management.system;

import java.awt.*;

import javax.swing.*;
import java.util.*;



public class SignupOne extends JFrame {
    
    SignupOne(){
        Random ran=new Random();
        long random=Math.abs((ran.nextLong() %9000L)+1000L);
        
        
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        JLabel formNo=new JLabel("APPLICATION FORM NO. "+ random);
        formNo.setBounds(140,20,600,40);
        formNo.setFont(new Font("Raleway",Font.BOLD,38));
        add(formNo);
        
        JLabel personalDetail=new JLabel("Page 1: Personal Details");
        personalDetail.setBounds(290,80,400,30);
        personalDetail.setFont(new Font("Raleway",Font.BOLD,22));
        add(personalDetail);
        
        JLabel name=new JLabel("Name : ");
        name.setBounds(100,140,100,30);
        name.setFont(new Font("Raleway",Font.BOLD,20));
        add(name);
        //1text
        JTextField nameText=new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,20));
        nameText.setBounds(300,140,400,30);
        add(nameText);
        
        JLabel fname=new JLabel("Father Name : ");
        fname.setBounds(100,190,200,30);
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        add(fname);
        //text fname
        JTextField fnameText=new JTextField();
        fnameText.setFont(new Font("Raleway",Font.BOLD,20));
        fnameText.setBounds(300,190,400,30);
        add(fnameText);
        
        JLabel dob=new JLabel("Date of Birth : ");
        dob.setBounds(100,240,200,30);
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        add(dob);
        
        JLabel gender=new JLabel("Gender : ");
        gender.setBounds(100,290,200,30);
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        add(gender);
        
        JLabel marital=new JLabel("Marital Status : ");
        marital.setBounds(100,340,200,30);
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        add(marital);
        
        JLabel email=new JLabel("Email id : ");
        email.setBounds(100,390,200,30);
        email.setFont(new Font("Raleway",Font.BOLD,20));
        add(email);
        
        JLabel address=new JLabel("Address : ");
        address.setBounds(100,440,200,30);
        address.setFont(new Font("Raleway",Font.BOLD,20));
        add(address);
        
        JLabel city=new JLabel("City : ");
        city.setBounds(100,490,200,30);
        city.setFont(new Font("Raleway",Font.BOLD,20));
        add(city);
        
        JLabel pinCode=new JLabel("Zip Code : ");
        pinCode.setBounds(100,540,200,30);
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        add(pinCode);
        
        JLabel state=new JLabel("Zip Code : ");
        state.setBounds(100,590,200,30);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        add(state);
        
    }
    
    
    
    public static void main(String[] args) {
        new SignupOne();
        
    }
}

