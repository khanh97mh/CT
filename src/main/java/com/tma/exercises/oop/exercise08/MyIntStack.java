package com.tma.exercises.oop.exercise08;

import java.util.Arrays;

public class MyIntStack {
	private int[] contents;
	private int tos; // Top of the stack

	// constructors
	public MyIntStack(int capacity) {
		contents = new int[capacity];
		tos = -1;
	}
//	public void push(int element) throws IllegalStateException {
//		if(isFull())
//			throw new IllegalStateException("Error IllegalStateException");
//	      contents[++tos] = element;
//	   }
//	public boolean push(int element) throws IllegalStateException {
//		if(isFull())
//			return false;
//	      contents[++tos] = element;
//	      return true;
//	   }
	public void push(int element) throws IllegalStateException {
		if (isFull()) {
			tos++;
			int[] tmp = new int[tos + 1];
			for (int i = 0; i < tmp.length - 1; i++) {
				tmp[i] = contents[i];
			}
			tmp[tmp.length - 1] = element;
			contents = new int[tos + 1];
			contents = tmp;
		} else
		contents[++tos] = element;
	}

	@Override
	public String toString() {
		return "MyIntStack = " + Arrays.toString(contents) + ", tos = " + tos;
	}

	public int pop() {
		return contents[tos--];
	}

	public int peek() {
		return contents[tos];
	}

	public boolean isEmpty() {
		return tos < 0;
	}

	public boolean isFull() {
		return tos == contents.length - 1;
	}
}
