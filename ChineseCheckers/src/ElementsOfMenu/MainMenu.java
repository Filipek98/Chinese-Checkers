package ElementsOfMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainMenu extends JFrame implements ActionListener {

    private JPanel menu;
    private JButton startGame, howToPlay, exit;
    private JLabel background;
    Color cButtons=new Color(101,17,17);

    public MainMenu(){
        super("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200,200,513,389);
        setResizable(false);

        menu=new JPanel();//(new GridLayout(3,1));
        add(menu);
        setLayout(new BorderLayout());
        background=new JLabel(new ImageIcon("C:\\Users\\fkula\\IdeaProjects\\ChineseCheks\\img\\chinesee.jpg"));
        background.setLayout(new FlowLayout());
        add(background);


        background.setLayout(null);
        startGame=new JButton("Start Game");
        howToPlay=new JButton("How to play");
        exit=new JButton("Exit");
        startGame.setBackground(cButtons);
        howToPlay.setBackground(cButtons);
        exit.setBackground(cButtons);
        startGame.setForeground(Color.BLACK);
        howToPlay.setForeground(Color.BLACK);
        exit.setForeground(Color.BLACK);

        startGame.setBounds(20,100,100,40);
        howToPlay.setBounds(350,150,100,40);
        exit.setBounds(195,303,100,40);

        background.add(startGame);
        background.add(howToPlay);
        background.add(exit);

        startGame.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==startGame){
            setVisible(false);
            HowManyPlayers number=new HowManyPlayers();

        }
    }
}
