package new_tb;

/**
 *
 * @author Azure
 */
import java.util.Scanner;

public class Input extends Controler {

    RuangKelas RuangKelasObject = new RuangKelas();
    RuangKelas Ruang;
    Scanner scan = new Scanner(System.in);

    public RuangKelas getRuangKelas() {
        return Ruang;
    }

    void NamaKelas() {
        Header("Input Kelas");
        System.out.println("Masukkan Nama Ruang : ");
        RuangKelasObject.setNamaRuang(scan.nextLine());
        System.out.println("Masukkan Lokasi Ruang : ");
        RuangKelasObject.setLokasiRuang(scan.nextLine());
        System.out.println("Masukkan Program Study : ");
        RuangKelasObject.setProgramStudi(scan.nextLine());
        System.out.println("Masukkan Fakultas : ");
        RuangKelasObject.setFakultas(scan.nextLine());

        Ruang = new RuangKelas(RuangKelasObject.getNamaRuang(),
                RuangKelasObject.getLokasiRuang(),
                RuangKelasObject.getProgramStudi(),
                RuangKelasObject.getFakultas());
    }

    @Override
    void KondisiRuang() {
        Header("Kondisi Ruang");
        System.out.println("Masukkan Panjang Ruang : ");
        RuangKelasObject.setPanjangRuang(scan.nextInt());
        System.out.println("Masukkan Lebar Ruang : ");
        RuangKelasObject.setLebarRuang(scan.nextInt());
        System.out.println("Masukkan Jumlah Kursi : ");
        RuangKelasObject.setJumlahKursi(scan.nextInt());
        System.out.println("Masukkan Jumlah Pintu : ");
        RuangKelasObject.setJumlahPintu(scan.nextInt());
        System.out.println("Masukkan Jumlah Jendela : ");
        RuangKelasObject.setJumlahJendela(scan.nextInt());
        Ruang = new RuangKelas(RuangKelasObject.getPanjangRuang(),
                RuangKelasObject.getLebarRuang(),
                RuangKelasObject.getJumlahKursi(),
                RuangKelasObject.getJumlahPintu(),
                RuangKelasObject.getJumlahKursi());
    }

    @Override
    void Sarana() {
        Header("Kondisi Sarana");
        System.out.println("Masukkan Jumlah Stop Kontak : ");
        RuangKelasObject.setJumlahStopKontak(scan.nextInt());
        System.out.println("Masukkan Kondisi Stop Kontak : ");
        RuangKelasObject.setKondisiStopKontak(scan.next());
        System.out.println("Masukkan Posisi Stop Kontak : ");
        RuangKelasObject.setPosisiStopKontak(scan.next());
        System.out.println("Masukkan Jumlah Kabel LCD : ");
        RuangKelasObject.setJumlahKabelLCD(scan.nextInt());
        System.out.println("Masukkan Kondisi Kabel LCD : ");
        RuangKelasObject.setKondisiKabelLCD(scan.next());
        System.out.println("Masukkan Posisi Kabel LCD : ");
        RuangKelasObject.setPosisiKabelLCD(scan.next());
        System.out.println("Masukkan Jumlah Lampu : ");
        RuangKelasObject.setJumlahLampu(scan.nextInt());
        System.out.println("Masukkan Kondisi Lampu : ");
        RuangKelasObject.setKondisiLampu(scan.next());
        System.out.println("Masukkan Posisi Lampu : ");
        RuangKelasObject.setPosisiLampu(scan.next());
        System.out.println("Masukkan Jumlah Kipas Angin : ");
        RuangKelasObject.setJumlahKipasAngin(scan.nextInt());
        System.out.println("Masukkan Kondisi Kipas Angin : ");
        RuangKelasObject.setKondisiKipasAngin(scan.next());
        System.out.println("Masukkan Posisi Kipas Angin : ");
        RuangKelasObject.setPosisiKipasAngin(scan.next());
        System.out.println("Masukkan Jumlah AC : ");
        RuangKelasObject.setJumlahAC(scan.nextInt());
        System.out.println("Masukkan Kondisi AC : ");
        RuangKelasObject.setKondisiAC(scan.next());
        System.out.println("Masukkan Posisi AC : ");
        RuangKelasObject.setPosisiAC(scan.next());
        System.out.println("Masukkan SSID : ");
        RuangKelasObject.setSSID(scan.next());
        System.out.println("Masukkan Bandwidth : ");
        RuangKelasObject.setBandwidth(scan.next());
        System.out.println("Masukkan Jumlah CCTV : ");
        RuangKelasObject.setJumlahCCTV(scan.nextInt());
        System.out.println("Masukkan Kondisi CCTV : ");
        RuangKelasObject.setKondisiCCTV(scan.next());
        System.out.println("Masukkan Posisi CCTV : ");
        RuangKelasObject.setPosisiCCTV(scan.next());
        Ruang = new RuangKelas(RuangKelasObject.getJumlahStopKontak(),
                RuangKelasObject.getKondisiStopKontak(),
                RuangKelasObject.getPosisiStopKontak(),
                RuangKelasObject.getJumlahKabelLCD(),
                RuangKelasObject.getKondisiKabelLCD(),
                RuangKelasObject.getPosisiKabelLCD(),
                RuangKelasObject.getJumlahLampu(),
                RuangKelasObject.getKondisiLampu(),
                RuangKelasObject.getPosisiLampu(),
                RuangKelasObject.getJumlahKipasAngin(),
                RuangKelasObject.getKondisiKipasAngin(),
                RuangKelasObject.getPosisiKipasAngin(),
                RuangKelasObject.getJumlahAC(),
                RuangKelasObject.getKondisiAC(),
                RuangKelasObject.getPosisiAC(), RuangKelasObject.getSSID(),
                RuangKelasObject.getBandwidth(),
                RuangKelasObject.getJumlahCCTV(),
                RuangKelasObject.getKondisiCCTV(),
                RuangKelasObject.getPosisiCCTV());
    }

    void KondisiKelas() {
        Header("Kondisi Kelas");
        System.out.println("Masukkan Kondisi Lantai : ");
        RuangKelasObject.setKondisiLantai(scan.next());
        System.out.println("Masukkan Kondisi Dinding : ");
        RuangKelasObject.setKondisiDinding(scan.next());
        System.out.println("Masukkan Kondisi Atap : ");
        RuangKelasObject.setKondisiAtap(scan.next());
        System.out.println("Masukkan Kondisi Pintu : ");
        RuangKelasObject.setKondisiPintu(scan.next());
        System.out.println("Masukkan Kondisi Jendela : ");
        RuangKelasObject.setKondisiJendela(scan.next());
        Ruang = new RuangKelas(RuangKelasObject.getKondisiLantai(),
                RuangKelasObject.getKondisiDinding(),
                RuangKelasObject.getKondisiAtap(),
                RuangKelasObject.getKondisiPintu(),
                RuangKelasObject.getKondisiJendela());
    }

    @Override
    void Kebersihan() {
        Header("Kondisi Kebersihan");
        System.out.println("Masukkan Sirkulasi Udara: ");
        RuangKelasObject.setSirkulasiUdara(scan.next());
        System.out.println("Masukkan Nilai Pencahayaan : ");
        RuangKelasObject.setNilaiPencahayaan(scan.nextInt());
        System.out.println("Masukkan Kelembaban (%) : ");
        RuangKelasObject.setKelembaban(scan.nextInt());
        System.out.println("Masukkan Suhu (celcius) : ");
        RuangKelasObject.setSuhu(scan.nextInt());
        Ruang = new RuangKelas(RuangKelasObject.getSirkulasiUdara(),
                RuangKelasObject.getNilaiPencahayaan(),
                RuangKelasObject.getKelembaban(), RuangKelasObject.getSuhu());
    }

    @Override
    void Kenyamanan() {
        Header("Kondisi Kenyamanan");
        System.out.println("Masukkan Kebisingan : ");
        RuangKelasObject.setKebisingan(scan.next());
        System.out.println("Masukkan Bau : ");
        RuangKelasObject.setBau(scan.next());
        System.out.println("Masukkan Kebocoran : ");
        RuangKelasObject.setKebocoran(scan.next());
        System.out.println("Masukkan Kerusakan : ");
        RuangKelasObject.setKerusakan(scan.next());
        System.out.println("Masukkan Keausan : ");
        RuangKelasObject.setKeausan(scan.next());
        Ruang = new RuangKelas(RuangKelasObject.getKebisingan(),
                RuangKelasObject.getBau(), RuangKelasObject.getKebocoran(),
                RuangKelasObject.getKerusakan(), RuangKelasObject.getKeausan());

    }

    @Override
    void Keamanan() {
        Header("Kondisi Keamanan");
        System.out.println("Masukkan Kekokohan : ");
        RuangKelasObject.setKekokohan(scan.next());
        System.out.println("Masukkan Kunci Pintu dan Jendela : ");
        RuangKelasObject.setKunciPintuJendela(scan.next());
        System.out.println("Masukkan Bahaya : ");
        RuangKelasObject.setBahaya(scan.next());
        Ruang = new RuangKelas(RuangKelasObject.getKekokohan(),
                RuangKelasObject.getKunciPintuJendela(),
                RuangKelasObject.getBahaya());
    }

}
