package Precision;

import java.lang.Math;

public class PreciseMath {
	int degree;
	
	public PreciseMath(short precision) {
		degree = (int)Math.pow(10, precision);
	}
	
	public double add(double x, double y) {
		long xInt = (long) (x * degree);
		long yInt = (long) (y * degree);
		
		long result = xInt + yInt;
		return result / degree;
	}
	
	public double subtract(double x, double y) {
		long xInt = (long) (x * degree);
		long yInt = (long) (y * degree);
		
		long result = xInt - yInt;
		return result / degree;
	}
	
	public double multiply(double x, double y) {
		long xInt = (long) (x * degree);
		long yInt = (long) (y * degree);
		
		long result = xInt * yInt;
		return result / (degree * degree);
	}
	
	public double divide(double x, double y) {
		long xInt = (long) (x * degree);
		long yInt = (long) (y * degree);
		
		double result = xInt / yInt;
		return result;
	}
}
