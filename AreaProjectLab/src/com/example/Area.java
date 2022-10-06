//declaring package 
package com.example;

//declaring class Area
public class Area extends Shape {

	// initializing the value 0
	double Area = 0;

	@Override
	void RectangleArea(float length, float breadth) {
		// TODO Auto-generated method stub

		Area = length * breadth; // calculating area of rectangleArea
		System.out.println(" " + Area);

	}

	@Override
	void SquareArea(float side) {
		// TODO Auto-generated method stub

		Area = Math.pow(side, 2); // calculating area of squareArea
		System.out.println(" " + Area);

	}

	@Override
	void CircleArea(float radius) {
		// TODO Auto-generated method stub

		double pi = 3.14; // taking pi=3.14 as double
		Area = pi * Math.pow(radius, 2); // claculating area of circleArea
		System.out.println(" " + Area);

	}

}
//ending class of Area