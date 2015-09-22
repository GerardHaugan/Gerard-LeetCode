package com.mingche;

public class EmptyStackException extends RuntimeException
{
	public EmptyStackException()
	{
		this("Stack is empty.");
	}
	
	public EmptyStackException(String expression)
	{
		super(expression);
	}
}