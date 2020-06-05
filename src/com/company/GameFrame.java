package com.company;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        setSize(500, 500);
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new GamePanel());

        setVisible(true);
    }
}
