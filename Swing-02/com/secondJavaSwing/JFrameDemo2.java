package com.secondJavaSwing;
import javax.swing.*;

public class JFrameDemo2 {
    public static void main(String[] args) {
        //Run this program on the Even Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameOne frame1 = new JFrameOne();
                // through extending JFrameOne out of JFrame class, we have
                //'exposed' our JFrameOne to the world through allowing it
                // access to all of the methods of JFrame
                // in most cases, you do not want this - but instead you want
                // to create 'a small focused API' that does only those things
                // you want the JFrame to do

                JFrameTwo Frame2 = new JFrameTwo();
            }

        });
    }

}
