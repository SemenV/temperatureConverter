package tempCon;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
	
	@Test
    public void testCelToKel() {
		MainClass q = new MainClass();
		Assert.assertEquals(273.15, q.p_CelToKel(0),0);
		Assert.assertEquals(283.15, q.p_CelToKel(10),0);
		Assert.assertEquals(293.15, q.p_CelToKel(20),0);
		Assert.assertEquals(303.15, q.p_CelToKel(30),0);
	
    }
	
	@Test
    public void testKelToCel() {
		MainClass q = new MainClass();
		Assert.assertEquals(0, q.p_KelToCel(273.15),0);
		Assert.assertEquals(10, q.p_KelToCel(283.15),0);
		Assert.assertEquals(20, q.p_KelToCel(293.15),0);
		Assert.assertEquals(30, q.p_KelToCel(303.15),0);
    }

}
