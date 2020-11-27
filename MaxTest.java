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
}
