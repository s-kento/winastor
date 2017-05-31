package org.apache.commons.math.estimation;


@java.lang.Deprecated
public class GaussNewtonEstimatorTest extends junit.framework.TestCase {
	public GaussNewtonEstimatorTest(java.lang.String name) {
		super(name);
	}

	public void testTrivial() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) } , 3.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertEquals(0, estimator.getRMS(problem), 1.0E-10);
		junit.framework.Assert.assertEquals(1.5, problem.getUnboundParameters()[0].getEstimate(), 1.0E-10);
	}

	public void testQRColumnsPermutation() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] x = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 0) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ x[0] , x[1] } , 4.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ x[1] } , 6.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -2.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ x[0] , x[1] } , 1.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertEquals(0, estimator.getRMS(problem), 1.0E-10);
		junit.framework.Assert.assertEquals(7.0, x[0].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(3.0, x[1].getEstimate(), 1.0E-10);
	}

	public void testNoDependency() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p3" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p4" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p5" , 0) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] } , 0.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[1] } , 1.1) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[2] } , 2.2) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[3] } , 3.3) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[4] } , 4.4) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[5] } , 5.5) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertEquals(0, estimator.getRMS(problem), 1.0E-10);
		for (int i = 0 ; i < (p.length) ; ++i) {
			junit.framework.Assert.assertEquals((0.55 * i), p[i].getEstimate(), 1.0E-10);
		}
	}

	public void testOneSet() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 0) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ -1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ -1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[1] , p[2] } , 1.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertEquals(0, estimator.getRMS(problem), 1.0E-10);
		junit.framework.Assert.assertEquals(1.0, p[0].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(2.0, p[1].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(3.0, p[2].getEstimate(), 1.0E-10);
	}

	public void testTwoSets() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 1) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p3" , 3) , new org.apache.commons.math.estimation.EstimatedParameter("p4" , 4) , new org.apache.commons.math.estimation.EstimatedParameter("p5" , 5) };
		double epsilon = 1.0E-7;
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2.0 , 1.0 , 4.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[3] } , 2.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ -4.0 , -2.0 , 3.0 , -7.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , -9.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 4.0 , 1.0 , -2.0 , 8.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 2.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ -3.0 , -12.0 , -1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[1] , p[2] , p[3] } , 2.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ epsilon , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[4] , p[5] } , (1.0 + (epsilon * epsilon))) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[4] , p[5] } , 2.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertEquals(0, estimator.getRMS(problem), 1.0E-10);
		junit.framework.Assert.assertEquals(3.0, p[0].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(4.0, p[1].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(-1.0, p[2].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(-2.0, p[3].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals((1.0 + epsilon), p[4].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals((1.0 - epsilon), p[5].getEstimate(), 1.0E-10);
	}

	public void testNonInversible() {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 0) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[] m = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 2.0 , -3.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2.0 , 1.0 , 3.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ -3.0 , -9.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[2] } , 1.0) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(m);
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		try {
			estimator.estimate(problem);
			junit.framework.Assert.fail("an exception should have been caught");
		} catch (org.apache.commons.math.estimation.EstimationException ee) {
		} catch (java.lang.Exception e) {
			junit.framework.Assert.fail("wrong exception type caught");
		}
	}

	public void testIllConditioned() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 0) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 1) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p3" , 3) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem1 = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 10.0 , 7.0 , 8.0 , 7.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 32.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 7.0 , 5.0 , 6.0 , 5.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 23.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 8.0 , 6.0 , 10.0 , 9.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 33.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 7.0 , 5.0 , 9.0 , 10.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 31.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator1 = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator1.estimate(problem1);
		junit.framework.Assert.assertEquals(0, estimator1.getRMS(problem1), 1.0E-10);
		junit.framework.Assert.assertEquals(1.0, p[0].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(1.0, p[1].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(1.0, p[2].getEstimate(), 1.0E-10);
		junit.framework.Assert.assertEquals(1.0, p[3].getEstimate(), 1.0E-10);
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem2 = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 10.0 , 7.0 , 8.1 , 7.2 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 32.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 7.08 , 5.04 , 6.0 , 5.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 23.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 8.0 , 5.98 , 9.89 , 9.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 33.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 6.99 , 4.99 , 9.0 , 9.98 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] , p[3] } , 31.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator2 = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator2.estimate(problem2);
		junit.framework.Assert.assertEquals(0, estimator2.getRMS(problem2), 1.0E-10);
		junit.framework.Assert.assertEquals(-81.0, p[0].getEstimate(), 1.0E-8);
		junit.framework.Assert.assertEquals(137.0, p[1].getEstimate(), 1.0E-8);
		junit.framework.Assert.assertEquals(-34.0, p[2].getEstimate(), 1.0E-8);
		junit.framework.Assert.assertEquals(22.0, p[3].getEstimate(), 1.0E-8);
	}

	public void testMoreEstimatedParametersSimple() {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 7) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 6) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 5) , new org.apache.commons.math.estimation.EstimatedParameter("p3" , 4) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 3.0 , 2.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 7.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[1] , p[2] , p[3] } , 3.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 2.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[2] } , 5.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		try {
			estimator.estimate(problem);
			junit.framework.Assert.fail("an exception should have been caught");
		} catch (org.apache.commons.math.estimation.EstimationException ee) {
		} catch (java.lang.Exception e) {
			junit.framework.Assert.fail("wrong exception type caught");
		}
	}

	public void testMoreEstimatedParametersUnsorted() {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p2" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p3" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p4" , 2) , new org.apache.commons.math.estimation.EstimatedParameter("p5" , 2) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 3.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[2] , p[3] , p[4] } , 12.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[4] , p[5] } , -1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[3] , p[2] , p[5] } , 7.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[4] , p[3] } , 1.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		try {
			estimator.estimate(problem);
			junit.framework.Assert.fail("an exception should have been caught");
		} catch (org.apache.commons.math.estimation.EstimationException ee) {
		} catch (java.lang.Exception e) {
			junit.framework.Assert.fail("wrong exception type caught");
		}
	}

	public void testRedundantEquations() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 1) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 1) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 3.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 3.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 5.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertEquals(0, estimator.getRMS(problem), 1.0E-10);
		org.apache.commons.math.estimation.EstimatedParameter[] all = problem.getAllParameters();
		for (int i = 0 ; i < (all.length) ; ++i) {
			junit.framework.Assert.assertEquals((all[i].getName().equals("p0") ? 2.0 : 1.0), all[i].getEstimate(), 1.0E-10);
		}
	}

	public void testInconsistentEquations() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("p0" , 1) , new org.apache.commons.math.estimation.EstimatedParameter("p1" , 1) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 3.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 3.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] } , 4.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertTrue(((estimator.getRMS(problem)) > 0.1));
	}

	public void testBoundParameters() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.EstimatedParameter[] p = new org.apache.commons.math.estimation.EstimatedParameter[]{ new org.apache.commons.math.estimation.EstimatedParameter("unbound0" , 2 , false) , new org.apache.commons.math.estimation.EstimatedParameter("unbound1" , 2 , false) , new org.apache.commons.math.estimation.EstimatedParameter("bound" , 2 , true) };
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem problem = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[]{ new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] } , 3.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , -1.0 , 1.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] } , 1.0) , new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement(new double[]{ 1.0 , 3.0 , 2.0 } , new org.apache.commons.math.estimation.EstimatedParameter[]{ p[0] , p[1] , p[2] } , 7.0) });
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		estimator.estimate(problem);
		junit.framework.Assert.assertTrue(((estimator.getRMS(problem)) < 1.0E-10));
		double[][] covariances = estimator.getCovariances(problem);
		int i0 = 0;
		int i1 = 1;
		if (problem.getUnboundParameters()[0].getName().endsWith("1")) {
			i0 = 1;
			i1 = 0;
		} 
		junit.framework.Assert.assertEquals((11.0 / 24), covariances[i0][i0], 1.0E-10);
		junit.framework.Assert.assertEquals(((-3.0) / 24), covariances[i0][i1], 1.0E-10);
		junit.framework.Assert.assertEquals(((-3.0) / 24), covariances[i1][i0], 1.0E-10);
		junit.framework.Assert.assertEquals((3.0 / 24), covariances[i1][i1], 1.0E-10);
		double[] errors = estimator.guessParametersErrors(problem);
		junit.framework.Assert.assertEquals(0, errors[i0], 1.0E-10);
		junit.framework.Assert.assertEquals(0, errors[i1], 1.0E-10);
	}

	public void testMaxIterations() {
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle circle = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle(98.68 , 47.345);
		circle.addPoint(30.0, 68.0);
		circle.addPoint(50.0, -6.0);
		circle.addPoint(110.0, -20.0);
		circle.addPoint(35.0, 15.0);
		circle.addPoint(45.0, 97.0);
		try {
			org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(4 , 1.0E-14 , 1.0E-14);
			estimator.estimate(circle);
			junit.framework.Assert.fail("an exception should have been caught");
		} catch (org.apache.commons.math.estimation.EstimationException ee) {
		} catch (java.lang.Exception e) {
			junit.framework.Assert.fail("wrong exception type caught");
		}
	}

	public void testCircleFitting() throws org.apache.commons.math.estimation.EstimationException {
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle circle = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle(98.68 , 47.345);
		circle.addPoint(30.0, 68.0);
		circle.addPoint(50.0, -6.0);
		circle.addPoint(110.0, -20.0);
		circle.addPoint(35.0, 15.0);
		circle.addPoint(45.0, 97.0);
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-10 , 1.0E-10);
		estimator.estimate(circle);
		double rms = estimator.getRMS(circle);
		junit.framework.Assert.assertEquals(1.768262623567235, ((java.lang.Math.sqrt(circle.getM())) * rms), 1.0E-10);
		junit.framework.Assert.assertEquals(69.96016176931406, circle.getRadius(), 1.0E-10);
		junit.framework.Assert.assertEquals(96.07590211815305, circle.getX(), 1.0E-10);
		junit.framework.Assert.assertEquals(48.13516790438953, circle.getY(), 1.0E-10);
	}

	public void testCircleFittingBadInit() {
		org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle circle = new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle(-12 , -12);
		double[][] points = new double[][]{ new double[]{ -0.312967 , 0.072366 } , new double[]{ -0.339248 , 0.132965 } , new double[]{ -0.37978 , 0.202724 } , new double[]{ -0.390426 , 0.260487 } , new double[]{ -0.361212 , 0.328325 } , new double[]{ -0.346039 , 0.392619 } , new double[]{ -0.280579 , 0.444306 } , new double[]{ -0.216035 , 0.470009 } , new double[]{ -0.149127 , 0.493832 } , new double[]{ -0.075133 , 0.483271 } , new double[]{ -0.007759 , 0.45268 } , new double[]{ 0.060071 , 0.410235 } , new double[]{ 0.103037 , 0.341076 } , new double[]{ 0.118438 , 0.273884 } , new double[]{ 0.131293 , 0.192201 } , new double[]{ 0.115869 , 0.129797 } , new double[]{ 0.072223 , 0.058396 } , new double[]{ 0.022884 , 7.18E-4 } , new double[]{ -0.053355 , -0.020405 } , new double[]{ -0.123584 , -0.032451 } , new double[]{ -0.216248 , -0.032862 } , new double[]{ -0.278592 , -0.005008 } , new double[]{ -0.337655 , 0.056658 } , new double[]{ -0.385899 , 0.112526 } , new double[]{ -0.405517 , 0.186957 } , new double[]{ -0.415374 , 0.262071 } , new double[]{ -0.387482 , 0.343398 } , new double[]{ -0.347322 , 0.397943 } , new double[]{ -0.287623 , 0.458425 } , new double[]{ -0.223502 , 0.475513 } , new double[]{ -0.135352 , 0.478186 } , new double[]{ -0.061221 , 0.483371 } , new double[]{ 0.003711 , 0.422737 } , new double[]{ 0.065054 , 0.37583 } , new double[]{ 0.108108 , 0.297099 } , new double[]{ 0.123882 , 0.22285 } , new double[]{ 0.117729 , 0.134382 } , new double[]{ 0.085195 , 0.05682 } , new double[]{ 0.0298 , -0.019138 } , new double[]{ -0.02752 , -0.072374 } , new double[]{ -0.102268 , -0.091555 } , new double[]{ -0.200299 , -0.106578 } , new double[]{ -0.292731 , -0.091473 } , new double[]{ -0.356288 , -0.051108 } , new double[]{ -0.420561 , 0.014926 } , new double[]{ -0.471036 , 0.074716 } , new double[]{ -0.488638 , 0.182508 } , new double[]{ -0.48599 , 0.254068 } , new double[]{ -0.463943 , 0.338438 } , new double[]{ -0.406453 , 0.404704 } , new double[]{ -0.334287 , 0.466119 } , new double[]{ -0.254244 , 0.503188 } , new double[]{ -0.161548 , 0.495769 } , new double[]{ -0.075733 , 0.49556 } , new double[]{ 0.001375 , 0.434937 } , new double[]{ 0.082787 , 0.385806 } , new double[]{ 0.11549 , 0.323807 } , new double[]{ 0.141089 , 0.22345 } , new double[]{ 0.138693 , 0.131703 } , new double[]{ 0.126415 , 0.049174 } , new double[]{ 0.066518 , -0.010217 } , new double[]{ -0.005184 , -0.070647 } , new double[]{ -0.080985 , -0.103635 } , new double[]{ -0.177377 , -0.116887 } , new double[]{ -0.260628 , -0.100258 } , new double[]{ -0.335756 , -0.056251 } , new double[]{ -0.405195 , -8.95E-4 } , new double[]{ -0.444937 , 0.085456 } , new double[]{ -0.484357 , 0.175597 } , new double[]{ -0.472453 , 0.248681 } , new double[]{ -0.43858 , 0.347463 } , new double[]{ -0.402304 , 0.422428 } , new double[]{ -0.326777 , 0.479438 } , new double[]{ -0.247797 , 0.505581 } , new double[]{ -0.152676 , 0.51938 } , new double[]{ -0.071754 , 0.516264 } , new double[]{ 0.015942 , 0.472802 } , new double[]{ 0.076608 , 0.419077 } , new double[]{ 0.127673 , 0.330264 } , new double[]{ 0.159951 , 0.26215 } , new double[]{ 0.15353 , 0.172681 } , new double[]{ 0.140653 , 0.089229 } , new double[]{ 0.078666 , 0.024981 } , new double[]{ 0.023807 , -0.037022 } , new double[]{ -0.048837 , -0.077056 } , new double[]{ -0.127729 , -0.075338 } , new double[]{ -0.221271 , -0.067526 } };
		for (int i = 0 ; i < (points.length) ; ++i) {
			circle.addPoint(points[i][0], points[i][1]);
		}
		org.apache.commons.math.estimation.GaussNewtonEstimator estimator = new org.apache.commons.math.estimation.GaussNewtonEstimator(100 , 1.0E-6 , 1.0E-6);
		try {
			estimator.estimate(circle);
			junit.framework.Assert.fail("an exception should have been caught");
		} catch (org.apache.commons.math.estimation.EstimationException ee) {
		} catch (java.lang.Exception e) {
			junit.framework.Assert.fail("wrong exception type caught");
		}
	}

	private static class LinearProblem extends org.apache.commons.math.estimation.SimpleEstimationProblem {
		public LinearProblem(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[] measurements) {
			java.util.HashSet<org.apache.commons.math.estimation.EstimatedParameter> set = new java.util.HashSet<org.apache.commons.math.estimation.EstimatedParameter>();
			for (int i = 0 ; i < (measurements.length) ; ++i) {
				addMeasurement(measurements[i]);
				org.apache.commons.math.estimation.EstimatedParameter[] parameters = measurements[i].getParameters();
				for (int j = 0 ; j < (parameters.length) ; ++j) {
					set.add(parameters[j]);
				}
			}
			for (org.apache.commons.math.estimation.EstimatedParameter p : set) {
				addParameter(p);
			}
		}
	}

	private static class LinearMeasurement extends org.apache.commons.math.estimation.WeightedMeasurement {
		public LinearMeasurement(double[] factors ,org.apache.commons.math.estimation.EstimatedParameter[] parameters ,double setPoint) {
			super(1.0, setPoint, true);
			this.factors = factors;
			this.parameters = parameters;
			setIgnored(false);
		}

		@java.lang.Override
		public double getTheoreticalValue() {
			double v = 0;
			for (int i = 0 ; i < (factors.length) ; ++i) {
				v += (factors[i]) * (parameters[i].getEstimate());
			}
			return v;
		}

		@java.lang.Override
		public double getPartial(org.apache.commons.math.estimation.EstimatedParameter parameter) {
			for (int i = 0 ; i < (parameters.length) ; ++i) {
				if ((parameters[i]) == parameter) {
					return factors[i];
				} 
			}
			return 0;
		}

		public org.apache.commons.math.estimation.EstimatedParameter[] getParameters() {
			return parameters;
		}

		private double[] factors;

		private org.apache.commons.math.estimation.EstimatedParameter[] parameters;

		private static final long serialVersionUID = -3922448707008868580L;
	}

	private static class Circle implements org.apache.commons.math.estimation.EstimationProblem {
		public Circle(double cx ,double cy) {
			this.cx = new org.apache.commons.math.estimation.EstimatedParameter("cx" , cx);
			this.cy = new org.apache.commons.math.estimation.EstimatedParameter(new org.apache.commons.math.estimation.EstimatedParameter("cy" , cy));
			points = new java.util.ArrayList<org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel>();
		}

		public void addPoint(double px, double py) {
			points.add(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel(this , px , py));
		}

		public int getM() {
			return points.size();
		}

		public org.apache.commons.math.estimation.WeightedMeasurement[] getMeasurements() {
			return points.toArray(new org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel[points.size()]);
		}

		public org.apache.commons.math.estimation.EstimatedParameter[] getAllParameters() {
			return new org.apache.commons.math.estimation.EstimatedParameter[]{ cx , cy };
		}

		public org.apache.commons.math.estimation.EstimatedParameter[] getUnboundParameters() {
			return new org.apache.commons.math.estimation.EstimatedParameter[]{ cx , cy };
		}

		public double getPartialRadiusX() {
			double dRdX = 0;
			for (org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel point : points) {
				dRdX += point.getPartialDiX();
			}
			return dRdX / (points.size());
		}

		public double getPartialRadiusY() {
			double dRdY = 0;
			for (org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel point : points) {
				dRdY += point.getPartialDiY();
			}
			return dRdY / (points.size());
		}

		public double getRadius() {
			double r = 0;
			for (org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel point : points) {
				r += point.getCenterDistance();
			}
			return r / (points.size());
		}

		public double getX() {
			return cx.getEstimate();
		}

		public double getY() {
			return cy.getEstimate();
		}

		private static class PointModel extends org.apache.commons.math.estimation.WeightedMeasurement {
			public PointModel(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle circle ,double px ,double py) {
				super(1.0, 0.0);
				this.px = px;
				this.py = py;
				this.circle = circle;
			}

			@java.lang.Override
			public double getPartial(org.apache.commons.math.estimation.EstimatedParameter parameter) {
				if (parameter == (circle.cx)) {
					return (getPartialDiX()) - (circle.getPartialRadiusX());
				} else {
					if (parameter == (circle.cy)) {
						return (getPartialDiY()) - (circle.getPartialRadiusY());
					} 
				}
				return 0;
			}

			public double getCenterDistance() {
				double dx = (px) - (circle.cx.getEstimate());
				double dy = (py) - (circle.cy.getEstimate());
				return java.lang.Math.sqrt(((dx * dx) + (dy * dy)));
			}

			public double getPartialDiX() {
				return ((circle.cx.getEstimate()) - (px)) / (getCenterDistance());
			}

			public double getPartialDiY() {
				return ((circle.cy.getEstimate()) - (py)) / (getCenterDistance());
			}

			@java.lang.Override
			public double getTheoreticalValue() {
				return (getCenterDistance()) - (circle.getRadius());
			}

			private double px;

			private double py;

			private final transient org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle circle;

			private static final long serialVersionUID = 1L;
		}

		private org.apache.commons.math.estimation.EstimatedParameter cx;

		private org.apache.commons.math.estimation.EstimatedParameter cy;

		private java.util.ArrayList<org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel> points;
	}
}

