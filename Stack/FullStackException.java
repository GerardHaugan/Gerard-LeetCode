package com.mingche;

public class FullStackException extends RuntimeException
{
	public FullStackException()
	{
		this("Stack is full.");
	}
	
	public FullStackException(String expression)
	{
		super(expression);
	}
}