package new_tb;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Connector {

    public void testkoneksi() {
        // TODO code application logic here
        String Dburl = "jdbc:mysql://localhost:3306/db_ruangkelas";
        String username = "root";
        String Password = "";

        Connection dbCon = null;
        Statement st = null;
        ResultSet res = null;

        String quary = "SELECT * FROM `identias";
        try {
            dbCon = DriverManager.getConnection(Dburl, username, Password);
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
//           res.getString(quary)

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");

        }
    }

    public void Simpan1(JTextField a, JTextField b, JTextField c, JTextField d) {

        try {
            if (a.getText().equals("") || b.getText().equals("") || c.getText().equals("") || d.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");

            } else {

                String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();

                st.executeUpdate(
                        "insert into identias"
                        + "(NamaRuang, LokasiRuang, ProgramStudi, Fakultas) values ('" + a.getText() + "','" + b.getText() + "','" + c.getText() + "','" + d.getText() + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }

    public void Simpan2(String a, int b, int c, int d, int e, int f) {

        try {

            String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "insert into tb_kondisiruang"
                    + "(NamaRuang, PanjangRuang, LebarRuang, JumlahKursi,JumlahPintu,JumlahJendela) values ('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "','" + f + "')");

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }

    public void Simpan3(String a, JTextField a1, JTextField a2, JTextField a3, JTextField a4, JTextField a5, JTextField a6,
            JTextField a7, JTextField a8, JTextField a9, JTextField a10, JTextField a11, JTextField a12,
            JTextField a13, JTextField a14, JTextField a15, JTextField a16, JTextField a17, JTextField a18, JTextField a19, JTextField a20) {

        try {

            String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "insert into tb_sarana"
                    + "(NamaRuang, JumlahStopKontak, KondisiStopKontak, PosisiStopKontak,JumlahKabelLCD,KondisiKabelLCD,PosisiKabelLCD,JumlahLampu,KondisiLampu,PosisiLampu,JumlahKipasAngin,KondisiKipasAngin,PosisiKipasAngin,JumlahAC,KondisiAC,PosisiAC,SSID) "
                    + "values ('" + a + "','" + Integer.parseInt(a1.getText()) + "','" + a2.getText() + "','" + a3.getText() + "','" + Integer.parseInt(a4.getText())
                    + "','" + a5.getText() + "','" + a6.getText() + "','" + Integer.parseInt(a7.getText())
                +"','" + a8.getText() + "','"
                + a9.getText() + "','" + Integer.parseInt(a10.getText()) + "','" + a11.getText() + "','" + a12.getText() + "','" + Integer.parseInt(a13.getText()) + "','"
                + a14.getText() + "','" + a15.getText() + "','" + a16.getText() + "','" + a17.getText() + "','"
                + Integer.parseInt(a18.getText()) + "','" + a19.getText() + "','" + a20.getText() + "')");
        

              
                JOptionPane.showMessageDialog(null, "Dat berhasil disimpan");

    }
    catch (SQLException ex){

    
        
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
    }
}
    
    public void Simpan4(String a,String b,String c,String d,String e,String f) {

        try {

            String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "insert into tb_kondisikelas"
                    + "(NamaRuang, KondisiLantai, KondisiDinding, KondisiAtap,KondisiPintu,KondisiJendela) values ('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "')'");

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }
    
    public void Simpan5(String a,String a1  , JTextField b,JTextField c,JTextField d) {

        try {
           

                String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
                Connection conn = DriverManager.getConnection(url, "root", "");
                Statement st = conn.createStatement();

                st.executeUpdate(
                        "insert into tb_kebersihan"
                        + "(NamaRuang, SirkulasiUdara, NilaiPencahayaan, Kelembaban,Suhu) values ('" + a + "','"+b+"','" + Integer.parseInt(b.getText()) + "','" +Integer.parseInt(c.getText()) + "','" + Integer.parseInt(d.getText()) + "')");

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }
    
    public void Simpan6(String a,String b,String c,String d,String e,String f) {

        try {

            String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "insert into tb_kenyamanan"
                    + "(NamaRuang, Kebisingan, Bau, Kebocoran,Kerusakan,Keausan) values ('" + a + "','" + b + "','" + c + "','" + d + "','" + e +"','" + f + "')'");

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }
    
    public void Simpan7(String a,String b,String c, String d) {

        try {

            String url = "jdbc:mysql://localhost:3306/db_ruangkelas";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement st = conn.createStatement();

            st.executeUpdate(
                    "insert into tb_kenyamanan"
                    + "(NamaRuang, Kekokohan, KunciPintuJendela, Bahaya) values ('" + a + "','" + b + "','" + c + "','" + d + "')'");

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan! : " + ex);
        }
    }
}  

