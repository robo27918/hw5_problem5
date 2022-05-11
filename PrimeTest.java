package tests;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Prime.Prime;

public class PrimeTest {

	@Test
	public void test2() 
	{
		Prime myPrime  = new Prime ();
		assertTrue (myPrime.isPrime(2));
		
	}
	@Test
	public void test3() 
	{
		Prime myPrime  = new Prime ();
		assertTrue (myPrime.isPrime(3));
		
	}
	@Test
	public void test4() 
	{
		Prime myPrime  = new Prime ();
		assertTrue (myPrime.isPrime(4));
		
	}
	@Test
	public void test5() 
	{
		Prime myPrime  = new Prime ();
		assertTrue (myPrime.isPrime(5));
		
	}
	@Test
	public void test6() 
	{
		Prime myPrime  = new Prime ();
		assertTrue (myPrime.isPrime(6));
		
	}
}
