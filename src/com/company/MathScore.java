package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import java.util.regex.Matcher;

import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.CL;

public class MathScore extends JFrame {
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    int real=0;
    int milan=0;
    JButton but1 = new JButton("Real Madrid");
    JButton but2 = new JButton("Milan");
    JPanel center = new JPanel();
    JLabel score = new JLabel("Result: 0X0");
    JLabel last_goal = new JLabel("Last Scorer: ");
    Label result = new Label("Winner: DRAW");


    public MathScore()
    {
        setLayout(null);
        this.setDefaultCloseOperation(CLOSE_ON_EXIT);
//        center.setBounds(0,0,200,600);
//        center.setBackground(Color.BLACK);
//        add(center);

        but2.setBounds(600,0,200,600);
        but1.setBounds(0,0,200,600);
        add(but1);
        add(but2);


        score.setBounds(350,0,600,100);
        add(score);
        last_goal.setBounds(348,100,600,100);
        add(last_goal);
        result.setBounds(350,400,300,100);
        add(result);

        ActionListener actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real++;
                score.setText("Result: "+real+"X"+milan);
                last_goal.setText("Last scorer is: Real madrid" );
                if (real>milan){
                    result.setText("Winner: Real Madrid");
                }
                else if(real<milan){
                    result.setText("Winner: Milan");
                }
                else result.setText("Winner: DRAW");
            }
        };
        but1.addActionListener(actionListener1);

        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                score.setText("Result: "+real+"X"+milan);
                last_goal.setText("Last scorer is: Milan" );
                if (real>milan){
                    result.setText("Winner: Real Madrid");
                }
                else if(real<milan){
                    result.setText("Winner: Milan");
                }
                else result.setText("Winner: DRAW");
            }
        };
        but2.addActionListener(actionListener2);
        setSize(800,600);

    }

}
