package mainpackage;

import com.microsoft.sqlserver.jdbc.*;
import java.sql.*;

public class database {

    public static void main(String[] args) {
        try {
            System.setProperty("java.net.preferIPv6Addresses", "true");
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser("sa");
            ds.setPassword("Sqlserver2005");
            ds.setServerName("59.90.86.214");
            ds.setPortNumber(1433);
            ds.setDatabaseName("OnlineJobrpt");
            Connection con = ds.getConnection();
            Statement statement = con.createStatement();
            System.out.println(con.isClosed());
            SQLServerResultSet result = (SQLServerResultSet) statement.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE'");
            ResultSetMetaData meta_data = result.getMetaData();
//            for (int i = 1; i <= meta_data.getColumnCount(); i++) {
//                System.out.println(meta_data.getColumnName(i));
//            }
            while (result.next()) {
                System.out.println(result.getString(1));
//        }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
