package com.sahariar.abrelatas;

import java.util.Arrays;

public class Command {

    private String arr[];
    private String symbol;
	
	public Command(String s[])
	{
		arr=new String[2];
		symbol=s[0];
		arr[0]=s[1];
		arr[1]=s[2];
		System.out.println(arr[1]+" "+symbol);
	}
	public String [] get()
	{
		return arr;
	}
	public String  getSymbol()
	{
		return symbol;
	}
	
	public void add(String s)
	{
		arr[1]=arr[1]+"s";
	}
	
	
}
