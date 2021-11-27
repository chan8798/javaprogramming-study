package javastudy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.IllegalThreadStateException;
import javax.swing.JOptionPane;
public class ThreadIntteruptEx extends JFrame implements ActionListener  {
	class TimerRunnable implements Runnable{
		private JLabel timerLabel;
		
		public TimerRunnable(JLabel timerLabel) {
			this.timerLabel=timerLabel;
		}
		@Override
		public void run() {
			
			
			for(int h=0; h<=100; h++){
				Integer u0 = new Integer((int) (Math.random() * 45 + 1));
			    timerLabel.setText(Integer.toString(u0));
				
					try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
		}	
		
		}
	}
	class TimerRunnablee implements Runnable{
		private JLabel timerLabell;
		
		public TimerRunnablee(JLabel timerLabell) {
			this.timerLabell=timerLabell;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=200; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabell.setText(Integer.toString(u1));
				
				
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
		}
		
		}
	}
	class TimerRunnableee implements Runnable{
		private JLabel timerLabelll;
		
		public TimerRunnableee(JLabel timerLabelll) {
			this.timerLabelll=timerLabelll;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=300; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabelll.setText(Integer.toString(u1));
				
				
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
		}
		
		}
	}
	class TimerRunnableeee implements Runnable{
		private JLabel timerLabellll;
		
		public TimerRunnableeee(JLabel timerLabellll) {
			this.timerLabellll=timerLabellll;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=400; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellll.setText(Integer.toString(u1));
				
				
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
		}
		
		}
	}
	class TimerRunnableeeee implements Runnable{
		
		private JLabel timerLabelllll;
		
		public TimerRunnableeeee(JLabel timerLabelllll) {
			this.timerLabelllll=timerLabelllll;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=500; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabelllll.setText(Integer.toString(u1));
				
				
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
		}
		
		}
	}
	class TimerRunnableeeeee implements Runnable{
		private JLabel timerLabellllll;
		
		public TimerRunnableeeeee(JLabel timerLabellllll) {
			this.timerLabellllll=timerLabellllll;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=700; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellllll.setText(Integer.toString(u1));
				
				
				btna.setEnabled(false);
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			btna.setEnabled(true);
		}
		
		}
	}
	
	
	JPanel center = new JPanel(new GridLayout(2, 3));
	JPanel south = new JPanel(new BorderLayout());
	JTextField tf = new JTextField();
	
	private Thread th;
	private Thread thh;
	private Thread thhh;
	private Thread thhhh;
	private Thread thhhhh;
	private Thread thhhhhh;
	
	JButton btnn[] = new JButton[6];
    JButton btn=new JButton("½ÃÀÛ");
    JButton btna=new JButton("ÃÊ±âÈ­");
  
    
    JLabel timerLabel=new JLabel ();
    JLabel timerLabell=new JLabel();
    JLabel timerLabelll=new JLabel();
    JLabel timerLabellll=new JLabel();	
    JLabel timerLabelllll=new JLabel();
    JLabel timerLabellllll=new JLabel();
    
    public ThreadIntteruptEx() {
    	
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
    	timerLabell.setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 50));
    	timerLabelll.setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 50));
    	timerLabellll.setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 50));
    	timerLabelllll.setFont(new Font("µ¸¿òÃ¼", Font.BOLD, 50));
    	timerLabellllll.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	TimerRunnable runnable =new TimerRunnable(timerLabel);
    	th=new Thread(runnable);
    	TimerRunnablee run =new TimerRunnablee(timerLabell);
    	thh=new Thread(run);
    	TimerRunnableee runn =new TimerRunnableee(timerLabelll);
    	thhh=new Thread(runn);
    	TimerRunnableeee ru =new TimerRunnableeee(timerLabellll);
    	thhhh=new Thread(ru);
    	TimerRunnableeeee rr =new TimerRunnableeeee(timerLabelllll);
    	thhhhh=new Thread(rr);
    	TimerRunnableeeeee rrr =new TimerRunnableeeeee(timerLabellllll);
    	thhhhhh=new Thread(rrr);
    	
       
        btnn[0].add(timerLabel);
        btnn[1].add(timerLabell);
        btnn[2].add(timerLabelll);
        btnn[3].add(timerLabellll);
        btnn[4].add(timerLabelllll);
        btnn[5].add(timerLabellllll);
        
        
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
        	
        			
            th.start();
        	thh.start();
        	thhh.start();
        	thhhh.start();
        	thhhhh.start();
        	thhhhhh.start();
        	btn.setEnabled(false);
        	
        	
        	
        	
        	
        	}
           else if (e.getSource() == btna) {
          
    	   new ThreadIntteruptEx();
    	   setVisible(false);
    	  
    	   
     }
        
    
    }
     
    public static void main(String args[]) {
    	  ThreadIntteruptEx m=new ThreadIntteruptEx();
       	   m.setVisible(true);//ÀÌÀü ½ÇÇà È­¸é ´Ý±â
      }
 }		 	