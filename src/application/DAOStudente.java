package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOStudente {

	
	private final String DBUrl = "jdbc:mysql://localhost:3306/panifici";

	private String user;

	private String passw;

	private Connection c=null;
	
	public DAOStudente(String user, String passw) {

		this.user = user;

		this.passw = passw;

		//connectDB();
	}
	
	private void connectDB() {

		try {

			if (c==null) c=DriverManager.getConnection(DBUrl,user,passw);

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public void closeDB() {

		try {

			c.close();

			c=null;

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	





}
