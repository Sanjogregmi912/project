package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class delete_test {
	@Test
	void test() {
		int value;
	
		String sql = "delete from register where id =1";
				
		String query = "select first_name from register where id =1 ";	
		dbOperation1 db = new dbOperation1();
		int ans = db.update(sql);
		ResultSet rs = db.select(query);
		value = 0;
		try {
		if (rs.next()){
		value = 0;
		}
		} catch (SQLException throwables) {
		throwables.printStackTrace();
		}
		assertEquals(0,ans);
	}
}
