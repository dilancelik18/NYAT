import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VeritabaniIslem implements IVeritabani{
    private Connection baglan() {

        Connection conn = null;
        String url= "jdbc:postgresql://localhost:5432/kullanici";
        try {
            conn = DriverManager.getConnection(url,"postgres","dilan1518");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public boolean girisYap(String k_adi, String pass) { // Başarılı bir şekilde giriş yapılıp yapılmadığını döndürür
        try {
            boolean girisDurumu = false;

            Connection conn = this.baglan(); // Veritabanı bağlantısı yapılır

            // Konsoldan girilen bilgilere uygun kişiyi veritabanından seçmek için gerekli SQL sorgusu yazılır
            String sql = "SELECT *  FROM \"Kullanıcı\" WHERE \"Ad\"='" + k_adi + "' and \"Sifre\"='" + pass + "'";

            // Sorgu çalıştırılır
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Veritabanı bağlantısı sonlandırılır
            conn.close();

            Thread.sleep(500);
            if (!rs.next()) { // Veritabanından dönen ResultSet boş ise böyle bir kullanıcı yoktur
                System.out.println("Böyle bir kullanıcı bulunamadı...");
                girisDurumu = false;
            } else { // ResultSet boş değilse giriş başarılıdır
                System.out.println("Giriş başarılı...");
                girisDurumu=true;

            }


            rs.close();
            stmt.close();
            return girisDurumu;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

