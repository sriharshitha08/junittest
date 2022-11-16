package junittestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		junitfuncations obj = new junitfuncations();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezxc",obj.add_str(a, b));
		
	}
	@Test
	public void test1() {
		junitfuncations obj = new junitfuncations();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezx",obj.add_str(a, b));
		
	}

}