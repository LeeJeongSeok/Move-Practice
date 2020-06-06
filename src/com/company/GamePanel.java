package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {

    private ImageIcon testImage;
    private int moveX = 100;
    private int moveY = 100;

    public GamePanel() {

        addKeyListener(this);
        setSize(500, 500);
        setFocusable(true);
    }

    public void paint(Graphics g) {
//        g.setColor(Color.WHITE);
//        g.drawRect(10, 10, 30, 30);

        setBackground(Color.pink);
        testImage = new ImageIcon("src/resources/enemy.png");
        testImage.paintIcon(this, g, moveX, moveY);
//        testImage.paintIcon(this, g, 125, 10);
//        testImage.paintIcon(this, g, 150, 10);


        g.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == 39) {
            moveX += 10;
            repaint();
        }

        if (e.getKeyCode() == 38) {
            moveY -= 10;
            repaint();
        }

        if (e.getKeyCode() == 40) {
            moveY += 10;
            repaint();
        }

        if (e.getKeyCode() == 37) {
            moveX -= 10;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
