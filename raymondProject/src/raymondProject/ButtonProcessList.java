package raymondProject;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;	
import java.awt.Panel;

public class ButtonProcessList implements ActionListener
{
	@SuppressWarnings("unused")
	private JButton btn1;
	@SuppressWarnings("unused")
	private JButton btn2;
	@SuppressWarnings("unused")
	private JButton btn3;
	@SuppressWarnings("unused")
	private JButton btn4;
	@SuppressWarnings("unused")
	private JButton btn5;
	private Panel pnlA12;
	
	public ButtonProcessList(Panel pnl1, Panel pnl2)
	{
		pnlA12 = pnl2;
		BtnInitialization(pnl1);
	}
	
	private void BtnInitialization(Panel pnl1)
	{
		btn1 = buttonProp(10, "Bubble Sort", pnl1);
		btn2 = buttonProp(120, "Palindrome", pnl1);
		btn3 = buttonProp(230, "Document Creator", pnl1);
		btn4 = buttonProp(340, "", pnl1);
		btn5 = buttonProp(450, "", pnl1);
	}
	
	private JButton buttonProp(int x, String Name, Panel pnlSA1)
	{
		JButton myBtn = new JButton();
		myBtn.setText(Name);
		myBtn.setSelected(false);
		myBtn.setFocusable(false);
		myBtn.setBounds(10, x, 280, 100);
		myBtn.setForeground(Color.white);
		myBtn.setBackground(new Color(120, 120, 120));
		myBtn.setFont(new Font("Lucida Brigth", Font.PLAIN, 20));
		myBtn.addActionListener(this);
		pnlSA1.add(myBtn);		
		return myBtn;
	}

	@Override
	@SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e) 
	{
		pnlA12.removeAll();
	    String command = ((JButton) e.getSource()).getActionCommand();
	    if(command == "Bubble Sort")
	    { 
			 BubbleSort bS1 = new BubbleSort(pnlA12);
	    }
	    if(command == "Palindrome")
	    {
			Palindrome pl1 = new Palindrome(pnlA12);
	    }
	    if(command == "Document Creator")
	    {
	    	SavingObject1 so1 = new SavingObject1(pnlA12);
	    }
	}	
}
