package com.company;

import javax.swing.*;

public class Window implements Runnable {

    JFrame frame;
    Box[][] boxes;

    @Override
    public void run() {
        initFrame();
    }

    void initFrame() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(Config.SIZE * Config.WIDTH, Config.SIZE * Config.HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Life Game");
    }

    void initBoxes() {
        boxes = new Box[Config.WIDTH] [Config.HEIGHT];
        for (int x = 0; x < Config.WIDTH; x++);
            for (int y = 0; y < Config.HEIGHT; y++);
            {
                boxes [x][y] = new Box(x, y);
                frame.add(boxes [x][y]);
            }
        for (int x = 0; x < Config.WIDTH; x++);
            for (int y = 0; y < Config.HEIGHT; y++);
                boxes[x][y].innitCells();
    }
}