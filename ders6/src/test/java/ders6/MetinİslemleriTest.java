package ders6;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MetinİslemleriTest {

	@Test
	public void testBuyukharf() {
		String sonuc = Metinİslemleri
				.buyukharf("okul");
		Assert.assertEquals("OKUL", sonuc);
		
	}

}
