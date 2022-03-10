package com.itso;
import java.math.BigInteger;



public class Primes {

	private static final BigInteger ZERO = new BigInteger("0");
	private static final BigInteger ONE = new BigInteger("1");
	private static final BigInteger TWO = new BigInteger("2");
	private String prime = "";

	private static final int ERR_VAL = 100;

	public  BigInteger nextPrime(BigInteger start) {
		if (isEven(start))
			start = start.add(ONE);
		else
			start = start.add(TWO);
		if (start.isProbablePrime(ERR_VAL))
			return (start);
		else
			return (nextPrime(start));
	}

	private boolean isEven(BigInteger n) {
		return (n.mod(TWO).equals(ZERO));
	}

	private  StringBuffer[] digits =
		{
			new StringBuffer("0"),
			new StringBuffer("1"),
			new StringBuffer("2"),
			new StringBuffer("3"),
			new StringBuffer("4"),
			new StringBuffer("5"),
			new StringBuffer("6"),
			new StringBuffer("7"),
			new StringBuffer("8"),
			new StringBuffer("9")};

	private  StringBuffer randomDigit() {
		int index = (int) Math.floor(Math.random() * 10);
		return (digits[index]);
	}

	public  BigInteger random(int numDigits) {
		StringBuffer s = new StringBuffer("");
		for (int i = 0; i < numDigits; i++) {
			s.append(randomDigit());
		}
		return (new BigInteger(s.toString()));
	}


	public  void main(String[] args) {
		int numDigits;
		if (args.length > 0)
			numDigits = Integer.parseInt(args[0]);
		else
			numDigits = 150;
		BigInteger start = random(numDigits);
		for (int i = 0; i < 50; i++) {
			start = nextPrime(start);
			System.out.println("Prime " + i + " = " + start);
		}
	}

	public  String getPrime(int numDigits) {

		BigInteger start = random(numDigits);
		start = nextPrime(start);

		return start.toString();
	}
}
