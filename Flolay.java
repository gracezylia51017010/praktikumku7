/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flolay;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

/**
 *
 * @author User
 */
public class Flolay extends JFrame{

    /**
     * @param args the command line arguments
     */
public Flolay () {
    FlowLayout Flolay = new FlowLayout (FlowLayout.CENTER, 5,10);
    
    //Memperoleh konten pane dari frame
    Container container = getContentPane ();
   
    //Mengatur Layout maneger dari kontent pane
    container.setLayout(Flolay);
    
    //menambahkan layout manager dari content  pane
    container.setLayout(Flolay);
    
    //menambahkan lima button ke content pane
    container.add(new JButton("Tombol 1"));
    container.add(new JButton("Tombol 2"));
    container.add(new JButton("Tombol 3"));
    container.add(new JButton("Tombol 4"));
    container.add(new JButton("Tombol 5"));
    
}

        public static void main(String[] args) {
        Flolay jendela = new Flolay();
    jendela.setTitle("Kelas DemoFlowLayout");
    jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jendela.setSize(390, 120);
    jendela.setVisible(true);
    }
}
