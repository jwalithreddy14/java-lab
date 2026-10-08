import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight extends JFrame implements ActionListener {

    JRadioButton red, yellow, green;
    JLabel message;

    TrafficLight() {
        setTitle("Traffic Light Simulation");
        setLayout(new BorderLayout());

        message = new JLabel("", SwingConstants.CENTER);
        message.setFont(new Font("Arial", Font.BOLD, 24));
        add(message, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        panel.add(red);
        panel.add(yellow);
        panel.add(green);

        add(panel, BorderLayout.SOUTH);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            message.setText("STOP");
            message.setForeground(Color.RED);
        } 
        else if (e.getSource() == yellow) {
            message.setText("READY");
            message.setForeground(Color.ORANGE);
        } 
        else if (e.getSource() == green) {
            message.setText("GO");
            message.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
