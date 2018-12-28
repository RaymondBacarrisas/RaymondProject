package RaymondProjectNo1;
import java.util.*;
import java.io.*;

public class DataStructures 
{
	ArrayList<String> nameList = new ArrayList<String>();
	private String[] UserInputVal = new String[5];
	public DataStructures() 
	{
		userInputHolder();
		saveToFile();
		readTheFile();
	}
	
	@SuppressWarnings("resource")
	private void userInputHolder()
	{
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Number [" + i + "] enter the Value: ");
			String theInputs = in.nextLine();
			if(theInputs.equals("")) 
			{
				UserInputVal[i] = String.valueOf(i) + " No Value";
			}
			else
			{
				
				UserInputVal[i] = theInputs;
			}
		}
	}
	
	private void saveToFile()
	{
		try
		{
			FileOutputStream fileOutStream = new FileOutputStream("C:\\Users\\Intern\\Desktop\\Data Structure.txt");
			ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream);
			objOutStream.writeObject(UserInputVal[0] + "/" + UserInputVal[1] + "/" + UserInputVal[2] + "/" + UserInputVal[3] + "/" + UserInputVal[4]);
			objOutStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private void readTheFile()
	{
		try
		{
			FileInputStream fileInStream = new FileInputStream("C:\\Users\\Intern\\Desktop\\Data Structure.txt");
			ObjectInputStream objInStream = new ObjectInputStream(fileInStream);
			String line = String.valueOf(objInStream.readObject());
			System.out.println("Read From File: " + line);
			splitList(line);
			objInStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private void splitList(String lineToParse)
	{
		String[] Tokens = lineToParse.split("/");		
		for(int i = 0; i < Tokens.length; i++)
		{
			nameList.add(Tokens[i]);
		}
		System.out.println("Not Sorted List Output: " + nameList);
		Collections.sort(nameList);
		System.out.println("Sorted List Output: " + nameList);		
	}
}
