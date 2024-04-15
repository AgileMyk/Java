package com.secondJavaSwing;
// this is the more ideal way to create a JFrame class
import javax.swing.JFrame;
public class JFrameTwo {
    //instead of extending from JFrame class, instantiate a private frame class
    private JFrame frame;
    public JFrameTwo() {
        initalize();
    }

    public void initalize() {
        frame = new JFrame();
        //this must be executed by referencing the private instance variable and then
        //performing the methods on that instance
        this.frame.setTitle("JFrameTwo");
        this.frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setVisible(true);
        this.frame.setResizable(false);
        this.frame.setLocationRelativeTo(null);
    }
}
