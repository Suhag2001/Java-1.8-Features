package org.example.lamda_function.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        //window : onject JFrame
        JFrame frame= new JFrame("my Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        //create button and add iframe

        JButton button  = new JButton("Click me !");
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Click !");
//                JOptionPane.showMessageDialog(null,"Hey button clicked");
//            }
//        });

        // or by using lambda expression
        button.addActionListener((e)-> {
            System.out.println("Button click");
            JOptionPane.showMessageDialog(null,"Hey button clicked");
        });
        frame.add(button);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
