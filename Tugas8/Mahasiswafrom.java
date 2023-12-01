package Tugas8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswafrom extends JFrame{
    private JPanel panelMain;
    private JTextField textFieldNama;
    private JTextField textFieldAlamat;
    private JComboBox comboBoxTanggal;
    private JComboBox comboBoxBulan;
    private JComboBox comboBoxTahun;
    private JLabel nama;
    private JButton PROSESButton;
    private JTextArea textArea1Nama;
    private JTextArea textArea2TanggalLahir;
    private JTextArea textArea3Usia;
    private JTextArea textArea4Alamat;

    public Mahasiswafrom() {
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        PROSESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                int tlTanggal = Integer.parseInt ((String) comboBoxTanggal.getSelectedItem());
                int tlBulan = comboBoxBulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) comboBoxTahun.getSelectedItem());
                String alamat = textFieldAlamat.getText();


                textArea1Nama.setText("Nama              :" + " " + nama);
                textArea2TanggalLahir.setText("Tanggal Lahir           :" + " " + tlTanggal + " " +comboBoxBulan.getSelectedItem() + " " + tlTahun);
                textArea4Alamat.setText("Alamat              :" + " " + alamat);

                LocalDate birthdate = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                LocalDate currentDate = LocalDate.now();
                Period period = Period.between(birthdate, currentDate);

                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();

                textArea3Usia.setText("Usia          :" + " " + years + " tahun, " + months + " bulan, " + days + " hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswafrom mahasiswafrom= new Mahasiswafrom();
        mahasiswafrom.setVisible(true);
    }

}

