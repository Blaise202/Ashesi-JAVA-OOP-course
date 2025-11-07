import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Break Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // JLabel with line breaks
        JLabel label = new JLabel("<html><h2 id='heading' style='color: red'>This is the first line.</h2><br>This is the second line.<br>And this is the third line.<button>Click here</button></html>");
        frame.add(label);

        // JButton with line breaks
        JButton button = new JButton("<html>Click</html>");
        frame.add(button);

        frame.setVisible(true);
    }
}