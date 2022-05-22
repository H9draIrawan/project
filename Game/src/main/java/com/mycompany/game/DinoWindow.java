package com.mycompany.game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class DinoWindow extends JFrame implements Setting, KeyListener {

    private Border border = BorderFactory.createLineBorder(Color.black, 3);
    private DinoComponents Player = new DinoComponents(Dino1, PlayerX, PlayerY, 110, 60);
    private DinoComponents Background = new DinoComponents(Display, 0, 0, 1000, 600);
    private DinoComponents TrapSpike = new DinoComponents(Spike, SpikeX, SpikeY, Spike_Width, Spike_Height);
    private DinoComponents Burning = new DinoComponents(Flame, FlameX, FlameY, Flame_Width, Flame_Height);
    private DinoComponents Unit_Enemy = new DinoComponents(Enemy, EnemyX, EnemyY, Enemy_Width, Enemy_Height);
    private DinoComponents BoardScore = new DinoComponents(null, 720, 10, 250, 50);
    private boolean Gameover = false;
    static int point = 0;

    public DinoWindow() {
        this.addKeyListener(this);
        SetComponents();
        SetTimer();
    }

    @Override
    public void SetComponents() {
        this.add(Player);//player
        this.add(Unit_Enemy);// untit enemy
        this.add(TrapSpike);//pasang spike
        this.add(Burning);// pasang thron
        this.add(BoardScore);// status score
        this.add(Background);//background

        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void SetTimer() {

        Timer TimeMove = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getUnit_Enemy().setLocation(getUnit_Enemy().getX() - 10, getUnit_Enemy().getY());
                getTrapThron().setLocation(getTrapThron().getX() - 10, getTrapThron().getY());
                getTrapSpike().setLocation(getTrapSpike().getX() - 10, getTrapSpike().getY());
                SetPositions();
                SetHit();
            }
        });

        Timer TimePoint = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetScore();
            }
        });

        Timer TimeFall = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getPlayer().getY() < 370) {
                    Player.setLocation(Player.getX(), Player.getY() + 1);
                } else if (getPlayer().getY() >= 370) {
                    Player.setLocation(Player.getX(), 370);
                }
                
                if (isGameover()) {
                    TimeMove.stop();
                    TimePoint.stop();
                }
            }
        });
        TimePoint.start();
        TimeMove.start();
        TimeFall.start();

    }

    @Override
    public void SetPositions() {
        if (getTrapSpike().getX() <= -100) {
            getTrapSpike().setLocation(1000, getTrapSpike().getY());
        } else if (getTrapThron().getX() <= -100) {
            getTrapThron().setLocation(1000, getTrapSpike().getY());
        } else if (getUnit_Enemy().getX() <= -100) {
            getUnit_Enemy().setLocation(1000, getUnit_Enemy().getY());
        }
    }

    @Override
    public void SetScore() {
        getBoardScore().setText("SCORE : " + getPoint());
        setPoint(getPoint() + 1);
        getBoardScore().setFont(new Font("Kristen ITC", Font.BOLD, 30));
        getBoardScore().setHorizontalAlignment(JLabel.CENTER);
        getBoardScore().setBackground(Color.white);
        getBoardScore().setBorder(getBorder());
        getBoardScore().setOpaque(true);
    }

    @Override
    public void SetHit() {
        Rectangle playerxy = new Rectangle(getPlayer().getX(), getPlayer().getY(), getPlayer().getWidth(), getPlayer().getHeight());
        Rectangle spikexy = new Rectangle(getTrapSpike().getX(), getTrapSpike().getY(), getTrapSpike().getWidth(), getTrapSpike().getHeight());
        Rectangle flamexy = new Rectangle(getBurning().getX(), getBurning().getY(), getBurning().getWidth(), getBurning().getHeight());
        Rectangle enemyxy = new Rectangle(getUnit_Enemy().getX(), getUnit_Enemy().getY(), getUnit_Enemy().getWidth(), getUnit_Enemy().getHeight());

        if (playerxy.intersects(spikexy)
                || playerxy.intersects(flamexy)
                || playerxy.intersects(enemyxy)) {
            setGameover(true);
            setVisible(false);
            setPoint(0);
            Home home = new Home();
            home.setVisible(true);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && getPlayer().getY() == 370) {
            while (getPlayer().getY() > 100) {
                getPlayer().setLocation(getPlayer().getX(), getPlayer().getY() - 1);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public DinoComponents getPlayer() {
        return Player;
    }

    public void setPlayer(DinoComponents Player) {
        this.Player = Player;
    }

    public DinoComponents isBackground() {
        return Background;
    }

    public void setBackground(DinoComponents Background) {
        this.Background = Background;
    }

    public DinoComponents getTrapSpike() {
        return TrapSpike;
    }

    public void setTrapSpike(DinoComponents TrapSpike) {
        this.TrapSpike = TrapSpike;
    }

    public DinoComponents getTrapThron() {
        return Burning;
    }

    public void setTrapThron(DinoComponents TrapThron) {
        this.Burning = TrapThron;
    }

    public DinoComponents getUnit_Enemy() {
        return Unit_Enemy;
    }

    public void setUnit_Enemy(DinoComponents Unit_Enemy) {
        this.Unit_Enemy = Unit_Enemy;
    }

    public DinoComponents getBoardScore() {
        return BoardScore;
    }

    public void setBoardScore(DinoComponents BoardScore) {
        this.BoardScore = BoardScore;
    }

    public static int getPoint() {
        return point;
    }

    public static void setPoint(int point) {
        DinoWindow.point = point;
    }

    public DinoComponents getBurning() {
        return Burning;
    }

    public void setBurning(DinoComponents Burning) {
        this.Burning = Burning;
    }

    public boolean isGameover() {
        return Gameover;
    }

    public void setGameover(boolean Gameover) {
        this.Gameover = Gameover;
    }

}
