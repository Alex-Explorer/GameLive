import javax.swing.*;

public class Window implements Runnable {

    JFrame frame;

    @Override
    public void run() {
        initFrame();
    }

    void initFrame() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(width: 100, height: 200);
    }
}