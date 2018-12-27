package raymondProject;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Palindrome implements 	ActionListener
{
	private JTextArea jta1;
	private JTextArea jta2;
	private JTextArea polit;
	private JTextArea polif;
	private JTextField UserInput;
	@SuppressWarnings("unused")
	private JButton ClearBtn;
	@SuppressWarnings("unused")
	private JButton Enter;
	private Panel ind1;
	private Panel ind2;
	private JTextArea userinval;
	private JTextArea reversval;
	private JTextArea resultval;
	
	public Palindrome(Panel pnl1)
	{
		Panel panel1 = new Panel();
		panel1.setLayout(null);
		panel1.setBounds(10, 10, 1030, 680);
		panel1.setBackground(Color.DARK_GRAY);
		pnl1.add(panel1);
		
		//------------------------
		panel1.add(jta1 = setlabel(20, 20, 25, "PALINDROME ALGORITHM"));
		panel1.add(jta2 = setlabel(12, 60, 150, "An interesting problem that can be easily solved using the deque data structure is the classic palindrome problem. A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam. We would like to construct an algorithm to input a string of characters and check whether it is a palindrome."));
		panel1.add(polit = setlabel(15, 400, 30, "PALINDROME"));
		panel1.add(polif = setlabel(15, 400, 30, "NOT PALINDROME"));
		polit.setFont(new Font("Lucida Brigth", Font.PLAIN, 25));
		polif.setFont(new Font("Lucida Brigth", Font.PLAIN, 25));
		polit.setBounds(50, 500, 230, 30);
		polif.setBounds(50, 560, 230, 30);
		polit.setEditable(false);
		polif.setEditable(false);
		jta1.setEditable(false);
		jta2.setEditable(false);
		
		//------------------------
		panel1.add(UserInput = Inputs());
		panel1.add(ClearBtn = buttonProp(300, 670, 120, 30, "CLEAR"));
		panel1.add(Enter = buttonProp(340, 465, 120, 50, "ENTER"));
		
		//------------------------
		panel1.add(ind1 = poliindc(30, 513));
		panel1.add(ind2 = poliindc(30, 573));
		
		//------------------------
		panel1.add(userinval = setlabel(15, 400, 30, "USER INPUT: "));
		panel1.add(reversval = setlabel(15, 400, 30, "REVERSE: "));
		panel1.add(resultval = setlabel(15, 400, 30, "RESULT: "));
		userinval.setBounds(400, 500, 600, 30);
		reversval.setBounds(415, 530, 600, 30);
		resultval.setBounds(428, 560, 600, 30);
		userinval.setFont(new Font("Lucida Brigth", Font.PLAIN, 15));
		reversval.setFont(new Font("Lucida Brigth", Font.PLAIN, 15));
		resultval.setFont(new Font("Lucida Brigth", Font.PLAIN, 15));
	}
	
	private JTextArea setlabel(int theFont, int ylocation, int hth, String Name)
	{
		JTextArea jlb1 = new JTextArea(Name);
		jlb1.setVisible(true);
		jlb1.setLineWrap(true); 
		jlb1.setFont(new Font("Lucida Brigth", Font.ITALIC, theFont));
		jlb1.setBounds(20,  ylocation, 990, hth);
		jlb1.setBackground(Color.DARK_GRAY);
		jlb1.setForeground(Color.white);
		return jlb1;
	}
	
	private Panel poliindc(int x, int y)
	{
		Panel pnl1 = new Panel();
		pnl1 = new Panel();
		pnl1.setLayout(null);
		pnl1.setBounds(x, y, 10, 10);
		pnl1.setBackground(new Color(100, 100, 100));		
		return pnl1;
	}
	
	private JTextField Inputs()
	{
		JTextField jtf = new JTextField();
		jtf.setBounds(262, 300, 400, 30);
		jtf.setFont(new Font("Lucida Brigth", Font.PLAIN, 14));
		jtf.setBorder(null);
		return jtf;
	}
	
	private JButton buttonProp(int x, int y, int width, int heigth, String Name)
	{
		JButton myBtn = new JButton();
		myBtn.setText(Name);
		myBtn.setSelected(false);
		myBtn.setFocusable(false);
		myBtn.setBounds(y, x, width, heigth);
		myBtn.setForeground(Color.white);
		myBtn.setBackground(new Color(120, 120, 120));
		myBtn.setFont(new Font("Lucida Brigth", Font.PLAIN, 20));
		myBtn.addActionListener(this);	
		return myBtn;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String command = ((JButton) e.getSource()).getActionCommand();
		if(command == "CLEAR")
		{
			UserInput.setText(null);
		}
		if(command == "ENTER")
		{
			palindromeProc();
			UserInput.setText(null);
		}
	}
	
	private void palindromeProc()
	{
		String UserInput1 = UserInput.getText();
		String Reverse = "";
		for(int i = UserInput1.length() - 1; i >=0; i--)
		{
			Reverse = Reverse + UserInput1.charAt(i);
		}
		userinval.setText("USER INPUT: " + UserInput1);
		reversval.setText("REVERSE: " + Reverse);
		ind1.setBackground(new Color(120, 120, 120));
		ind2.setBackground(new Color(120, 120, 120));
		if(!UserInput.getText().equals("")) 
		{
			if(UserInput1.equals(Reverse))
			{
				ind1.setBackground(Color.RED);
				ind2.setBackground(new Color(120, 120, 120));
				resultval.setText("RESULT: " + "Correct PALINDROME");
			}
			else
			{
				ind2.setBackground(Color.RED);
				ind1.setBackground(new Color(120, 120, 120));
				resultval.setText("RESULT: " + "Wrong PALINDROME");
			}
		}
		else
		{
			resultval.setText("RESULT: " + "Empty  Input");
		}
	}
}