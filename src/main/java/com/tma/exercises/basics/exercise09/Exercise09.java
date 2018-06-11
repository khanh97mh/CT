package com.tma.exercises.basics.exercise09;

public class Exercise09 {
	public static final double E = 2.7182818284590452354;
	public static final double PI = 3.14159265358979323846;

	public static int abs(int a) {
		return (a < 0) ? -a : a;
	}

	public static long abs(long a) {
		return (a < 0) ? -a : a;
	}

	public static float abs(float a) {
		return (a <= 0.0F) ? 0.0F - a : a;
	}

	public static double abs(double a) {
		return (a <= 0.0D) ? 0.0D - a : a;
	}

	public static int max(int a, int b) {
		return (a >= b) ? a : b;
	}

	public static long max(long a, long b) {
		return (a >= b) ? a : b;
	}

	private static long negativeZeroFloatBits = Float.floatToRawIntBits(-0.0f);
	private static long negativeZeroDoubleBits = Double.doubleToRawLongBits(-0.0d);

	public static float max(float a, float b) {
		if (a != a)
			return a; // a is NaN
		if ((a == 0.0f) && (b == 0.0f) && (Float.floatToRawIntBits(a) == negativeZeroFloatBits)) {
			// Raw conversion ok since NaN can't map to -0.0.
			return b;
		}
		return (a >= b) ? a : b;
	}

	public static double max(double a, double b) {
		if (a != a)
			return a; // a is NaN
		if ((a == 0.0d) && (b == 0.0d) && (Double.doubleToRawLongBits(a) == negativeZeroDoubleBits)) {
			// Raw conversion ok since NaN can't map to -0.0.
			return b;
		}
		return (a >= b) ? a : b;
	}

	public static int min(int a, int b) {
		return (a <= b) ? a : b;
	}

	public static long min(long a, long b) {
		return (a <= b) ? a : b;
	}

	public static float min(float a, float b) {
		if (a != a)
			return a; // a is NaN
		if ((a == 0.0f) && (b == 0.0f) && (Float.floatToRawIntBits(b) == negativeZeroFloatBits)) {
			// Raw conversion ok since NaN can't map to -0.0.
			return b;
		}
		return (a <= b) ? a : b;
	}

	public static double min(double a, double b) {
		if (a != a)
			return a; // a is NaN
		if ((a == 0.0d) && (b == 0.0d) && (Double.doubleToRawLongBits(b) == negativeZeroDoubleBits)) {
			// Raw conversion ok since NaN can't map to -0.0.
			return b;
		}
		return (a <= b) ? a : b;
	}

	public static double toDegrees(double angrad) {
		return angrad * 180.0 / PI;
	}
}
