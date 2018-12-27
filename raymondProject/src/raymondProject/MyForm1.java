package raymondProject;
import java.awt.EventQueue;	
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;

public class MyForm1 
{	
	private JFrame frame;
	private Panel panel1;
	private Panel panel2;
	
	public MyForm1()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					initialize();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		panel1 = new Panel();
		panel1.setLayout(null);
		panel1.setBounds(0, 0, 300, 500);
		panel1.setBackground(Color.black);
		frame.getContentPane().add(panel1, BorderLayout.WEST);
		
		panel2 = new Panel();
		panel2.setLayout(null);
		panel2.setBounds(0, 0, 1050, 500);
		panel2.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel2, BorderLayout.EAST);
		@SuppressWarnings("unused")
		ButtonProcessList btnprol = new ButtonProcessList(panel1, panel2);
	}
}