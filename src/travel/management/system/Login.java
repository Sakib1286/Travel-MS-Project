package travel.management.system;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame { 
    Login(){
        
        //login box implement
        setSize(900,400);
        setLocation (350,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        //Separate the box in two parts  
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        //Impelement login Image in left side
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        //username Implement 
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2 .add(lblusername);
        
        //username Text border implement
        JTextField tfusername = new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        
         //Password Implement 
        JLabel iblpass = new JLabel("Password");
        iblpass.setBounds(60,110,100,25);
        iblpass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2 .add(iblpass);
        
        //Password Text border implement
        JTextField tfpass = new JTextField();
        tfpass .setBounds(60,150,300,30);
       tfpass .setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpass );
        
        //Login button 
        JButton login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
          login .setBorder(BorderFactory.createEmptyBorder());
        p2.add(login);
        
        //Signup button as login
        JButton signup = new JButton("Signup ");
         signup.setBounds(250,200,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
          signup.setBorder(BorderFactory.createEmptyBorder());
        p2.add(signup );
        
        // forget password button
         JButton forgetPass = new JButton("Forget Password");
        forgetPass.setBounds(155,250,130,30);
       forgetPass.setBackground(new Color(133,193,233));
        forgetPass.setForeground(Color.WHITE);
          forgetPass.setBorder(BorderFactory.createEmptyBorder());
        p2.add(forgetPass );
        
        //side text 
       JLabel text = new JLabel("Trouble in Login.... ");
        text.setBounds (300,250,150,20);
        text.setForeground(Color.red);
        p2.add(text);
        
        setVisible(true);
        
}
    
       public static void main(String[] args)  {
           
           new Login();
           
       }
           
       }

    

