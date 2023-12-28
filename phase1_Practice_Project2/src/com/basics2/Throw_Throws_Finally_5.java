package com.basics2;

public class Throw_Throws_Finally_5 {

	public static void main(String[] args) {

		int a = 50, b = 0, ans;

		try {
			if (b == 0)
				throw (new ArithmeticException("Can not divide by zero."));
			else {
				ans = a / b;
				System.out.print("\n\tThe result is : " + ans);
			}
		} catch (ArithmeticException e) {
			System.out.print("\n\tError : " + e.getMessage());
		}

		System.out.print("\n program end..");

	}

}
