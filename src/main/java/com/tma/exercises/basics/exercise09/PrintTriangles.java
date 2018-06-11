package com.tma.exercises.basics.exercise09;

public class PrintTriangles {
	public static void main(String[] args) {

		PrintTriangles aPrintTriangles = new PrintTriangles();

		System.out.println("(a) PowerOf2Triangle");
		aPrintTriangles.printPowerOf2Triangle(7);
		System.out.println();

		System.out.println("(b) PascalTriangle1");
		aPrintTriangles.printPascalTriangle1(7);
		System.out.println();

		System.out.println("(c) PascalTriangle2");
		aPrintTriangles.printPascalTriangle2(7);
		System.out.println();
	}

	private void printPowerOf2Triangle(int numRows) {
		for (int i = 1; i <= numRows; i++) {
			for (int j = 1; j <= 2 * numRows; j++) {
				if (j == numRows + 1) {
					continue;
				}

				int k = (j < numRows + 1) ? j : 2 * numRows - j + 1;
				if (k >= numRows + 1 - i) {
					int x = (int) Math.pow(2, (i + k - numRows - 1));
					System.out.printf("%3d", x);
				} else {
					System.out.print("   ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private void printPascalTriangle1(int numRows) {
		// generate array for Pascal Triangle
		int[][] intArray = new int[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numRows; j++) {
				intArray[i][j] = 0;
				if (j == 0 || i == j) {// Tạo cột 1 và đường chéo bằng 1
					intArray[i][j] = 1;
				} else if (j < i) {// Cộng 2 giá trị trên lại với nhau
					intArray[i][j] = intArray[i - 1][j] + intArray[i - 1][j - 1];
				}
			}
		}

		// print Pascal Triangle's array
		for (int[] a : intArray) {
			for (int x : a) {
				if (x == 0) {
					System.out.printf("%3s", "");
					continue;
				}
				System.out.printf("%2d ", x);
			}
			System.out.println();
		}
	}

	private void printPascalTriangle2(int numRows) {
//		// generate array for Pascal Triangle
		int k = numRows;
				int[][] intArray = new int[numRows][2*numRows - 1];
				for (int i = 0; i < numRows; i++) {
					for (int j = 0; j < 2*numRows - 1; j++) {
						intArray[i][j] = 0;
						if (j == k - 1|| j == 2*numRows - 1 - k) {// Tạo cột 1 và đường chéo bằng 1
							intArray[i][j] = 1;
						} else if (j > k - 1 && j < 2*numRows - 1 - k) {// Cộng 2 giá trị trên lại với nhau
							intArray[i][j] = intArray[i - 1][j + 1] + intArray[i - 1][j - 1];
						}
					}
					k--;
				}


//				int k = numRows;
//				for (int i = 0; i < numRows; i++) {
//					for (int j = k; j < k+2*(i + 1); j = j+2) {
//					
//							for (int j2 = 0; j2 < i + 1; j2++) {
//								intArray[i][j] = intArray[i][j2];
//							}
//						
//					}
//					k--;
//				}
				
//				 print Pascal Triangle's array
				// print Pascal Triangle's array
				for (int[] a : intArray) {
					for (int x : a) {
						if (x == 0) {
							System.out.printf("%3s", "");
							continue;
						}
						System.out.printf("%2d ", x);
					}
					System.out.println();
				}
	}
}
