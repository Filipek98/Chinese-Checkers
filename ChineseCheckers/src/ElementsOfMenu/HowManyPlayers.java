package ElementsOfMenu;

import javax.swing.*;
import java.awt.*;

public class HowManyPlayers extends JFrame {
    private JPanel howMany;
    private JButton two, three, four, six;
    Color cButtons = new Color(101, 17, 17);

    public HowManyPlayers() {
        super("How many players?");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(3);
        setBounds(200, 200, 300, 500);

        howMany = new JPanel(new GridLayout(4, 1));
        add(howMany);

        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        six = new JButton("6");

        two.setBackground(cButtons);
        three.setBackground(cButtons);
        four.setBackground(cButtons);
        six.setBackground(cButtons);

        two.setForeground(Color.BLACK);
        three.setForeground(Color.BLACK);
        four.setForeground(Color.BLACK);
        six.setForeground(Color.BLACK);

        howMany.add(two);
        howMany.add(three);
        howMany.add(four);
        howMany.add(six);
    }
}