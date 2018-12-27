package raymondProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JScrollPane;

public class VideoPlayer 
{	
	public VideoPlayer(Panel WorkPlacePanel)
	{
		Panel lvp = new Panel();
		lvp.setLayout(null);
		lvp.setBounds(10, 10, 1030, 680);
		lvp.setBackground(Color.black);
		WorkPlacePanel.add(lvp);
		lvp.add(VideoPlayerList(), BorderLayout.SOUTH);
	}
	
	private Panel VideoPlayerList()
	{
		JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(50, 30, 300, 50);
        //----------------------------------------------
		Panel lvp = new Panel();
		lvp.setLayout(null);
		lvp.setBounds(0, 480, 1030, 200);
		lvp.add(scrollPane);
		lvp.setBackground(new Color(20, 20, 20));
		int locx = 0;
		for(int i = 0; i < 20; i++)
		{
			lvp.add(videoHolder(locx));
			locx = locx + 150;
		}
		
		
		return lvp;
	}
	
	private Panel videoHolder(int x)
	{
		
		Panel lvp = new Panel();
		lvp.setLayout(null);		
		lvp.setBounds(x + 10, 15, 150, 150);
		lvp.setBackground(Color.black);
		return lvp;
	}
}
