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
import javax.swing.JOptionPane;

public class Analisis extends Controler {

    //PanelTab gui = new PanelTab();

    Input InputObject = new Input();
    Output OutputObject = new Output();
    RuangKelas ruangObject = new RuangKelas();

    int KondisiFinal = 0;
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

    int AnalisisKondisiRuangan(int a, int b,int c , int d,int e,int status) {
        int luas,rasio;
        int w=0;
        if (a > b){
        JOptionPane.showMessageDialog(null,"Kelas Persegi Panjang");
        w++;
        }
        else if (a < b ){
        JOptionPane.showMessageDialog(null,"Kelas tidak Persegi Panjang");
        }
        luas = a * d;
        rasio = luas / c;
        if (rasio >= 0.5){
        JOptionPane.showMessageDialog(null, "Rasio sesuai");
        w++;
        }
        else if (rasio <= 0.5){
        JOptionPane.showMessageDialog(null, "Rasio tak sesuai");
        }
        status = w;
       return status; 
    }
    
    int AnalisisKondisiStopKontak(int jumlah, int baik) {
        int c = 0;
        int kondisi = 0;
        for (int a = 0; a < jumlah; a++) {
            String loop = JOptionPane.showInputDialog("Kondisi StopKontak ke " + (a + 1) + "    : 1.Baik\t 2.Buruk");
            int q = Integer.parseInt(loop);
            if (q == 1) {
                c++;

            }
        }
        int d = jumlah - c;

        String bagus = Integer.toString(c);
        String buruk = Integer.toString(d);
        String p = "KondisiStopKontak";
        JOptionPane.showMessageDialog(null, "Kondisi Baik =" + bagus + "   Buruk = " + buruk, "KondisiStopKontak", JOptionPane.INFORMATION_MESSAGE);
        if (c >= 4) {
            kondisi = 1;
        }

        return baik = baik = kondisi;
    }

    int AnalisisPosisiStopKontak(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah Posisi Stop Kontak di Dekat Dosen? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        }
        String loop2 = JOptionPane.showInputDialog("Apakah Posisi Stop Kontak di Pojok Ruangan? 1.ya 2.tidak");
        int cek2 = Integer.parseInt(loop2);
        if (cek2 == 1) {
            count++;
            System.out.print(count);
        }

        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Tidak ada Di keDuanya");
            // JOptionPane.showMessageDialog(null,"Tidak ada Di keDuanya",JOptionPane.WARNING_MESSAGE);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Hanya ada di pojok / di dekat dosen");
        } else if (count == 2) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisKondisiKabelLCD(int jumlah, int baik) {

        int c = 0;
        int kondisi = 0;
        for (int a = 0; a < jumlah; a++) {
            String loop = JOptionPane.showInputDialog("Kondisi KabelLCD ke " + (a + 1) + "    : 1.Baik\t 2.Buruk");
            int q = Integer.parseInt(loop);
            if (q == 1) {
                c++;

            }
        }
        int d = jumlah - c;

        String bagus = Integer.toString(c);
        String buruk = Integer.toString(d);
        String p = "KabelLCD";
        JOptionPane.showMessageDialog(null, "Kondisi Baik =" + bagus + "   Buruk = " + buruk, "KondisiStopKontak", JOptionPane.INFORMATION_MESSAGE);
        if (c >= 1) {
            kondisi = 1;
        }
        return baik = baik = kondisi;
    }

    int AnalisisPosisiKabelLCD(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah Posisi Kabel LCD di Dekat Dosen? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Posisi salah");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisKondisiLampu(int jumlah, int baik) {
        int c = 0;
        int kondisi = 0;
        for (int a = 0; a < jumlah; a++) {
            String loop = JOptionPane.showInputDialog("KondisiLampu ke " + (a + 1) + "    : 1.Baik\t 2.Buruk");
            int q = Integer.parseInt(loop);
            if (q == 1) {
                c++;

            }
        }
        int d = jumlah - c;

        String bagus = Integer.toString(c);
        String buruk = Integer.toString(d);
        String p = "KondisiLampu";
        JOptionPane.showMessageDialog(null, "Kondisi Baik =" + bagus + "   Buruk = " + buruk, "KondisiStopKontak", JOptionPane.INFORMATION_MESSAGE);
        if (c >= 18) {
            kondisi = 1;
        }

        return baik = baik = kondisi;
    }

    int AnalisisPosisiLampu(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah Posisi Lampu di Atap? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Posisi salah");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisKondisiKipasAngin(int jumlah, int baik) {
        int c = 0;
        int kondisi = 0;
        for (int a = 0; a < jumlah; a++) {
            String loop = JOptionPane.showInputDialog("Kondisi Kipas Angin " + (a + 1) + "    : 1.Baik\t 2.Buruk");
            int q = Integer.parseInt(loop);
            if (q == 1) {
                c++;

            }
        }
        int d = jumlah - c;

        String bagus = Integer.toString(c);
        String buruk = Integer.toString(d);
        String p = "KondisiKipasAngin";
        JOptionPane.showMessageDialog(null, "Kondisi Baik =" + bagus + "   Buruk = " + buruk, "KondisiStopKontak", JOptionPane.INFORMATION_MESSAGE);
        if (c >= 2) {
            kondisi = 1;
        }

        return baik = baik = kondisi;
    }

    int AnalisisPosisiKipasAngin(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah Posisi KipasAngin di Atap? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Posisi salah");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisKondisiAC(int jumlah, int baik) {
        int c = 0;
        int kondisi = 0;
        for (int a = 0; a < jumlah; a++) {
            String loop = JOptionPane.showInputDialog("Kondisi Kondisi AC " + (a + 1) + "    : 1.Baik\t 2.Buruk");
            int q = Integer.parseInt(loop);
            if (q == 1) {
                c++;

            }
        }
        int d = jumlah - c;

        String bagus = Integer.toString(c);
        String buruk = Integer.toString(d);
        String p = "KondisiAC";
        JOptionPane.showMessageDialog(null, "Kondisi Baik =" + bagus + "   Buruk = " + buruk, "KondisiStopKontak", JOptionPane.INFORMATION_MESSAGE);
        if (c >= 1) {
            kondisi = 1;
        }

        return baik = baik = kondisi;
    }

    int AnalisisPosisiAC(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah Posisi AC di Samping/Belakang? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Posisi salah");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisSSID(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah SSID anda UMM HOTSPOT? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Posisi salah");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisBandwith(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah  anda Bisa login? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        } else if (count == 0) {
            JOptionPane.showMessageDialog(null, "Posisi salah");
        }

        posisi = posisi + count;
        return posisi;
    }

    int AnalisisKondisiCCTV(int jumlah, int baik) {
        int c = 0;
        int kondisi = 0;
        for (int a = 0; a < jumlah; a++) {
            String loop = JOptionPane.showInputDialog("Masukan Kondisi AC " + (a + 1) + "    : 1.Baik\t 2.Buruk");
            int q = Integer.parseInt(loop);
            if (q == 1) {
                c++;

            }
        }
        int d = jumlah - c;

        String bagus = Integer.toString(c);
        String buruk = Integer.toString(d);
        String p = "KondisiCCTV";
        JOptionPane.showMessageDialog(null, "Kondisi Baik =" + bagus + "   Buruk = " + buruk, "KondisiStopKontak", JOptionPane.INFORMATION_MESSAGE);
        if (c >= 1) {
            kondisi = 1;
        }

        return baik = baik = kondisi;
    }

    int AnalisisPosisiCCTV(int posisi) {

        int count = 0;
        String loop1 = JOptionPane.showInputDialog("Apakah Posisi CCTV ada yg di depan? 1.ya 2.tidak");
        int cek1 = Integer.parseInt(loop1);
        if (cek1 == 1) {
            count++;
            System.out.print(count);
        }
        String loop2 = JOptionPane.showInputDialog("Apakah Posisi SCCTV ada yg di Belakang? 1.ya 2.tidak");
        int cek2 = Integer.parseInt(loop2);
        if (cek2 == 1) {
            count++;
            System.out.print(count);
        }

        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Tidak ada Di keDuanya");
            // JOptionPane.showMessageDialog(null,"Tidak ada Di keDuanya",JOptionPane.WARNING_MESSAGE);
        } else if (count == 1) {
            JOptionPane.showMessageDialog(null, "Hanya ada di depan / belakang");
        } else if (count == 2) {
            JOptionPane.showMessageDialog(null, "Posisi Terpenuhi");
        }

        posisi = posisi + count;
        return posisi;
    }

   
     int AnalisisKebersihan(int radio, int status)
    {
       if (radio == 5){
         JOptionPane.showMessageDialog(null,"Kondisi kebersihan Sesuai");
         status = 1;
       }
       else if (radio == 4){
       JOptionPane.showMessageDialog(null,"Kondisi kebersihan Hampir Sesuai");
       status = 0;
       }
       else if (radio == 3){
       JOptionPane.showMessageDialog(null,"Kondisi kebersihan kurang Sesuai");
       status = 0;
       }
       else if (radio == 2){
       JOptionPane.showMessageDialog(null,"Kondisi kebersihan Tidak Sesuai");
       status = 0;
       }
       else if (radio == 1){
       JOptionPane.showMessageDialog(null,"Kondisi kebersihan Sangat tidak sesuai");
       status = 0;
       }
       else if (radio == 0){
       JOptionPane.showMessageDialog(null,"Kondisi kebersihan Sangat buruk");
       status = 0;
       }
    
    
        return status;
    }
    
    int AnalisisKelembapankelas(int cahaya,int suhu,int kelembapan,int lancar,int status){
        int count = 0;
        int test;
        
        if (lancar == 1){
        count++;
       JOptionPane.showMessageDialog(null, "Sirkulasi udara Sesuai");
        }
        else {
       JOptionPane.showMessageDialog(null, "Sirkulasi udara buruk");
        }
        
       if (cahaya >= 250  &&   cahaya <= 350 ){
       count++;
       JOptionPane.showMessageDialog(null, "Pencahayaan  Sesuai");
       }
       else {
        JOptionPane.showMessageDialog(null, "Pencahayaan kurang Sesuai");
       }
        if (kelembapan >= 70   && kelembapan <=80 ){
      count++;
       JOptionPane.showMessageDialog(null, "kelembapan  Sesuai");
       }
       else {
        JOptionPane.showMessageDialog(null, "kelembapan kurang Sesuai");
       }
        
        if (suhu >=   25 && suhu <=35 ){
       count++;
        
       JOptionPane.showMessageDialog(null, "Suhu  Sesuai");
       }
       else {
        JOptionPane.showMessageDialog(null, "Suhu kurang Sesuai");
       }
     
      
       return count; 
    }
     
     int AnalisisKenyamanan(int radio, int status)
    {
       if (radio == 5){
         JOptionPane.showMessageDialog(null,"Kondisi Kenyamanan Sesuai");
         status = 1;
       }
       else if (radio == 4){
       JOptionPane.showMessageDialog(null,"Kondisi Kenyamanan Hampir Sesuai");
       status = 0;
       }
      else if (radio == 3){
       JOptionPane.showMessageDialog(null,"Kondisi Kenyamanan Hampir Sesuai");
       status = 0;
       }
       else if (radio == 2){
       JOptionPane.showMessageDialog(null,"Kondisi Kenyamanan Tidak Sesuai");
       status = 0;
       }
       else if (radio == 1){
       JOptionPane.showMessageDialog(null,"Kondisi Kenyamanan Tidak Sesuai");
       status = 0;
       }
       
       
    
    
        return status;
    }
    
     int AnalisisKeamanan(int radio, int status)
    {
       if (radio == 3){
         JOptionPane.showMessageDialog(null,"Kondisi Keamanan Sesuai");
         status = 1;
       }
       else if (radio == 2){
       JOptionPane.showMessageDialog(null,"Kondisi Keamanan Hampir Sesuai");
       status = 0;
       }
      
       else if (radio == 1){
       JOptionPane.showMessageDialog(null,"Kondisi Keamanan Tidak Sesuai");
       status = 0;
       }
       
       
    
    
        return status;
    }
    
     
     
    @Override
    int KondisiRuang() {
         int a=0;
        if (ruangObject.getPanjangRuang() != ruangObject
                .getLebarRuang()) {
            System.out.println("Bentuk Ruangan Persegi panjang");
            System.out.println("Ruangan Sesuai");
            a++;
        } else {
            System.out.println("Bentuk Ruangan Tidak Persegi panjang");
            System.out.println("Ruangan Sesuai");
        }
        Rasio = Luas / ruangObject.getJumlahKursi();
        if (Rasio >= 0.5) {
            System.out.println("Rasio Ruangan Sesuai");
            a++;
        } else {
            System.out.println("Rasio Ruangan Tidak Sesuai");
        }
        if (ruangObject.getJumlahJendela() >= 1) {
            System.out.println("Jumlah Cendela Sesuai");
            a++;
        } else {
            System.out.println("Jumlah Jendela tidak sesuai");
        }
        if (ruangObject.getJumlahPintu() >= 2) {
            System.out.println("Jumlah Pintu sesuai");
            a++;
        } else {
            System.out.println("Jumlah Pintu tidak sesuai");
        }
        OutputObject.get(ruangObject.getPanjangRuang(),
                ruangObject.getLebarRuang(),
                ruangObject.getJumlahKursi(),
                ruangObject.getJumlahPintu(),
                ruangObject.getJumlahJendela());
    return a;
    }

    double KondisiKelas() {
        // ruangObject = InputObject.get;
        if (ruangObject.getJumlahStopKontak() >= 4) {
            System.out.println("Jumlah Stop Kontak Sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Tidak Sesusai");
        }
        if (ruangObject.getKondisiStopKontak().equalsIgnoreCase("baik")) {
            System.out.println("KondisiFinal Stop Kontak Sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (ruangObject.getPosisiStopKontak().equalsIgnoreCase(
                "DekatDosen")
                || ruangObject.getPosisiStopKontak().equalsIgnoreCase(
                        "PojokKelas")) {
            System.out.println("Posisi Sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Posisi Tidak Sesuai");
        }
        if (ruangObject.getJumlahKabelLCD() >= 1) {
            System.out.println("Jumlah Kabel LCD Sesuai");
            KondisiFinal++;

        } else {
            System.out.println("Jumlah Kabel LCD Tidak Sesuai");
        }
        if (ruangObject.getKondisiKabelLCD().equalsIgnoreCase("baik")
                || ruangObject.getKondisiKabelLCD().equalsIgnoreCase(
                        "berfungsi")) {
            System.out.println("KondisiKabelLCD : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")) {
            System.out.println("PosisiKabelLCD : s");
            KondisiFinal++;
        } else {
            System.out.println("Posisi kabel LCD Tidak sesuai");
        }
        if (ruangObject.getJumlahLampu() >= 18) {
            System.out.println("Jumlah Lampu Sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Jumlah Lampu tidak Sesuai");
        }
        if (ruangObject.getKondisiLampu().equalsIgnoreCase("baik")) {
            System.out.println("KondisiFinal lampu sesuai");
            KondisiFinal++;
        } else {
            System.out.println("kondisi Lampu tidak sesuai");
        }
        if (ruangObject.getPosisiLampu().equalsIgnoreCase("atap")) {
            System.out.println("Posisi Lampu Sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Posisi Lampu tidak sesuai");
        }
        if (ruangObject.getJumlahKipasAngin() >= 2) {
            System.out.println("Jumlah Kipas angin sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Jumlah kipas angin tidak sesuai");
        }
        if (ruangObject.getPosisiKipasAngin().equalsIgnoreCase("atap")) {
            System.out.println("Posisi kipas angin sesuai");
            KondisiFinal++;
        } else {
            System.out.println("posisi Kipas Angin tidak sesuai");
        }
        if (ruangObject.getKondisiKipasAngin().equalsIgnoreCase("baik")) {
            System.out.println("KondisiFinal Kipas angin sesuai");
            KondisiFinal++;
        } else {
            System.out.println("KondisiFinal kipas angin tidak sesuai");
        }
        if (ruangObject.getJumlahAC() >= 1) {
            System.out.println("Jumlah AC Sesuai");
            KondisiFinal++;
        } else {
            System.out.println("Jumlah AC Tidak Sesuai");
        }
        if (ruangObject.getKondisiAC().equalsIgnoreCase("baik")) {
            System.out.println("KondisiFinalAC : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
            KondisiFinal++;
        }
        if (ruangObject.getPosisiAC().equalsIgnoreCase("belakang")
                || ruangObject.getPosisiAC().equalsIgnoreCase("samping")) {
            System.out.println("PosisiAC : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getSSID().equalsIgnoreCase("ummhotspot")) {
            System.out.println("getSSID : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getBandwidth().equalsIgnoreCase("bisa")) {
            System.out.println("Bandwidth : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getJumlahCCTV() >= 2) {
            System.out.println("JumlahCCTV : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getKondisiCCTV().equalsIgnoreCase("baik")) {
            System.out.println("KondisiFinalCCTV : s");
            KondisiFinal++;
        } else {
            System.out.println("Tidak s");
        }
        if (ruangObject.getPosisiCCTV().equalsIgnoreCase("depanbelakang")) {
            System.out.println("PosisiCCTV : s");
            KondisiFinal++;
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
        return KondisiFinal;
    }

    
    
   
            
    @Override
    void Sarana() {
        // TODO Auto-generated method stub

    }

//    @Override
  //  void Kebersihan() {
        // TODO Auto-generated method stub

    //}

    @Override
    void Kenyamanan() {
        // TODO Auto-generated method stub

    }

    @Override
    void Keamanan() {
        // TODO Auto-generated method stub

    }

    @Override
    void Kebersihan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
