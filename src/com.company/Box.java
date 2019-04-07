package com.company;

import javax.swing.*;
import java.awt.*;

import javafx.embed.swing.JFXPanel;
import javafx.scene.paint.Color;

public class Box extends JPanel {

    Cell cell;

    public Box (int x, int y) {
        super();
        cell = new Cell();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Color.BLUE);
    }

    public innitCells(int x, int y) 
    {
        
    }
}