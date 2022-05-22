package com.mycompany.game;

import javax.swing.*;

public class DinoComponents extends JLabel {

    public DinoComponents(ImageIcon img, int x, int y, int width, int height) {
        this.setIcon(img);
        this.setBounds(x, y, width, height);
    }

}
