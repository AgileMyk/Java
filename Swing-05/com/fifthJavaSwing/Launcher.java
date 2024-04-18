package com.fifthJavaSwing;
import javax.swing.SwingUtilities;
public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainGridFrame gridFrame = new MainGridFrame();
                gridFrame.show();
            }
        });
    }
}
