package org.apache.commons.math.random;


public class GaussianRandomGeneratorTest extends junit.framework.TestCase {
	public GaussianRandomGeneratorTest(java.lang.String name) {
		super(name);
	}

	public void testMeanAndStandardDeviation() {
		org.apache.commons.math.random.RandomGenerator rg = new org.apache.commons.math.random.JDKRandomGenerator();
		rg.setSeed(17399225432L);
		org.apache.commons.math.random.GaussianRandomGenerator generator = new org.apache.commons.math.random.GaussianRandomGenerator(rg);
		double[] sample = new double[10000];
		for (int i = 0 ; i < (sample.length) ; ++i) {
			sample[i] = generator.nextNormalizedDouble();
		}
		junit.framework.Assert.assertEquals(0.0, org.apache.commons.math.stat.StatUtils.mean(sample), 0.012);
		junit.framework.Assert.assertEquals(1.0, org.apache.commons.math.stat.StatUtils.variance(sample), 0.01);
	}
}

