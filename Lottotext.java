package javastudy;
import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javastudy.ThreadIntteruptEx.TimerRunnable;
import javastudy.ThreadIntteruptEx.TimerRunnablee;
import javastudy.ThreadIntteruptEx.TimerRunnableee;
import javastudy.ThreadIntteruptEx.TimerRunnableeee;
import javastudy.ThreadIntteruptEx.TimerRunnableeeee;
import javastudy.ThreadIntteruptEx.TimerRunnableeeeee;


public class Lottotext  extends JFrame implements ActionListener{
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
	class Timer implements Runnable{
		private JLabel timerLabelllllla;
		
		public Timer(JLabel timerLabelllllla) {
			this.timerLabelllllla=timerLabelllllla;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=100; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabelllllla.setText(Integer.toString(u1));
				
				
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
	class Twina implements Runnable{
		private JLabel timerLabellllllaa;
		
		public Twina(JLabel timerLabellllllaa) {
			this.timerLabellllllaa=timerLabellllllaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=100; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellllllaa.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class Twinaa implements Runnable{
		private JLabel timerLabellllllaaa;
		
		public Twinaa(JLabel timerLabellllllaaa) {
			this.timerLabellllllaaa=timerLabellllllaaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=200; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellllllaaa.setText(Integer.toString(u1));
				
				
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
	class third implements Runnable{
		private JLabel timerLabellllllb;
		
		public third(JLabel timerLabellllllb) {
			this.timerLabellllllb=timerLabellllllb;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=200; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellllllb.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class thirda implements Runnable{
		private JLabel timerLabellllllbb;
		
		public thirda(JLabel timerLabellllllbb) {
			this.timerLabellllllbb=timerLabellllllbb;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=300; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellllllbb.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class thirdaa implements Runnable{
		private JLabel timerLabellllllbbb;
		
		public thirdaa(JLabel timerLabellllllbbb) {
			this.timerLabellllllbbb=timerLabellllllbbb;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=400; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabellllllbbb.setText(Integer.toString(u1));
				
				
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
	class four implements Runnable{
		private JLabel timerLabel;
		
		public four(JLabel timerLabel) {
			this.timerLabel=timerLabel;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=200; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabel.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fourr implements Runnable{
		private JLabel timerLabela;
		
		public fourr(JLabel timerLabela) {
			this.timerLabela=timerLabela;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=300; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabela.setText(Integer.toString(u1));
				
				
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fourrr implements Runnable{
		private JLabel timerLabelaa;
		
		public fourrr(JLabel timerLabelaa) {
			this.timerLabelaa=timerLabelaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=400; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabelaa.setText(Integer.toString(u1));
				
				
			
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fourrrr implements Runnable{
		private JLabel timerLabelaaa;
		
		public fourrrr(JLabel timerLabelaaa) {
			this.timerLabelaaa=timerLabelaaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=500; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabelaaa.setText(Integer.toString(u1));
				
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
	class five implements Runnable{
		private JLabel timerLabea;
		
		public five(JLabel timerLabea) {
			this.timerLabea=timerLabea;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=200; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabea.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fivee implements Runnable{
		private JLabel timerLabeaa;
		
		public fivee(JLabel timerLabeaa) {
			this.timerLabeaa=timerLabeaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=300; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabeaa.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fiveee implements Runnable{
		private JLabel timerLabeaaa;
		
		public fiveee(JLabel timerLabeaaa) {
			this.timerLabeaaa=timerLabeaaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=400; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabeaaa.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fiveeee implements Runnable{
		private JLabel timerLabeaaaa;
		
		public fiveeee(JLabel timerLabeaaaa) {
			this.timerLabeaaaa=timerLabeaaaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=500; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabeaaaa.setText(Integer.toString(u1));
				
				
				
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				return;
			}
			
		}
		
		}
	}
	class fiveeeee implements Runnable{
		private JLabel timerLabelaaaaa;
		
		public fiveeeee(JLabel timerLabelaaaaa) {
			this.timerLabelaaaaa=timerLabelaaaaa;
		}
		@Override
		public void run() {
			
			for(int h=0; h<=600; h++){
			    Integer u1 = new Integer((int) (Math.random() * 45 + 1));
				timerLabelaaaaa.setText(Integer.toString(u1));
				
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
	/* class Ãß°¡ ÀÛ¼º¶õ     */
	
	
	JPanel center = new JPanel(new GridLayout(2, 3));
	JPanel south = new JPanel(new BorderLayout());
	
	
	JTextField tf = new JTextField();
	
	JButton btnn[] = new JButton[6];
    JButton btn=new JButton("½ÃÀÛ");
    JButton btna=new JButton("ÃÊ±âÈ­");
    
    private Thread th;
	private Thread thh;
	private Thread thhh;
	private Thread thhhh;
	private Thread thhhhh;
	private Thread thhhhhh;
	
	private Thread tr;
	
	private Thread tre;
	private Thread tree;
	
	private Thread ta;
	private Thread taa;
	private Thread taaa;
	
	private Thread f;
	private Thread ff;
	private Thread fff;
	private Thread ffff;
	
	private Thread u;
	private Thread uu;
	private Thread uuu;
	private Thread uuuu;
	private Thread uuuuu;
	
	JLabel timerLabel=new JLabel ();
    JLabel timerLabell=new JLabel();
    JLabel timerLabelll=new JLabel();
    JLabel timerLabellll=new JLabel();	
    JLabel timerLabelllll=new JLabel();
    JLabel timerLabellllll=new JLabel();
    
    JLabel timerLabelllllla=new JLabel();
    
    JLabel timerLabellllllaa=new JLabel();
    JLabel timerLabellllllaaa=new JLabel();
    
    JLabel timerLabellllllb=new JLabel();
    JLabel timerLabellllllbb=new JLabel();
    JLabel timerLabellllllbbb=new JLabel();
    
    JLabel timerLabe=new JLabel();
    JLabel timerLabela=new JLabel();
    JLabel timerLabelaa=new JLabel();
    JLabel timerLabelaaa=new JLabel();
    
    JLabel timerLabea=new JLabel();
    JLabel timerLabeaa=new JLabel();
    JLabel timerLabeaaa=new JLabel();
    JLabel timerLabeaaaa=new JLabel();
    JLabel timerLabeaaaaa=new JLabel();
    
	public Lottotext() {
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
    	
    	timerLabelllllla.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	timerLabellllllaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabellllllaaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	timerLabellllllb.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabellllllbb.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabellllllbbb.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	timerLabe.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabela.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabelaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabelaaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
    	timerLabea.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabeaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabeaaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabeaaaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	timerLabeaaaaa.setFont(new Font("µ¸¿òÃ¼", Font.BOLD,50));
    	
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
    	
    	Timer vv=new Timer(timerLabelllllla);
    	tr=new Thread(vv);
        
    	Twina vva=new Twina(timerLabellllllaa);
    	tre=new Thread(vva);
    	Twinaa vvar=new Twinaa(timerLabellllllaaa);
    	tree=new Thread(vvar);
    	
    	third c=new third(timerLabellllllb);
    	ta=new Thread(c);
    	thirda cc=new thirda(timerLabellllllbb);
    	taa=new Thread(cc);
    	thirdaa ccc=new thirdaa(timerLabellllllbbb);
    	taaa=new Thread(ccc);
    	
    	four d=new four(timerLabe);
    	f=new Thread(d);
    	fourr dd=new fourr(timerLabela);
    	ff=new Thread(dd);
    	fourrr ddd=new fourrr(timerLabelaa);
    	fff=new Thread(ddd);
    	fourrrr dddd=new fourrrr(timerLabelaaa);
    	ffff=new Thread(dddd);
    	
    	five f=new five(timerLabea);
    	u=new Thread(f);
    	fivee ff=new fivee(timerLabeaa);
    	uu=new Thread(ff);
    	fiveee fff=new fiveee(timerLabeaaa);
    	uuu=new Thread(fff);
    	fiveeee ffff=new fiveeee(timerLabeaaaa);
    	uuuu=new Thread(ffff);
    	fiveeeee fffff=new fiveeeee(timerLabeaaaaa);
    	uuuuu=new Thread(fffff);
    	

        add(center, "Center");
        south.add(tf, "Center");
        
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
        	String data = tf.getText(); 
        	if(data.equals("6")) {
            btnn[0].add(timerLabel);
            btnn[1].add(timerLabell);
            btnn[2].add(timerLabelll);
            btnn[3].add(timerLabellll);
            btnn[4].add(timerLabelllll);
            btnn[5].add(timerLabellllll);		
            th.start();
        	thh.start();
        	thhh.start();
        	thhhh.start();
        	thhhhh.start();
        	thhhhhh.start();
        	btn.setEnabled(false);
        	tf.setText("6°³ ¼ýÀÚ°¡ ³ªÅ¸³³´Ï´Ù.");
        	}
        	else if(data.equals("")) {
        		tf.setText("ÀÔ·ÂÇÏ½Ã¿À.");
        	}
        	else if(data.equals("1")) {
        		btnn[0].add(timerLabelllllla);
        		tr.start();
        		btn.setEnabled(false);
            	tf.setText("1°³ ¼ýÀÚ°¡ ³ªÅ¸³³´Ï´Ù.");
        	}
        	else if(data.equals("2")) {
        		btnn[0].add(timerLabellllllaa);
        		btnn[1].add(timerLabellllllaaa);
        		tre.start();
        		tree.start();
        		btn.setEnabled(false);
            	tf.setText("2°³ ¼ýÀÚ°¡ ³ªÅ¸³³´Ï´Ù.");
        	}
        	else if(data.equals("3")) {
        		btnn[0].add(timerLabellllllb);
        		btnn[1].add(timerLabellllllbb);
        		btnn[2].add(timerLabellllllbbb);
        		ta.start();
        		taa.start();
        		taaa.start();
        		btn.setEnabled(false);
            	tf.setText("3°³ ¼ýÀÚ°¡ ³ªÅ¸³³´Ï´Ù.");
        	}
        	else if(data.equals("4")) {
        		btnn[0].add(timerLabe);
        		btnn[1].add(timerLabela);
        		btnn[2].add(timerLabelaa);
        		btnn[3].add(timerLabelaaa);
        		f.start();
        		ff.start();
        		fff.start();
        		ffff.start();
        		btn.setEnabled(false);
            	tf.setText("4°³ ¼ýÀÚ°¡ ³ªÅ¸³³´Ï´Ù.");
        	}
        	else if(data.equals("5")) {
        		btnn[0].add(timerLabea);
        		btnn[1].add(timerLabeaa);
        		btnn[2].add(timerLabeaaa);
        		btnn[3].add(timerLabeaaaa);
        		btnn[4].add(timerLabeaaaaa);
        		u.start();
        		uu.start();
        		uuu.start();
        		uuuu.start();
        		uuuuu.start();
        		btn.setEnabled(false);
            	tf.setText("5°³ ¼ýÀÚ°¡ ³ªÅ¸³³´Ï´Ù.");
        	}
        	else {
        		tf.setText("´Ù½Ã ÀÔ·ÂÇÏ½Ã¿À.");
        	}
        	
        	
        	
        	
        	}
           else if (e.getSource() == btna) {
          
    	   new Lottotext();
    	   setVisible(false);
    	  
    	   
     }
		
	}
	public static void main(String args[]) {
		Lottotext m=new Lottotext();
     	m.setVisible(true);//ÀÌÀü ½ÇÇà È­¸é ´Ý±â 
	}
}
