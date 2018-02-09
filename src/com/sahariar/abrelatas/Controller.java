package com.sahariar.abrelatas;

import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
	List <Command> cmds;
	public Controller()
	{
		ListCommand list=new ListCommand(); 
		cmds=list.read("command.txt");
		
	}

	@FXML
	private TextField text;
	
	@FXML
	public void enterPresses(KeyEvent event)
	{
		if (event.getCode().equals(KeyCode.ENTER)) {
	        open();
			
	    }	
	}
	
	@FXML
	public void open()
	{
		
		
		
		String input[]=text.getText().split(" ");
		try {
			String arr[]=new String[2];
			String dflt []={"explorer.exe","D:\\JAVA TUTORIALS"};
			boolean flag  =false;
			for(Command cmd:cmds)
			{
			  if(cmd.getSymbol().equalsIgnoreCase(input[0]))
			  {
				  flag=true;
				  arr=cmd.get();
				  
			  }
			}
			if(!flag)
			{
				arr=dflt;
			}
			System.out.println(arr[0]+" from the vault "+arr[1]);
			Runtime.getRuntime().exec(arr);
		} catch (Exception e) {
			
			System.out.println(e.getStackTrace());
		}
	}
	
}

