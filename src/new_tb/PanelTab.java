/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_tb;

import java.awt.AWTEventMulticaster;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Azure
 */
public class PanelTab extends JFrame implements ActionListener {

    int a;

    int baik = 0, buruk = 0;
    String IDruang;
    String field1, field2, field3, field4, field5;
    String separator = "----------------\n";
    String text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text32, text33, text34, text35, text36, text37, text38, text39, text40;
    JTabbedPane tabpane;
    JLabel nilaiudara, label1, label2, label3, label4, label5, label6, label7, label8, label9,
            label10, label11, label12, label13, label14, label15, label16, label17, label18, label19,
            label20, label21, label22, label23, label24, label25, label26,
            label27, label28, label29, label30, label31, label32, label33, label34, label35, label36, label37, label38, label39, label40, label41, label42, label43, label44, label45, label46, label47;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
    //JButton button;

    ButtonGroup pilihan1 = new ButtonGroup();
    ButtonGroup pilihan2 = new ButtonGroup();
    ButtonGroup pilihan3 = new ButtonGroup();
    ButtonGroup pilihan4 = new ButtonGroup();
    ButtonGroup pilihan5 = new ButtonGroup();
    ButtonGroup pilihan6 = new ButtonGroup();
    ButtonGroup pilihan7 = new ButtonGroup();
    ButtonGroup pilihan8 = new ButtonGroup();
    ButtonGroup pilihan9 = new ButtonGroup();
    ButtonGroup pilihan10 = new ButtonGroup();
    ButtonGroup pilihan11 = new ButtonGroup();
    ButtonGroup pilihan12 = new ButtonGroup();
    ButtonGroup pilihan13 = new ButtonGroup();
    ButtonGroup pilihan14 = new ButtonGroup();

    JTextArea message1 = new JTextArea();
    JTextArea message2 = new JTextArea();
    JTextArea message3 = new JTextArea();
    JTextArea message4 = new JTextArea();
    JTextArea message5 = new JTextArea();
    JTextArea message6 = new JTextArea();
    JTextArea message7 = new JTextArea();
    
    

    JScrollPane messageScrollPane1 = new JScrollPane(message1);
    JScrollPane messageScrollPane2 = new JScrollPane(message2);
    JScrollPane messageScrollPane3 = new JScrollPane();
    JScrollPane messageScrollPane4 = new JScrollPane();
    JScrollPane messageScrollPane5 = new JScrollPane();
    JScrollPane messageScrollPane6 = new JScrollPane();
    JScrollPane messageScrollPane7 = new JScrollPane();

    JRadioButton Sesuai1 = new JRadioButton("Bersih");
    JRadioButton tak_sesuai1 = new JRadioButton("Tidak Bersih");
    JRadioButton Sesuai2 = new JRadioButton("Bersih");
    JRadioButton tak_sesuai2 = new JRadioButton("Tidak Bersih");
    JRadioButton Sesuai3 = new JRadioButton("Bersih");
    JRadioButton tak_sesuai3 = new JRadioButton("Tidak Bersih");
    JRadioButton Sesuai4 = new JRadioButton("Bersih");
    JRadioButton tak_sesuai4 = new JRadioButton("Tidak Bersih");
    JRadioButton Sesuai5 = new JRadioButton("Bersih");
    JRadioButton tak_sesuai5 = new JRadioButton("Tidak Bersih");
    JRadioButton Sesuai6 = new JRadioButton("Tidak Bising ");
    JRadioButton tak_sesuai6 = new JRadioButton("Bising");
    JRadioButton Sesuai7 = new JRadioButton("Tidak Bau");
    JRadioButton tak_sesuai7 = new JRadioButton(" Bau");
    JRadioButton Sesuai8 = new JRadioButton("Tidak Bocor");
    JRadioButton tak_sesuai8 = new JRadioButton(" Bocor");
    JRadioButton Sesuai9 = new JRadioButton("Tidak Rusak ");
    JRadioButton tak_sesuai9 = new JRadioButton("Rusak");
    JRadioButton Sesuai10 = new JRadioButton("Tidak aus");
    JRadioButton tak_sesuai10 = new JRadioButton("aus");

    JRadioButton Sesuai11 = new JRadioButton("Kekokohan");
    JRadioButton tak_sesuai11 = new JRadioButton("tidak Kekokohan");

    JRadioButton Sesuai12 = new JRadioButton("KunciPintuJendela pas");
    JRadioButton tak_sesuai12 = new JRadioButton("KunciPintuJendela kurang");
    JRadioButton Sesuai13 = new JRadioButton("Aman");
    JRadioButton tak_sesuai13 = new JRadioButton("Bahaya");

    JRadioButton udara = new JRadioButton("Lancar");
    JRadioButton udara2 = new JRadioButton("Kurang Lancar");

    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    JTextField input3 = new JTextField();
    JTextField input4 = new JTextField();
    JTextField input5 = new JTextField();
    JTextField input6 = new JTextField();
    JTextField input7 = new JTextField();
    JTextField input8 = new JTextField();
    JTextField input9 = new JTextField();
    JTextField input10 = new JTextField();
    JTextField input11 = new JTextField();
    JTextField input12 = new JTextField();
    JTextField input13 = new JTextField();
    JTextField input14 = new JTextField();
    JTextField input15 = new JTextField();
    JTextField input16 = new JTextField();
    JTextField input17 = new JTextField();
    JTextField input18 = new JTextField();
    JTextField input19 = new JTextField();
    JTextField input20 = new JTextField();
    JTextField input21 = new JTextField();
    JTextField input22 = new JTextField();
    JTextField input23 = new JTextField();
    JTextField input24 = new JTextField();
    JTextField input25 = new JTextField();
    JTextField input26 = new JTextField();
    JTextField input27 = new JTextField();
    JTextField input28 = new JTextField();
    JTextField input29 = new JTextField();
    JTextField input30 = new JTextField();
    JTextField input31 = new JTextField();
    JTextField input32 = new JTextField();
    JTextField input33 = new JTextField();
    JTextField input34 = new JTextField();
    JTextField input35 = new JTextField();
    JTextField input36 = new JTextField();
    JTextField input37 = new JTextField();
    JTextField input38 = new JTextField();
    JTextField input39 = new JTextField();
    JTextField input40 = new JTextField();
    JTextField input41 = new JTextField();
    
    JTextField HasilKondisiRuang = new JTextField();
    JTextField HasilSarana = new JTextField();
    JTextField HasilKebersihan = new JTextField();
    JTextField HasilKelembapan = new JTextField();
    JTextField HasilKenyamanan = new JTextField();
    JTextField HasilKeamanan = new JTextField();
    
    

    JTextField Radio1 = new JTextField();

    JButton next = new JButton();
    JButton TestConnection = new JButton();
    JButton tombol1 = new JButton();
    JButton tombol2 = new JButton();
    JButton tombol3 = new JButton();
    JButton tombol4 = new JButton();
    JButton tombol5 = new JButton();
    JButton tombol6 = new JButton();
    JButton tombol7 = new JButton();
    JButton tombol8 = new JButton();
    JButton tombol9 = new JButton();
    JButton tombol10 = new JButton();
    JButton tombol11 = new JButton();
    JButton tombol12 = new JButton();
    JButton tombol13 = new JButton();
    JButton tombol14 = new JButton();
    JButton tombol15 = new JButton();
    JButton tombol18 = new JButton();

    JButton analisis1 = new JButton();
    JButton analisis2 = new JButton();
    JButton analisis3 = new JButton();
    JButton analisis4 = new JButton();
    JButton analisis5 = new JButton();
    JButton analisis6 = new JButton();
    JButton analisis7 = new JButton();
    JButton analisis8 = new JButton();
    JButton analisis9 = new JButton();
    JButton analisis10 = new JButton();
    JButton analisis11 = new JButton();
    JButton analisis12 = new JButton();
    JButton analisis13 = new JButton();

    JButton analisis14 = new JButton();
    JButton analisis15 = new JButton();
    
    JButton Tambah = new JButton();
    JButton Hapus = new JButton();
    JButton Edit = new JButton();
    JButton Cari = new JButton();
    JButton Tampil = new JButton();
    
    String[] combobox = { "NamaRuangan", "KondisiRuang", "Sarana", "Kebersihan", "Kelembapan"
    , "Kenyamanan", "Keamanan"};
    

    public PanelTab() {
        // super("Tabbed Pane");
        setTitle("System Inventaris Ruangan");
        setSize(800, 700);
        tabpane = new JTabbedPane();

        label1 = new JLabel("Masukan Nama Ruang       : ");
        label1.setBounds(0, 28, 175, 10);
        input1.setBounds(175, 20, 150, 30);
        label2 = new JLabel("Masukan Lokasi Ruangan : ");
        label2.setBounds(0, 75, 175, 10);
        input2.setBounds(175, 72, 150, 30);
        label3 = new JLabel("Masukan Program Studi    : ");
        label3.setBounds(0, 125, 175, 10);
        input3.setBounds(175, 120, 150, 30);
        label4 = new JLabel("Masukan Fakultas              : ");
        label4.setBounds(0, 175, 175, 10);
        input4.setBounds(175, 172, 150, 30);
        panel1 = new JPanel();
        tabpane.addTab("Identitas_Ruangan", null, panel1, "Panel pertama");
        panel1.setLayout(null);

        TestConnection.setText("Test DB");
        TestConnection.setBounds(10, 600, 100, 30);
        
        next.setText("Next");
        next.setBounds(680, 600, 100, 30);
        
        
        /*Tambah.setText("Tambah");
        Tambah.setBounds(10, 600, 100, 30);
        Hapus.setText("Hapus");
        Hapus.setBounds(200, 600, 100, 30);
        Edit.setText("Edit");
        Edit.setBounds(400, 600, 100, 30);
        Cari.setText("Cari");
        Cari.setBounds(600, 600, 100, 30);
        panel1.add(Tambah);
        panel1.add(Hapus);
        panel1.add(Edit);
        panel1.add(Cari);
        */
        
        
        
        IDruang = input1.getText();
        next.addActionListener(this);

        panel1.add(TestConnection);
        panel1.add(next);
        panel1.add(label1);
        panel1.add(input1);
        panel1.add(label2);
        panel1.add(input2);
        panel1.add(label3);
        panel1.add(input3);
        panel1.add(label4);
        panel1.add(input4);
        
        
        
        
        //---------------------Tabke 2------------///
        // public void PanelTab2() {
        //label2 = new JLabel("Panel Kedua");
        panel2 = new JPanel();
        panel2.setLayout(new AbsoluteLayout());
        tabpane.addTab("Kondisi Ruang", null, panel2, null);

        label5 = new JLabel("Masukan Panjang Ruangan      : ");
        label6 = new JLabel("Masukan Lebar Ruangan          : ");
        label7 = new JLabel("Masukan Jumlah kursi              : ");
        label8 = new JLabel("Masukan Jumlah Pintu              : ");
        label9 = new JLabel("Masukan Jumlah Jendela         : ");
        tombol1.setText("Next");
        tombol2.setText("Back");

        //;
        messageScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane1.setPreferredSize(new Dimension(170, 100));

        panel2.add(messageScrollPane1, new AbsoluteConstraints(580, 8, 205, 500));
        panel2.add(label5, new AbsoluteConstraints(0, 28, 205, 10));
        panel2.add(label6, new AbsoluteConstraints(0, 75, 205, 10));
        panel2.add(label7, new AbsoluteConstraints(0, 125, 205, 10));
        panel2.add(label8, new AbsoluteConstraints(0, 175, 205, 10));
        panel2.add(label9, new AbsoluteConstraints(0, 225, 205, 10));
        panel2.add(HasilKondisiRuang,new AbsoluteConstraints(0, 0, 0, 0));

        panel2.add(input5, new AbsoluteConstraints(200, 20, 150, 30));
        panel2.add(input6, new AbsoluteConstraints(200, 70, 150, 30));
        panel2.add(input7, new AbsoluteConstraints(200, 120, 150, 30));
        panel2.add(input8, new AbsoluteConstraints(200, 170, 150, 30));
        panel2.add(input9, new AbsoluteConstraints(200, 220, 150, 30));
        panel2.add(tombol1, new AbsoluteConstraints(680, 600, 100, 30));
        panel2.add(tombol2, new AbsoluteConstraints(10, 600, 100, 30));

        //----------------------tab ke 3--------------------//
        panel3 = new JPanel();
        //panel3.setBackground(Color.RED);
        panel3.setLayout(new AbsoluteLayout());
        tabpane.addTab("Sarana ", null, panel3, null);
        label10 = new JLabel("Masukan Jumlah Stopkontak       : ");
        label11 = new JLabel("Kondisi StopKontak                         : ");
        label12 = new JLabel("Masukan Posisi StopKontak         : ");
        label13 = new JLabel("Masukan Jumlah Kabel LCD          : ");
        label14 = new JLabel("Kondisi Kabel LCD                           : ");
        label15 = new JLabel("Masukan Posisi Kabel LCD           : ");
        label16 = new JLabel("Masukan Jumlah Lampu               : ");
        label17 = new JLabel("Kondisi Lampu                                 : ");
        label18 = new JLabel("Masukan Posisi Lampu                  : ");
        label19 = new JLabel("Masukan Jumlah Kipas Angin       : ");
        label20 = new JLabel("Kondisi Kipas Angin                        : ");
        label21 = new JLabel("Masukan Posisi Kipas Angin        : ");

        tombol3.setText("Next");
        tombol4.setText("Back");
        analisis1.setText("Checking");
        analisis2.setText("Checking");
        analisis3.setText("Checking");
        analisis4.setText("Checking");
        analisis5.setText("Checking");
        analisis6.setText("Checking");
        analisis7.setText("Checking");
        analisis8.setText("Checking");
        analisis9.setText("Checking");
        analisis10.setText("Checking");
        analisis11.setText("Checking");
        analisis12.setText("Checking");
        analisis13.setText("Checking");
        analisis14.setText("Checking");

        messageScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane2.setPreferredSize(new Dimension(170, 100));

        panel3.add(messageScrollPane2, new AbsoluteConstraints(580, 8, 205, 500));
        panel3.add(label10, new AbsoluteConstraints(0, 20, 205, 10));

        panel3.add(label11, new AbsoluteConstraints(0, 65, 205, 10));
        panel3.add(analisis1, new AbsoluteConstraints(360, 65, 90, 25));

        panel3.add(label12, new AbsoluteConstraints(0, 110, 205, 10));
        panel3.add(analisis2, new AbsoluteConstraints(360, 110, 90, 25));

        panel3.add(label13, new AbsoluteConstraints(0, 155, 205, 10));

        panel3.add(label14, new AbsoluteConstraints(0, 200, 205, 10));
        panel3.add(analisis3, new AbsoluteConstraints(360, 200, 90, 25));
        panel3.add(label15, new AbsoluteConstraints(0, 245, 205, 10));
        panel3.add(analisis4, new AbsoluteConstraints(360, 245, 90, 25));

        panel3.add(label16, new AbsoluteConstraints(0, 290, 205, 10));

        panel3.add(label17, new AbsoluteConstraints(0, 335, 205, 10));
        panel3.add(analisis5, new AbsoluteConstraints(360, 335, 90, 25));
        panel3.add(label18, new AbsoluteConstraints(0, 380, 205, 10));
        panel3.add(analisis6, new AbsoluteConstraints(360, 380, 90, 25));

        panel3.add(label19, new AbsoluteConstraints(0, 425, 205, 10));

        panel3.add(label20, new AbsoluteConstraints(0, 470, 205, 10));
        panel3.add(analisis7, new AbsoluteConstraints(360, 470, 90, 25));
        panel3.add(label21, new AbsoluteConstraints(0, 515, 205, 10));
        panel3.add(analisis8, new AbsoluteConstraints(360, 515, 90, 25));
        
        
        analisis2.setVisible(false);
        analisis3.setVisible(false);
        analisis4.setVisible(false);
        analisis5.setVisible(false);
        analisis6.setVisible(false);
        analisis7.setVisible(false);
        analisis8.setVisible(false);
        analisis9.setVisible(false);
        analisis10.setVisible(false);
        analisis11.setVisible(false);
        analisis12.setVisible(false);
        analisis13.setVisible(false);
        analisis14.setVisible(false);

        panel3.add(input10, new AbsoluteConstraints(200, 20, 150, 30));
        panel3.add(input11, new AbsoluteConstraints(200, 65, 150, 30));
        panel3.add(input12, new AbsoluteConstraints(200, 110, 150, 30));
        panel3.add(input13, new AbsoluteConstraints(200, 155, 150, 30));
        panel3.add(input14, new AbsoluteConstraints(200, 200, 150, 30));
        panel3.add(input15, new AbsoluteConstraints(200, 245, 150, 30));
        panel3.add(input16, new AbsoluteConstraints(200, 290, 150, 30));
        panel3.add(input17, new AbsoluteConstraints(200, 335, 150, 30));
        panel3.add(input18, new AbsoluteConstraints(200, 380, 150, 30));
        panel3.add(input19, new AbsoluteConstraints(200, 425, 150, 30));
        panel3.add(input20, new AbsoluteConstraints(200, 470, 150, 30));
        panel3.add(input21, new AbsoluteConstraints(200, 515, 150, 30));
        
        panel3.add(tombol3, new AbsoluteConstraints(680, 600, 100, 30));
        panel3.add(tombol4, new AbsoluteConstraints(10, 600, 100, 30));

        //----------------------tab ke 4--------------------//
        panel4 = new JPanel();
        //panel3.setBackground(Color.RED);
        panel4.setLayout(new AbsoluteLayout());
        tabpane.addTab("Sarana#2 ", null, panel4, null);
        label22 = new JLabel("Masukan Jumlah AC                : ");
        label23 = new JLabel("Kondisi  AC                                 : ");
        label24 = new JLabel("Masukan Posisi AC                  : ");
        label25 = new JLabel("Masukan SSID                          : ");
        label26 = new JLabel("Masukan BandWith                 : ");
        label27 = new JLabel("Masukan Jumlah CCTV          : ");
        label29 = new JLabel("KOndisi  CCTV                           : ");
        label30 = new JLabel("Posisi CCTV                              : ");
        label28 = new JLabel("");

        tombol5.setText("Next");
        tombol6.setText("Back");
        messageScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane3.setPreferredSize(new Dimension(170, 100));

        panel4.add(messageScrollPane3, new AbsoluteConstraints(580, 8, 205, 500));
        panel4.add(label22, new AbsoluteConstraints(0, 20, 205, 10));

        panel4.add(label23, new AbsoluteConstraints(0, 65, 205, 10));
        panel4.add(analisis9, new AbsoluteConstraints(360, 65, 90, 25));
        panel4.add(label24, new AbsoluteConstraints(0, 110, 205, 10));
        panel4.add(analisis10, new AbsoluteConstraints(360, 110, 90, 25));

        panel4.add(label25, new AbsoluteConstraints(0, 155, 205, 10));
        panel4.add(analisis13, new AbsoluteConstraints(360, 155, 90, 25));
        panel4.add(label26, new AbsoluteConstraints(0, 200, 205, 10));
        panel4.add(analisis14, new AbsoluteConstraints(360, 200, 90, 25));

        panel4.add(label27, new AbsoluteConstraints(0, 245, 205, 10));

        panel4.add(label29, new AbsoluteConstraints(0, 290, 205, 10));
        panel4.add(analisis11, new AbsoluteConstraints(360, 290, 90, 25));
        panel4.add(label30, new AbsoluteConstraints(0, 335, 205, 10));
        panel4.add(analisis12, new AbsoluteConstraints(360, 335, 90, 25));

        panel4.add(label28, new AbsoluteConstraints(0, 380, 205, 10));

        panel4.add(input22, new AbsoluteConstraints(200, 20, 150, 30));
        panel4.add(input23, new AbsoluteConstraints(200, 65, 150, 30));
        panel4.add(input24, new AbsoluteConstraints(200, 110, 150, 30));
        panel4.add(input25, new AbsoluteConstraints(200, 155, 150, 30));
        panel4.add(input26, new AbsoluteConstraints(200, 200, 150, 30));
        panel4.add(input27, new AbsoluteConstraints(200, 245, 150, 30));
        panel4.add(input29, new AbsoluteConstraints(200, 290, 150, 30));
        panel4.add(input30, new AbsoluteConstraints(200, 335, 150, 30));
        //panel4.add(input28, new AbsoluteConstraints(200, 380, 150, 30));
        panel4.add(tombol5, new AbsoluteConstraints(680, 600, 100, 30));
        panel4.add(tombol6, new AbsoluteConstraints(10, 600, 100, 30));
        panel4.add(HasilSarana,new AbsoluteConstraints(0, 0, 0, 0));
        //----------------------tab ke 5--------------------//
        panel5 = new JPanel();
        //panel3.setBackground(Color.RED);
        panel5.setLayout(new AbsoluteLayout());
        tabpane.addTab(" Kebersihan ", null, panel5, null);
        label31 = new JLabel("Masukan Kondisi Lantai :");
        label32 = new JLabel("Masukan Kondisi Dinding :");
        label33 = new JLabel("Masukan Kondisi Atap :");
        label34 = new JLabel("Masukan Kondisi Pintu :");
        label35 = new JLabel("Masukan Kondisi Jendela :");
        tombol7.setText("Next");
        tombol8.setText("Back");
        messageScrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane4.setPreferredSize(new Dimension(170, 100));

        pilihan1.add(Sesuai1);
        pilihan1.add(tak_sesuai1);
        pilihan2.add(Sesuai2);
        pilihan2.add(tak_sesuai2);
        pilihan3.add(Sesuai3);
        pilihan3.add(tak_sesuai3);
        pilihan4.add(Sesuai4);
        pilihan4.add(tak_sesuai4);
        pilihan5.add(Sesuai5);
        pilihan5.add(tak_sesuai5);

        panel5.add(messageScrollPane4, new AbsoluteConstraints(580, 8, 205, 500));

        panel5.add(label31, new AbsoluteConstraints(0, 28, 175, 10));
        panel5.add(Sesuai1, new AbsoluteConstraints(150, 28, 70, 10));
        panel5.add(tak_sesuai1, new AbsoluteConstraints(250, 28, 175, 10));

        panel5.add(label32, new AbsoluteConstraints(0, 60, 175, 10));
        panel5.add(Sesuai2, new AbsoluteConstraints(150, 60, 70, 10));
        panel5.add(tak_sesuai2, new AbsoluteConstraints(250, 60, 175, 10));

        panel5.add(label33, new AbsoluteConstraints(0, 92, 175, 10));
        panel5.add(Sesuai3, new AbsoluteConstraints(150, 92, 70, 10));
        panel5.add(tak_sesuai3, new AbsoluteConstraints(250, 92, 175, 10));

        panel5.add(label34, new AbsoluteConstraints(0, 124, 175, 10));
        panel5.add(Sesuai4, new AbsoluteConstraints(150, 124, 70, 10));
        panel5.add(tak_sesuai4, new AbsoluteConstraints(250, 124, 175, 10));

        panel5.add(label35, new AbsoluteConstraints(0, 156, 175, 10));
        panel5.add(Sesuai5, new AbsoluteConstraints(150, 156, 70, 10));
        panel5.add(tak_sesuai5, new AbsoluteConstraints(250, 156, 175, 10));

        panel5.add(tombol7, new AbsoluteConstraints(680, 600, 100, 30));
        panel5.add(tombol8, new AbsoluteConstraints(10, 600, 100, 30));
        panel5.add(HasilKebersihan,new AbsoluteConstraints(0, 0, 0, 0));
        //----------------------tab ke 6--------------------//
        panel6 = new JPanel();
        //panel3.setBackground(Color.RED);
        panel6.setLayout(new AbsoluteLayout());

        tabpane.addTab("Kelembapan", null, panel6, null);

        label36 = new JLabel("Masukan  SirkulasiUdara :");
        label37 = new JLabel("Masukan  Nilai Pencahayaan   : ");
        label38 = new JLabel("Masukan  Kelembaban  50-100(%):");
        label39 = new JLabel("Masukan  Suhu (celcius) :");
        nilaiudara = new JLabel("(100-500)");
        tombol9.setText("Next");
        tombol10.setText("Back");

        messageScrollPane5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane5.setPreferredSize(new Dimension(170, 100));

        panel6.add(messageScrollPane5, new AbsoluteConstraints(580, 8, 205, 500));
        panel6.add(label36, new AbsoluteConstraints(0, 20, 205, 10));
        panel6.add(label37, new AbsoluteConstraints(0, 65, 205, 10));
         panel6.add(nilaiudara, new AbsoluteConstraints(350, 75, 205, 10));
        panel6.add(label38, new AbsoluteConstraints(0, 110, 205, 10));
        panel6.add(label39, new AbsoluteConstraints(0, 155, 205, 10));

        pilihan14.add(udara);
        pilihan14.add(udara2);
        panel6.add(HasilKelembapan,new AbsoluteConstraints(0, 0, 0, 0));
        panel6.add(udara, new AbsoluteConstraints(200, 10, 80, 30));
        panel6.add(udara2, new AbsoluteConstraints(290, 10, 120, 30));
        panel6.add(input32, new AbsoluteConstraints(200, 65, 150, 30));
        panel6.add(input33, new AbsoluteConstraints(200, 110, 150, 30));
        panel6.add(input34, new AbsoluteConstraints(200, 155, 150, 30));

        panel6.add(tombol9, new AbsoluteConstraints(680, 600, 100, 30));
        panel6.add(tombol10, new AbsoluteConstraints(10, 600, 100, 30));
//----------------------tab ke 7--------------------//
        panel7 = new JPanel();
        //panel3.setBackground(Color.RED);
        panel7.setLayout(new AbsoluteLayout());
        tabpane.addTab("Kenyamanan ", null, panel7, null);

        label40 = new JLabel("Masukan Kondisi Kebisingan :");
        label41 = new JLabel("Masukan Kondisi Bau :");
        label42 = new JLabel("Masukan Kondisi Kebocoran :");
        label43 = new JLabel("Masukan Kondisi Kerusakan :");
        label44 = new JLabel("Masukan Kondisi Keausan :");
        tombol11.setText("Next");
        tombol12.setText("Back");

        messageScrollPane6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane6.setPreferredSize(new Dimension(170, 100));

        panel7.add(messageScrollPane6, new AbsoluteConstraints(580, 8, 205, 500));
        panel7.add(label40, new AbsoluteConstraints(0, 20, 205, 10));
        panel7.add(label41, new AbsoluteConstraints(0, 65, 205, 10));
        panel7.add(label42, new AbsoluteConstraints(0, 110, 205, 10));
        panel7.add(label43, new AbsoluteConstraints(0, 155, 205, 10));
        panel7.add(label44, new AbsoluteConstraints(0, 200, 205, 10));

        pilihan6.add(Sesuai6);
        pilihan6.add(tak_sesuai6);
        pilihan7.add(Sesuai7);
        pilihan7.add(tak_sesuai7);
        pilihan8.add(Sesuai8);
        pilihan8.add(tak_sesuai8);
        pilihan9.add(Sesuai9);
        pilihan9.add(tak_sesuai9);
        pilihan10.add(Sesuai10);
        pilihan10.add(tak_sesuai10);

        panel7.add(Sesuai6, new AbsoluteConstraints(190, 20, 100, 10));
        panel7.add(tak_sesuai6, new AbsoluteConstraints(300, 20, 205, 10));

        panel7.add(Sesuai7, new AbsoluteConstraints(190, 65, 100, 10));
        panel7.add(tak_sesuai7, new AbsoluteConstraints(300, 65, 205, 10));

        panel7.add(Sesuai8, new AbsoluteConstraints(190, 110, 100, 10));
        panel7.add(tak_sesuai8, new AbsoluteConstraints(300, 110, 205, 10));

        panel7.add(Sesuai9, new AbsoluteConstraints(190, 155, 100, 10));
        panel7.add(tak_sesuai9, new AbsoluteConstraints(300, 155, 205, 10));

        panel7.add(Sesuai10, new AbsoluteConstraints(190, 200, 100, 10));
        panel7.add(tak_sesuai10, new AbsoluteConstraints(300, 200, 205, 10));

        panel7.add(tombol11, new AbsoluteConstraints(680, 600, 100, 30));
        panel7.add(tombol12, new AbsoluteConstraints(10, 600, 100, 30));
        panel7.add(HasilKenyamanan,new AbsoluteConstraints(0, 0, 0, 0));
        //----------------------tab ke 8--------------------//
        panel8 = new JPanel();
        //panel3.setBackground(Color.RED);
        panel8.setLayout(new AbsoluteLayout());
        tabpane.addTab("Keamanan ", null, panel8, null);
        label45 = new JLabel("Masukan Kondisi Kekokohan	 :");
        label46 = new JLabel("Masukan Kondisi KunciPintuJendela :");
        label47 = new JLabel("Masukan Kondisi Bahaya :");

        panel8.add(label45, new AbsoluteConstraints(0, 20, 205, 10));
        panel8.add(label46, new AbsoluteConstraints(0, 120, 305, 10));
        panel8.add(label47, new AbsoluteConstraints(0, 220, 205, 10));

        tombol13.setText("Next");
        tombol14.setText("Back");

        messageScrollPane7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        messageScrollPane7.setPreferredSize(new Dimension(170, 100));

        panel8.add(messageScrollPane7, new AbsoluteConstraints(580, 8, 205, 500));
        pilihan11.add(Sesuai11);
        pilihan11.add(tak_sesuai11);
        pilihan12.add(Sesuai12);
        pilihan12.add(tak_sesuai12);
        pilihan13.add(Sesuai13);
        pilihan13.add(tak_sesuai13);

        panel8.add(Sesuai11, new AbsoluteConstraints(0, 70, 100, 10));
        panel8.add(tak_sesuai11, new AbsoluteConstraints(200, 70, 205, 10));

        panel8.add(Sesuai12, new AbsoluteConstraints(0, 170, 170, 10));
        panel8.add(tak_sesuai12, new AbsoluteConstraints(200, 170, 205, 10));

        panel8.add(Sesuai13, new AbsoluteConstraints(0, 270, 100, 10));
        panel8.add(tak_sesuai13, new AbsoluteConstraints(200, 270, 205, 10));

        panel8.add(tombol13, new AbsoluteConstraints(680, 600, 100, 30));
        panel8.add(tombol14, new AbsoluteConstraints(10, 600, 100, 30));
        panel8.add(HasilKeamanan,new AbsoluteConstraints(0, 0, 0, 0));
        
        tabpane.setEnabledAt(1, false);
        tabpane.setEnabledAt(2, false);
        tabpane.setEnabledAt(3, false);
        tabpane.setEnabledAt(4, false);
        tabpane.setEnabledAt(5, false);
        tabpane.setEnabledAt(6, false);
        tabpane.setEnabledAt(7, false);

        tombol1.addActionListener(this);
        tombol3.addActionListener(this);
        tombol5.addActionListener(this);
        tombol7.addActionListener(this);
        tombol9.addActionListener(this);
        tombol11.addActionListener(this);
        tombol13.addActionListener(this);
        //Sesuai1.addItemListener(get);
        
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        
        tombol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol1ActionPerformed(evt);
            }
        });
        tombol7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol7ActionPerformed(evt);
            }
        });
        tombol9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol9ActionPerformed(evt);
            }
        });
        
          tombol11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol11ActionPerformed(evt);
            }
        });
          
           tombol13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol13ActionPerformed(evt);
            }
        });
           tombol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol5ActionPerformed(evt);
            }
        });
           
             TestConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestConnectionActionPerformed(evt);
            }
        });

        analisis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis1ActionPerformed(evt);
            }
        });

        analisis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis2ActionPerformed(evt);
            }
        });

        analisis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis3ActionPerformed(evt);
            }
        });

        analisis4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis4ActionPerformed(evt);
            }
        });

        analisis5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis5ActionPerformed(evt);
            }
        });
        analisis6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis6ActionPerformed(evt);
            }
        });
        analisis7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis7ActionPerformed(evt);
            }
        });
        analisis8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis8ActionPerformed(evt);
            }
        });

        analisis9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis9ActionPerformed(evt);
            }
        });

        analisis10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis10ActionPerformed(evt);
            }
        });
        analisis11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis11ActionPerformed(evt);
            }
        });
        analisis12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis12ActionPerformed(evt);
            }
        });

        analisis13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis13ActionPerformed(evt);
            }
        });

        analisis14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisis14ActionPerformed(evt);
            }
        });

        analisis2.addActionListener(this);
        analisis3.addActionListener(this);
        analisis4.addActionListener(this);
        analisis5.addActionListener(this);
        analisis6.addActionListener(this);
        analisis7.addActionListener(this);
        analisis8.addActionListener(this);
        analisis9.addActionListener(this);
        analisis10.addActionListener(this);
        analisis11.addActionListener(this);
        analisis12.addActionListener(this);

        getContentPane().add(tabpane);
        // setSize(400, 300);

        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {
      Input masuk = new Input();
      
      masuk.NamaKelas(input1, input2, input3, input4);
     
     
    }
    
    private void tombol1ActionPerformed(java.awt.event.ActionEvent evt) {
      Input masuk = new Input();
      Analisis check = new Analisis();
       RuangKelas test = new RuangKelas();
      masuk.KondisiRuang(input5,input6,input7,input8,input9);
      int a, b,c,d,e,status;
      a= 0;
      b= 0;
      c =0;
      d = 0;
      e = 0;
      status=0;
      a=Integer.parseInt(input5.getText());
      b=Integer.parseInt(input6.getText());
      c=Integer.parseInt(input7.getText());
      d=Integer.parseInt(input8.getText());
      e=Integer.parseInt(input9.getText());
       check.AnalisisKondisiRuangan(a,b,c,d,e,status);
      if (status == 2){
      JOptionPane.showMessageDialog(rootPane, "Kondisi Ruangkelas Sesuai");
    }
      
      if (status != 2){
      JOptionPane.showMessageDialog(rootPane, "Kondisi Ruangkelas Tidak Sesuai");
    } 
    }
    
    private void tombol5ActionPerformed(java.awt.event.ActionEvent evt) {
      
      Input masuk = new Input();
      
      masuk.Sarana(input10,input11,input12,input13,input14,input15,input16,input17
      ,input18,input19,input20,input21,input22,input23,input24,input25,input26,input27,input29,input30);
      
    }
    
    
    
    
    private void tombol7ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        Input masuk = new Input();
        int radio = 0;
        int status = 0;
        String a,b,c,d,e;
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        
        if (Sesuai1.isSelected()) {
            radio = radio + 1;
            a = "Bersih";
        }
        else if (tak_sesuai1.isSelected()){
        a = "TidakBersih";
        }
        
        if (Sesuai2.isSelected()) {
            radio = radio + 1;
            b = "Bersih";
        }
        else if (tak_sesuai2.isSelected()){
        b = "TidakBersih";
        }
        
        
        if (Sesuai3.isSelected()) {
            radio = radio + 1;
        c = "Bersih";
        }
        else if (tak_sesuai3.isSelected()){
        c = "TidakBersih";
        }
        
        
        if (Sesuai4.isSelected()) {
            radio = radio + 1;
        d = "Bersih";
        }
        else if (tak_sesuai4.isSelected()){
        d = "TidakBersih";
        }    
        
        if (Sesuai5.isSelected()) {
            radio = radio + 1;
            e = "Bersih";
        }
        else if (tak_sesuai5.isSelected()){
        e = "TidakBersih";
        }
        
        masuk.Kebersihan(a,b,c,d,e);
        check.AnalisisKebersihan(radio, status);
        if (status == 1) {
          //set variable final untuk hasil NB belum
        }
        

    }

    private void tombol9ActionPerformed(java.awt.event.ActionEvent evt) {
        int test; 
        int kelembapan;
    int suhu;
    int lancar =0; 
     int status = 0;   
    Analisis check = new Analisis();
    Input masuk = new Input();
    int cahaya; //32 33 34
   String a= "";
        
        
    cahaya = Integer.parseInt(input32.getText());
    kelembapan = Integer.parseInt(input33.getText());
    suhu = Integer.parseInt(input34.getText());
    if (udara.isSelected()) {
            lancar = 1;
            a= "Lancar";
        }
    else if (udara2.isSelected()){
         a= "Tidak Lancar";    
    }
    masuk.KondisiKelas(a,input32,input33,input34 );
    test = check.AnalisisKelembapankelas(cahaya,suhu,kelembapan,lancar,status);
    
    if (test == 4){
    JOptionPane.showMessageDialog(null, "Kondisi Kelembapan kelas Sesuai");
    }
     if(test != 4){
     JOptionPane.showMessageDialog(null, "Kondisi Kelembapan kelas  tidak Sesuai");
    }
    
    } 
    
    private void tombol11ActionPerformed(java.awt.event.ActionEvent evt) {
            Analisis check = new Analisis();
            Input masuk = new Input();
        int radio = 0;
        int status = 0;
        String a,b,c,d,e;
        a= "";
        b= "";
        c= "";
        d= "";
        e= "";
        
        
        if (Sesuai6.isSelected()) {
            radio = radio + 1;
            a="Tidak Bising";
        }
        else if (tak_sesuai6.isSelected())
        {
        a= "Bising";
        }
        if (Sesuai7.isSelected()) {
            radio = radio + 1;
        b="Tidak Bau";
        }
        else if (tak_sesuai7.isSelected())
        {
        b= "Bau";
        }
        
        if (Sesuai8.isSelected()) {
            radio = radio + 1;
        c="Tidak Bocor";
        }
        else if (tak_sesuai8.isSelected())
        {
        c= "Bocor";
        }
        if (Sesuai9.isSelected()) {
            radio = radio + 1;
        d="Tidak Rusak";
        }
        else if (tak_sesuai9.isSelected())
        {
        d= "Rusak";
        }
        if (Sesuai10.isSelected()) {
            radio = radio + 1;
        e="Tidak Aus";
        }
        else if (tak_sesuai10.isSelected())
        {
        e= "Aus";
        }
        masuk.Kenyamanan(a,b,c,d,e);
        check.AnalisisKenyamanan(radio, status);
        if (status == 1) {
          //set variable final untuk hasil NB belum
        }
    
    
    }
     
    private void tombol13ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        Input masuk = new Input();
        int radio = 0;
        int status = 0;
        String a, b ,c;
        a = "";
        b = "";
        c ="";
        if (Sesuai11.isSelected()) {
            radio = radio + 1;
        a="KOkoh";
        }
        else if (tak_sesuai11.isSelected())
        {
        a= "tidak kokoh";
        }
        if (Sesuai12.isSelected()) {
            radio = radio + 1;
        b="JUmlah kunci Tak sesuai";
        }
        else if (tak_sesuai12.isSelected())
        {
        b= "Jumlah kunci sesuai";
        }
        if (Sesuai13.isSelected()) {
            radio = radio + 1;
        c="Aman";
        }
        else if (tak_sesuai13.isSelected())
        {
        c= "Berbahaya";
        }
        masuk.Keamanan(a,b,c);
        check.AnalisisKeamanan(radio, status);
        if (status == 1) {
          //set variable final untuk hasil NB belum
        }

    }  
    
    
    
    private void analisis1ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        String baca;
        int num;

        a = Integer.parseInt(input10.getText());
        baca = Integer.toString(check.AnalisisKondisiStopKontak(a, baik));
        //baca = Integer.toString(check.AnalisisJumlahStopKontak(a,baik));
        num = Integer.parseInt(baca);
        if (num == 1) {
            input11.setText("Sesuai");
        }

        if (num == 0) {
            input11.setText("Tidak Sesuai");
        }
        analisis1.setVisible(false);
        analisis2.setVisible(true);

        // jTextField1.getText(coba.output(a));
    }

    private void analisis2ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisPosisiStopKontak(posisi);

        if (cek == 2) {
            input12.setText("Sesuai");
        }
        if (cek != 2) {
            input12.setText("Tidak Sesuai");
        }
        analisis2.setVisible(false);
        analisis3.setVisible(true);
    }

    private void analisis3ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();

        String baca;
        int num;

        a = Integer.parseInt(input13.getText());
        baca = Integer.toString(check.AnalisisKondisiKabelLCD(a, baik));
        //baca = Integer.toString(check.AnalisisJumlahStopKontak(a,baik));
        num = Integer.parseInt(baca);
        if (num == 1) {
            input14.setText("Sesuai");
        }

        if (num == 0) {
            input14.setText("Tidak Sesuai");
        }
    }

    private void analisis4ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisPosisiKabelLCD(posisi);

        if (cek == 1) {
            input15.setText("Sesuai");
        }
        if (cek != 1) {
            input15.setText("Tidak Sesuai");
        }
    }

    private void analisis5ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        String baca;
        int num;

        a = Integer.parseInt(input16.getText());
        baca = Integer.toString(check.AnalisisKondisiLampu(a, baik));
        //baca = Integer.toString(check.AnalisisJumlahStopKontak(a,baik));
        num = Integer.parseInt(baca);
        if (num == 1) {
            input17.setText("Sesuai");
        }

        if (num == 0) {
            input17.setText("Tidak Sesuai");
        }

        // jTextField1.getText(coba.output(a));
    }

    private void analisis6ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisPosisiLampu(posisi);

        if (cek == 1) {
            input18.setText("Sesuai");
        }
        if (cek != 1) {
            input18.setText("Tidak Sesuai");
        }
    }

    private void analisis7ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        String baca;
        int num;

        a = Integer.parseInt(input19.getText());
        baca = Integer.toString(check.AnalisisKondisiKipasAngin(a, baik));
        //baca = Integer.toString(check.AnalisisJumlahStopKontak(a,baik));
        num = Integer.parseInt(baca);
        if (num == 1) {
            input20.setText("Sesuai");
        }

        if (num == 0) {
            input20.setText("Tidak Sesuai");
        }

        // jTextField1.getText(coba.output(a));
    }

    private void analisis8ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisPosisiKipasAngin(posisi);

        if (cek == 1) {
            input21.setText("Sesuai");
        }
        if (cek != 1) {
            input21.setText("Tidak Sesuai");
        }
    }

    private void analisis9ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        String baca;
        int num;

        a = Integer.parseInt(input22.getText());
        baca = Integer.toString(check.AnalisisKondisiAC(a, baik));
        //baca = Integer.toString(check.AnalisisJumlahStopKontak(a,baik));
        num = Integer.parseInt(baca);
        if (num == 1) {
            input23.setText("Sesuai");
        }

        if (num == 0) {
            input23.setText("Tidak Sesuai");
        }
    }

    private void analisis10ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisPosisiAC(posisi);

        if (cek == 1) {
            input24.setText("Sesuai");
        }
        if (cek != 1) {
            input24.setText("Tidak Sesuai");
        }
        analisis13.setVisible(true);
    }
    // jTextField1.getText(coba.output(a));

    private void analisis13ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisSSID(posisi);

        if (cek == 1) {
            input25.setText("Sesuai");
        }
        if (cek != 1) {
            input25.setText("Tidak Sesuai");
        }
        analisis13.setVisible(false);
        analisis14.setVisible(true);
    }

    private void analisis14ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisBandwith(posisi);

        if (cek == 1) {
            input26.setText("Sesuai");
        }
        if (cek != 1) {
            input26.setText("Tidak Sesuai");
        }
        analisis14.setVisible(false);
    }

    private void analisis11ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        String baca;
        int num;

        a = Integer.parseInt(input27.getText());
        baca = Integer.toString(check.AnalisisKondisiCCTV(a, baik));
        //baca = Integer.toString(check.AnalisisJumlahStopKontak(a,baik));
        num = Integer.parseInt(baca);
        if (num == 1) {
            input29.setText("Sesuai");
        }

        if (num == 0) {
            input29.setText("Tidak Sesuai");
        }
    }

    private void analisis12ActionPerformed(java.awt.event.ActionEvent evt) {
        Analisis check = new Analisis();
        int posisi = 0;
        int cek = check.AnalisisPosisiCCTV(posisi);

        if (cek == 2) {
            input30.setText("Sesuai");
        }
        if (cek != 2) {
            input30.setText("Tidak Sesuai");
        }
        analisis13.setVisible(true);
    }
    
    
    private void TestConnectionActionPerformed(java.awt.event.ActionEvent evt){
    Connector koneksi = new Connector();
          koneksi.testkoneksi();
    
    }
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            tabpane.setEnabledAt(1, true);
            tabpane.setEnabledAt(0, false);
            text1 = input1.getText();
            IDruang = input1.getText();
            text2 = input2.getText();
            text3 = input3.getText();
            text4 = input4.getText();
            String a = "Nama Ruangan : ";
            String a1 = "LokasiRuang : ";
            String a2 = "Program Study : ";
            String a3 = "Fakultas : ";

            field1 = "\n" + a + text1 + " \n" + a1 + text2 + "\n" + a2 + text3 + " \n" + a3 + text4 + "\n" + separator;
            message1.append(field1);

        } else if (e.getSource() == tombol1) {
            tabpane.setEnabledAt(2, true);
            tabpane.setEnabledAt(1, false);
            text5 = input5.getText();
            text6 = input6.getText();
            text7 = input7.getText();
            text8 = input8.getText();
            text9 = input9.getText();
            String b = "Panjang Ruang : ";
            String b1 = "Lebar Ruang : ";
            String b2 = "Jumlah Kursi : ";
            String b3 = "Jumlah Pintu : ";
            String b4 = "Jumlah Jendela : ";
            field2 = "\n" + b + text5 + " \n" + b1 + text6 + "\n" + b2 + text7 + " \n" + b3 + text8 + "\n" + b4 + text9 + "\n" + separator;
            message2.append(field1);
            message2.append(field2);

        } else if (e.getSource() == tombol3) {
            tabpane.setEnabledAt(3, true);
            tabpane.setEnabledAt(2, false);
        } else if (e.getSource() == tombol5) {
            tabpane.setEnabledAt(4, true);
            tabpane.setEnabledAt(3, false);
        } else if (e.getSource() == tombol7) {
            tabpane.setEnabledAt(5, true);
            tabpane.setEnabledAt(4, false);
        } else if (e.getSource() == tombol9) {
            tabpane.setEnabledAt(6, true);
            tabpane.setEnabledAt(5, false);
        } else if (e.getSource() == tombol11) {
            tabpane.setEnabledAt(7, true);
            tabpane.setEnabledAt(6, false);
        } else if (e.getSource() == tombol13) {
            // tabpane.setEnabledAt(8,true);

        } else if (e.getSource() == TestConnection) {
        } /*  else if (e.getSource() == analisis1) {
           
         }*/ else if (e.getSource() == analisis3) {
            analisis3.setVisible(false);
            analisis4.setVisible(true);
        } else if (e.getSource() == analisis4) {
            analisis4.setVisible(false);
            analisis5.setVisible(true);
        } else if (e.getSource() == analisis5) {
            analisis5.setVisible(false);
            analisis6.setVisible(true);
        } else if (e.getSource() == analisis6) {
            analisis6.setVisible(false);
            analisis7.setVisible(true);
        } else if (e.getSource() == analisis7) {
            analisis7.setVisible(false);
            analisis8.setVisible(true);
        } else if (e.getSource() == analisis8) {
            analisis8.setVisible(false);
            analisis9.setVisible(true);
        } else if (e.getSource() == analisis9) {
            analisis9.setVisible(false);
            analisis10.setVisible(true);
        } else if (e.getSource() == analisis10) {
            analisis10.setVisible(false); 
            analisis11.setVisible(true);
        } else if (e.getSource() == analisis11) {
            analisis11.setVisible(false);
            analisis12.setVisible(true);
        } else if (e.getSource() == analisis12) {
            analisis12.setVisible(false);

        }
        

    }

}
