package javaprogrammingproject;
import java.io.*;


public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		File src=new File("c:\\windows\\system.ini");// ���� ���� ��θ�
		File dest=new File("C:\\Users\\chan1\\Desktop\\test.txt"); //���� ���� ��θ�
		
		int n;
		
		

	try {
		FileReader fr=new FileReader(src);
		FileWriter fw=new FileWriter(dest);
		for( long i=1;true; i++) {
			fw.write(Long.toString(i));
			fw.write("\n");
			
			if(dest.length() >= 1024*1024*10) {
				System.out.println(dest.length());
			break;
			}	
}
		fr.close();
		fw.close();
		System.out.println(src.getPath()+"��"+dest.getPath()+"�� �����Ͽ����ϴ�.");
	
	}catch(IOException e) {
		 System.out.println("����� ����...");
	 }
	
}
}