import javax.swing.*;
import java.awt.*;
import java.util.*;
public class toDoLauncher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainToDoJFrame MainFrameOne = new MainToDoJFrame();
                MainFrameOne.initialize();
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (InstantiationException e) {
                            throw new RuntimeException(e);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (UnsupportedLookAndFeelException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    }
                }
                //ToDo ToDo = new ToDo();
                //ToDo.initialize();
            }
        });
    }

}
