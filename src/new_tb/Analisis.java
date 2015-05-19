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
public class Analisis extends Controler {

    Input InputObject = new Input();
    Output OutputObject = new Output();
    RuangKelas ruangObject = new RuangKelas();

    public Analisis() {

    }

    int Kondisi = 0;
    private double Luas;
    private double Rasio;

    public double getLuas() {
        return Luas;
    }

    public void setLuas(double luas) {
        Luas = luas;
    }

    public double getRasio() {
        return Rasio;
    }

    public void setRasio(double rasio) {
        Rasio = rasio;
    }

    double Luas() {
        Luas = ruangObject.getPanjangRuang()
                * ruangObject.getLebarRuang();
        return Luas;
    }

    @Override
    void Header(String Masukan) {

    }

    @Override
    void KondisiRuang() {

        if (ruangObject.getPanjangRuang() != ruangObject
                .getLebarRuang()) {
            System.out.println("Bentuk Ruangan Persegi panjang");
            System.out.println("Ruangan Sesuai");
        } else {
            System.out.println("Bentuk Ruangan Tidak Persegi panjang");
            System.out.println("Ruangan Sesuai");
        }
        Rasio = Luas / ruangObject.getJumlahKursi();
        if (Rasio >= 0.5) {
            System.out.println("Rasio Ruangan Sesuai");
            Kondisi++;
        } else {
            System.out.println("Rasio Ruangan Tidak Sesuai");
        }
        if (ruangObject.getJumlahJendela() >= 1) {
            System.out.println("Jumlah Cendela Sesuai");
            Kondisi++;
        } else {
            System.out.println("Jumlah Jendela tidak sesuai");
        }
        if (ruangObject.getJumlahPintu() >= 2) {
            System.out.println("Jumlah Pintu sesuai");
            Kondisi++;
        } else {
            System.out.println("Jumlah Pintu tidak sesuai");
        }
        OutputObject.get(ruangObject.getPanjangRuang(),
                ruangObject.getLebarRuang(),
                ruangObject.getJumlahKursi(),
                ruangObject.getJumlahPintu(),
                ruangObject.getJumlahJendela());

    }

    double KondisiKelas() {
        ruangObject = InputObject.getRuangKelas();
        if (ruangObject.getJumlahStopKontak() >= 4) {
            System.out.println("Jumlah Stop Kontak Sesuai");
            Kondisi++;
        } else {
            System.out.println("Tidak Sesusai");
        }
        if (ruangObject.getKondisiStopKontak().equalsIgnoreCase("baik")) {
            System.out.println("Kondisi Stop Kontak Sesuai");
            Kondisi++;
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (ruangObject.getPosisiStopKontak().equalsIgnoreCase(
                "DekatDosen")
                || ruangObject.getPosisiStopKontak().equalsIgnoreCase(
                        "PojokKelas")) {
            System.out.println("Posisi Sesuai");
            Kondisi++;
        } else {
            System.out.println("Posisi Tidak Sesuai");
        }
        if (ruangObject.getJumlahKabelLCD() >= 1) {
            System.out.println("Jumlah Kabel LCD Sesuai");
            Kondisi++;

        } else {
            System.out.println("Jumlah Kabel LCD Tidak Sesuai");
        }
        if (ruangObject.getKondisiKabelLCD().equalsIgnoreCase("baik")
                || ruangObject.getKondisiKabelLCD().equalsIgnoreCase(
                        "berfungsi")) {
            System.out.println("KondisiKabelLCD : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")) {
            System.out.println("PosisiKabelLCD : s");
            Kondisi++;
        } else {
            System.out.println("Posisi kabel LCD Tidak sesuai");
        }
        if (ruangObject.getJumlahLampu() >= 18) {
            System.out.println("Jumlah Lampu Sesuai");
            Kondisi++;
        } else {
            System.out.println("Jumlah Lampu tidak Sesuai");
        }
        if (ruangObject.getKondisiLampu().equalsIgnoreCase("baik")) {
            System.out.println("Kondisi lampu sesuai");
            Kondisi++;
        } else {
            System.out.println("kondisi Lampu tidak sesuai");
        }
        if (ruangObject.getPosisiLampu().equalsIgnoreCase("atap")) {
            System.out.println("Posisi Lampu Sesuai");
            Kondisi++;
        } else {
            System.out.println("Posisi Lampu tidak sesuai");
        }
        if (ruangObject.getJumlahKipasAngin() >= 2) {
            System.out.println("Jumlah Kipas angin sesuai");
            Kondisi++;
        } else {
            System.out.println("Jumlah kipas angin tidak sesuai");
        }
        if (ruangObject.getPosisiKipasAngin().equalsIgnoreCase("atap")) {
            System.out.println("Posisi kipas angin sesuai");
            Kondisi++;
        } else {
            System.out.println("posisi Kipas Angin tidak sesuai");
        }
        if (ruangObject.getKondisiKipasAngin().equalsIgnoreCase("baik")) {
            System.out.println("Kondisi Kipas angin sesuai");
            Kondisi++;
        } else {
            System.out.println("Kondisi kipas angin tidak sesuai");
        }
        if (ruangObject.getJumlahAC() >= 1) {
            System.out.println("Jumlah AC Sesuai");
            Kondisi++;
        } else {
            System.out.println("Jumlah AC Tidak Sesuai");
        }
        if (ruangObject.getKondisiAC().equalsIgnoreCase("baik")) {
            System.out.println("KondisiAC : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
            Kondisi++;
        }
        if (ruangObject.getPosisiAC().equalsIgnoreCase("belakang")
                || ruangObject.getPosisiAC().equalsIgnoreCase("samping")) {
            System.out.println("PosisiAC : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getSSID().equalsIgnoreCase("ummhotspot")) {
            System.out.println("getSSID : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getBandwidth().equalsIgnoreCase("bisa")) {
            System.out.println("Bandwidth : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getJumlahCCTV() >= 2) {
            System.out.println("JumlahCCTV : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getKondisiCCTV().equalsIgnoreCase("baik")) {
            System.out.println("KondisiCCTV : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getPosisiCCTV().equalsIgnoreCase("depanbelakang")) {
            System.out.println("PosisiCCTV : s");
            Kondisi++;
        } else {
            System.out.println("Tidak s");
        }
        OutputObject.get(ruangObject.getJumlahStopKontak(),
                ruangObject.getKondisiStopKontak(),
                ruangObject.getPosisiStopKontak(),
                ruangObject.getJumlahKabelLCD(),
                ruangObject.getKondisiKabelLCD(),
                ruangObject.getPosisiKabelLCD(),
                ruangObject.getJumlahLampu(),
                ruangObject.getKondisiLampu(),
                ruangObject.getPosisiLampu(),
                ruangObject.getJumlahKipasAngin(),
                ruangObject.getKondisiKipasAngin(),
                ruangObject.getPosisiKipasAngin(),
                ruangObject.getJumlahAC(),
                ruangObject.getKondisiAC(),
                ruangObject.getPosisiAC(), 
                ruangObject.getSSID(),
                ruangObject.getBandwidth(),
                ruangObject.getJumlahCCTV(),
                ruangObject.getKondisiCCTV(),
                ruangObject.getPosisiCCTV());
        return Kondisi;
    }

    @Override
    void Sarana() {
        // TODO Auto-generated method stub

    }

    @Override
    void Kebersihan() {
        // TODO Auto-generated method stub

    }

    @Override
    void Kenyamanan() {
        // TODO Auto-generated method stub

    }

    @Override
    void Keamanan() {
        // TODO Auto-generated method stub

    }
}
