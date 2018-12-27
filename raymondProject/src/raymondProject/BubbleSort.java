package raymondProject;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSort implements ActionListener
{
	@SuppressWarnings("unused")
	private JButton btn1;
	@SuppressWarnings("unused")
	private JButton btn2;
	
	@SuppressWarnings("unused")
	private JTextArea ta1;
	@SuppressWarnings("unused")
	private JTextArea ta2;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel lb5;
	private JLabel lb6;
	private JLabel lb7;
	private JLabel lb8;
	private JLabel lb9;
	private JLabel lb10;
	private JLabel lb11;
	private JLabel lb12;
	private JLabel lb13;
	private JLabel lb14;
	private JLabel lb15;
	private JLabel lb16;
	private JLabel lb17;
	private JLabel lb18;
	private JLabel lb19;
	private JLabel lb20;
	private JLabel lb21;
	private JLabel lb22;
	private JLabel lb23;
	private JLabel lb24;
	private JLabel lb25;
	private JLabel lb26;
	private JLabel lb27;
	private JLabel lb28;
	private JLabel lb29;
	private JLabel lb30;
	private JLabel lb31;
	private JLabel lb32;
	private JLabel lb33;
	private JLabel lb34;
	private JLabel lb35;
	private JLabel lb36;
	private JLabel lb37;
	private JLabel lb38;
	private JLabel lb39;
	private JLabel lb40;
	private JLabel lb41;
	private JLabel lb42;
	private JLabel lb43;
	private JLabel lb44;
	private JLabel lb45;
	private JLabel lb46;
	private JLabel lb47;
	private JLabel lb48;
	
	private int[] numValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};
	private int[] numheigth = {20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255};
	
	public BubbleSort(Panel pnl1)
	{
		Panel panel1 = new Panel();
		panel1.setLayout(null);
		panel1.setBounds(10, 10, 1030, 680);
		panel1.setBackground(Color.DARK_GRAY);
		pnl1.add(panel1);	
		
		panel1.add(ta1 = setlabel(20, 20, 25, "BUBBLE SORT ALGORITHM"));
		panel1.add(ta2 = setlabel(12, 60, 150, "Bubble sort is a sorting algorithm that works by repeatedly stepping through lists that need to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. This passing procedure is repeated until no swaps are required, indicating that the list is sorted. Bubble sort gets its name because smaller elements bubble toward the top of the list."));
		ta1.setEditable(false);
		ta2.setEditable(false);
		panel1.add(lb1 = theLabel(40, 20, "1"));
		panel1.add(lb2 = theLabel(60, 25, "2"));
		panel1.add(lb3 = theLabel(80, 30, "3"));
		panel1.add(lb4 = theLabel(100, 35, "4"));
		panel1.add(lb5 = theLabel(120, 40, "5"));
		panel1.add(lb6 = theLabel(140, 45, "6"));
		panel1.add(lb7 = theLabel(160, 50, "7"));
		panel1.add(lb8 = theLabel(180, 55, "8"));
		panel1.add(lb9 = theLabel(200, 60, "9"));
		panel1.add(lb10 = theLabel(220, 65, "10"));
		panel1.add(lb11 = theLabel(240, 70, "11"));
		panel1.add(lb12 = theLabel(260, 75, "12"));
		panel1.add(lb13 = theLabel(280, 80, "13"));
		panel1.add(lb14 = theLabel(300, 85, "14"));
		panel1.add(lb15 = theLabel(320, 90, "15"));
		panel1.add(lb16 = theLabel(340, 95, "16"));
		panel1.add(lb17 = theLabel(360, 100, "17"));
		panel1.add(lb18 = theLabel(380, 105, "18"));
		panel1.add(lb19 = theLabel(400, 110, "19"));
		panel1.add(lb20 = theLabel(420, 115, "20"));
		panel1.add(lb21 = theLabel(440, 120, "21"));
		panel1.add(lb22 = theLabel(460, 125, "22"));
		panel1.add(lb23 = theLabel(480, 130, "23"));
		panel1.add(lb24 = theLabel(500, 135, "24"));
		panel1.add(lb25 = theLabel(520, 140, "25"));
		panel1.add(lb26 = theLabel(540, 145, "26"));
		panel1.add(lb27 = theLabel(560, 150, "27"));
		panel1.add(lb28 = theLabel(580, 155, "28"));
		panel1.add(lb29 = theLabel(600, 160, "29"));
		panel1.add(lb30 = theLabel(620, 165, "30"));
		panel1.add(lb31 = theLabel(640, 170, "31"));
		panel1.add(lb32 = theLabel(660, 175, "32"));
		panel1.add(lb33 = theLabel(680, 180, "33"));
		panel1.add(lb34 = theLabel(700, 185, "34"));
		panel1.add(lb35 = theLabel(720, 190, "35"));
		panel1.add(lb36 = theLabel(740, 195, "36"));
		panel1.add(lb37 = theLabel(760, 200, "37"));
		panel1.add(lb38 = theLabel(780, 205, "38"));
		panel1.add(lb39 = theLabel(800, 210, "39"));
		panel1.add(lb40 = theLabel(820, 215, "40"));
		panel1.add(lb41 = theLabel(840, 220, "41"));
		panel1.add(lb42 = theLabel(860, 225, "42"));
		panel1.add(lb43 = theLabel(880, 230, "43"));
		panel1.add(lb44 = theLabel(900, 235, "44"));
		panel1.add(lb45 = theLabel(920, 240, "45"));
		panel1.add(lb46 = theLabel(940, 245, "46"));
		panel1.add(lb47 = theLabel(960, 250, "47"));
		panel1.add(lb48 = theLabel(980, 255, "48"));
		panel1.add(btn1 = buttonProp(620, 315, "Random"));
		panel1.add(btn2 = buttonProp(620, 525, "Bubble Sort"));		
	}
	
	private JButton buttonProp(int x, int y, String Name)
	{
		JButton myBtn = new JButton();
		myBtn.setText(Name);
		myBtn.setSelected(false);
		myBtn.setFocusable(false);
		myBtn.setBounds(y, x, 200, 50);
		myBtn.setForeground(Color.white);
		myBtn.setBackground(new Color(120, 120, 120));
		myBtn.setFont(new Font("Lucida Brigth", Font.PLAIN, 15));
		myBtn.addActionListener(this);
		return myBtn;
	}
	
	public JTextArea setlabel(int theFont, int ylocation, int hth, String Name)
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
	
	private JLabel theLabel(int x, int height, String Name)
	{
		JLabel myLabel = new JLabel(Name);
		myLabel.setHorizontalAlignment(JLabel.CENTER);
		myLabel.setVerticalAlignment(JLabel.BOTTOM);
		myLabel.setBounds(x, 300, 15, height);
		myLabel.setForeground(Color.white);
		myLabel.setFont(new Font("Lucida Bright", Font.PLAIN, 8));
		myLabel.setBackground(new Color(20, 20, 20));
		myLabel.setOpaque(true);
		return myLabel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String btnName = ((JButton) e.getSource()).getActionCommand();
		if(btnName == "Random")
		{
			therandomProc();
		}
		if(btnName == "Bubble Sort")
		{
			thebubbelsortProc();
		}
	}	
	
	
	private void thebubbelsortProc()
	{
		// --------------------- hiegth ------------------------------
		for(int i = 0; i < numValue.length; i++)
		{
			for(int j = 0; j < numValue.length - 1; j++)
			{
				int a = numValue[j];
				int b = numValue[j + 1];
				if(a > b)
				{
					a = a + b;
					b = a - b;
					a = a - b;
					numValue[j] = a;
					numValue[j + 1] = b;
				}
			}
		}
		lb1.setText(String.valueOf(numValue[0]));
		lb2.setText(String.valueOf(numValue[1]));
		lb3.setText(String.valueOf(numValue[2]));
		lb4.setText(String.valueOf(numValue[3]));
		lb5.setText(String.valueOf(numValue[4]));
		lb6.setText(String.valueOf(numValue[5]));
		lb7.setText(String.valueOf(numValue[6]));
		lb8.setText(String.valueOf(numValue[7]));
		lb9.setText(String.valueOf(numValue[8]));
		lb10.setText(String.valueOf(numValue[9]));
		lb11.setText(String.valueOf(numValue[10]));
		lb12.setText(String.valueOf(numValue[11]));
		lb13.setText(String.valueOf(numValue[12]));
		lb14.setText(String.valueOf(numValue[13]));
		lb15.setText(String.valueOf(numValue[14]));
		lb16.setText(String.valueOf(numValue[15]));
		lb17.setText(String.valueOf(numValue[16]));
		lb18.setText(String.valueOf(numValue[17]));
		lb19.setText(String.valueOf(numValue[18]));
		lb20.setText(String.valueOf(numValue[19]));
		lb21.setText(String.valueOf(numValue[20]));
		lb22.setText(String.valueOf(numValue[21]));
		lb23.setText(String.valueOf(numValue[22]));
		lb24.setText(String.valueOf(numValue[23]));
		lb25.setText(String.valueOf(numValue[24]));
		lb26.setText(String.valueOf(numValue[25]));
		lb27.setText(String.valueOf(numValue[26]));
		lb28.setText(String.valueOf(numValue[27]));
		lb29.setText(String.valueOf(numValue[28]));
		lb30.setText(String.valueOf(numValue[29]));
		lb31.setText(String.valueOf(numValue[30]));
		lb32.setText(String.valueOf(numValue[31]));
		lb33.setText(String.valueOf(numValue[32]));
		lb34.setText(String.valueOf(numValue[33]));
		lb35.setText(String.valueOf(numValue[34]));
		lb36.setText(String.valueOf(numValue[35]));
		lb37.setText(String.valueOf(numValue[36]));
		lb38.setText(String.valueOf(numValue[37]));
		lb39.setText(String.valueOf(numValue[38]));
		lb40.setText(String.valueOf(numValue[39]));
		lb41.setText(String.valueOf(numValue[40]));
		lb42.setText(String.valueOf(numValue[41]));
		lb43.setText(String.valueOf(numValue[42]));
		lb44.setText(String.valueOf(numValue[43]));
		lb45.setText(String.valueOf(numValue[44]));
		lb46.setText(String.valueOf(numValue[45]));
		lb47.setText(String.valueOf(numValue[46]));
		lb48.setText(String.valueOf(numValue[47]));
		
		// --------------------- hiegth ------------------------------
		for(int i = 0; i < numheigth.length; i++)
		{
			for(int j = 0; j < numheigth.length - 1; j++)
			{
				int a = numheigth[j];
				int b = numheigth[j + 1];
				if(a > b)
				{
					a = a + b;
					b = a - b;
					a = a - b;
					numheigth[j] = a;
					numheigth[j + 1] = b;
				}
			}
		}
		lb1.setSize(15, numheigth[0]);
		lb2.setSize(15, numheigth[1]);
		lb3.setSize(15, numheigth[2]);
		lb4.setSize(15, numheigth[3]);
		lb5.setSize(15, numheigth[4]);
		lb6.setSize(15, numheigth[5]);
		lb7.setSize(15, numheigth[6]);
		lb8.setSize(15, numheigth[7]);
		lb9.setSize(15, numheigth[8]);
		lb10.setSize(15, numheigth[9]);
		lb11.setSize(15, numheigth[10]);
		lb12.setSize(15, numheigth[11]);
		lb13.setSize(15, numheigth[12]);
		lb14.setSize(15, numheigth[13]);
		lb15.setSize(15, numheigth[14]);
		lb16.setSize(15, numheigth[15]);
		lb17.setSize(15, numheigth[16]);
		lb18.setSize(15, numheigth[17]);
		lb19.setSize(15, numheigth[18]);
		lb20.setSize(15, numheigth[19]);
		lb21.setSize(15, numheigth[20]);
		lb22.setSize(15, numheigth[21]);
		lb23.setSize(15, numheigth[22]);
		lb24.setSize(15, numheigth[23]);
		lb25.setSize(15, numheigth[24]);
		lb26.setSize(15, numheigth[25]);
		lb27.setSize(15, numheigth[26]);
		lb28.setSize(15, numheigth[27]);
		lb29.setSize(15, numheigth[28]);
		lb30.setSize(15, numheigth[29]);
		lb31.setSize(15, numheigth[30]);
		lb32.setSize(15, numheigth[31]);
		lb33.setSize(15, numheigth[32]);
		lb34.setSize(15, numheigth[33]);
		lb35.setSize(15, numheigth[34]);
		lb36.setSize(15, numheigth[35]);
		lb37.setSize(15, numheigth[36]);
		lb38.setSize(15, numheigth[37]);
		lb39.setSize(15, numheigth[38]);
		lb40.setSize(15, numheigth[39]);
		lb41.setSize(15, numheigth[40]);
		lb42.setSize(15, numheigth[41]);
		lb43.setSize(15, numheigth[42]);
		lb44.setSize(15, numheigth[43]);
		lb45.setSize(15, numheigth[44]);
		lb46.setSize(15, numheigth[45]);
		lb47.setSize(15, numheigth[46]);
		lb48.setSize(15, numheigth[47]);
	}
	
	private void therandomProc()
	{
		// --------------------------- random --------------------------- 
		for(int i = 0; i < numValue.length; i++)
		{
			int j = (int) (Math.random() * numValue.length);
			int tmp = numValue[j];
			numValue[j] = numValue[i];
			numValue[i] = tmp;			
		}
		lb1.setText(String.valueOf(numValue[0]));
		lb2.setText(String.valueOf(numValue[1]));
		lb3.setText(String.valueOf(numValue[2]));
		lb4.setText(String.valueOf(numValue[3]));
		lb5.setText(String.valueOf(numValue[4]));
		lb6.setText(String.valueOf(numValue[5]));
		lb7.setText(String.valueOf(numValue[6]));
		lb8.setText(String.valueOf(numValue[7]));
		lb9.setText(String.valueOf(numValue[8]));
		lb10.setText(String.valueOf(numValue[9]));
		lb11.setText(String.valueOf(numValue[10]));
		lb12.setText(String.valueOf(numValue[11]));
		lb13.setText(String.valueOf(numValue[12]));
		lb14.setText(String.valueOf(numValue[13]));
		lb15.setText(String.valueOf(numValue[14]));
		lb16.setText(String.valueOf(numValue[15]));
		lb17.setText(String.valueOf(numValue[16]));
		lb18.setText(String.valueOf(numValue[17]));
		lb19.setText(String.valueOf(numValue[18]));
		lb20.setText(String.valueOf(numValue[19]));
		lb21.setText(String.valueOf(numValue[20]));
		lb22.setText(String.valueOf(numValue[21]));
		lb23.setText(String.valueOf(numValue[22]));
		lb24.setText(String.valueOf(numValue[23]));
		lb25.setText(String.valueOf(numValue[24]));
		lb26.setText(String.valueOf(numValue[25]));
		lb27.setText(String.valueOf(numValue[26]));
		lb28.setText(String.valueOf(numValue[27]));
		lb29.setText(String.valueOf(numValue[28]));
		lb30.setText(String.valueOf(numValue[29]));
		lb31.setText(String.valueOf(numValue[30]));
		lb32.setText(String.valueOf(numValue[31]));
		lb33.setText(String.valueOf(numValue[32]));
		lb34.setText(String.valueOf(numValue[33]));
		lb35.setText(String.valueOf(numValue[34]));
		lb36.setText(String.valueOf(numValue[35]));
		lb37.setText(String.valueOf(numValue[36]));
		lb38.setText(String.valueOf(numValue[37]));
		lb39.setText(String.valueOf(numValue[38]));
		lb40.setText(String.valueOf(numValue[39]));
		lb41.setText(String.valueOf(numValue[40]));
		lb42.setText(String.valueOf(numValue[41]));
		lb43.setText(String.valueOf(numValue[42]));
		lb44.setText(String.valueOf(numValue[43]));
		lb45.setText(String.valueOf(numValue[44]));
		lb46.setText(String.valueOf(numValue[45]));
		lb47.setText(String.valueOf(numValue[46]));
		lb48.setText(String.valueOf(numValue[47]));
		
		// --------------------------- random ---------------------------
		for(int i = 0; i < numheigth.length; i++)
		{
			int j = (int) (Math.random() * numheigth.length);
			int tmp = numheigth[j];
			numheigth[j] = numheigth[i];
			numheigth[i] = tmp;			
		}
		
		lb1.setSize(15, numheigth[0]);
		lb2.setSize(15, numheigth[1]);
		lb3.setSize(15, numheigth[2]);
		lb4.setSize(15, numheigth[3]);
		lb5.setSize(15, numheigth[4]);
		lb6.setSize(15, numheigth[5]);
		lb7.setSize(15, numheigth[6]);
		lb8.setSize(15, numheigth[7]);
		lb9.setSize(15, numheigth[8]);
		lb10.setSize(15, numheigth[9]);
		lb11.setSize(15, numheigth[10]);
		lb12.setSize(15, numheigth[11]);
		lb13.setSize(15, numheigth[12]);
		lb14.setSize(15, numheigth[13]);
		lb15.setSize(15, numheigth[14]);
		lb16.setSize(15, numheigth[15]);
		lb17.setSize(15, numheigth[16]);
		lb18.setSize(15, numheigth[17]);
		lb19.setSize(15, numheigth[18]);
		lb20.setSize(15, numheigth[19]);
		lb21.setSize(15, numheigth[20]);
		lb22.setSize(15, numheigth[21]);
		lb23.setSize(15, numheigth[22]);
		lb24.setSize(15, numheigth[23]);
		lb25.setSize(15, numheigth[24]);
		lb26.setSize(15, numheigth[25]);
		lb27.setSize(15, numheigth[26]);
		lb28.setSize(15, numheigth[27]);
		lb29.setSize(15, numheigth[28]);
		lb30.setSize(15, numheigth[29]);
		lb31.setSize(15, numheigth[30]);
		lb32.setSize(15, numheigth[31]);
		lb33.setSize(15, numheigth[32]);
		lb34.setSize(15, numheigth[33]);
		lb35.setSize(15, numheigth[34]);
		lb36.setSize(15, numheigth[35]);
		lb37.setSize(15, numheigth[36]);
		lb38.setSize(15, numheigth[37]);
		lb39.setSize(15, numheigth[38]);
		lb40.setSize(15, numheigth[39]);
		lb41.setSize(15, numheigth[40]);
		lb42.setSize(15, numheigth[41]);
		lb43.setSize(15, numheigth[42]);
		lb44.setSize(15, numheigth[43]);
		lb45.setSize(15, numheigth[44]);
		lb46.setSize(15, numheigth[45]);
		lb47.setSize(15, numheigth[46]);
		lb48.setSize(15, numheigth[47]);
	}
}
