package UAs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UAS {
    private JButton button1;
    private JTextArea textArea1;
    private JLabel lbtotal;
    private JPanel JPanel;
    private JPanel main;

    public JPanel getMain() {
        return main;
    }

    public UAS() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ganjil data = new ganjil();
                textArea1.setText(String.valueOf(data.getBilanganGanjil()));
                lbtotal.setText(data.getTotal());

                System.out.printf("Total : " + data.getBilanganGanjil());
            }
        });
    }

}
