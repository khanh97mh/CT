package com.tma.exercises.basics.exercise02;

public class Exercise02 {
	public static void main(String[] args) {
		System.out.println("###Exercises 2.1");		
		
		CheckPassFail checkPassFail = new CheckPassFail();		
		checkPassFail.CheckPassFail(49);
		
		CheckOddEven checkOddEven = new CheckOddEven();
		checkOddEven.CheckOddEven(20);
		
		PrintNumberInWord printNumberInWord = new PrintNumberInWord();
		printNumberInWord.PrintNumberInWord(5);
		
		PrintDayInWord printDayInWord = new PrintDayInWord();
		printDayInWord.PrintDayInWord(0);
		
		System.out.println("###Exercises 2.2");
		
		SumAndAverage sumAndAverage = new SumAndAverage();
		sumAndAverage.SumAndAverage(1, 100);
		sumAndAverage.SumAndAverage(111, 8899);
		sumAndAverage.SumAndAverageOfOddNumber(1, 100);
		sumAndAverage.SumAndAverageOfDivisibleBy7(1, 100);
		sumAndAverage.SumAndAverageOfSquares(1, 100);
		
		Product1ToN product1ToN = new Product1ToN();
		product1ToN.Product1ToN(1, 10);
		product1ToN.Product1ToN(1, 11);
		product1ToN.Product1ToN(1, 12);
		product1ToN.Product1ToN(1, 13);
		product1ToN.Product1ToN(1, 14);
		
		HarmonicSum harmonicSum = new HarmonicSum();
		harmonicSum.HarmonicSum(50000);
		
		ComputePI computePI = new ComputePI();
		computePI.ComputePI(10000000);
		computePI.ComputePI(1000000);
		
		CozaLozaWoza cozaLozaWoza = new CozaLozaWoza();
		cozaLozaWoza.CozaLozaWoza();
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.Fibonacci(20);
		
		Tribonacci tribonacci = new Tribonacci();
		tribonacci.Tribonacci(20);
		
		ExtractDigits extractDigits = new ExtractDigits();
		extractDigits.ExtractDigits(15423);
		
		System.out.println("\n\n###Exercises 2.3");
		
		SquareBoard squareBoard = new SquareBoard();
		squareBoard.SquareBoard(5);
		
		CheckerBoard CheckerBoard = new CheckerBoard();//Chua lam
		
		TimeTable timeTable = new TimeTable();
		timeTable.TimeTable(12);
		
		Shape shape = new Shape();
		shape.Shape();
		
		
		
	}
	
}
