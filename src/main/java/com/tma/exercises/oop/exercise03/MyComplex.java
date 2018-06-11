package com.tma.exercises.oop.exercise03;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;

	public MyComplex() {
	}

	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String toString() {
		return "(" + real + "+" + imag + "i)";
	}

	public boolean isReal() {
		return real == 0;
	}

	public boolean isImaginary() {
		return imag == 0;
	}

	public boolean equals(double real, double imag) {
		return this.real == real && this.imag == imag;
	}

	public boolean equals(MyComplex another) {
		return this.real == another.real && this.imag == another.imag;
	}

	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}

	public double argument() {
		return Math.atan2(imag, real);
	}

	public MyComplex add(MyComplex right) {
		real += right.getReal();
		imag += right.getImag();
		return this;
	}

	public MyComplex addNew(MyComplex right) {
		return new MyComplex(real + right.getReal(), imag + right.getImag());
	}

	public MyComplex subtract(MyComplex right) {
		real -= right.getReal();
		imag -= right.getImag();
		return this;
	}

	public MyComplex subtractNew(MyComplex right) {
		return new MyComplex(real - right.getReal(), imag - right.getImag());
	}

	public MyComplex multiply(MyComplex right) {
		// (ac - bd) + (ad + bc)i
		real = real * right.getReal() - imag * right.getImag();
		imag = real * right.getImag() + imag * right.getReal();
		return this;
	}

	public MyComplex divide(MyComplex right) {
		// [(a + bi) * (c – di)] / (c2 + d2)
		double delimiter = right.getReal() * right.getReal() + right.getImag() * right.getImag();
		if (delimiter != 0) {
			real = (real * right.getReal() + imag * right.getImag()) / delimiter;
			imag = (-real * right.getImag() + imag * right.getReal()) / delimiter;
		}
		return this;
	}

	public MyComplex conjugate() {
		return new MyComplex(real, -imag);
	}

}
