//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int denominator;
	private int numerator;
	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	public Rational(int n, int d) {
		setRational(n, d);
	}

	//write a setRational method
	public void setRational(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		this.numerator = n;
	}
	public void setDenominator(int d) {
		this.denominator = d;
	}
	
	public void add(Rational  other)
	{
		num1/den1 + num2/den2 
		new numerator = (num1 * den2 + num2 * den1)
		new denominator = (den1 * den2)


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}
