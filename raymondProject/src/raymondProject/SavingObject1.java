package raymondProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class SavingObject1 implements ActionListener
{
	private Panel WorkPlaceHolder;
	private JTextArea UserInputs;
	
	public SavingObject1(Panel WorkplaceImport)
	{
		WorkplaceImport.add(WorkPlaceHolder = WorkPlace());
	}
	
	private Panel WorkPlace()
	{
		Panel WorkPlacePanel = new Panel();
		WorkPlacePanel.setLayout(null);
		WorkPlacePanel.setBounds(10, 10, 1030, 680);
		WorkPlacePanel.setBackground(Color.DARK_GRAY);		
		WorkPlacePanel.add(UserInputs = textInput());
		WorkPlacePanel.add(saveButton("SAVE", 0));
		WorkPlacePanel.add(saveButton("READ", 60));
		return WorkPlacePanel;
	}
	
	private JTextArea textInput()
	{
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setBounds(80, 0, 600, 680);
		jta.setBackground(Color.white);
		return jta;
	}
	
	private JButton saveButton(String text, int toploc)
	{
		JButton thBtn = new JButton(text);
		thBtn.setBounds(725,  toploc,  250, 50);
		thBtn.setFont(new Font("Lucida Brigth", Font.PLAIN, 17));
		thBtn.setFocusable(false);
		thBtn.setSelected(false);
		thBtn.setBackground(Color.gray);
		thBtn.setForeground(Color.white);		
		thBtn.addActionListener(this);
		return thBtn;
	}
	
	private void objectOutputStream_Fn()
	{
		try
		{
			FileOutputStream fileOutStream = new FileOutputStream("Raymond.ser");
			ObjectOutputStream ObjOutStream = new ObjectOutputStream(fileOutStream);
			ObjOutStream.writeObject(UserInputs.getText());
			UserInputs.setText(null);
			ObjOutStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private void objectInputStream_Fn()
	{
		try
		{
			FileInputStream fileInStream = new FileInputStream("Raymond.ser");
			ObjectInputStream ObjInStream = new ObjectInputStream(fileInStream);
			UserInputs.setText(String.valueOf(ObjInStream.readObject()));
			fileInStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	private void bufferedreader_Fn()
	{
		try
		{
			File myFile = new File("Raymond.ser");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while((line = bufferedReader.readLine()) != null)
			{
				UserInputs.setText(line);
			}
			bufferedReader.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String command = ((JButton) e.getSource()).getActionCommand();
		if(command == "SAVE")
		{
			objectOutputStream_Fn();
		}
		
		if(command == "READ")
		{
			//objectInputStream_Fn();
			objectInputStream_Fn();
		}
	}
}

