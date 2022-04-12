package com.geekbrains.HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork8 extends JFrame {
    private int value;
    private JLabel infoLabel;

    public HomeWork8() {
        setTitle("My Window");
        setBounds(400, 400, 500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        infoLabel = new JLabel();
        add(infoLabel, BorderLayout.NORTH);


        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);

        //buttons >> <<
        JButton decrementButton2 = new JButton("<<");
        decrementButton2.setFont(font);

        JButton incrementButton2 = new JButton(">>");
        incrementButton2.setFont(font);

        //button "reset"
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(font);
        add(resetButton, BorderLayout.SOUTH);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        decrementButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                label.setText(String.valueOf(value));
            }
        });


        JPanel grid = new JPanel(new GridLayout(1, 2, 5, 10));
        grid.add(decrementButton2);
        grid.add(decrementButton);
        add(grid, BorderLayout.WEST);

        JPanel grid2 = new JPanel(new GridLayout(1, 2, 5, 10));
        grid2.add(incrementButton);
        grid2.add(incrementButton2);
        add(grid2, BorderLayout.EAST);


        setVisible(true);
    }

    private void validateRange() {
        if (Math.abs(value) > 100) {
            infoLabel.setText("value out of range");
        } else {
            infoLabel.setText("");
        }

    }

    public static void main(String[] args) {
        new HomeWork8();
    }
}
