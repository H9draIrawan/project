package com.mycompany.game;

import java.util.ArrayList;
import javax.swing.*;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.background.setIcon(new ImageIcon("src/main/java/img/dino.gif"));
        this.setSize(650, 395);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        highscore = new javax.swing.JButton();
        play = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setSize(new java.awt.Dimension(640, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Papyrus", 1, 48)); // NOI18N
        title.setForeground(java.awt.Color.orange);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Dino Run");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 640, 60));

        exit.setBackground(java.awt.Color.orange);
        exit.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        exit.setText("Exit");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 120, 60));

        highscore.setBackground(java.awt.Color.orange);
        highscore.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        highscore.setText("Highscore");
        highscore.setBorder(null);
        highscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highscoreActionPerformed(evt);
            }
        });
        getContentPane().add(highscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 320, 70));

        play.setBackground(java.awt.Color.orange);
        play.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        play.setText("Play");
        play.setBorder(null);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 140, 60));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        this.setVisible(false);
        DinoWindow frame = new DinoWindow();
        frame.setVisible(true);
    }//GEN-LAST:event_playActionPerformed

    private void highscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highscoreActionPerformed
        this.setVisible(false);
        new Score().setVisible(true);

    }//GEN-LAST:event_highscoreActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        Highscore<String, Integer> Leaderboard[] = new Highscore[10];
        for (int i = 0; i < Leaderboard.length; i++) {
            Leaderboard[i] = new Highscore<>(" ",0);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JButton highscore;
    private javax.swing.JButton play;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
