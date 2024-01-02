package UAs;

import javax.swing.*;

public class RunUAs {
    public static void main(String[] args) {
        JFrame data = new JFrame("FORM BILANGAN GANJIL");
        data.setContentPane(new UAS().getMain());
        data.setSize(800, 600);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }
}
