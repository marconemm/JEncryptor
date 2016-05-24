package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class SQLServerConnection_DL {

    private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private volatile String strConn;
    protected volatile static Connection conn;
    protected volatile PreparedStatement prepSta;
    protected volatile ResultSet resSet;

    public SQLServerConnection_DL() {
        //It's the default constructor method:
        this.prepSta = null;
        this.resSet = null;
//        this.strConn = "jdbc:sqlserver://[youserver].database.windows.net:1433;";
//        this.strConn += "database=[YourDataBase];";
//        this.strConn += "user=[yourlogin]@[yourserver];";
//        this.strConn += "password=[YourPass];";
//        this.strConn += "encrypt=true;";
//        this.strConn += "trustServerCertificate=false;";
//        this.strConn += "hostNameInCertificate=*.database.windows.net;";
//        this.strConn += "loginTimeout=30;";

        this.strConn = "jdbc:sqlserver://[YourPCName]:1433;";
        this.strConn += "database=[YourDatabase];";
        this.strConn += "user=[YourLogin];";
        this.strConn += "password=[YourPassword];";
    }

    public boolean connect() throws SQLException, ClassNotFoundException {
        //make the connection with the Database:
        Class.forName(driver);
        conn = DriverManager.getConnection(strConn);
        return !conn.isClosed();
    } // connect()

    public boolean disconnect() throws SQLException {
        //ends the connection with the Database:
        if (this.prepSta != null) {
            this.prepSta.clearBatch();
            this.prepSta.clearParameters();
            this.prepSta.clearWarnings();
            this.prepSta.close();
        }

        if (this.resSet != null) {
            this.resSet.close();
            this.resSet = null;
        }

        if (conn != null) {
            conn.clearWarnings();
            conn.close();
            conn = null;
        }
        return (conn == null);
    } // disconnect()
}
