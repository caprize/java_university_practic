package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class NullLayout extends JFrame {
    Integer ans = (int) (Math.random()*10000%20);
    Integer attempt = 3;
    JButton but1 = new JButton("1");
    JButton but2 = new JButton("2");
    JButton but3 = new JButton("3");
    JButton but4 = new JButton("4");
    JButton but5 = new JButton("5");
    JButton but6 = new JButton("6");
    JButton but7 = new JButton("7");
    JButton but8 = new JButton("8");
    JButton but9 = new JButton("9");
    JButton but10 = new JButton("10");
    JButton but11 = new JButton("11");
    JButton but12 = new JButton("12");
    JButton but13 = new JButton("13");
    JButton but14 = new JButton("14");
    JButton but15 = new JButton("15");
    JButton but16 = new JButton("16");
    JButton but17 = new JButton("17");
    JButton but18 = new JButton("18");
    JButton but19 = new JButton("19");
    JButton but20 = new JButton("20");
    public NullLayout()
    {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        System.out.println(ans);


        JLabel succes = new JLabel("Start the game!");
        succes.setBounds(450,150,150,50);
        add(succes);
        JLabel attempts = new JLabel("Left attempts: "+attempt.toString());
        attempts.setBounds(0,150,150,50);
        add(attempts);

        JTextArea guess = new JTextArea("Enter number");
        guess.setBounds(450,500,100,40);
        JButton button = new JButton("Guess");
        button.setBounds(450,600,100,40);
        add(guess);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (guess.getText().equals(ans.toString())){
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if(attempt!=1){
                    String temp="";
                    byte b =0;
                    b = Byte.parseByte(guess.getText());
                    int a = (int)b;
                    System.out.println(a);
                    if (a<attempt) temp+="Number lower ";
                    else temp+="Number higher ";
                    JOptionPane.showMessageDialog(button,"Wrong answer, "+temp+ attempt+ " atempts left");
                    attempt--;
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    dispose();
                }
            }
        });

        but1.setBounds(0,0,100,40);
        but2.setBounds(100,0,100,40);
        but3.setBounds(200,0,100,40);
        but4.setBounds(300,0,100,40);
        but5.setBounds(400,0,100,40);
        but6.setBounds(500,0,100,40);
        but7.setBounds(600,0,100,40);
        but8.setBounds(700,0,100,40);
        but9.setBounds(800,0,100,40);
        but10.setBounds(900,0,100,40);
        but11.setBounds(0,300,100,40);
        but12.setBounds(100,300,100,40);
        but13.setBounds(200,300,100,40);
        but14.setBounds(300,300,100,40);
        but15.setBounds(400,300,100,40);
        but16.setBounds(500,300,100,40);
        but17.setBounds(600,300,100,40);
        but18.setBounds(700,300,100,40);
        but19.setBounds(800,300,100,40);
        but20.setBounds(900,300,100,40);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==1) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    dispose();
                }
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==2) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==3) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==4) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==5) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==6) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==7) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==8) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==9) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==10) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==11) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==12) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==13) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==14) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==15) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==16) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==17) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==18) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==19) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });
        but20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ans==20) {
                    JOptionPane.showMessageDialog(but1,"Good Job! You Won!");
                    dispose();
                }
                else if (attempt!=1){
                    attempt--;
                    attempts.setText("Left attempts: "+attempt.toString());
                    succes.setText("Wrong ^_^");
                }
                else{
                    JOptionPane.showMessageDialog(but1,"YOU LOST");
                    succes.setText("YOU LOST");
                    dispose();
                }
            }
        });


        add(but1);
        add(but2);
        add(but3);
        add(but4);
        add(but5);
        add(but6);
        add(but7);
        add(but8);
        add(but9);
        add(but10);
        add(but11);
        add(but12);
        add(but13);
        add(but14);
        add(but15);
        add(but16);
        add(but17);
        add(but18);
        add(but19);
        add(but20);
        setVisible(true);
        setSize(1000,1000);
    }
}
