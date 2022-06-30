/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gloria
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menus {
    JFrame myframe= new JFrame("My Frame");
    JPanel myp1= new JPanel(new FlowLayout());
    JPanel myp2= new JPanel(new GridLayout( ));
    JPanel myp3=  new JPanel(new GridLayout());
    JMenuBar mb= new JMenuBar();
    JMenu m1= new JMenu("File");
    JMenu m2= new JMenu("Help");
    JMenuItem i1= new JMenuItem("Open");
    JMenuItem i2= new JMenuItem("Save As");
    JMenuItem i3= new JMenuItem("What do you want from me");
    JTextArea ta= new JTextArea();
    JLabel lbl= new JLabel("Enter text");
    JTextField txt= new JTextField(10);
    JButton b1= new JButton("Send");
    JButton b2= new JButton("Reset");
    
    public void drawAndShowGUI(){
        mb.add(m1);
        mb.add(m2);
        m1.add(i1);
        m1.add(i2);
        m2.add(i3);
        myframe.add(mb);
        myp1.add(mb);
        myp2.add(ta);
        myp3.add(lbl);
        myp3.add(txt);
        myp3.add(b1);
        b1.addActionListener(new Send());
        myp3.add(b2);
        b2.addActionListener( new Reset());
        myframe.add(myp1,BorderLayout.NORTH);
        myframe.add(myp2, BorderLayout.CENTER);
        myframe.add(myp3, BorderLayout.SOUTH);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
        myframe.setLocation(300,200);
        myframe.setSize(450,450);
        
    
    }

    private class Send implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String str= txt.getText();
            ta.setText(str);
        }
        
            }
    private class Reset implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            txt.setText("");
            ta.setText("");
        }
    }
    }
    
    

