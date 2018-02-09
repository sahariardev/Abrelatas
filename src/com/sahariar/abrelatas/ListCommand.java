package com.sahariar.abrelatas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCommand {
	
	public List<Command> read(String filename)
	{
		File f=new File(filename);
		System.out.println(filename);
		List<Command> commands=new ArrayList<>();
		try
		{
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
			{
				commands.add(new Command(sc.nextLine().split("B!Q")));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return commands;
	}

}
