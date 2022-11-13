import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Testing_Trignometric_Functions {
	public double value = 0.0001;
	public double PI = 3.14159265358979323846;
	
	
	@Test
	 public void test_Degree_To_Radian() {
		
		assertEquals(Trignometry_functions.degree_to_Radian(90), PI/2, 0.001);
		assertEquals(Trignometry_functions.degree_to_Radian(60), PI/3, 0.001);
		assertEquals(Trignometry_functions.degree_to_Radian(30), PI/6, 0.001);
		assertEquals(Trignometry_functions.degree_to_Radian(-180), -PI, 0.001);
		assertEquals(Trignometry_functions.degree_to_Radian(-60), -1*PI/3, 0.001);
	}


	@Test
	 public void test_Radian_To_Degree() {
		
		assertEquals(Trignometry_functions.radian_to_Degree(PI/2), 90, 0.001);
		assertEquals(Trignometry_functions.radian_to_Degree(PI/3), 60, 0.001);
		assertEquals(Trignometry_functions.radian_to_Degree(PI/6), 30, 0.001);
		assertEquals(Trignometry_functions.radian_to_Degree(-1*PI), -180, 0.001);
		assertEquals(Trignometry_functions.radian_to_Degree(-1*PI/3), -60, 0.001);
	}
	@Test
	public void test_factorial() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.factorial(5),120, 0.001);
	}
	@Test
	public void test_power() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.power(4,2),Math.pow(4,2), 0.001);
	}

	
	
	@Test
	public void test_Sine_conversion() throws Factorial_Exception,Power_Exception {

		assertEquals(Trignometry_functions.sine(14), Math.sin(14), value);
		assertEquals(Trignometry_functions.sine(Trignometry_functions.degree_to_Radian(90)), Math.sin(PI / 2), value);
		assertEquals(Trignometry_functions.sine(Trignometry_functions.radian_to_Degree(PI)), Math.sin(180), value);


	}
	@Test
	public void test_Cosine_conversion() throws Factorial_Exception {

		
		assertEquals(Trignometry_functions.cosine(0), Math.cos(0), value);
		assertEquals(Math.round(Trignometry_functions.cosine(Trignometry_functions.degree_to_Radian(90))),Math.round(Math.cos((PI) / 2)), value);
		assertEquals(Trignometry_functions.cosine(Trignometry_functions.radian_to_Degree(PI)), Math.cos(180), value);


	}
//	
	@Test
	public void test_Tangent_conversion() throws Factorial_Exception, Tangent_Exception {

		
		assertEquals(Trignometry_functions.tangent(0), Math.tan(0), value);
		assertEquals(Trignometry_functions.tangent(Trignometry_functions.degree_to_Radian(180)), Math.tan(PI), value);
		assertEquals(Trignometry_functions.tangent(Trignometry_functions.radian_to_Degree(2*PI)), Math.tan(360), value);


	}
	
//	
	public void test_Sine_FirstQuadrant() throws Factorial_Exception{
		assertEquals(Trignometry_functions.sine(0), Math.sin(0), value);
		assertEquals(Trignometry_functions.sine(35), Math.sin(35), value);
		assertEquals(Trignometry_functions.sine(75), Math.sin(75), value);
	}
	@Test 
	public void test_Sine_secondQuadrant() throws Factorial_Exception{
		assertEquals(Trignometry_functions.sine(95), Math.sin(95), value);
		assertEquals(Trignometry_functions.sine(115), Math.sin(115), value);
		assertEquals(Trignometry_functions.sine(145), Math.sin(145), value);
	}
	@Test
	public void test_Sine_thirdQuadrant() throws Factorial_Exception{
		assertEquals(Trignometry_functions.sine(185), Math.sin(185), value);
		assertEquals(Trignometry_functions.sine(215), Math.sin(215), value);
		assertEquals(Trignometry_functions.sine(245), Math.sin(245), value);
		
	}
	@Test
	public void test_Sine_fourthQuadrant() throws Factorial_Exception{
		assertEquals(Trignometry_functions.sine(285), Math.sin(285), value);
		assertEquals(Trignometry_functions.sine(315), Math.sin(315), value);
		assertEquals(Trignometry_functions.sine(345), Math.sin(345), value);
		
	}
	@Test
	public void test_Sine_Normalization() throws Factorial_Exception {

		assertEquals(Trignometry_functions.sine(12), Math.sin(12), value);
		assertEquals(Trignometry_functions.sine(PI * 6), Math.sin(PI * 6), value);
		assertEquals(Trignometry_functions.sine((5 * PI) / 2), Math.sin((5 * PI) / 2), value);
		assertEquals(Trignometry_functions.sine(10 / PI), Math.sin(10 / PI), value);

	}
//	
	@Test
	public void test_Sine_Negative() throws Factorial_Exception {

		assertEquals(Trignometry_functions.sine(-2 * PI), Math.sin(-2 * PI), value);
		assertEquals(Trignometry_functions.sine((-3 * PI) / 4), Math.sin((-3 * PI) / 4), value);

	}
//	
//	
	
	public void test_Cosine_FirstQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.cosine(0),Math.cos(0),value);
		assertEquals(Trignometry_functions.cosine(25),Math.cos(25),value);
		assertEquals(Trignometry_functions.cosine(65),Math.cos(65),value);
		
	}
	@Test
	public void test_Cosine_SecondQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.cosine(105),Math.cos(105),value);
		assertEquals(Trignometry_functions.cosine(125),Math.cos(125),value);
		assertEquals(Trignometry_functions.cosine(175),Math.cos(175),value);
		
	}
	@Test
	public void test_Cosine_ThirdQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.cosine(195),Math.cos(195),value);
		assertEquals(Trignometry_functions.cosine(215),Math.cos(215),value);
		assertEquals(Trignometry_functions.cosine(235),Math.cos(235),value);
		
	}
	@Test
	public void test_Cosine_FourthQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.cosine(295),Math.cos(295),value);
		assertEquals(Trignometry_functions.cosine(305),Math.cos(305),value);
		assertEquals(Trignometry_functions.cosine(335),Math.cos(335),value);
		
	}
	@Test
	public void test_Cosine_Normalization() throws Factorial_Exception {

		assertEquals(Trignometry_functions.cosine(12), Math.cos(12), value);
		assertEquals(Trignometry_functions.cosine(PI * 6), Math.cos(PI * 6), value);
		assertEquals(Trignometry_functions.cosine((5 * PI) / 2), Math.cos((5 * PI) / 2), value);
		assertEquals(Trignometry_functions.cosine(10 / PI), Math.cos(10 / PI), value);

	}
//	
	@Test
	public void test_Cosine_Negative() throws Factorial_Exception {

		assertEquals(Trignometry_functions.cosine(-2 * PI), Math.cos(-2 * PI), value);
		assertEquals(Trignometry_functions.cosine((-3 * PI) / 4), Math.cos((-3 * PI) / 4), value);

	}
	
	
	@Test
	public void test_Tangent_Exception()  {
	 Throwable exception = assertThrows(
	            Tangent_Exception.class, () -> {
	            	Trignometry_functions.tangent((PI / 2));
	            }
	    );
	 assertEquals("Not Defined", exception.getMessage());
	}


	
	@Test
	
	public void test_Tangent_FirstQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.tangent(0),Math.tan(0),value);
		assertEquals(Trignometry_functions.tangent(35),Math.tan(35),value);
		assertEquals(Trignometry_functions.tangent(75),Math.tan(75),value);
		
	}
	@Test
	public void test_Tangent_SecondQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.tangent(115),Math.tan(115),value);
		assertEquals(Trignometry_functions.tangent(155),Math.tan(155),value);
		assertEquals(Trignometry_functions.tangent(175),Math.tan(175),value);
		
	}
	@Test
	public void test_Tangent_ThirdQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.tangent(195),Math.tan(195),value);
		assertEquals(Trignometry_functions.tangent(205),Math.tan(205),value);
		assertEquals(Trignometry_functions.tangent(235),Math.tan(235),value);
		
	}
	@Test
	public void test_Tangent_FourthQuadrant() throws Factorial_Exception
	{
		assertEquals(Trignometry_functions.tangent(285),Math.tan(285),value);
		assertEquals(Trignometry_functions.tangent(295),Math.tan(295),value);
		assertEquals(Trignometry_functions.tangent(315),Math.tan(315),value);
		
	}
	@Test
	public void test_Tangent_Normalization() throws Factorial_Exception {

		assertEquals(Trignometry_functions.cosine(12), Math.cos(12), value);
		assertEquals(Trignometry_functions.tangent(PI * 6), Math.tan(PI * 6), value);
	}

	@Test
	public void test_Tangent_Negative() throws Factorial_Exception {

		assertEquals(Trignometry_functions.tangent(-2 * PI), Math.tan(-2 * PI), value);
		assertEquals(Trignometry_functions.tangent((-3 * PI) / 4), Math.tan((-3 * PI) / 4), value);

	}
//	

//	assertEquals(Trignometry_functions.sine((3 * PI) / 2), Math.sin((3 * PI) / 2), value);
//	assertEquals(Trignometry_functions.sine(2 * PI), Math.sin(2 * PI), value);
//
//	assertEquals(Trignometry_functions.sine(PI / 4), Math.sin(PI / 4), value);
//	assertEquals(Trignometry_functions.sine((3 * PI) / 4), Math.sin((3 * PI) / 4), value);
//	assertEquals(Trignometry_functions.sine((5 * PI) / 4), Math.sin((5 * PI) / 4), value);
//	assertEquals(Trignometry_functions.sine((7 * PI) / 4), Math.sin((7 * PI) / 4), value);
	
	
//	assertEquals(Trignometry_functions.tangent(PI / 4), Math.tan(PI / 4), value);
//	assertEquals(Trignometry_functions.tangent((3 * PI) / 4), Math.tan((3 * PI) / 4), value);
//	assertEquals(Trignometry_functions.tangent((5 * PI) / 4), Math.tan((5 * PI) / 4), value);
//	assertEquals(Trignometry_functions.tangent((7 * PI) / 4), Math.tan((7 * PI) / 4), value);

	
//	assertEquals(Trignometry_functions.cosine((3 * PI) / 2), Math.cos((3 * PI) / 2), value);
//	assertEquals(Trignometry_functions.cosine(2 * PI), Math.cos(2 * PI), value);
//
//	
//	assertEquals(Trignometry_functions.cosine(PI / 4), Math.cos(PI / 4), value);
//	assertEquals(Trignometry_functions.cosine((3 * PI) / 4), Math.cos((3 * PI) / 4), value);
//	assertEquals(Trignometry_functions.cosine((5 * PI) / 4), Math.cos((5 * PI) / 4), value);
//	assertEquals(Trignometry_functions.cosine((7 * PI) / 4), Math.cos((7 * PI) / 4), value);
}
