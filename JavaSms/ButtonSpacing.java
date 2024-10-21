import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonSpacing {
    public static void main(String[] args) {
        showWindow();
    }

    public static void showWindow() {
        JFrame frame = new JFrame("Usage");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200); // Set the size before centering
        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.setLocationRelativeTo(null); // This centers the frame on the screen

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 50));
        panel.setBackground(new Color(255, 204, 0));
        panel.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
        JLabel text = new JLabel(" 500MB");
        panel.add(text);
        frame.getContentPane().add(panel);

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(100, 50));
        panel1.setBackground(new Color(255, 204, 0));
        panel1.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
        JLabel text1 = new JLabel(" 300MB");
        panel1.add(text1);
        frame.getContentPane().add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setBackground(new Color(255, 204, 0));
        panel2.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
        JLabel text2 = new JLabel(" 500MB");
        panel2.add(text2);
        frame.getContentPane().add(panel2);

        frame.setVisible(true);
    }
}
