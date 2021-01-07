package com.simpleCalc;

public class calcBase {
	private int val1;
	private int val2;
	
	public calcBase() {
	}
	
	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}

	
	
	public int addition(int val1, int val2) {
	return val1 + val2;
	}
	
	public int simpleDivision(int val1, int val2) {
	return val1 / val2;
	}
	
	public int subtraction(int val1, int val2) {
	return val1 - val2;
	}
	
	public int multiplication(int val1, int val2) {
	return val1 * val2;
	}
}
