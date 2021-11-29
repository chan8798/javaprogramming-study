package javastudy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javastudy.ThreadIntteruptEx.TimerRunnable;
import javastudy.ThreadIntteruptEx.TimerRunnablee;
import javastudy.ThreadIntteruptEx.TimerRunnableee;
import javastudy.ThreadIntteruptEx.TimerRunnableeee;
import javastudy.ThreadIntteruptEx.TimerRunnableeeee;
import javastudy.ThreadIntteruptEx.TimerRunnableeeeee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.IllegalThreadStateException;

public class lottoversion extends JFrame implements ActionListener  {
	class TimerRunnable implements Runnable{
		private JLabel timerLabel;
		private JLabel timerLabellllll;
		private JLabel timerLabell;
		private JLabel timerLabelll;
		private JLabel timerr;
		private JLabel timer;
		
		public TimerRunnable(JLabel timerLabel,JLabel timerLabellllll,JLabel timerLabell
				,JLabel timerLabelll,JLabel timerr,JLabel timer) {
			this.timerLabel=timerLabel;
			this.timerLabellllll=timerLabellllll;
			this.timerLabell=timerLabell;
			this.timerLabelll=timerLabelll;
			this.timerr=timerr;
			this.timer=timer;
			
		}
		@Override
		public void run() {
			for(int h=0; h<=200; h++){
				Integer u0 = new Integer((int) (Math.random() * 45 + 1));
				timerLabel.setText(Integer.toString(u0));
			   
				try {
					Thread.sleep(5);
				}
				catch(InterruptedException e) {
					return;
				}
				
			    
				
				
			    if( h>50) {
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
			    		timerLabellllll.setText(Integer.toString(u1));
			    		try {
							Thread.sleep(5);
						}
						catch(InterruptedException e) {
							return;
						}
			    				    	    }
			    if( h==200) {
			    	for(int hh=0; hh<=200; hh++){
			    	Integer u1 = new Integer((int) (Math.random() * 45 + 1));
		    		timerLabellllll.setText(Integer.toString(u1));
		    		
		    		try {
						Thread.sleep(5);
					}
					catch(InterruptedException e) {
						return;
					}
		    		
		    		if(hh>50) {
		    			Integer u2 = new Integer((int) (Math.random() * 45 + 1));
			    		timerLabell.setText(Integer.toString(u2));
			    		
			    		try {
							Thread.sleep(5);
						}
						catch(InterruptedException e) {
							return;
						}
		    		}
		    		if(hh==200) {
		    			for(int t=0; t<=200; t++){
					    	Integer u2 = new Integer((int) (Math.random() * 45 + 1));
				    		timerLabell.setText(Integer.toString(u2));
				    		
				    		try {
								Thread.sleep(5);
							}
							catch(InterruptedException e) {
								return;
							}
				    		if(t>50) {
				    			Integer u3 = new Integer((int) (Math.random() * 45 + 1));
					    		timerLabelll.setText(Integer.toString(u3));
				    		}
				    		try {
								Thread.sleep(5);
							}
							catch(InterruptedException e) {
								return;
							}
				    		if(t==200) {
				    			for(int r=0; r<=200; r++) {
				    				Integer u3 = new Integer((int) (Math.random() * 45 + 1));
						    		timerLabelll.setText(Integer.toString(u3));
					    		
				    			
					    		try {
									Thread.sleep(5);
								}
								catch(InterruptedException e) {
									return;
								}
					    		if(r>50) {
					    			Integer u4 = new Integer((int) (Math.random() * 45 + 1));
						    		timerr.setText(Integer.toString(u4));
						    		try {
										Thread.sleep(5);
									}
									catch(InterruptedException e) {
										return;
									}
					    		
					    		if(r==200) {
					    			for(int kkk=0; kkk<200; kkk++) {
					    				Integer u5 = new Integer((int) (Math.random() * 45 + 1));
							    		timer.setText(Integer.toString(u5));
						    		
							    		btna.setEnabled(false);
						    		try {
										Thread.sleep(5);
									}
									catch(InterruptedException e) {
										return;
									}
						    		btna.setEnabled(true);
					    			
						    		
					    			}
					    		
					    		}
				    			}
				    			}
				    			
				    		}
		    		}
		    		}
		    		}
			    	}
			    	}
			    
			}
		
	}		    	
	JPanel center = new JPanel(new GridLayout(2, 3));
	JPanel south = new JPanel(new BorderLayout());
	JTextField tf = new JTextField();
	
	private Thread th;

	
	
	JButton btnn[] = new JButton[6];
    JButton btn=new JButton("½ÃÀÛ");
    JButton btna=new JButton("ÃÊ±âÈ­");
  
    
    JLabel timerLabel=new JLabel ();
    JLabel timerLabell=new JLabel();
    JLabel timerLabellllll=new JLabel();
    JLabel timerLabelll=new JLabel();
    JLabel timerr=new JLabel();
    JLabel timer=new JLabel();
    
    
    public lottoversion() {
    	
    	super("·Î¶Ç¹øÈ£");
    	center.setSize(50, 50);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String num[] = { " ", " ", " ", " ", " ", " " };
        for (int i = 0; i < num.length; i++) {
            btnn[i] = new JButton(num[i]);
            center.add(btnn[i]);
            btnn[i].setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 50));
            
        }
    	
    
    	timerLabel.setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 50));
    	timerLabell.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabelll.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	timerLabellllll.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerr.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timer.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	TimerRunnable runnable =new TimerRunnable(timerLabel, timerLabellllll,timerLabell
    			,timerLabelll,timerr,timer);
    	th=new Thread(runnable);
    	
    
    	
      
        
        
        add(center, "Center");
        south.add(btn, "East");
        south.add(btna, "West");
        
        add(south, "South");
    	setSize(300,250);
        setVisible(true);
        
        
        btn.addActionListener(this);
        btna.addActionListener(this);
        
        
        
        btn.setEnabled(true);
        btna.setEnabled(false);
        
    	}
    
      public void actionPerformed(ActionEvent e)  {
    	
        if (e.getSource() == btn) {
        	
        	 
            btnn[0].add(timerLabel);
            btnn[1].add(timerLabellllll);
            btnn[2].add(timerLabell);
            btnn[3].add(timerLabelll);
            btnn[4].add(timerr);
            btnn[5].add(timer);
            th.start();
     

        	btn.setEnabled(false);
        	
        	
        	
        	
        	
        	}
           else if (e.getSource() == btna) {
          
    	   new lottoversion();
    	   setVisible(false);
    	  
    	   
     }
        
    
    }
     
    public static void main(String args[]) {
    	lottoversion m=new lottoversion();
       	   m.setVisible(true);//ÀÌÀü ½ÇÇà È­¸é ´Ý±â
      }
 }		 			    		