//this (JFrameOne Approach) is an example of a less ideal way to create a JFrame
// see comments in JFrameDemo2.java

package com.secondJavaSwing;
import javax.swing.JFrame;
public class JFrameOne extends JFrame {
    public JFrameOne() {
        initialize();
    }

    public void initialize() {
    //used to build JFrame
        setTitle("JFrameOne");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
