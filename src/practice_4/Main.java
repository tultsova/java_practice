package practice_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

    JLabel l1 = new JLabel(), l2 = new JLabel(), l3 = new JLabel();
    int re = 0, mil = 0;

    JButton Re = new JButton("Real Madrid"), Mil = new JButton("AC Milan");
    JPanel[] pnl = new JPanel[3];
    JPanel[] pnl2 = new JPanel[3];

    public void updateScore(){
        l2.setText("Result: " + mil + "X" + re);
    }

    public void updateWinner(){
        if (mil > re){
            l3.setText("Winner: AC Milan");
        } else if (mil == re){
            l3.setText("Winner: DRAW");
        } else {
            l3.setText("Winner: Real Madrid");
        }
    }

    public void updateLast(String last){
        l1.setText("Last Scorer " + last);
    }

    Main(){
        super("Real Madrid vs AC Milan");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(1, 3));

        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[1].setLayout(new GridLayout(3, 1));

        for(int i = 0 ; i < pnl2.length ; i++)
        {
            pnl2[i] = new JPanel();
            pnl[1].add(pnl2[i]);
        }

        updateScore();
        updateWinner();
        l1.setText("Last Scorer:");


        Mil.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                updateScore();
                updateWinner();
                updateLast("AC Milan");
            }
        });

        Re.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                re++;
                updateScore();
                updateWinner();
                updateLast("Real Madrid");
            }
        });

        Mil.setPreferredSize(new Dimension(900, 600));
        l2.setPreferredSize(new Dimension(900, 200));
        Re.setPreferredSize(new Dimension(900, 600));
        l1.setPreferredSize(new Dimension(900, 200));
        l3.setPreferredSize(new Dimension(900, 200));

        l2.setVerticalAlignment(JLabel.CENTER);
        l2.setHorizontalAlignment(JLabel.CENTER);
        l3.setVerticalAlignment(JLabel.CENTER);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setHorizontalAlignment(JLabel.CENTER);

        l2.setForeground(Color.BLACK);
        Re.setForeground(Color.BLACK);
        Mil.setForeground(Color.BLACK);
        l1.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);

        pnl[0].add(Mil);
        pnl[2].add(Re);
        pnl2[0].add(l3);
        pnl2[1].add(l2);
        pnl2[2].add(l1);

        setSize(1200, 640);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
