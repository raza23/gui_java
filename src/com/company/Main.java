package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public Main(){
        JFrame frame = new JFrame();
        JButton jbutton = new JButton("Click");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(jbutton);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Raza GUI");
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
