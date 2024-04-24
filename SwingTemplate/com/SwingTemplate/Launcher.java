package com.SwingTemplate;
import javax.swing.SwingUtilities;
import java.awt.*;
//
public class Launcher {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Template Template1 = new Template();
                Template1.show();
            }
        });

    }
}
