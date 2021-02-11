package org.o7planning.simplewebapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_JTDS {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection connection = SQLServerConnUtils_JTDS.getSQLServerConnection_JTDS();
	System.out.println(connection.isClosed());
    }

    // Connect to SQLServer
    // (Using JDBC Driver of JTDS library)
    public static Connection getSQLServerConnection_JTDS() //
	    throws SQLException, ClassNotFoundException {

	// Note: Change the connection parameters accordingly.
	String hostName = "localhost";
	String sqlInstanceName = "SQLEXPRESS";
	String database = "mytest";
	String userName = "sa";
	String password = "123";

	return getSQLServerConnection_JTDS(hostName, sqlInstanceName, database, userName, password);
    }

    static Connection conn = null;

    // Connect to SQLServer, using JTDS library
    private static Connection getSQLServerConnection_JTDS(String hostName, String sqlInstanceName, String database, String userName, String password) throws ClassNotFoundException, SQLException {

	// Example:
	// jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS

	if (conn == null) {
	    Class.forName("net.sourceforge.jtds.jdbc.Driver");
	    String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" + database + ";instance=" + sqlInstanceName;
	    conn = DriverManager.getConnection(connectionURL, userName, password);
	}

	return conn;
    }

}