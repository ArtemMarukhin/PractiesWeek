package oopweek.ZooAnimalOOP.swingmouse;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setVisible(true);
        jf.addMouseListener(new SimpleClickListener());
    }
}
