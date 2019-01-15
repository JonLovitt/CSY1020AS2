package CCarCrash;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.awt.event.ActionEvent;
	 
	public class CCarCrash extends JFrame implements ActionListener  {
	
	    public JLabel labeltext;
	    	 
	    public static void main(String[] args)
	    {
	        CCarCrash frame = new CCarCrash();
	        frame.setSize(810, 650);
	        frame.createGUI();
	        frame.setVisible(true);
	    }
	   
	    private void createGUI()
	    {
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        Container window = getContentPane();
	        window.setLayout(new FlowLayout() );
	        JFrame f = new JFrame("Option 0");
	 
	      
	      labeltext = new JLabel("option 0");
	      labeltext.setBounds(70, 200, 150, 60);
	      f.add(labeltext);
	      
	      JButton btn = new JButton("Option 1");
	      btn.setBounds(70, 200, 150, 60);
	      f.add(btn);
	      
	      btn.addActionListener(new ActionListener());
	      
	      
	      
	       
	    }
	    public void actionPerformed(ActionEvent event) 
	    
	    { 
	    	
	    }
	

}
