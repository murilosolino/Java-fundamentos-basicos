package Cap15;

import java.io.IOException;

import javax.swing.JFrame;

public class JFileChooserTest {
    public static void main(String[] args) throws IOException{
        JFileChooserDemo chooserDemo = new JFileChooserDemo();
        chooserDemo.setSize(400,400);
        chooserDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooserDemo.setVisible(true);

    }
}
