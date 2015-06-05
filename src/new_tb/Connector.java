package new_tb;



import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class Connector {
 
    public static void testkoneksi() {
        // TODO code application logic here
        String Dburl ="jdbc:mysql://localhost:3306/db_ruangkelas";
        String username="root";
        String Password="";
        
        Connection dbCon =null;
        Statement stmt =null;
        ResultSet res=null;
            
        String quary ="SELECT * FROM `identias";
        try{
            dbCon = DriverManager.getConnection(Dburl,username,Password);
            JOptionPane.showMessageDialog(null,"koneksi berhasil");
           // res.getString(quary)
            
            
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "koneksi gagal");
            
        }
    }
    
}