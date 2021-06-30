package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    int count = 0;
    JLabel jlabel;
    JFrame jframe;
    JPanel panel;

    public Main(){
         jframe = new JFrame();
        JButton jbutton = new JButton("Click");
        jbutton.addActionListener(this);
         jlabel = new JLabel("Number of Clicks");

         panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(jbutton);
        panel.add(jlabel);


        jframe.add(panel,BorderLayout.CENTER);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setTitle("Raza GUI");
        jframe.pack();
        jframe.setVisible(true);


    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        jlabel.setText("number of clicks " + count);

    }
}
