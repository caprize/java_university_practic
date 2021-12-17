package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class NullLayout extends JFrame {
    Integer attempt = 3;
    public NullLayout()
    {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);


        JLabel internet_form = new JLabel("Internet Order");
        internet_form.setBounds(10,50,150,50);
        add(internet_form);
        JLabel restaurant_form = new JLabel("Restaurant Order");
        restaurant_form.setBounds(850,50,150,50);
        add(restaurant_form);

        DishType[] dishType1 = DishType.values();
        JComboBox dishTypes1 = new JComboBox(dishType1);
        dishTypes1.setBounds(10,120,100,40);
        add(dishTypes1);
        JTextField infoDish1 = new JTextField("Enter info");
        infoDish1.setBounds(10,170,100,40);
        add(infoDish1);
        JTextField costDish1 = new JTextField("Enter cost");
        costDish1.setBounds(10,220,100,40);
        add(costDish1);
        JButton dishBut1 = new JButton("Add");
        dishBut1.setBounds(10,270,100,40);
        add(dishBut1);


        DrinkType[] drinkType1 = DrinkType.values();
        JComboBox drinkTypes1 = new JComboBox(drinkType1);
        drinkTypes1.setBounds(120,120,100,40);
        add(drinkTypes1);
        JTextField infoDrink1 = new JTextField("Enter info");
        infoDrink1.setBounds(120,170,100,40);
        add(infoDrink1);
        JTextField costDrink1 = new JTextField("Enter cost");
        costDrink1.setBounds(120,220,100,40);
        add(costDrink1);
        JButton drinkBut1 = new JButton("Add");
        drinkBut1.setBounds(120,270,100,40);
        add(drinkBut1);

        JButton order1 = new JButton("Order");
        order1.setBounds(60,320,100,40);
        add(order1);


        DishType[] dishType2 = DishType.values();
        JComboBox dishTypes2 = new JComboBox(dishType2);
        dishTypes2.setBounds(760,120,100,40);
        add(dishTypes2);
        JTextField infoDish2 = new JTextField("Enter info");
        infoDish2.setBounds(760,170,100,40);
        add(infoDish2);
        JTextField costDish2 = new JTextField("Enter cost");
        costDish2.setBounds(760,220,100,40);
        add(costDish2);
        JButton dishBut2 = new JButton("Add");
        dishBut2.setBounds(760,270,100,40);
        add(dishBut2);


        DrinkType[] drinkType2 = DrinkType.values();
        JComboBox drinkTypes2 = new JComboBox(drinkType2);
        drinkTypes2.setBounds(870,120,100,40);
        add(drinkTypes2);
        JTextField infoDrink2 = new JTextField("Enter info");
        infoDrink2.setBounds(870,170,100,40);
        add(infoDrink2);
        JTextField costDrink2 = new JTextField("Enter cost");
        costDrink2.setBounds(870,220,100,40);
        add(costDrink2);
        JButton drinkBut2 = new JButton("Add");
        drinkBut2.setBounds(870,270,100,40);
        add(drinkBut2);

        JButton order2 = new JButton("Order");
        order2.setBounds(810,320,100,40);
        add(order2);

        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        Customer customer = new Customer("Alex","Ivanov",10,new Address("kazan",20,"Fuchik",12,'a',32));
        InternetOrder internetOrder = new InternetOrder(10,customer);
        ArrayList<JTextField> arr = new ArrayList<>();
        ArrayList<JButton> delarr = new ArrayList<>();
        JTextField tempCost1 = new JTextField();
        dishBut1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                DishType type = (DishType)dishTypes1.getSelectedItem();
                String info = infoDish1.getText();
                try{
                    Integer cost = Integer.parseInt(costDish1.getText());
                    Dish dish = new Dish(cost,info,type);
                    internetOrder.addItem(dish);
                    JOptionPane.showMessageDialog(dishBut1, "Dish Added");
                    JTextField item = new JTextField(type.toString()+" "+cost.toString());
                    item.setBounds(10,330+internetOrder.getNumber()*50,200,40);
                    add(item);
                    arr.add(item);
                    tempCost1.setText("Total cost: " + internetOrder.getOrderCost().toString());
                    tempCost1.setBounds(10,330+(internetOrder.getNumber()+1)*50,200,40);
                    add(tempCost1);
                    JButton delDish1 = new JButton("Del "+type.toString());
                    delDish1.setBounds(230,330+internetOrder.getNumber()*50,100,40);
                    add(delDish1);
                    delarr.add(delDish1);
                    delDish1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String name = delDish1.getText().substring(4,delDish1.getText().length());
                            JTextField text = new JTextField();
                            int g = 0;
                            for (JTextField i: arr){
                                if (i.getText().split(" ")[0].equals(name)){
                                    System.out.println(i.getText().split(" ")[0]);
                                    text = i;
                                    remove(i);
                                    break;
                                }
                            }
                            arr.remove(text);
                            internetOrder.delItem(name);
                            System.out.println(internetOrder.getOrderCost().toString());
                            remove(tempCost1);
                            tempCost1.setText("Total cost: " + internetOrder.getOrderCost().toString());
//                            tempCost.setBounds(10,330+(internetOrder.getNumber()+1)*50,200,40);
                            remove(delDish1);
                            validate();
                            repaint();
                        }
                    });
                } catch (NumberFormatException err){
                JOptionPane.showMessageDialog(dishBut1, "Cost must be Integer");
                }

            }
        });
        drinkBut1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                DrinkType type = (DrinkType) drinkTypes1.getSelectedItem();
                String info = infoDrink1.getText();
                try{
                    Integer cost = Integer.parseInt(costDrink1.getText());
                    Drink drink = new Drink(cost,info,type);
                    if (internetOrder.getCustomer().getAge()<18 && drink.alcoholPrecent>0){
                        JOptionPane.showMessageDialog(drinkBut1, "Drink can't be added");
                    }
                    else {
                        internetOrder.addItem(drink);
                        JOptionPane.showMessageDialog(drinkBut1, "Drink Added");
                        JTextField item = new JTextField(type.toString() + " " + cost.toString());
                        item.setBounds(10, 330 + internetOrder.getNumber() * 50, 200, 40);
                        add(item);
                        arr.add(item);
                        tempCost1.setText("Total cost: " + internetOrder.getOrderCost().toString());
                        tempCost1.setBounds(10, 330 + (internetOrder.getNumber() + 1) * 50, 200, 40);
                        add(tempCost1);
                        JButton delDish1 = new JButton("Del " + type.toString());
                        delDish1.setBounds(230, 330 + internetOrder.getNumber() * 50, 100, 40);
                        add(delDish1);
                        delarr.add(delDish1);
                        delDish1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String name = delDish1.getText().substring(4, delDish1.getText().length());
                                JTextField text = new JTextField();
                                int g = 0;
                                for (JTextField i : arr) {
                                    if (i.getText().split(" ")[0].equals(name)) {
                                        System.out.println(i.getText().split(" ")[0]);
                                        text = i;
                                        remove(i);
                                        break;
                                    }
                                }
                                arr.remove(text);
                                internetOrder.delItem(name);
                                System.out.println(internetOrder.getOrderCost().toString());
                                remove(tempCost1);
                                tempCost1.setText("Total cost: " + internetOrder.getOrderCost().toString());
//                            tempCost.setBounds(10,330+(internetOrder.getNumber()+1)*50,200,40);
                                remove(delDish1);
                                validate();
                                repaint();
                            }
                        });
                    }
                    } catch (NumberFormatException err){
                        JOptionPane.showMessageDialog(drinkBut1, "Cost must be Integer");
                    }


            }
        });
        order1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (internetOrder.size==0) JOptionPane.showMessageDialog(order1, "Order is Empty");
                else {
                    internetOrdersManager.add(internetOrder);
                    for (JTextField i:arr){
                        remove(i);
                    }
                    arr.clear();
                    for (JButton i:delarr){
                        remove(i);
                    }
                    delarr.clear();
                    remove(tempCost1);
                    Random rand = new Random();
                    int randn = rand.nextInt(50);
                    JOptionPane.showMessageDialog(order1, "Order Added, your order number: "+randn);
                    internetOrder.delAll();
                    validate();
                    repaint();
                }
            }
        });
        ArrayList<JTextField> arr2 = new ArrayList<>();
        TablesOrderManager tablesOrderManager = new TablesOrderManager();
        Customer customer2 = new Customer("Bob","Ivanov",23,new Address("kazan",20,"Fuchik",12,'a',32));
        TableOrder tableOrder = new TableOrder(customer2);
        ArrayList<JButton> delarr1 = new ArrayList<>();
        JTextField tempCost2 = new JTextField();
        dishBut2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                DishType type = (DishType)dishTypes2.getSelectedItem();
                String info = infoDish2.getText();
                try {
                    Integer cost = Integer.parseInt(costDish2.getText());
                    Dish dish = new Dish(cost,info,type);
                    tableOrder.addItem(dish);
                    JOptionPane.showMessageDialog(dishBut2, "Dish Added");
                    JTextField item = new JTextField(type.toString()+" "+cost.toString());
                    item.setBounds(760,330+tableOrder.getNumber()*50,200,40);
                    add(item);
                    arr2.add(item);
                    tempCost2.setText("Total cost: " + tableOrder.getOrderCost().toString());
                    tempCost2.setBounds(760,330+(tableOrder.getNumber()+1)*50,200,40);
                    add(tempCost2);
                    JButton delDish1 = new JButton("Del "+type.toString());
                    delDish1.setBounds(960,330+tableOrder.getNumber()*50,100,40);
                    add(delDish1);
                    delarr1.add(delDish1);
                    delDish1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String name = delDish1.getText().substring(4,delDish1.getText().length());
                            JTextField text = new JTextField();
                            int g = 0;
                            for (JTextField i: arr2){
                                if (i.getText().split(" ")[0].equals(name)){
                                    System.out.println(i.getText().split(" ")[0]);
                                    text = i;
                                    remove(i);
                                    break;
                                }
                            }
                            arr2.remove(text);
                            tableOrder.delItem(name);
                            remove(tempCost2);
                            tempCost2.setText("Total cost: " + tableOrder.getOrderCost().toString());
                            remove(delDish1);
                            validate();
                            repaint();
                        }
                    });
                }  catch (NumberFormatException err){
                    JOptionPane.showMessageDialog(dishBut2, "Cost must be Integer");
                }

            }
        });
        drinkBut2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                DrinkType type = (DrinkType) drinkTypes2.getSelectedItem();
                String info = infoDrink2.getText();
                try {
                    Integer cost = Integer.parseInt(costDrink2.getText());
                    Drink drink = new Drink(cost,info,type);
                    if (tableOrder.getCustomer().getAge()<18 && drink.alcoholPrecent>0){
                        JOptionPane.showMessageDialog(drinkBut2, "Drink can't be added");
                    }
                    else {
                        tableOrder.addItem(drink);
                        JOptionPane.showMessageDialog(drinkBut2, "Drink Added");
                        JTextField item = new JTextField(type.toString() + " " + cost.toString());
                        item.setBounds(760, 330 + tableOrder.getNumber() * 50, 200, 40);
                        add(item);
                        arr2.add(item);
                        tempCost2.setText("Total cost: " + tableOrder.getOrderCost().toString());
                        tempCost2.setBounds(760, 330 + (tableOrder.getNumber() + 1) * 50, 200, 40);
                        add(tempCost2);
                        JButton delDish1 = new JButton("Del " + type.toString());
                        delDish1.setBounds(960, 330 + tableOrder.getNumber() * 50, 100, 40);
                        add(delDish1);
                        delarr1.add(delDish1);
                        delDish1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String name = delDish1.getText().substring(4, delDish1.getText().length());
                                JTextField text = new JTextField();
                                int g = 0;
                                for (JTextField i : arr2) {
                                    if (i.getText().split(" ")[0].equals(name)) {
                                        System.out.println(i.getText().split(" ")[0]);
                                        text = i;
                                        remove(i);
                                        break;
                                    }
                                }
                                arr2.remove(text);
                                tableOrder.delItem(name);

                                remove(tempCost2);
                                tempCost2.setText("Total cost: " + tableOrder.getOrderCost().toString());
//                            tempCost.setBounds(10,330+(internetOrder.getNumber()+1)*50,200,40);
                                remove(delDish1);
                                validate();
                                repaint();
                            }
                        });
                    }
                } catch (NumberFormatException err){
                    JOptionPane.showMessageDialog(drinkBut2, "Cost must be Integer");
                }
            }
        });
        order2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                if (tableOrder.getNumber()==0) JOptionPane.showMessageDialog(order2, "Order is Empty");
                else {
                    Integer table = tablesOrderManager.freeTableNumber();
                    for (JTextField i:arr2){
                        remove(i);
                    }
                    arr2.clear();
                    for (JButton i:delarr1){
                        remove(i);
                    }
                    delarr1.clear();
                    remove(tempCost2);
                    if (table !=0) {
                        tablesOrderManager.add(tableOrder,table );
                        JOptionPane.showMessageDialog(order2, "Order Added, your table: " + table);
                        tableOrder.delAll();
                        validate();
                        repaint();
                    }
                    else{
                        JOptionPane.showMessageDialog(order2, "We don't have free tables");
                        tableOrder.delAll();
                        validate();
                        repaint();
                    }
                }
            }
        });
        dispose();
        setVisible(true);
        setSize(1000,1000);
    }
}
