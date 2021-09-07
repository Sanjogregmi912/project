import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class dbOperation1 {

	Connection con;
	Statement st;
	String url = "jdbc:mysql://127.0.0.1:3306/paitent";
	String user = "root";
	String PAssword= "sheisurs";
	int val;
	ResultSet rows;
	
	
	public dbOperation1() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,PAssword);
			
			if(con != null) {
				System.out.println("successs");
				
			}
			st=con.createStatement();

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public int insert(String query) {
		 try {
			val= st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
		 
		
	}
	public ResultSet select(String query) {
		try {
		 rows =st.executeQuery(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rows;
	}
	
	public int update(String query) {
		try {
		 val = st.executeUpdate(query);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return val;
	}
	public int delete(String query) {
		try {
			val = st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
		
	}
		
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		new dbOperation1(); 
	}

}
