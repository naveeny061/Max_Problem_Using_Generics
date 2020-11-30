package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void givenMaxIntegrNumberAtFirstPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Integer result = maxValue.Maximum(9, 8, 3, 6);
		Assert.assertSame(9, result);
	}

	@Test
	public void givenMaxIntegerNumberAtSecondPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Integer result = maxValue.Maximum(8, 18, 3, 6);
		Assert.assertSame(18, result);
	}

	@Test
	public void givenMaxIntegerNumberAtThirdPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Integer result = maxValue.Maximum(9, 8, 13, 6);
		Assert.assertSame(13, result);
	}

	@Test
	public void givenMaxIntegerNumberAtFourthPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Integer result = maxValue.Maximum(9, 8, 6, 13);
		Assert.assertSame(13, result);
	}

	@Test
	public void givenMaxFloatNumberAtFirstPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Float result = maxValue.Maximum(9.12f, 8.21f, 3.214f, 3.32f);
		Assert.assertEquals(9.12f, result, 0.0f);
	}

	@Test
	public void givenMaxFloatNumberAtSecondPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Float result = maxValue.Maximum(9.12f, 18.21f, 3.214f, 3.32f);
		Assert.assertEquals(18.21f, result, 0.0f);
	}

	@Test
	public void givenMaxFloatNumberAtThirdPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Float result = maxValue.Maximum(9.12f, 18.21f, 31.214f, 3.32f);
		Assert.assertEquals(31.214f, result, 0.0f);
	}

	@Test
	public void givenMaxFloatNumberAtFourthPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		Float result = maxValue.Maximum(9.12f, 18.21f, 3.32f, 31.214f);
		Assert.assertEquals(31.214f, result, 0.0f);
	}

	@Test
	public void givenMaxStringAtFirstPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		String result = maxValue.Maximum("Peach", "Apple", "Bannana", "Orrange");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void givenMaxStringAtSecondPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		String result = maxValue.Maximum("Apple", "Peach", "Bannana", "Orrange");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void givenMaxStringAtThirdPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		String result = maxValue.Maximum("Bannana", "Apple", "Peach", "Orrange");
		Assert.assertEquals("Peach", result);
	}

	@Test
	public void givenMaxStringAtFouthPosition_ReturnMaximumValueSame() {
		FindMax maxValue = new FindMax();
		String result = maxValue.Maximum("Bannana", "Apple", "Orrange", "Peach");
		Assert.assertEquals("Peach", result);
	}
}
