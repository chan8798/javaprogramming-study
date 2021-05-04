package javaprogrammingproject;
import java.io.*;


public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		File src=new File("c:\\windows\\system.ini");// 원본 파일 경로명
		File dest=new File("C:\\Users\\chan1\\Desktop\\test.txt"); //복사 파일 경로명
		
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
		System.out.println(src.getPath()+"를"+dest.getPath()+"로 복사하였습니다.");
	
	}catch(IOException e) {
		 System.out.println("입출력 오류...");
	 }
	
}
}