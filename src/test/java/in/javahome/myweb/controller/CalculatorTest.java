package in.javahome.myweb.controller;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	Calculator cal = new Calculator();

//	public void testAdd() {
//		Properties prop = new Properties();
//
//		OutputStream output = null;
//
//		try
//		{
//
//			output = new FileOutputStream("../config.properties");
//
//			// set the properties value
//			prop.setProperty("database", "localhost");
//			prop.setProperty("dbuser", "hari");
//			prop.setProperty("dbpassword", "password");
//
//			// save properties to project root folder
//			prop.store(output, null);
//
//		}catch(
//		IOException io)
//		{
//			io.printStackTrace();
//		}finally
//		{
//			if (output != null) {
//				try {
//					output.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//
//		}
//	}

	public void testAdd(){
		Assert.assertEquals(cal.add(2,3), 5);
	}

	public void testMultiply() {
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
}
