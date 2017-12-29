package selenium1.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	public DBConnector() {
		super();
	}
	
	private static Connection con;
	
	public static Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
		return con;
	}

}
