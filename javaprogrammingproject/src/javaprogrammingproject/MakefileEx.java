package javaprogrammingproject;
import java.util.*;
import java.io.*;

public class MakefileEx {
	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 char [] alphabet= new char[26];
	 
	 System.out.print("파일이름을 입력하시오>>>");
	 String name=scanner.next();
	 System.out.print("파일크기를 입력하시오.>>>");
	 long size=scanner.nextLong();
	 
	 try {
		 FileOutputStream fin=new FileOutputStream("c:\\Temp\\"+name+ ". txt");
		 for(long s=0; s<=size*20; s++) {
			 for(int i=0; i<alphabet.length;i++) {
				 alphabet[i]=(char)('a'+i);
				 fin.write(alphabet[i]);
			 }
			 fin.write('\r');
			 for(int j=0; j<alphabet.length;j++) {
				 alphabet[j]=(char)('A'+j);
				 fin.write(alphabet[j]);
			 }
			 fin.write('\r');
		 }
		 fin.close();
		 		
	 }catch(IOException e) {
		 System.out.println("입출력 오류...");
	 }
	 scanner.close();
	 System.out.println("파일 생성 완료");

}
}