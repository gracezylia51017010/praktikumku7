/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borlay;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Borlay extends JFrame {

    /**
     * @param args the command line arguments
     */
        JButton nButton = new JButton("North");
        JButton sButton = new JButton("South");
        JButton eButton = new JButton("East");
        JButton wButton = new JButton("West");
        JButton cButton = new JButton("Center");
        
    public Borlay () {
        super("Border Layout Beraksi");
        setSize(240, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
            add(nButton, BorderLayout.NORTH);
            add(sButton, BorderLayout.SOUTH);
            add(eButton, BorderLayout.EAST);
            add(wButton, BorderLayout.WEST);
            add(cButton, BorderLayout.CENTER);}
            
    
    public static void main(String[] args) {
         // TODO code application logic here
         Borlay frame = new Borlay();
         frame.setVisible(true);
    }   
    
}
