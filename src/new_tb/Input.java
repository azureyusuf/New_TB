package new_tb;

/**
 *
 * @author Azure
 */
import java.util.Scanner;
import javax.swing.*;
import new_tb.Controler;


public class Input extends Controler {
    //PanelTab gui = new PanelTab();
    RuangKelas RuangKelasObject = new RuangKelas();
    RuangKelas Ruang;
  
    Scanner scan = new Scanner(System.in);
     
    public RuangKelas getRuangKelas() {
        return Ruang;
    }

    void NamaKelas( JTextField a,JTextField b,JTextField c,JTextField d ) {
        
        RuangKelasObject.setNamaRuang(a.getText());
        RuangKelasObject.setLokasiRuang(b.getText());
        RuangKelasObject.setProgramStudi(c.getText());
        RuangKelasObject.setFakultas(d.getText());
       // JOptionPane.showMessageDialog(a,RuangKelasObject.getNamaRuang());
        
        
    }

    void KondisiRuang(JTextField a,JTextField b,JTextField c,JTextField d,JTextField e) {
        
        
        RuangKelasObject.setPanjangRuang(Integer.parseInt(a.getText()));
        
        RuangKelasObject.setLebarRuang(Integer.parseInt (b.getText()));;
        //System.out.println("Masukkan Jumlah Kursi : ");
        RuangKelasObject.setJumlahKursi(Integer.parseInt (c.getText()));;
        //System.out.println("Masukkan Jumlah Pintu : ");
        RuangKelasObject.setJumlahPintu(Integer.parseInt (d.getText()));;
        //System.out.println("Masukkan Jumlah Jendela : ");
        RuangKelasObject.setJumlahJendela(Integer.parseInt (e.getText()));;
        Ruang = new RuangKelas(RuangKelasObject.getPanjangRuang(),
                RuangKelasObject.getLebarRuang(),
                RuangKelasObject.getJumlahKursi(),
                RuangKelasObject.getJumlahPintu(),
                RuangKelasObject.getJumlahKursi());
    }

    
    void Sarana(JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,JTextField a6,
            JTextField a7,JTextField a8,JTextField a9,JTextField a10,JTextField a11,JTextField a12,
            JTextField a13,JTextField a14,JTextField a15,JTextField a16,JTextField a17,JTextField a18,JTextField a19,JTextField a20) {
        //Header("Kondisi Sarana");
        //System.out.println("Masukkan Jumlah Stop Kontak : ");
        RuangKelasObject.setJumlahStopKontak(Integer.parseInt(a1.getText()));
        //System.out.println("Masukkan Kondisi Stop Kontak : ");
        RuangKelasObject.setKondisiStopKontak(a2.getText());
        //System.out.println("Masukkan Posisi Stop Kontak : ");
        RuangKelasObject.setPosisiStopKontak(a3.getText());
        //System.out.println("Masukkan Jumlah Kabel LCD : ");
        RuangKelasObject.setJumlahKabelLCD(Integer.parseInt(a4.getText()));
        //System.out.println("Masukkan Kondisi Kabel LCD : ");
        RuangKelasObject.setKondisiKabelLCD(a5.getText());
        //System.out.println("Masukkan Posisi Kabel LCD : ");
        RuangKelasObject.setPosisiKabelLCD(a6.getText());
        //System.out.println("Masukkan Jumlah Lampu : ");
        RuangKelasObject.setJumlahLampu(Integer.parseInt(a7.getText()));
        //System.out.println("Masukkan Kondisi Lampu : ");
        RuangKelasObject.setKondisiLampu(a8.getText());
        //System.out.println("Masukkan Posisi Lampu : ");
        RuangKelasObject.setPosisiLampu(a9.getText());
        //System.out.println("Masukkan Jumlah Kipas Angin : ");
        RuangKelasObject.setJumlahKipasAngin(Integer.parseInt(a10.getText()));
        //System.out.println("Masukkan Kondisi Kipas Angin : ");
        RuangKelasObject.setKondisiKipasAngin(a11.getText());
        //System.out.println("Masukkan Posisi Kipas Angin : ");
        RuangKelasObject.setPosisiKipasAngin(a12.getText());
        //System.out.println("Masukkan Jumlah AC : ");
        RuangKelasObject.setJumlahAC(Integer.parseInt(a13.getText()));
        //System.out.println("Masukkan Kondisi AC : ");
        RuangKelasObject.setKondisiAC(a14.getText());
        //System.out.println("Masukkan Posisi AC : ");
        RuangKelasObject.setPosisiAC(a15.getText());
        //System.out.println("Masukkan SSID : ");
        RuangKelasObject.setSSID(a16.getText());
        //System.out.println("Masukkan Bandwidth : ");
        RuangKelasObject.setBandwidth(a17.getText());
        //System.out.println("Masukkan Jumlah CCTV : ");
        RuangKelasObject.setJumlahCCTV(Integer.parseInt(a18.getText()));
        //System.out.println("Masukkan Kondisi CCTV : ");
        RuangKelasObject.setKondisiCCTV(a19.getText());
        //System.out.println("Masukkan Posisi CCTV : ");
        RuangKelasObject.setPosisiCCTV(a20.getText());
           }

    void Kebersihan (String a,String b,String c,String d,String e) {
        
        RuangKelasObject.setKondisiLantai(a);
        //System.out.println("Masukkan Kondisi Dinding : ");
        RuangKelasObject.setKondisiDinding(b);
        //System.out.println("Masukkan Kondisi Atap : ");
        RuangKelasObject.setKondisiAtap(c);
        //System.out.println("Masukkan Kondisi Pintu : ");
        RuangKelasObject.setKondisiPintu(d);
        //System.out.println("Masukkan Kondisi Jendela : ");
        RuangKelasObject.setKondisiJendela(e);
        Ruang = new RuangKelas(RuangKelasObject.getKondisiLantai(),
                RuangKelasObject.getKondisiDinding(),
                RuangKelasObject.getKondisiAtap(),
                RuangKelasObject.getKondisiPintu(),
                RuangKelasObject.getKondisiJendela());
    }

    
    void KondisiKelas (String a , JTextField b,JTextField c,JTextField d) {
     //   Header("Kondisi Kebersihan");
       // System.out.println("Masukkan Sirkulasi Udara: ");
        RuangKelasObject.setSirkulasiUdara(a);
      //  System.out.println("Masukkan Nilai Pencahayaan : ");
        RuangKelasObject.setNilaiPencahayaan(Integer.parseInt(b.getText()));
        //System.out.println("Masukkan Kelembaban (%) : ");
        RuangKelasObject.setKelembaban(Integer.parseInt(c.getText()));
        //System.out.println("Masukkan Suhu (celcius) : ");
        RuangKelasObject.setSuhu(Integer.parseInt(d.getText()));
        Ruang = new RuangKelas(RuangKelasObject.getSirkulasiUdara(),
                RuangKelasObject.getNilaiPencahayaan(),
                RuangKelasObject.getKelembaban(), RuangKelasObject.getSuhu());
    }

    //@Override
    void Kenyamanan(String a,String b,String c,String d,String e) {
        //Header("Kondisi Kenyamanan");
        //System.out.println("Masukkan Kebisingan : ");
        RuangKelasObject.setKebisingan(a);
      //  System.out.println("Masukkan Bau : ");
        RuangKelasObject.setBau(b);
        //System.out.println("Masukkan Kebocoran : ");
        RuangKelasObject.setKebocoran(c);
        //System.out.println("Masukkan Kerusakan : ");
        RuangKelasObject.setKerusakan(d);
        //System.out.println("Masukkan Keausan : ");
        RuangKelasObject.setKeausan(e);
        Ruang = new RuangKelas(RuangKelasObject.getKebisingan(),
                RuangKelasObject.getBau(), RuangKelasObject.getKebocoran(),
                RuangKelasObject.getKerusakan(), RuangKelasObject.getKeausan());

    }

   
    void Keamanan(String a, String b, String c) {
        Header("Kondisi Keamanan");
       // System.out.println("Masukkan Kekokohan : ");
        RuangKelasObject.setKekokohan(scan.next());
        //System.out.println("Masukkan Kunci Pintu dan Jendela : ");
        RuangKelasObject.setKunciPintuJendela(scan.next());
        //System.out.println("Masukkan Bahaya : ");
        RuangKelasObject.setBahaya(scan.next());
        Ruang = new RuangKelas(RuangKelasObject.getKekokohan(),
                RuangKelasObject.getKunciPintuJendela(),
                RuangKelasObject.getBahaya());
    }

    @Override
    int KondisiRuang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Sarana() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Kebersihan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Kenyamanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void Keamanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
