/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_tb;

/**
 *
 * @author Azure
 */
public class Output implements Interface {

    public void get(String NamaRuang, String LokasiRuang, String ProgramStudi,
            String Fakultas) {
        System.out.println(" Identitas Kelas");
        System.out.println("Nama Ruang : " + NamaRuang);
        System.out.println("klskasi Ruang : " + LokasiRuang);
        System.out.println("Fakultas : " + Fakultas);
        System.out.println("Program Studi : " + ProgramStudi);
    }

    public void get(int PanjangRuang, int LebarRuang, int JumlahKursi,
            int JumlahPintu, int JumlahJendela) {
        System.out.println(" Kondisi Ruang Kelas ");
        System.out.println("Panjang Ruang : " + PanjangRuang);
        System.out.println("Lebar Ruang : " + LebarRuang);
        System.out.println("Jumlah Kursi : " + JumlahKursi);
        System.out.println("Jumlah Pintu : " + JumlahPintu);
        System.out.println("Jumlah Jendela : " + JumlahJendela);
    }

    public void get(int JumlahStopKontak, String KondisiStopKontak,
            String PosisiStopKontak, int JumlahKabelLCD,
            String KondisiKabelLCD, String PosisiKabelLCD, int JumlahLampu,
            String KondisiLampu, String PosisiLampu, int JumlahKipasAngin,
            String KondisiKipasAngin, String PosisiKipasAngin, int JumlahAC,
            String KondisiAC, String PosisiAC, String SSID, String Bandwidth,
            int JumlahCCTV, String KondisiCCTV, String PosisiCCTV) {
        System.out.println(" Kondisi Sarana ");
        System.out.println("Jumlah Stop Kontak : " + JumlahStopKontak);
        System.out.println("Kondisi Stop Kontak : " + KondisiStopKontak);
        System.out.println("Posisi Stop Kontak : " + PosisiStopKontak);
        System.out.println("Jumlah Kabel LCD : " + JumlahKabelLCD);
        System.out.println("Kondisi Kabel LCD : " + KondisiKabelLCD);
        System.out.println("Posisi Kabel LCD : " + PosisiKabelLCD);
        System.out.println("Jumlah Lampu : " + JumlahLampu);
        System.out.println("Kondisi Lampu : " + KondisiLampu);
        System.out.println("Posisi Lampu : " + PosisiLampu);
        System.out.println("Jumlah Kipas Angin : " + JumlahKipasAngin);
        System.out.println("Kondisi Kipas Angin : " + KondisiKipasAngin);
        System.out.println("Posisi Kipas Angin : " + PosisiKipasAngin);
        System.out.println("Jumlah AC : " + JumlahAC);
        System.out.println("Kondisi AC : " + KondisiAC);
        System.out.println("Posisi AC : " + PosisiAC);
        System.out.println("SSID : " + SSID);
        System.out.println("Bandwidth : " + Bandwidth);
        System.out.println("Jumlah CCTV : " + JumlahCCTV);
        System.out.println("Kondisi CCTV : " + KondisiCCTV);
        System.out.println("Posisi CCTV : " + PosisiCCTV);
    }

    public void get(String KondisiLantai, String KondisiDinding,
            String KondisiAtap, String KondisiPintu, String KondisiJendela) {
        System.out
                .println("Kondisi Lingkungan");
        System.out.println("Kondisi Lantai : " + KondisiLantai);
        System.out.println("Kondisi Dinding : " + KondisiDinding);
        System.out.println("Kondisi Atap : " + KondisiAtap);
        System.out.println("Kondisi Pintu : " + KondisiPintu);
        System.out.println("Kondisi Jendela : " + KondisiJendela);
    }

    public void get(String SirkulasiUdara, int NilaiPencahayaan, int Kelembaban,
            int Suhu) {
        System.out.println("Kenyamanan");
        System.out.println("Sirkulasi Udara : " + SirkulasiUdara);
        System.out.println("Nilai Pencahayaan " + NilaiPencahayaan);
        System.out.println("Kelembaban : " + Kelembaban);
        System.out.println("Suhu : " + Suhu);
    }

    public void get(String Kebisingan, String Bau, String Kebocoran,
            String Kerusakan, String Keausan, String x) {
        System.out.println("Keamanan");
        System.out.println("Kebisingan : " + Kebisingan);
        System.out.println("Bau : " + Bau);
        System.out.println("Kebocoran : " + Kebocoran);
        System.out.println("Kerusakan : " + Kerusakan);
        System.out.println("Keausan : " + Keausan);
    }

    public void get(String Kekokohan, String KunciPintuJendela, String Bahaya) {
        System.out.println("Keamanan");
        System.out.println("Kekokohan : " + Kekokohan);
        System.out.println("Kunci Pintu dan Jendela : " + KunciPintuJendela);
        System.out.println("Bahaya : " + Bahaya);
    }
}
