package com.company;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private ImageIcon testImage;

    public GamePanel() {

        setBackground(Color.PINK);
        setBounds(250, 250, 100, 100);

    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRect(10, 10, 30, 30);

        testImage = new ImageIcon("src/resources/enemy.png");
        testImage.paintIcon(this, g, 10, 10);


        g.dispose();
    }
}
