package org.apache.commons.math.distribution;


public class BetaDistributionTest extends junit.framework.TestCase {
	public void testCumulative() throws org.apache.commons.math.MathException {
		double[] x = new double[]{ -0.1 , 0.0 , 0.1 , 0.2 , 0.3 , 0.4 , 0.5 , 0.6 , 0.7 , 0.8 , 0.9 , 1.0 , 1.1 };
		checkCumulative(0.1, 0.1, x, new double[]{ 0.0 , 0.0 , 0.4063850939 , 0.4397091902 , 0.4628041861 , 0.4821200456 , 0.5 , 0.5178799544 , 0.5371958139 , 0.5602908098 , 0.5936149061 , 1.0 , 1.0 });
		checkCumulative(0.1, 0.5, x, new double[]{ 0.0 , 0.0 , 0.7048336221 , 0.7593042194 , 0.7951765304 , 0.8234948385 , 0.8480017124 , 0.870603437 , 0.8926585878 , 0.9156406404 , 0.9423662883 , 1.0 , 1.0 });
		checkCumulative(0.1, 1.0, x, new double[]{ 0.0 , 0.0 , 0.7943282347 , 0.8513399225 , 0.8865681506 , 0.9124435366 , 0.9330329915 , 0.9502002165 , 0.9649610951 , 0.9779327685 , 0.9895192582 , 1.0 , 1.0 });
		checkCumulative(0.1, 2.0, x, new double[]{ 0.0 , 0.0 , 0.8658177758 , 0.9194471163 , 0.9486279211 , 0.9671901487 , 0.9796846411 , 0.9882082252 , 0.993909928 , 0.9974914239 , 0.9994144508 , 1.0 , 1.0 });
		checkCumulative(0.1, 4.0, x, new double[]{ 0.0 , 0.0 , 0.9234991121 , 0.9661958941 , 0.9842285085 , 0.9928444112 , 0.997004066 , 0.9989112804 , 0.9996895625 , 0.9999440793 , 0.9999967829 , 1.0 , 1.0 });
		checkCumulative(0.5, 0.1, x, new double[]{ 0.0 , 0.0 , 0.05763371168 , 0.08435935962 , 0.10734141216 , 0.12939656302 , 0.1519982876 , 0.17650516146 , 0.20482346963 , 0.24069578055 , 0.29516637795 , 1.0 , 1.0 });
		checkCumulative(0.5, 0.5, x, new double[]{ 0.0 , 0.0 , 0.2048327647 , 0.2951672353 , 0.3690101196 , 0.4359057832 , 0.5 , 0.5640942168 , 0.6309898804 , 0.7048327647 , 0.7951672353 , 1.0 , 1.0 });
		checkCumulative(0.5, 1.0, x, new double[]{ 0.0 , 0.0 , 0.316227766 , 0.4472135955 , 0.5477225575 , 0.632455532 , 0.7071067812 , 0.7745966692 , 0.8366600265 , 0.894427191 , 0.9486832981 , 1.0 , 1.0 });
		checkCumulative(0.5, 2.0, x, new double[]{ 0.0 , 0.0 , 0.4585302607 , 0.6260990337 , 0.7394254526 , 0.8221921916 , 0.8838834765 , 0.9295160031 , 0.9621590305 , 0.9838699101 , 0.996117463 , 1.0 , 1.0 });
		checkCumulative(0.5, 4.0, x, new double[]{ 0.0 , 0.0 , 0.6266250826 , 0.8049844719 , 0.8987784842 , 0.9502644369 , 0.9777960959 , 0.9914837366 , 0.9974556254 , 0.9995223859 , 0.9999714889 , 1.0 , 1.0 });
		checkCumulative(1.0, 0.1, x, new double[]{ 0.0 , 0.0 , 0.01048074179 , 0.02206723146 , 0.03503890488 , 0.04979978349 , 0.06696700846 , 0.08755646344 , 0.11343184943 , 0.14866007748 , 0.20567176528 , 1.0 , 1.0 });
		checkCumulative(1.0, 0.5, x, new double[]{ 0.0 , 0.0 , 0.05131670195 , 0.105572809 , 0.16333997347 , 0.22540333076 , 0.29289321881 , 0.36754446797 , 0.45227744249 , 0.5527864045 , 0.68377223398 , 1.0 , 1.0 });
		checkCumulative(1, 1, x, new double[]{ 0.0 , 0.0 , 0.1 , 0.2 , 0.3 , 0.4 , 0.5 , 0.6 , 0.7 , 0.8 , 0.9 , 1.0 , 1.0 });
		checkCumulative(1, 2, x, new double[]{ 0.0 , 0.0 , 0.19 , 0.36 , 0.51 , 0.64 , 0.75 , 0.84 , 0.91 , 0.96 , 0.99 , 1.0 , 1.0 });
		checkCumulative(1, 4, x, new double[]{ 0.0 , 0.0 , 0.3439 , 0.5904 , 0.7599 , 0.8704 , 0.9375 , 0.9744 , 0.9919 , 0.9984 , 0.9999 , 1.0 , 1.0 });
		checkCumulative(2.0, 0.1, x, new double[]{ 0.0 , 0.0 , 5.855492117E-4 , 0.0025085760862 , 0.0060900720266 , 0.0117917748341 , 0.0203153588864 , 0.0328098512512 , 0.0513720788952 , 0.0805528836776 , 0.1341822241505 , 1.0 , 1.0 });
		checkCumulative(2, 1, x, new double[]{ 0.0 , 0.0 , 0.01 , 0.04 , 0.09 , 0.16 , 0.25 , 0.36 , 0.49 , 0.64 , 0.81 , 1.0 , 1.0 });
		checkCumulative(2.0, 0.5, x, new double[]{ 0.0 , 0.0 , 0.003882537047 , 0.0161300899 , 0.037840969486 , 0.07048399691 , 0.116116523517 , 0.177807808356 , 0.260574547368 , 0.3739009663 , 0.541469739276 , 1.0 , 1.0 });
		checkCumulative(2, 2, x, new double[]{ 0.0 , 0.0 , 0.028 , 0.104 , 0.216 , 0.352 , 0.5 , 0.648 , 0.784 , 0.896 , 0.972 , 1.0 , 1.0 });
		checkCumulative(2, 4, x, new double[]{ 0.0 , 0.0 , 0.08146 , 0.26272 , 0.47178 , 0.66304 , 0.8125 , 0.91296 , 0.96922 , 0.99328 , 0.99954 , 1.0 , 1.0 });
		checkCumulative(4.0, 0.1, x, new double[]{ 0.0 , 0.0 , 3.217128269E-6 , 5.592070271E-5 , 3.104375474E-4 , 0.001088719595 , 0.002995933981 , 0.007155588777 , 0.01577149153 , 0.03380410585 , 0.07650088789 , 1.0 , 1.0 });
		checkCumulative(4.0, 0.5, x, new double[]{ 0.0 , 0.0 , 2.851114863E-5 , 4.776140576E-4 , 0.002544374616 , 0.008516263371 , 0.02220390414 , 0.04973556312 , 0.1012215158 , 0.1950155281 , 0.3733749174 , 1.0 , 1.0 });
		checkCumulative(4, 1, x, new double[]{ 0.0 , 0.0 , 1.0E-4 , 0.0016 , 0.0081 , 0.0256 , 0.0625 , 0.1296 , 0.2401 , 0.4096 , 0.6561 , 1.0 , 1.0 });
		checkCumulative(4, 2, x, new double[]{ 0.0 , 0.0 , 4.6E-4 , 0.00672 , 0.03078 , 0.08704 , 0.1875 , 0.33696 , 0.52822 , 0.73728 , 0.91854 , 1.0 , 1.0 });
		checkCumulative(4, 4, x, new double[]{ 0.0 , 0.0 , 0.002728 , 0.033344 , 0.126036 , 0.289792 , 0.5 , 0.710208 , 0.873964 , 0.966656 , 0.997272 , 1.0 , 1.0 });
	}

	private void checkCumulative(double alpha, double beta, double[] x, double[] cumes) throws org.apache.commons.math.MathException {
		org.apache.commons.math.distribution.BetaDistribution d = new org.apache.commons.math.distribution.BetaDistributionImpl(alpha , beta);
		for (int i = 0 ; i < (x.length) ; i++) {
			junit.framework.Assert.assertEquals(cumes[i], d.cumulativeProbability(x[i]), 1.0E-8);
		}
		for (int i = 1 ; i < ((x.length) - 1) ; i++) {
			junit.framework.Assert.assertEquals(x[i], d.inverseCumulativeProbability(cumes[i]), 1.0E-5);
		}
	}

	public void testDensity() throws org.apache.commons.math.MathException {
		double[] x = new double[]{ 1.0E-6 , 0.1 , 0.2 , 0.3 , 0.4 , 0.5 , 0.6 , 0.7 , 0.8 , 0.9 };
		checkDensity(0.1, 0.1, x, new double[]{ 12741.2357380649 , 0.4429889586665234 , 0.2639378715 , 0.2066393611 , 0.1832401831 , 0.176630278 , 0.1832404579 , 0.2066400696 , 0.2639396531 , 0.4429925026 });
		checkDensity(0.1, 0.5, x, new double[]{ 22183.77102 , 0.7394524202 , 0.4203020268 , 0.3119435533 , 0.2600787829 , 0.2330648626 , 0.2211408259 , 0.2222728708 , 0.2414013907 , 0.3070567405 });
		checkDensity(0.1, 1.0, x, new double[]{ 25118.86432 , 0.7943210858 , 0.4256680458 , 0.2955218303 , 0.2281103709 , 0.1866062624 , 0.1583664652 , 0.1378514078 , 0.1222414585 , 0.1099464743 });
		checkDensity(0.1, 2.0, x, new double[]{ 27630.72312 , 0.7863770012 , 0.374587412 , 0.2275514842 , 0.1505525939 , 0.1026332391 , 0.06968107049 , 0.04549081293 , 0.02689298641 , 0.01209399123 });
		checkDensity(0.1, 4.0, x, new double[]{ 29979.27462 , 0.6911058917 , 0.2601128486 , 0.120977401 , 0.05880564714 , 0.02783915474 , 0.01209657335 , 0.004442148268 , 0.001167143939 , 1.312171805E-4 });
		checkDensity(0.5, 0.1, x, new double[]{ 88.3152184726 , 0.3070542841 , 0.2414007269 , 0.2222727015 , 0.2211409364 , 0.2330652355 , 0.2600795198 , 0.3119449793 , 0.4203052841 , 0.7394649088 });
		checkDensity(0.5, 0.5, x, new double[]{ 318.3100453389 , 1.0610282383 , 0.7957732234 , 0.6946084565 , 0.6497470636 , 0.6366197724 , 0.6497476051 , 0.6946097796 , 0.7957762075 , 1.0610376697 });
		checkDensity(0.5, 1.0, x, new double[]{ 500.0 , 1.5811309244 , 1.1180311937 , 0.9128694077 , 0.7905684268 , 0.7071060741 , 0.6454966865 , 0.5976138778 , 0.559016645 , 0.5270459839 });
		checkDensity(0.5, 2.0, x, new double[]{ 749.99925 , 2.134537420613655 , 1.34163575536 , 0.95851150881 , 0.7115103983 , 0.5303284949 , 0.38729704363 , 0.26892534859 , 0.16770415497 , 0.07905610701 });
		checkDensity(0.5, 4.0, x, new double[]{ 1093.746719 , 2.52142232809988 , 1.252190241 , 0.684934392 , 0.373541714 , 0.193348157 , 0.09036885833 , 0.03529621669 , 0.009782644546 , 0.001152878503 });
		checkDensity(1.0, 0.1, x, new double[]{ 0.10000009 , 0.1099466942 , 0.1222417336 , 0.1378517623 , 0.1583669403 , 0.1866069342 , 0.2281113974 , 0.2955236034 , 0.4256718768 , 0.7943353837 });
		checkDensity(1.0, 0.5, x, new double[]{ 0.50000025 , 0.5270465695 , 0.5590173438 , 0.5976147315 , 0.6454977623 , 0.7071074883 , 0.7905704033 , 0.9128724506 , 1.1180367838 , 1.5811467358 });
		checkDensity(1, 1, x, new double[]{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 });
		checkDensity(1, 2, x, new double[]{ 1.999998 , 1.799998 , 1.599998 , 1.399998 , 1.199998 , 0.999998 , 0.799998 , 0.599998 , 0.399998 , 0.199998 });
		checkDensity(1, 4, x, new double[]{ 3.999988000012 , 2.915990280011 , 2.04799232001 , 1.371994120008 , 0.863995680007 , 0.499997000006 , 0.255998080005 , 0.107998920004 , 0.031999520002 , 0.003999880001 });
		checkDensity(2.0, 0.1, x, new double[]{ 1.10000099E-7 , 0.0120942573 , 0.02689331586 , 0.04549123318 , 0.06968162794 , 0.1026340191 , 0.1505537732 , 0.2275534997 , 0.3745917198 , 0.7863929037 });
		checkDensity(2.0, 0.5, x, new double[]{ 7.50000375E-7 , 0.07905777599 , 0.1677060417 , 0.2689275256 , 0.3872996256 , 0.5303316769 , 0.7115145488 , 0.9585174425 , 1.341645818 , 2.134537420613655 });
		checkDensity(2, 1, x, new double[]{ 2.0E-6 , 0.200002 , 0.400002 , 0.600002 , 0.800002 , 1.000002 , 1.200002 , 1.400002 , 1.600002 , 1.800002 });
		checkDensity(2, 2, x, new double[]{ 5.999994E-6 , 0.5400048 , 0.9600036 , 1.2600024 , 1.4400012 , 1.5 , 1.4399988 , 1.2599976 , 0.9599964 , 0.5399952 });
		checkDensity(2, 4, x, new double[]{ 1.999994E-5 , 1.45800971996 , 2.04800255997 , 2.05799803998 , 1.72799567999 , 1.249995 , 0.76799552 , 0.37799676001 , 0.12799824001 , 0.01799948 });
		checkDensity(4.0, 0.1, x, new double[]{ 1.193501074E-19 , 1.312253162E-4 , 0.00116718158 , 0.004442248535 , 0.01209679109 , 0.02783958903 , 0.05880649983 , 0.1209791638 , 0.2601171405 , 0.6911229392 });
		checkDensity(4.0, 0.5, x, new double[]{ 1.093750547E-18 , 0.001152948959 , 0.009782950259 , 0.03529697305 , 0.09037036449 , 0.1933508639 , 0.3735463833 , 0.6849425461 , 1.252205894 , 2.52142232809988 });
		checkDensity(4, 1, x, new double[]{ 4.0E-18 , 0.004000120001 , 0.03200048 , 0.10800108 , 0.25600192 , 0.500003 , 0.86400432 , 1.37200588 , 2.04800768 , 2.91600972 });
		checkDensity(4, 2, x, new double[]{ 1.999998E-17 , 0.01800052 , 0.12800176 , 0.37800324 , 0.76800448 , 1.250005 , 1.72800432 , 2.05800196 , 2.04799744 , 1.45799028 });
		checkDensity(4, 4, x, new double[]{ 1.3999958E-16 , 0.1020627216 , 0.5734464512 , 1.296547409 , 1.935364838 , 2.1875 , 1.935355162 , 1.296532591 , 0.5734335488 , 0.1020572784 });
	}

	private void checkDensity(double alpha, double beta, double[] x, double[] expected) throws org.apache.commons.math.MathException {
		org.apache.commons.math.distribution.BetaDistribution d = new org.apache.commons.math.distribution.BetaDistributionImpl(alpha , beta);
		for (int i = 0 ; i < (x.length) ; i++) {
			junit.framework.Assert.assertEquals(java.lang.String.format("density at x=%.1f for alpha=%.1f, beta=%.1f", x[i], alpha, beta), expected[i], d.density(x[i]), 1.0E-5);
		}
	}
}

