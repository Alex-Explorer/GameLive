package com.company;

import javax.swing.*;

import javafx.embed.swing.JFXPanel;
import javafx.scene.paint.Color;

public class Box extends JFXPanel {

    public Box (int x, int y) {
        super();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);
    }
}