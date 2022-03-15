/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import javax.swing.*;

/**
 *
 * @author Suyoto
 */
public class Tampilan extends JFrame {
    JLabel Username = new JLabel("Username : ");
    JTextField user = new JTextField();
    JLabel Password = new JLabel ("Password : ");
    JPasswordField pass = new JPasswordField ();
    
    JButton Login = new JButton ("Login");
    JButton Cancel = new JButton ("Cancel");
    
    public Tampilan(){
        setLocationRelativeTo(null);
        setTitle("Login");
        setSize(300,200);
        setDefaultCloseOperation(3);
        setVisible(true);
        setLayout(null);
        add(Username);
        add(user);
        add(Password);
        add(pass);
        add(Login);
        add(Cancel);  
        Username.setBounds(25,10,100,20);
        user.setBounds(110,10,150,20);
        Password.setBounds(25,50,100,20);
        pass.setBounds(110,50,150,20);
        Login.setBounds(25,100,100,20);
        Cancel.setBounds(160,100,100,20);  
    }
}
