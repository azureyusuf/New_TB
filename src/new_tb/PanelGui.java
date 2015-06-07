/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_tb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Azure
 */
public class PanelGui extends JFrame implements ActionListener {
   Connector testDB  = new Connector();
   
    String IDruang;
    private JTabbedPane tabpane;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9,
            label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,
            label20,label21,label22,label23,label24,label25,label26,
            label27,label28,label29,label30,label31,label32,label33
            ,label34,label35,label36,label37,label38,label39,label40
            ,label41;
    private JPanel panel1, panel2, panel3,panel4,panel5,panel6;
    JButton button;
    
    private ButtonGroup pilihan1  = new ButtonGroup();
    private ButtonGroup pilihan2  = new ButtonGroup();
    private ButtonGroup pilihan3  = new ButtonGroup();
    private ButtonGroup pilihan4  = new ButtonGroup();
    private ButtonGroup pilihan5  = new ButtonGroup();
    private ButtonGroup pilihan6  = new ButtonGroup();
    
    
    private JRadioButton Sesuai1 = new JRadioButton("Sesuai");
    private JRadioButton tak_sesuai1 = new JRadioButton("Tidak Sesuai");
    private JRadioButton Sesuai2 = new JRadioButton("Sesuai");
    private JRadioButton tak_sesuai2 = new JRadioButton("Tidak Sesuai");
    private JRadioButton Sesuai3 = new JRadioButton("Sesuai");
    private JRadioButton tak_sesuai3 = new JRadioButton("Tidak Sesuai");
    private JRadioButton Sesuai4 = new JRadioButton("Sesuai");
    private JRadioButton tak_sesuai4 = new JRadioButton("Tidak Sesuai");
    private JRadioButton Sesuai5 = new JRadioButton("Sesuai");
    private JRadioButton tak_sesuai5 = new JRadioButton("Tidak Sesuai");
    private JRadioButton Sesuai6 = new JRadioButton("Sesuai");
    private JRadioButton tak_sesuai6 = new JRadioButton("Tidak Sesuai");
    
    private JTextField input1 = new JTextField();
    private JTextField input2 = new JTextField();
    private JTextField input3 = new JTextField();
    private JTextField input4 = new JTextField();
    private JTextField input5 = new JTextField();
    private JTextField input6 = new JTextField();
    private JTextField input7 = new JTextField();
    private JTextField input8 = new JTextField();
    private JTextField input9 = new JTextField();
    private JTextField input10 = new JTextField();
    private JTextField input11 = new JTextField();
    private JTextField input12 = new JTextField();
    private JTextField input13 = new JTextField();
    private JTextField input14 = new JTextField();
    private JTextField input15 = new JTextField();
    private JTextField input16 = new JTextField();
    private JTextField input17 = new JTextField();
    private JTextField input18 = new JTextField();
    private JTextField input19 = new JTextField();
    private JTextField input20 = new JTextField();
    private JTextField input21 = new JTextField();
    private JTextField input22 = new JTextField();
    private JTextField input23 = new JTextField();
    private JTextField input24 = new JTextField();
    private JTextField input25 = new JTextField();
    private JTextField input26 = new JTextField();
    private JTextField input27 = new JTextField();
    private JTextField input28 = new JTextField();
    private JTextField input29 = new JTextField();
    private JTextField input30 = new JTextField();
    
    
    
    
    
    private JButton next = new JButton();
    private JButton TestConnection = new JButton();
    private JButton tombol1 = new JButton();
    private JButton tombol2 = new JButton();
    private JButton tombol3 = new JButton();
    private JButton tombol4 = new JButton();
    private JButton tombol5 = new JButton();
    private JButton tombol6 = new JButton();
    private JButton tombol7 = new JButton();

    public PanelGui() {
        // super("Tabbed Pane");
        setTitle("System Inventaris Ruangan");
        setSize(700, 700);
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
        TestConnection.addActionListener(this);
        next.setText("Next");
        next.setBounds(580, 600, 100, 30);
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

        panel2.add(label5, new AbsoluteConstraints(0, 28, 205, 10));
        panel2.add(label6, new AbsoluteConstraints(0, 75, 205, 10));
        panel2.add(label7, new AbsoluteConstraints(0, 125, 205, 10));
        panel2.add(label8, new AbsoluteConstraints(0, 175, 205, 10));
        panel2.add(label9, new AbsoluteConstraints(0, 225, 205, 10));
        
        panel2.add(input5, new AbsoluteConstraints(200, 20, 150, 30));
        panel2.add(input6, new AbsoluteConstraints(200, 70, 150, 30));
        panel2.add(input7, new AbsoluteConstraints(200, 120, 150, 30));
        panel2.add(input8, new AbsoluteConstraints(200, 170, 150, 30));
        panel2.add(input9, new AbsoluteConstraints(200, 220, 150, 30));
        panel2.add(tombol1, new AbsoluteConstraints(580, 600, 100, 30));
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
         
        panel3.add(label10, new AbsoluteConstraints(0, 20, 205, 10));
        panel3.add(label11, new AbsoluteConstraints(0, 65, 205, 10));
        panel3.add(label12, new AbsoluteConstraints(0, 110, 205, 10));
        panel3.add(label13, new AbsoluteConstraints(0, 155, 205, 10));
        panel3.add(label14, new AbsoluteConstraints(0, 200, 205, 10));
        panel3.add(label15, new AbsoluteConstraints(0, 245, 205, 10));
        panel3.add(label16, new AbsoluteConstraints(0, 290, 205, 10));
        panel3.add(label17, new AbsoluteConstraints(0, 335, 205, 10));
        panel3.add(label18, new AbsoluteConstraints(0, 380, 205, 10));
        panel3.add(label19, new AbsoluteConstraints(0, 425, 205, 10));
        panel3.add(label20, new AbsoluteConstraints(0, 470, 205, 10));
        panel3.add(label21, new AbsoluteConstraints(0, 515, 205, 10));
        
        
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
        panel3.add(tombol3, new AbsoluteConstraints(580, 600, 100, 30));
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
         label28 = new JLabel("Masukan Jumlah AC                : ");
         label29 = new JLabel("KOndisi  CCTV                           : ");
         label30 = new JLabel("Posisi CCTV                              : ");
         
         
         panel4.add(label22, new AbsoluteConstraints(0, 20, 205, 10));
        panel4.add(label23, new AbsoluteConstraints(0, 65, 205, 10));
        panel4.add(label24, new AbsoluteConstraints(0, 110, 205, 10));
        panel4.add(label25, new AbsoluteConstraints(0, 155, 205, 10));
        panel4.add(label26, new AbsoluteConstraints(0, 200, 205, 10));
        panel4.add(label27, new AbsoluteConstraints(0, 245, 205, 10));
        panel4.add(label28, new AbsoluteConstraints(0, 290, 205, 10));
        panel4.add(label29, new AbsoluteConstraints(0, 335, 205, 10));
        panel4.add(label30, new AbsoluteConstraints(0, 380, 205, 10));
         
        panel4.add(input22, new AbsoluteConstraints(200, 20, 150, 30));
        panel4.add(input23, new AbsoluteConstraints(200, 65, 150, 30));
        panel4.add(input24, new AbsoluteConstraints(200, 110, 150, 30));
        panel4.add(input25, new AbsoluteConstraints(200, 155, 150, 30));
        panel4.add(input26, new AbsoluteConstraints(200, 200, 150, 30));
        panel4.add(input27, new AbsoluteConstraints(200, 245, 150, 30));
        panel4.add(input28, new AbsoluteConstraints(200, 290, 150, 30));
        panel4.add(input29, new AbsoluteConstraints(200, 335, 150, 30));
        panel4.add(input30, new AbsoluteConstraints(200, 380, 150, 30));
        
        panel5 = new JPanel();
         //panel3.setBackground(Color.RED);
         panel5.setLayout(new AbsoluteLayout());
         tabpane.addTab("KondisiKelas ", null, panel5, null);
        label31 = new JLabel("Masukan Kondisi Lantai :");
        label32 = new JLabel("Masukan Kondisi Dinding :");
        label33 = new JLabel("Masukan Kondisi Atap :");
        label34 = new JLabel("Masukan Kondisi Pintu :");
        label35 = new JLabel("Masukan Kondisi Jendela :");
        
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

         tombol5.setText("Next");
         tombol6.setText("Back");
      

        
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
        
        panel5.add(tombol3, new AbsoluteConstraints(580, 600, 100, 30));
        panel5.add(tombol4, new AbsoluteConstraints(10, 600, 100, 30));
        panel5.add(tombol5, new AbsoluteConstraints(580, 600, 100, 30));
        panel5.add(tombol6, new AbsoluteConstraints(10, 600, 100, 30));
        
        testDB.testkoneksi();
        
         
        getContentPane().add(tabpane);
        // setSize(400, 300);

        setLocationRelativeTo(null);
        setVisible(true);

    }

  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        button.add(panel1.add(label1));
    }

}
