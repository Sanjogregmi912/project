package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;



public class test_time {
	@Test
	void test() {
		class Test_currentTime {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			@Test
			void test() {
				String value = dtf.format(now);
				register res =new register();
				String result = res.Currenttime();
				assertEquals(value,result);
				
			}
	}
	}

}
