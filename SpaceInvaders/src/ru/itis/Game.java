package ru.itis;

import java.awt.Canvas;
import java.awt.image.BufferStrategy;
import javax.swing.*;
import java.awt.*;

public class Game extends Canvas{
    private BufferStrategy strategy;

    public Game() {
        JFrame container = new JFrame("Space Invaders");
        JPanel panel = (JPanel) container.getContentPane();
        panel.setPreferredSize(new Dimension(800,600));
        panel.setLayout(null);
        setBounds(0,0,800,600);
        panel.add(this);
        setIgnoreRepaint(true);
        container.pack();
        container.setResizable(false);
        container.setVisible(true);
        createBufferStrategy(2);
        strategy = getBufferStrategy();
    }
}
