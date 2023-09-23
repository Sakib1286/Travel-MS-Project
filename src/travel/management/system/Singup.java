
package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Singup extends JFrame {
    
    Singup(){
        
        
        
    setBounds(350,200,900,360);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    
    JPanel p1 = new JPanel();
    p1.setBackground(new Color (133,193,233));
   p1.setBounds(0,0,500,400);
    p1.setLayout(null);
    add(p1);
    
    //for singup username input form 
    JLabel lblusername = new JLabel("Username");
    lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
    lblusername.setBounds(50,20,125,25);
    p1.add(lblusername);
    
     JTextField tfusername = new JTextField();
        tfusername.setBounds(190,20,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        
        
        
        
        
        
    
    
    setVisible(true);
            }


    public static void main(String[] args)  {
        
        new Singup();
        
        
    }
    
}
