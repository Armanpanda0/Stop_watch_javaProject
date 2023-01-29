package com.practic;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;

    private JLabel clockLevel;

    private Font font=new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("Myclock");
        super.setSize(600,400);
        super.setLocation(300,100);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI(){
        //gui
        heading=new JLabel("Arman's_Clock");

        clockLevel=new JLabel("clock");
        heading.setFont(font);
        clockLevel.setFont(font);



        this.setLayout(new GridLayout(2,1) );

        this.add(heading);
        this.add(clockLevel);

    }
    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //  String dateTime=new Date().toString();
             //   String dateTime=new Date().toLocaleString();
                Date d=new Date();

                SimpleDateFormat sfd=new SimpleDateFormat("hh : mm : ss :a");

                String dateTime=sfd.format(d);

               clockLevel.setText(dateTime);
            }
        });
        timer.start();
    }



}
