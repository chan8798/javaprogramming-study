package java11;
import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
	public SliderEx() {
		setTitle("�����̴� ���鰡�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider =new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String [] args) {
		new SliderEx();
	}

}
