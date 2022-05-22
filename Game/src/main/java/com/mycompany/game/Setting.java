package com.mycompany.game;

import javax.swing.*;

public interface Setting {

    final ImageIcon Display = new ImageIcon("src/main/java/img/Land.png");//background
    final ImageIcon Dino1 = new ImageIcon("src/main/java/img/red.png");//tipe dino 1
    final ImageIcon Dino2 = new ImageIcon("src/main/java/img/blue.png");// tipe dino2
    final ImageIcon Dino3 = new ImageIcon("src/main/java/img/yellow.png");// tipe dino3
    final ImageIcon Enemy = new ImageIcon("src/main/java/img/enemy.png");//enemy
    final ImageIcon Spike = new ImageIcon("src/main/java/img/spike.png");//spike
    final ImageIcon Flame = new ImageIcon("src/main/java/img/flame.gif");// thron

    final int PlayerX = 70, PlayerY = 350;
    final int EnemyX = 1800,EnemyY = 150;
    final int SpikeX = 1000, SpikeY = 360;
    final int FlameX = 1500, FlameY = 330;
    final int Enemy_Width = 114,Enemy_Height = 54;
    final int Spike_Width = 140, Spike_Height = 70;
    final int Flame_Width = 70, Flame_Height = 100;

    public void SetComponents();
    public void SetTimer();
    public void SetPositions();
    public void SetScore();
    public void SetHit();
    public void SetGameOver();

}
