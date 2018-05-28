import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CigaretteSmokerGUI extends JFrame implements ActionListener {
    private ImageIcon image1,image2,image3,image4;       //dziadek1, dziadek2, dziadek3, trump
    static JLabel label1, label2, label3, label4;//dziadek1, dziadek2, dziadek3, trump

    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    JButton stop,start;

    CigaretteSmokerGUI(String name){
        super(name);
        JPanel panel = new JPanel();
        this.add(panel);

        if (RIGHT_TO_LEFT) { panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); }
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {c.fill = GridBagConstraints.HORIZONTAL; }

        //--------------------------- Wstawienie obrazka dziadka numer 1 -------------------------------------
        image1 = new ImageIcon(getClass().getResource("/img/Dziadek1/dziadek1_spoczynek.jpg"));
        label1 = new JLabel(image1);
        if (shouldWeightX) { c.weightx = 0.5; }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(label1, c);

        //--------------------------- Wstawienie obrazka dziadka numer 2 -------------------------------------
        image2 = new ImageIcon(getClass().getResource("/img/Dziadek2/dziadek2_spoczynek.jpg"));
        label2 = new JLabel(image2);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(label2, c);

        //--------------------------- Wstawienie obrazka dziadka numer 3 -------------------------------------
        image3 = new ImageIcon(getClass().getResource("/img/Dziadek3/dziadek3_spoczynek.jpg"));
        label3 = new JLabel(image3);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        panel.add(label3, c);

        //-------------------------------- Wstawienie obrazka trumpa -----------------------------------------
        image4 = new ImageIcon(getClass().getResource("/img/Stol/stol.jpg"));
        label4 = new JLabel(image4);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(label4, c);

        //-------------------------------- Wstawienie reszty przycisków -----------------------------------------
        setLayout(new FlowLayout());
        start = new JButton("Start");
        add(start);
        start.addActionListener(this);

        stop = new JButton("Zamknij");
        add(stop);
        stop.addActionListener(this);

        //--------------------------- Ustawienia graficznego interfejsu -----------------------------------------
        setSize(930,715);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch( e.getActionCommand() ) {
            case "Start":
                start.setEnabled(false);
                Table table = new Table();
                new Smoker(1, table).start(); //skladnik 1 to papier
                new Smoker(2, table).start(); //skladnik 2 to tyton
                new Smoker(3, table).start(); //skladnik 3 to zapalki
                new Agent(table).start(); //agent
                break;

            case "Zamknij":
                start.setEnabled(true);
                System.exit(0);
                break;
        }
    }
}