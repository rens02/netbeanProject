/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azmi Abdul Aziz
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class login extends Frame{
    Label tInfo;
    TextField f1, f2;
    Button b;
    
    public static void main(String[] args){
        login apl = new login();
    }
    public login(){
        super("Login");
        setSize(300, 120);
        
        Label t1 = new Label("Username: ");
        f1 = new TextField("", 10);
        Label t2 = new Label("Password: ");
        f2 = new TextField("", 10);
        f2.setEchoChar('*');
        
        b= new Button("Login");
        tInfo = new Label();
        
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(2,2));
        p1.add(t1);
        p1.add(f1);
        p1.add(t2);
        p1.add(f2);
        
        Panel p2 = new Panel();
        p2.setLayout(new FlowLayout());
        p2.add(b);
        p2.add(tInfo);
        
        add("North", p1);
        add("South", p2);
        
        b.addActionListener(new login.PenangananTombol());
        
        show();
    }
    
    class PenangananTombol implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
            if(s.equals("Login")){
                String user=f1.getText();
                String password=f2.getText();
                if(user.compareTo("Azmi") == 0 && password.compareTo("Bule123u_") ==0){
                    JOptionPane.showMessageDialog(null, "Login Sukses", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "User atau Password Salah", "Peringatan", JOptionPane.WARNING_MESSAGE);

                }
                
            }
        }
        
    }
    
    
}
