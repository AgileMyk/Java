package com.firstJavaSwing;

import javax.swing.*;

public class MainWindow {
    private JFrame window;
    JFrame frame = new JFrame("JFrame Demo");
    public MainWindow() {
        window = new JFrame();
        window.setTitle("My first JFrame");
        //ensures window closes - when this is not set, x-ing out hides the window, it does not close it
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set size
        window.setSize(800, 500);
        //center window on the screen - setting to null centers on the screen
        window.setLocationRelativeTo(null);
    }
    public void show() {
        //show window
        window.setVisible(true);
    }
}
