package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class getter_and_setter_test {
	@Test
	void test() {
		paitentwindow win =new paitentwindow();
		win.setdocname("Sanjog");
		String a= win.getdocname();
		assertEquals("Sanjog",a);
	}
}
