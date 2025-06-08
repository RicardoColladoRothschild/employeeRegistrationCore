package com.employeeData.EmployeeRegistrationSystemCORE.desktopClient.desktopClientViews;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//on this class we will build a view module for registrating using SwingFx as traditional (as use to be done)
public class RegisterView extends JFrame{

        public RegisterView(){
            super("Registration"); // pending, try to use some kind of i18n
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);





            JLabel label_register = new JLabel("Register a new employee");
                    label_register.setBounds(10,10,100,35);
            JTextField text_Field_name = new JTextField();
                    text_Field_name.setBounds(15,60,300,30);

            JButton btn_register = new JButton("Register");
                    btn_register.setBounds(15,95,275,35);
                    btn_register.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            System.out.println("The button was pressed.");
                        }
                    });



            add(label_register);
                    add(text_Field_name);
            add(btn_register);
        }

        public static void main(String[] args){

            RegisterView v = new RegisterView();
            v.setSize(400,400);
            v.setLocationRelativeTo(null);
            v.setVisible(true);
        }
}
