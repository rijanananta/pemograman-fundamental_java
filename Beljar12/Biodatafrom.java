
package Beljar12;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;


public class Biodatafrom extends JFrame {
    private JPanel PanelMain;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextArea textArea1Nama;
    private JTextArea textArea2TanggalLahir;
    private JTextArea textArea3Alamat;
    private JTextArea textArea4Usia;
    private JButton prosesButton;
    public Biodatafrom() {
        this.setContentPane(PanelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        prosesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                int tlTanggal = Integer.parseInt ((String) comboBox1.getSelectedItem());
                int tlBulan = comboBox3.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) comboBox2.getSelectedItem());
                String alamat = textField2.getText();


                textArea1Nama.setText("Nama              :" + " " + nama);
                textArea2TanggalLahir.setText("Tanggal Lahir           :" + " " + tlTanggal + " " +comboBox3.getSelectedItem() + " " + tlTahun);
                textArea3Alamat.setText("Alamat              :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                textArea4Usia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

}
