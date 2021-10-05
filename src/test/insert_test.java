package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;



class insert_test {

	@Test
	void test() {
		int value;
		String f_name ="a";
		String l_name = "b";
		String sql = "insert into register"
					+"(first_name,last_name)"
					+"values('"+f_name+"','"+l_name+"')";
		String query = "select first_name from register";	
		dbOperation1 db = new dbOperation1();
		int ans = db.insert(sql);
		ResultSet rs = db.select(query);
		value = 0;
		try {
		if (rs.next()){
		value = 1;
		}
		} catch (SQLException throwables) {
		throwables.printStackTrace();
		}
		assertEquals(1,ans);
	}

}
