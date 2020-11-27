package com.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

	@Test
	public void givenMaxNumberAtFirstPosition_ReturnMaximumValueSame() {
		FindMax maxValue=new FindMax();
		Integer result =maxValue.max(9, 8, 3);
		Assert.assertSame(9, result);
	}
	@Test
	public void givenMaxNumberAtSecondPosition_ReturnMaximumValueSame() {
		FindMax maxValue=new FindMax();
		Integer result =maxValue.max(8,18, 3);
		Assert.assertSame(18, result);
	}
	@Test
	public void givenMaxNumberAtThirdPosition_ReturnMaximumValueSame() {
		FindMax maxValue=new FindMax();
		Integer result =maxValue.max(9, 8, 13);
		Assert.assertSame(13, result);
	}
}
