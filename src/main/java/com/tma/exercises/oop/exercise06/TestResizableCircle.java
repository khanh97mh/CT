package com.tma.exercises.oop.exercise06;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle geomObj2 = new ResizableCircle(5.0);
        System.out.println(geomObj2);
        // System.out.println("Perimeter = "+geomObj2.getPerimeter());
        // System.out.println("Area = "+geomObj2.getArea());
        geomObj2.resize(50);
        System.out.println(geomObj2.getRadius());
	}
}
