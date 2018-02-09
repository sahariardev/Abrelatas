package com.sahariar.abrelatas;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField text;
	
	@FXML
	public void open()
	{
		
		
		
		String input[]=text.getText().split(" ");
		
		
		List <Command> cmd=new ArrayList<>();
		//0
		cmd.add(new Command("explorer.exe", "C:\\Program Files (x86)\\VideoLAN\\VLC"));
		//1
		cmd.add(new Command("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe",""));
		//2
		cmd.add(new Command("explorer.exe", "D:\\JAVA TUTORIALS"));
		//3
		cmd.add(new Command("explorer.exe", "E:\\javaworkspace"));
		
		List<String> symbols=new ArrayList<>();
		symbols.add("jt");
		
		try {
			
			String arr[]=new String[2];
			if(input[0].equalsIgnoreCase("jt"))
			{
				arr=cmd.get(2).get();
			}
			else if(input[0].equalsIgnoreCase("jw"))
			{
				arr=cmd.get(3).get();
			}
			else
			{
				arr=cmd.get(0).get();
			}
			Runtime.getRuntime().exec(arr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
}
class Command
{
	
	public String arr[];
	
	public Command(String s,String s2)
	{
		arr=new String[2];
		arr[0]=s;
		arr[1]=s2;
	}
	public String [] get()
	{
		return arr;
	}
	public void add(String s)
	{
		arr[1]=arr[1]+"s";
	}
	
}
