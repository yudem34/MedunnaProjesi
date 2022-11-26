package stepDefinitions.DB;

import utilities.ConfigReader;

import java.sql.*;

public class US_12 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // ConfigReader.getProperty("urlDB"),ConfigReader.getProperty("userDB"),ConfigReader.getProperty("passwordDB")
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(ConfigReader.getProperty("urlDB"),ConfigReader.getProperty("userDB"),ConfigReader.getProperty("passwordDB"));
        Statement st = con.createStatement();

        //1. Example:  region id'si 1 olan "country name" değerlerini çağırın.
        String sql1 = "SELECT country_name FROM countries WHERE region_id=1";
        boolean r1 = st.execute(sql1);
        System.out.println(r1); // true ya da false verir cunku data cagırma islemi yaptık

        //Recordları gormek icin executeQuery() methodunu kullanmalıyız
        ResultSet result1 = st.executeQuery(sql1);

    }
}
